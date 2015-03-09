package restaurantMenu;

public class WriterFactory {

	public WriteToFile gettype(int man)
	{
		if (man == 1)
			return new WriteToTxt();
		if(man==2)
			return new WriteToXml();
		if(man == 3)
			return new WriteToHtml();
		else
			return null;
		
	}
}
