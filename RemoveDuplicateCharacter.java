
import java.util.Scanner;
public class RemoveDuplicateCharacter 
{
public static void main(String[] args)
{
	Scanner scan=new Scanner (System.in);
	System.out.println("enter the string");
	String st = scan.nextLine();
	char ch[] = st.toCharArray();
	int Prashi= ch.length;
	st="";
	for (int Puni=0; Puni<Prashi; Puni++)
	{
		st = st+ch[Puni];
		for (int Sachi=Puni+1; Sachi<Prashi; Sachi++)
		{
				if (ch[Puni]!= ' '&&(ch[Puni]==ch[Sachi]||ch[Puni]==ch[Sachi]+32||ch[Puni]==ch[Sachi]-32))
				{
					for (int Shohan=Sachi; Shohan<Prashi-1; Shohan++)
					{
						ch[Shohan]=ch[Shohan+1];
					}
                      Puni--;
                     Sachi--;
				}
		}
}
			System.out.println(st);
		}
	}