
public class endsWithimplimentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abcde";
		String s2="";
		//System.out.println(s1.startsWith(s2));
		if(s2.length()<=s1.length())
		{
			int s1ind=s1.length()-1;
			int s2ind=s2.length()-1;
			int cnt=0;
			for (int i = 0; i < s2.length(); i++) 
			{
				if(s1.charAt(s1ind)==s2.charAt(s2ind))
				{
					
				}
				else
				{
					cnt++;
					break;
				}
			}
			s2ind--;
			s1ind--;
			
			if(cnt==0)
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
