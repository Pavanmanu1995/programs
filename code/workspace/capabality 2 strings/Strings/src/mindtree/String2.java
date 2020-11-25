package mindtree;

public class String2 {

	public static void main(String[] args) {
		String s[]= {"monday","tuesday","wed","thur","friday","sat","sun"};
		String b="sat";
		String c=new String("sun");
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals(b)||s[i].equals(c))
			{
				System.out.println("happy");
			}
			else
			{
				System.out.println("sad");
			}
		}

	}

}
