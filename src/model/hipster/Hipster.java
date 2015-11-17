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
		setupBooks();
		
	}
	
	private void setupArray()
	{
		
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
		return histerPhrases;
	}
	public void setHisterPhrases(String[] histerPhrases)
	{
		this.histerPhrases = histerPhrases;
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
