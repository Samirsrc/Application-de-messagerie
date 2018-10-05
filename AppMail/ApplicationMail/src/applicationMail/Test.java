package applicationMail;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String altmail;
		System.out.println("Entrer votre prenom: ");
		Scanner sc = new Scanner(System.in);
		String p = sc.nextLine();
		System.out.println("Entrer votre nom: ");
		String n = sc.nextLine();
		System.out.println("Avez-vous une adresse mail alternative? (oui/non)");
		String on = sc.nextLine();

		if (on.matches("oui")) {
			System.out.println("Donner l'adresse:");
			altmail = sc.nextLine();
		} else {
			altmail = "Inconnu";
		}
		Email first = new Email(n, p, altmail);
		System.out.println("Votre compte a été crée avec succes ! ");
		System.out.println("votre nouvelle adresse mail est : " + (first.getMail()));
		System.out.println("votre mot de passe est : " + (first.getPassword()));
		System.out.println("votre adress mail alternative est: " + first.getAltmail());
		System.out.println("voulez-vous modifier votre mot de passe?");
		String on2 = sc.nextLine();

		if (on2.matches("oui")) {
			System.out.println("Donner le mot de passe:");
			first.setPassword(sc.nextLine());
			System.out.println("Votre nouveau mot de passe est : " + first.getPassword());
		} else {
			System.out.println("bye!");
			;
		}

	}

}
