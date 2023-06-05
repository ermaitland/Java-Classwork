package com.sg.booktracker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sg.booktracker.controller.BookController;

/**
 *
 * @author Kyle David Rudy
 */
public class App {
    public static void main(String[] args) {
    AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.sg.booktracker");
        appContext.refresh();

        BookController controller = appContext.getBean("bookController", BookController.class);
        controller.run();
    }
}


/*
 * 
 */