package exercice;
import java.util.Scanner;

public class Bisictrisse {
	public static boolean verif(int c) {
		return ((c%4==0)&&(c%100!=0 ||(c%400==0)));
	}
	public static void main(String args[]) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("donner l'anner ");
		a=sc.nextInt();
		while(a<=0){
		System.out.println("donner l'anner ");
		a=sc.nextInt();
		}
		if(verif(a)) {
			System.out.println("l'anner est bisecstielle ");
		}
		else {
			System.out.println("l'anner est n'est pas bisecstielle ");
		}
		
		
		
	}

}
