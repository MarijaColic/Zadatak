package engineering.web.model;

public class UserRepository {

	private String ime;
	private String prezime;
	private String email;
	private String sifra;
	private CityRepository city;
	public UserRepository(String ime, String prezime, String email, String sifra, CityRepository city) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
		this.sifra = sifra;
		this.city=city;
	}
	
	
	public UserRepository(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}


	public CityRepository getCity() {
		return city;
	}

	public void setCity(CityRepository city) {
		this.city = city;
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
	
	
}
