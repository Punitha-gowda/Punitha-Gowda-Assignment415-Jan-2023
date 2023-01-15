
import java.util.Scanner;
public class PrintDuplicatesCharacters {
	
	public static void main(String ar[])
	{
	Scanner sc = new Scanner (System.in);
	String A1 = sc.next();
	int[] count = new int [210];
	for (int a =0; a<A1.length(); a++)
	{
		count[A1.charAt(a)]++;
	}
	for (int a=0; a<210; a++)
	{
		if (count[a]>1)
		{
			System.out.println((char)(a)+" count = "+count[a]);
		}
	 }
  }
}
