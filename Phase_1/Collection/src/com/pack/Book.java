package com.pack;

import java.util.HashSet;
import java.util.Iterator;

public class Book {
	
	int bookId;
	String bookName,author,publication;
	
	public Book(int BookId,String bookName,String author,String publication){
		
		this.bookId = BookId;
		this.bookName = bookName;
		this.author = author;
		this.publication = publication;
	}
	
	public String toString() {
		return bookId+" "+bookName+" "+author+" "+publication;
	}
	
	public static void main(String[] args) {
		
		HashSet<Book> hs = new HashSet<Book>();
		
		Book b1 = new Book(101,"Physics", "CV raman", "ram publication pvt ltd");
		Book b2 = new Book(102,"Math", "PK mishra", "Shyam publication pvt ltd");
		Book b3 = new Book(103,"Chemistry", "CV raman", "ram publication pvt ltd");
	
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		
		Iterator<Book> itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	
	}


}
