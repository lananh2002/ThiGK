package ThiGK;

public class Xe {
	private String maChuyen; 
	private String tenTaiXe;
	private String soXe;
	private int soChuyen;
	
	
	public String getMaChuyen() {
		return maChuyen;
	}
	public void setMaChuyen(String maChuyen) {
		this.maChuyen = maChuyen;
	}
	public String getTenTaiXe() {
		return tenTaiXe;
	}
	public void setTenTaiXe(String tenTaiXe) {
		this.tenTaiXe = tenTaiXe;
	}
	public String getSoXe() {
		return soXe;
	}
	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}
	public int getSoChuyen() {
		return soChuyen;
	}
	public void setSoChuyen(int soChuyen) {
		this.soChuyen = soChuyen;
	}
	public Xe(String maChuyen, String tenTaiXe, String soXe, int soChuyen) {
		super();
		this.maChuyen = maChuyen;
		this.tenTaiXe = tenTaiXe;
		this.soXe = soXe;
		this.soChuyen = soChuyen;
	}
	public Xe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
