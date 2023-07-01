package ThiGK;

public class XeKhach extends Xe{
	private int giaVe; 
	private int soChoNgoi;
	
	
	public int getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(int giaVe) {
		this.giaVe = giaVe;
	}
	public int getSoChoNgoi() {
		return soChoNgoi;
	}
	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}
	public XeKhach(String maChuyen, String tenTaiXe, String soXe, int soChuyen, int giaVe, int soChoNgoi) {
		super(maChuyen, tenTaiXe, soXe, soChuyen);
		this.giaVe = giaVe;
		this.soChoNgoi = soChoNgoi;
	}
	public XeKhach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public XeKhach(String maChuyen, String tenTaiXe, String soXe, int soChuyen) {
		super(maChuyen, tenTaiXe, soXe, soChuyen);
		// TODO Auto-generated constructor stub
	}
	
	
}
