package ThiGK;

public class XeKhach extends Xe{
	private int giaVe; 
	private int soChoNgoi;
	
	
	public int getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(int giaVe) {
		if (giaVe > 0) {
			this.giaVe = giaVe;
		} else {
			System.out.println("Gia ve lon hon 0 ");
		}

	}
	public int getSoChoNgoi() {
		return soChoNgoi;
	}
	public void setSoChoNgoi(int soChoNgoi) {
		 if (soChoNgoi == 12 || soChoNgoi == 30 || soChoNgoi == 45) {
			 this.soChoNgoi = soChoNgoi;
		} else {
			System.out.println("So cho phai la 12-30-45");
		}
		
	}
	public XeKhach(String maChuyen, String tenTaiXe, String soXe, int soChuyen, int giaVe, int soChoNgoi) {
		super(maChuyen, tenTaiXe, soXe, soChuyen);
		setGiaVe(giaVe);
		setSoChoNgoi(soChoNgoi);
	}
	public XeKhach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public XeKhach(String maChuyen, String tenTaiXe, String soXe, int soChuyen) {
		super(maChuyen, tenTaiXe, soXe, soChuyen);
		// TODO Auto-generated constructor stub
	}
	
	public double thanhtien() {
		return soChoNgoi* getSoChuyen()* giaVe;	
		
	}
	
	
	
}
