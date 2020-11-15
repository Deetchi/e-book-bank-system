import java. util. Scanner;
class Ascii
{
	static void ASCIISentence(String str)
	{
		int l=str.length();
		int convert;
		for (int i = 0; i <l;i++)
		{
			convert = str.charAt (i) ;
		System.out.print(convert);
		}
	}
		public static void main ( String args[])
		{
			System.out.println("enter a word");
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			System.out. println( "ASCII Sentence");
			ASCIISentence(str);
		}
}
