
public class toUpperCaseimplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcdES";
		String s2="";
		for (int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
			{
				s2=s2+(char)(s1.charAt(i)-32);
			}
			else
			{
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);

	}

}
