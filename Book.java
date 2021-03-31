package cproject;

import java.util.*;

public class Book implements Comparable {

	Scanner s = new Scanner(System.in);
	
	 String bookTitle;
	 String bookAuthor;
	 String bookPublisher;
	 String bookCode;
	 int bookPrice;
	 int bookSale;
	 int bookYear;
	 int borrow;
	
	Book(){}
	
	Book(String bookTitle, String bookAuthor, String bookPublisher, String bookCode, int bookPrice, int bookSale, int bookYear, int borrow)
	{
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
		this.bookCode = bookCode;
		this.bookPrice = bookPrice;
		this.bookSale = bookSale;
		this.bookYear = bookYear;
		this.borrow = borrow;
	}
	

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getBorrow() {
		return borrow;
	}

	public void setBorrow(int borrow) {
		this.borrow = borrow;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public int getBookPrice() {
		return bookPrice;
	}
	
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getBookSale() {
		return bookSale;
	}

	public void setBookSale(int bookSale) {
		this.bookSale = bookSale;
	}

	public int getBookYear() {
		return bookYear;
	}

	public void setBookYear(int bookYear) {
		this.bookYear = bookYear;
	}

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	@Override
	public int compareTo(Object o) {
		Book other = (Book)o;
		if(bookSale<other.bookSale)
			return -1;
		else if(bookSale>other.bookSale)
			return 1;
		else 
			return 0;
	}
	
	
}