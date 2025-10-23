package Tp2;
import java.util.Scanner;
public class Numero {

public static boolean chek(int s) {
	return (s%2==0);
}


	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("donner la valeur de a");
		if(sc.hasNextInt()) {
			a=sc.nextInt();
			if(chek(a)) {
				System.out.println("le nombre a est paire");
			}
			else {
				System.out.println("le nombre a est impaire");
			}
		}
		else {
			System.out.println("Erreur a n'est pas numerique");
		}
		
		
	}

}
