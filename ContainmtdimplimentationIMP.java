
public class ContainmtdimplimentationIMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdef";
		String str2="bttt";
		//System.out.println(str.contains(str2));
		boolean flag=false;
		if(str2.length()<=str.length())
		{
			if(str2.length()==0)
			{
				System.out.println(true);
			}
			int start=0;
			for (int i = 0; i <str.length(); i++)
			{
				if(str2.charAt(0)==str.charAt(i))
				{
					start=i;
				}

				int cnt=0;
				for (int k = 0; k < str2.length(); k++)
				{
					if(str2.charAt(k)==str.charAt(start))
					{
						cnt++;
						start++;
					}
					else
					{
						break;
					}
				}

				if(cnt==str2.length())
				{
					flag=true;
					System.out.println(true);
				}
			}
			if(flag==false && str2.length()!=0)
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

