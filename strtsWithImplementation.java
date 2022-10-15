
public class strtsWithImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abcde";
		String s2="abd";
		int cnt=0;
		//System.out.println(s1.startsWith(s2));
		if(s2.length()<=s1.length())
		{
			for (int i = 0; i < s2.length(); i++) 
			{
				if(s1.charAt(i)==s2.charAt(i))
				{
					cnt++;
				}
			}
			if(cnt==s2.length())
			{
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
		}
		else
		{
			System.out.println(false);
		}

	}

}
