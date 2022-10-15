
public class splitimpliIMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc    pres    jkl  xyz";
		int cnt=0;
		for (int i = 0; i <s.length(); i++)
		{
			if(s.charAt(i)==' ')
			{
				cnt++;
			}
		}
		String[] sa=new String[cnt+1];
		String str="";
		int ind=0;
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)==' ')
			{
				sa[ind++]=str;
				str="";
			}
			else
			{
				str=str+s.charAt(i);
			}
			if(i==s.length()-1)
			{
				sa[ind++]=str;
			}
		}
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.print(sa[i]+" ,");
		}
		
	}
	
	
		

}
/*String s="abc     pres   jkl   xyz";
String str2="";
for (int i = 0; i < s.length(); i++)
{
	if(s.charAt(i)==' ')
	{
		str2=str2+" ,";
	}
	else if(i==(s.length()-1))
	{
		str2=str2+" ,";
	}
	else
	{
		str2=str2+s.charAt(i);
	}
}
System.out.println(str2);*/



//2
/*
String s="you are very very good student";
		String[] a=mySplit(s);
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
	public static String[] mySplit(String s)
	{
		int scnt=0;
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)==' ')
			{
				scnt++;
			}
		}
		String[] a=new String[scnt+1];
		String str="";
		int ind=0;
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)==' ')
			{
				a[ind++]=str;
				str="";
			}
			else if(s.charAt(i)!=' ')
			{
				str=str+s.charAt(i);
			}
			if(i==(s.length()-1))
			{
				a[ind++]=str;
			}
		}
		return a;

*/