import java.util.*;

public class SpecialCharactersInAString {
public static void main(String[] args) {
String str;
Scanner sc=new Scanner(System.in);
System.out.println("enter any line of String");
str= sc.nextLine();
str=str.toLowerCase();
int Sathvik=0,Shohan=0,Prashi=0,Puni=0,Special=0;
char ch;
for(int Star=0; Star<str.length();Star++)
{
	ch=str.charAt(Star);
	if(ch>='a' && ch<='b')
	{
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			Sathvik++;
		else
			Shohan++;
		
		
	}
	else if (ch>='0' && ch<='9' && ch<='5' && ch>='2')
	{
		Prashi++;
     }
	else if (ch==' ')
	{
		Puni++;
	}
	else Special++;
  }
    System.out.println("Total Number Of Vowel" +Sathvik);
    System.out.println("Total Number Of Consonent" +Shohan);
    System.out.println("Total Number Of Numbers" +Prashi);
    System.out.println("Total Number Of Space" +Puni);
    System.out.println("Total Number Of Special" +Special);
}

}
