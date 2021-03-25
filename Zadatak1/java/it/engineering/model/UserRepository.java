package it.engineering.model;

public class UserRepository {

	private String ime;
	private String prezime;
	private String email;
	private String sifra;
	public UserRepository(String ime, String prezime, String email, String sifra) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
		this.sifra = sifra;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		this.sifra = sifra;
	}
	@Override
	public String toString() {
		return "UserRepository [ime=" + ime + ", prezime=" + prezime + ", email=" + email + ", sifra=" + sifra + "]";
	}
	
	
}
