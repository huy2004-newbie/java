package bai3;

import java.util.Scanner;

public class HangHoa {
	protected String maHang;
	protected String tenHang;
	protected float soLuong;
	protected float donGia;
	protected VatLieu[] dsVL;
	public HangHoa() {
		
	}
	
	
	public HangHoa(String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVl) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.dsVL = dsVl;
	}


	public String getMaHang() {
		return maHang;
	}


	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}


	public String getTenHang() {
		return tenHang;
	}


	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}


	public float getSoLuong() {
		return soLuong;
	}


	public void setSoLuong(float soLuong) {
		this.soLuong = soLuong;
	}


	public float getDonGia() {
		return donGia;
	}


	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}


	public VatLieu[] getDsVL() {
		return dsVL;
	}


	public void setDsVL(VatLieu[] dsVL) {
		this.dsVL = dsVL;
	}
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		VatLieu vl = new VatLieu();
		System.out.print("Nhập mã hàng: ");
		this.maHang = sc.nextLine();
		System.out.print("Nhập tên hàng: ");
		this.tenHang = sc.nextLine();
		System.out.print("Nhập số lượng: ");
		this.soLuong = sc.nextFloat();
		System.out.print("Nhập đơn giá: ");
		this.donGia = sc.nextFloat();
		int n = (int)this.soLuong;
		dsVL = new VatLieu[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập vật liệu thứ " + (i+1));
			dsVL[i] = new VatLieu();
			dsVL[i].nhap();
		}
	}
	
	
	public void output() {
		System.out.println("Mã hàng: " + getMaHang());
		System.out.println("Tên hàng: " + getTenHang());
		System.out.println("Số lượng: " + getSoLuong());
		System.out.println("Đơn giá: " + getDonGia());
        int n = (int)this.soLuong;
        for(int i = 0 ; i < n ; i++){
            System.out.println("Thông tin vật liệu thứ " +(i+1));
            System.out.printf("%-10s%-10s%-10s", "Tên", "Màu sắc", "Độ cứng");
            System.out.println("");
            dsVL[i].xuat();
            System.out.println("");
        }
        System.out.println("Tổng tiền: " + tongTien());
	}
	
	
	public float tongTien() {
		return this.soLuong * this.donGia;
	}
	
}
