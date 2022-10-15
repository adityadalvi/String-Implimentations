
public class compareToIgnoreCaseimpli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="aditya";
		String str2="Aditya";
		int res=myMtd(str1,str2);
		System.out.println(res);
	}
	private static int myMtd(String str1,String str2)
	{
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
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
