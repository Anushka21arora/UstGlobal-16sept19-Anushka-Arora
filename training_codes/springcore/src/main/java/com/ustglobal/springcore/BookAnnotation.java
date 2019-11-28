package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.di.Book;
import com.ustglobal.springcore.di.ConfigurationBook;

public class BookAnnotation {
public static void main(String[] args) {
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBook.class);
Book book = context.getBean(Book.class);
System.out.println(book.getName());
System.out.println(book.getPrice());
System.out.println(book.getAuthor().getName());
System.out.println(book.getAuthor().getPenName());
   
context.close();

}
}
