package org.springframework.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dengzm
 */
public class ContextApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);
		WelcomeService bean = context.getBean(WelcomeService.class);
		System.out.println(bean);
		System.out.println(bean.sayHello("conan"));
	}
}