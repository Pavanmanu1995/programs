package mindtree;

public class split {

	public static void main(String[] args) {
		String stringToBeSplit="every body loves dog";
		String[] wordsOfString=new String[10];
		String singleWorld=""; //temp variable
		int index=0;
		for(int i=0;i<stringToBeSplit.length();i++)
		{
			if(stringToBeSplit.charAt(i)!=' ')
			{
				singleWorld +=stringToBeSplit.charAt(i);
			}
			else
			{
				wordsOfString[index++]=singleWorld;
						singleWorld="";
			}
		}
		wordsOfString[index++]=singleWorld;
		for(String string : wordsOfString)
		{
			System.out.println(string);
		}
	}

}
