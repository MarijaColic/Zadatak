package engineering.web.model;

public class CityRepository {

	private long PTTB;
	private String naziv;
	public CityRepository(long pTTB, String naziv) {
		super();
		PTTB = pTTB;
		this.naziv = naziv;
	}
	public long getPTTB() {
		return PTTB;
	}
	public void setPTTB(long pTTB) {
		PTTB = pTTB;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	@Override
	public String toString() {
		return "CityRepository [PTTB=" + PTTB + ", naziv=" + naziv + "]";
	}
	
	
}
