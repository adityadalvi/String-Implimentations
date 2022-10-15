
public class toCharArrayimpli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Aditya";
		char[] ch=new char[s1.length()];
		for (int i = 0; i < s1.length(); i++) 
		{
			char ch1=s1.charAt(i);
			ch[i]=ch1;
		}
		for (int i = 0; i < ch.length; i++) 
		{
			System.out.print(ch[i]+" ");
		}

	}

}
