package demopackage1;

public class split {

	public static void main(String[] args) {
	String a="ab@ab@ab";
	for(int i=0;i<=a.length();i++)
	{
		if(a.charAt(i)=='@')
		{
			b=a.charAt(i-1);
		}
		System.out.println(b);
	}

	}

}
