package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

public class BookXml {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("practice.xml");
	Book book = context.getBean(Book.class);
     System.out.println(book.getName());
     System.out.println(book.getPrice());
     System.out.println(book.getAuthor().getName());
     System.out.println(book.getAuthor().getPenName());
     System.out.println("-----------------------------------");
     Author author = context.getBean(Author.class);
   System.out.println(author.getName());
   System.out.println(author.getPenName());
   context.close();
}
}
