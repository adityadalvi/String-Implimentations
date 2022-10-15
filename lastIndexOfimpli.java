
public class lastIndexOfimpli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Adityay";
		char ch='y';
		int cnt=0;
		for (int i = str.length()-1; i>=0; i--)
		{
			if(ch==str.charAt(i))
			{
				System.out.println(i);
				cnt++;
				break;
			}
		}
		if(cnt==0)
		{
			System.out.println(-1);
		}

	}

}
