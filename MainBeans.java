package com.galgotias;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gal.PasswordHasher;

public class MainBeans {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
		context.scan("com.gal");
		context.refresh();
		PasswordHasher bean= context.getBean(PasswordHasher.class);
		System.out.println(bean);
		System.out.println(bean.hash("hello"));
		context.close();
	}

}
