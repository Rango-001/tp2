package exercice;
import java.util.Scanner;

public class Calculatrice {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	   double a;
	   System.out.println("donner la valeur de a=");
	   a=sc.nextDouble();
	   
	   double b;
	   System.out.println("donner la valeur de b=");
	   b=sc.nextDouble();
	   double resulta;
	   char c;
	   
	   System.out.println("donner c=");
	    c =sc.next().charAt(0);
	   
	   
	   switch(c){
	   case '+':
		   resulta=a+b;
		   System.out.printf("le resulta est : %.3f\n", resulta);
		   break;
	   case'-':
		   resulta=a-b;
		   System.out.printf("le resulta est : %.3f\n" ,resulta);
		   break;
	   case'*':
		   resulta=a*b;
		   System.out.printf("le resulta est : %.3f\n" ,resulta);
		   break;
	   case'%':
		   resulta=a%b;
		   System.out.printf("le resulta est : %.3f\n" ,resulta);
		   break;
	   case'/':
		   if(b==0) {
			   System.out.println("erreur!");
		   } else {
				   resulta=a/b;
				   System.out.printf("le resulta est :%.3f\n",resulta);
			   }
		 
		   
		   break;
		   
		   
	   default:
		   System.out.println("Eureur dan l'operateur");
	   
	   }
		
	}

}
