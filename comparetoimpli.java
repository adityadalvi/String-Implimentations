
public class comparetoimpli {

	public static void main(String[] args) 
	{
		String str1="Aditya";
		String str2="Aditya";
		//System.out.println(str1.compareTo(str2));
		int res=myMtd(str1,str2);
		System.out.println(res);
	}
	private static int myMtd(String str1,String str2)
	{
		for (int i = 0; i < str1.length()&&i<str2.length(); i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				return str1.charAt(i)-str2.charAt(i);
			}
		}
		return str1.length()-str2.length();
	}

}
