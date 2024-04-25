public class RandomLetterChooser extends RandomStringChooser
{
	String ok[];
	ArrayList <Integer> index;
	public RandomLetterChooser(String str)
	{ 
		ok = getSingleLetters(str);
		index = new ArrayList <Integer>();
		this.getNext();
	}
	
	
	public static String[] getSingleLetters(String str)
	{ 
		String[] letterArray = new String[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			letterArray[i] = ""+str.charAt(i);
		}
		return letterArray;
	}
}
