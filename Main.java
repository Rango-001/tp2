package Tp2;
import java.util.Scanner;



public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String nom;
		String prénom;
		int age;
		double salaire;
		char choix ;
		char a;
		Employé exam= null;

		
		
		
		
		
		do
		{
		System.out.println("donner le nom");
		nom=sc.nextLine();
		System.out.println("donner le prénom ");
		prénom=sc.nextLine();
		System.out.println("donner l'age");
		age=sc.nextInt();
		System.out.println("donner le salaire");
		salaire=sc.nextDouble();
		Employé e= new Employé(nom,prénom,age,salaire);
		e.afficher();
		if(exam== null||e.salaire>exam.salaire) {
			exam=e;
		}
		
		
			
			 	
		
		
		
		System.out.println("voulez vou continuer O/N");
		a=sc.next().charAt(0);
		sc.nextLine();
		}while(a == 'O' ||a=='o');
		 
		System.out.println("le plus hot salaire est");
		exam.afficher();
		
		
			
			
		
		
		sc.close();
		
		
		
			
		}
		
		
		
		
	}


