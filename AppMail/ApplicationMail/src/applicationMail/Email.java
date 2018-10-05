package applicationMail;

import java.util.Random;

public class Email {
	private String prenom;
	private String nom;
	private String mail;
	private String altmail;
	private String password = "";
	char t[] = { 'a', 'z', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'q', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
			'w', 'x', 'c', 'v', 'b', 'n', 'A', 'Z', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'Q', 'S', 'D', 'F', 'G',
			'H', 'J', 'K', 'L', 'M', 'W', 'X', 'C', 'V', 'B', 'N', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };

	public Email(String nom, String prenom, String altmail) {
		this.nom = nom;
		this.prenom = prenom;
		this.altmail = altmail;
		setMail((prenom + "." + nom + "@company.dz"));
		for (int i = 0; i < 12; i++) {
			password += t[(int) (Math.random() * 62)];
		}

	}

	/* alternative
	 * public Email(String nom, String prenom, String altmail) { this.nom = nom;
	 * this.prenom = prenom; this.altmail = altmail; setMail((prenom + "." + nom +
	 * "@company.dz")); Random r = new Random(); for (int i = 0; i < 8; i++) {
	 * password += (char) (97 + r.nextInt(25)); }
	 * 
	 * }
	 */

	public String getAltmail() {
		return altmail;
	}

	public void setAltmail(String altmail) {
		this.altmail = altmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
