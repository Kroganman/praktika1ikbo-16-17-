package prac1;

class Book
{
	private String title, author;
	private int pages;
	
	public Book(String title,String author,int pages)
	{
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	
	public String toString()
	{
		return title + author + pages;
	}
}
