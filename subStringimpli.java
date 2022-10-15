
public class subStringimpli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Aditya";
		int ind=2;
		int ind2=4;
		String str2="";
		for (int i = ind; i < ind2; i++) 
		{
			char ch=str.charAt(i);
			str2=str2+ch;
		}
		System.out.println(str2);
		

	}

}
