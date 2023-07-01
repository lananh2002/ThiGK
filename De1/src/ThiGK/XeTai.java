package ThiGK;

public class XeTai extends Xe{
	private int giaVe;

	public int getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(int giaVe) {
		this.giaVe = giaVe;
	}

	public XeTai(String maChuyen, String tenTaiXe, String soXe, int soChuyen, int giaVe) {
		super(maChuyen, tenTaiXe, soXe, soChuyen);
		this.giaVe = giaVe;
	}

	public XeTai() {
		super();
		// TODO Auto-generated constructor stub
	}

	public XeTai(String maChuyen, String tenTaiXe, String soXe, int soChuyen) {
		super(maChuyen, tenTaiXe, soXe, soChuyen);
		// TODO Auto-generated constructor stub
	}
	
	
}
