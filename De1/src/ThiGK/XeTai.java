package ThiGK;

public class XeTai extends Xe{
	private int giaChuyen;

	public int getGiaChuyen() {
		return giaChuyen;
	}

	public void setGiaChuyen(int giaChuyen) {
		this.giaChuyen = giaChuyen;
	}

	public XeTai(String maChuyen, String tenTaiXe, String soXe, int soChuyen, int giaChuyen) {
		super(maChuyen, tenTaiXe, soXe, soChuyen);
		this.giaChuyen = giaChuyen;
	}

	public XeTai() {
		super();
		// TODO Auto-generated constructor stub
	}

	public XeTai(String maChuyen, String tenTaiXe, String soXe, int soChuyen) {
		super(maChuyen, tenTaiXe, soXe, soChuyen);
		// TODO Auto-generated constructor stub
	}
	
	
	public void thanhTien() {
		int tien= giaChuyen * giaChuyen;
	}

	public int tinhTien() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "XeTai [giaChuyen=" + giaChuyen + ", tinhTien()=" + tinhTien() + "]";
	}
	
	
	
}
