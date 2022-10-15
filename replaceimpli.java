
public class replaceimpli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Aditya";
		String str2="";
		char old='A';
		char new1='P';
		for (int i = 0; i < str.length(); i++)
		{
			char ch=str.charAt(i);
			if(ch==old)
			{
				str2=str2+new1;
			}
			else
			{
				str2=str2+ch;
			}
		}
		System.out.println(str2);

	}

}
