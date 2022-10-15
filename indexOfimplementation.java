
public class indexOfimplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "welcomeo";
		String s2 = "eo";
		//System.out.println(s1.indexOf(s2));
		if(s2.length()>s1.length())
		{
			System.out.println(-1);
		}
		if(s2.length()==0)
		{
			System.out.println(0);
		}
		if(s2.length()<=s1.length())
		{


			int start=0;
			for (int i = 0; i < s1.length(); i++) 
			{
				if(s1.charAt(i)==s2.charAt(0))
				{
					start=i;
					int y=0;
					int cnt=0;
					while(start<s1.length()&&y<s2.length())
					{
						if(s1.charAt(start)==s2.charAt(y))
						{
							cnt++;
						}
						start++;y++;
					}
					if(cnt==s2.length())
					{
						System.out.println(i);
					}
				}
			}
		}

	}

}
