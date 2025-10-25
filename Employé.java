package Tp2;

public class Employé {
	String nom;
	String prénom;
	int age;
	double salaire;
	char a;
	public Employé(String nom,String prénom,int age,double salaire) {
		this.nom=nom;
		this.prénom=prénom;
		this.age=age;
		this.salaire=salaire;
		
		
		
			
		}
	public void afficher() {
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prénom);
        System.out.println("Âge : " + age);
        System.out.println("Salaire : " + salaire);
        
    }
	
}

	


