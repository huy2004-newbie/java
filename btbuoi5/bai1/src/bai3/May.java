package bai3;

import java.util.Scanner;

public class May {
	static Scanner sc = new Scanner(System.in);
	private String MaMay;
	private String TenMay;
	private String TinhTrang;
	public May() {
		
	}
	
	
	public May(String MaMay, String TenMay, String TinhTrang) {
		this.MaMay = MaMay;
		this.TenMay = TenMay;
		this.TinhTrang = TinhTrang;
	}
	
	
	public void setMaMay(String MaMay) {
		this.MaMay = MaMay;
	}
	
	
	public String getMaMay() {
		return this.MaMay;
	}
	
	
	public void setTenMay(String TenMay) {
		this.TenMay = TenMay;
	}
	
	
	public String getTenMay() {
		return this.TenMay;
	}
	
	
	public void setTinhTrang(String TinhTrang) {
		this.TinhTrang =TinhTrang;
	}
	
	
	public String getTinhTrang() {
		return this.TinhTrang;
	}
	
	
	public void Nhap() {
		System.out.print("Nhập mã máy: ");
		this.MaMay = sc.nextLine();
		System.out.print("Nhập tên máy: ");
		this.TenMay = sc.nextLine();
		System.out.print("Nhập tình trạng: ");
		this.TinhTrang = sc.nextLine();
	}
	
	
	public void Xuat() {
		System.out.println("Mã máy: " + getMaMay());
		System.out.println("Tên máy: " + getTenMay());
		System.out.println("Tình trạng: " + getTinhTrang());
	}
}
