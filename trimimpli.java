
public class trimimpli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="   ab   cd   ";
		System.out.println(str.trim());
		int i=0;
		int j=str.length()-1;
		String str2="";
		while(true)
		{
			if(str.charAt(i)==' ')
			{
				i++;
			}
			else
			{
				break;
			}
		}
		while(true)
		{
			if(str.charAt(j)==' ')
			{
				j--;
			}
			else
			{
				break;
			}
		}
		for (int k = i; k <= j; k++)
		{
			str2=str2+str.charAt(k);	
		}
		System.out.println(str2);
		
		String str="   ab   cd   ";
		int cnt1=0;
		int i=0;
		cnt1=loopi(i,str,cnt1);
		int cnt2=str.length()-1;
		int j=str.length()-1;
		cnt2=loopj(j,cnt2,str);
		
		int n=cnt1;
		String str2="";
		str2=loopn(n,cnt2,str2,str);
		System.out.println(str2);


	}

	private static String loopn(int n,int cnt2, String str2,String str) {
		// TODO Auto-generated method stub
		if(n<=cnt2)
		{
			str2=str2+str.charAt(n);
			n++;
			return loopn(n, cnt2, str2,str);
		}
		return str2;
		
	}

	private static int loopj(int j, int cnt2, String str) {
		// TODO Auto-generated method stub
		if(str.charAt(j)==' ')
		{
			if(str.charAt(j)==' ')
			{
				cnt2--;
			}
			else
			{
				return cnt2;
			}
			j--;
			return loopj(j, cnt2, str);
		}
		return cnt2;
		
	}

	private static int loopi(int i, String str, int cnt1) {
		// TODO Auto-generated method stub
		if(i<str.length())
		{
			if(str.charAt(i)==' ')
			{
				cnt1++;
			}
			else
			{
				return cnt1;
			}
			i++;
			return loopi(i, str, cnt1);
		}
		return cnt1;
		
	}

}
