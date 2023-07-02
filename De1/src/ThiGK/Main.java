package ThiGK;

public class Main {
	public static void main(String[] args) {
		XeTai xeTai = new XeTai("MC001", "Tài xế 1", "Xe tải 1", 5, 2000000);
		int thanhTien = xeTai.tinhTien();
		System.out.println("Thành tiền: " + thanhTien);

	}

}
