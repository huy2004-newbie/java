package bai1;

import java.util.Scanner;

public class Hang {
	static Scanner sc = new Scanner(System.in);
	private String MaHang;
	private String TenHang;
	private NSX x;
	public Hang() {
		
	}
	
	
	public Hang(String MaHang, String TenHang) {
		this.MaHang = MaHang;
		this.TenHang = TenHang;
	}
	
	
	public void setMaHang(String MaHang) {
		this.MaHang = MaHang;
	}
	
	
	public String getMaHang() {
		return this.MaHang;
	}
	
	
	public void setTenHang(String TenHang) {
		this.TenHang = TenHang;
	}
	
	
	public String getTenHang() {
		return this.TenHang;
	}
	
		
	public void nhap() {
		System.out.print("Mã hàng: ");
		this.MaHang = sc.nextLine();
		System.out.print("Tên hàng: ");
		this.TenHang = sc.nextLine();
	}
	
	
	public void xuat() {
		System.out.println("Mã hàng: " + getMaHang());
		System.out.println("Tên hàng: " + getTenHang());
	}
	
	
	public static void main(String[] args) {
		Hang hang = new Hang();
		NSX nsx = new NSX();
		hang.nhap();
		nsx.nhap();
		System.out.println("------XUẤT------");
		hang.xuat();
		nsx.xuat();
	}
}
