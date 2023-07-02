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
		if (soChuyen > 0) {
			this.soChuyen = soChuyen;
		} else {
			System.out.println("So chuyen lon hon 0");
		}
		
	}
	public Xe(String maChuyen, String tenTaiXe, String soXe, int soChuyen) {
		super();
		this.maChuyen = maChuyen;
		this.tenTaiXe = tenTaiXe;
		this.soXe = soXe;
		setSoChuyen(soChuyen);
	}
	public Xe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean kiemTraMaTrung(Xe[] danhSachXe, String maChuyen, String soXe) {
	    for (Xe xe : danhSachXe) {
	        if (xe != null && xe.getMaChuyen().equals(maChuyen) && xe.getSoXe().equals(soXe)) {
	            return true; // Mã chuyến và số xe trùng
	        }
	    }
	    return false; // Mã chuyến và số xe không trùng
	}


	@Override
	public String toString() {
		return "Xe [maChuyen=" + maChuyen + ", tenTaiXe=" + tenTaiXe + ", soXe=" + soXe + ", soChuyen=" + soChuyen
				+ "]";
	}

	
	
}
