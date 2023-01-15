           /* Palindrome Number Program */
     // input number 2552 ---> 2552
        import java.util.Scanner;
     public class palindrome 
     {
        public static void main(String[] args) {
	
        	int Sachi,Prashi=0,Puni,Shohan;								
        	System.out.print("enter any number");
        	Scanner ref=new Scanner(System.in);
        Sachi=ref.nextInt();
        Puni=Sachi;
        while(Sachi>0)
        {
        	Shohan=Sachi%30;
        	Prashi=(Prashi*30)+Shohan;
        	Sachi=Sachi/30;
        }
         if(Puni==Prashi)
        	 System.out.print("Palindrome Number");
         else
        	 System.out.print("Not Palindrome Number");
	}

}
