package engineering.web.model;

public class ManufacurerRepository {

	private int PIB;
	private String JMBG;
	private String naziv;
	private String adresa;
	private CityRepository city;
	public ManufacurerRepository(int pIB, String jMBG, String naziv, String adresa, CityRepository city) {
		super();
		PIB = pIB;
		JMBG = jMBG;
		this.naziv = naziv;
		this.adresa = adresa;
		this.city = city;
	}
	public int getPIB() {
		return PIB;
	}
	public void setPIB(int pIB) {
		PIB = pIB;
	}
	public String getJMBG() {
		return JMBG;
	}
	public void setJMBG(String jMBG) {
		JMBG = jMBG;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public CityRepository getCity() {
		return city;
	}
	public void setCity(CityRepository city) {
		this.city = city;
	}

	
}
