package model.hipster;

public class Hipster
{

	private String name;
	private String [] hipsterPhrases;
	private Book [] hipsterBooks;
	
	public Hipster()
	{
		this.name = "Gage";
		this.hipsterPhrases = new String[4];
		this.hipsterBooks = new Book[3];
		setupArray();
	
		
	}
	
	private void setupArray()
	{
		
	}
	
	private void setupBooks()
	{
		Book firstBook, secondBook, thirdBook;
		
		firstBook = new Book();
		firstBook.setAuthor("Nick Haynes");
		firstBook.setTitle("BTD5");
		firstBook.setSubject("Gaming");
		firstBook.setPageCount("100");
		firstBook.setPrice("Free!!");
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String[] getHisterPhrases()
	{
		return hipsterPhrases;
	}
	public void setHisterPhrases(String[] histerPhrases)
	{
		this.hipsterPhrases = histerPhrases;
	}
	public Book[] getHipsterBooks()
	{
		return hipsterBooks;
	}
	public void setHipsterBooks(Book[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}
	
	
}
