package com.ustglobal.springcore.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBook {
    @Bean(name="book")
	public Book getbook() {
		Book book = new Book();
		book.setName("Anu");
		book.setPrice(10000);
		//book.setAuthor(getauthor());
		return book;
	}
    @Bean(name="author")
    public Author getauthor() {
		Author author = new Author();
		author.setName("abc");
		author.setPenName("parker");
		return author;
	}
}
