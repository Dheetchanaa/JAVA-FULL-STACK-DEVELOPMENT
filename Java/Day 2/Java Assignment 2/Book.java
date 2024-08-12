package com.sample;
import java.util.*;
public class Book {
	
	String title;
	String author;
	String ISBN;
	HashMap<String,String> mp=new HashMap<>();
	Book(String title,String author,String ISBN)
	{
		this.author=author;
		this.ISBN=ISBN;
		this.title=title;
	}
	void add()
	{
		if(!mp.containsKey(this.title))
		{
			mp.put(this.author,this.title+" "+this.ISBN);
			System.out.println("Added Successfully");
			System.out.println(this.author+" "+this.title+" "+this.ISBN);
		}
		else
			System.out.println("Already exists");
	}
	public static void main(String[] args) {	
	 Book b = new Book("The Lord of the Rings", "J.R.R. Tolkien", "978-0261102217");
     b.add();
	}
}