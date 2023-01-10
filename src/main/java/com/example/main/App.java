package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.confing.AppConfing;
import com.example.services.IMusicien;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfing.class);
		IMusicien l1 = (IMusicien) context2.getBean("iMusicien");
		System.out.println("il joue : " + l1.getJouer());
		
		

	}
}
