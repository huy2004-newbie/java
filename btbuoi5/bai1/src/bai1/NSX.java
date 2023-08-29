package bai1;

import java.util.Scanner;

public class NSX {
	static Scanner sc = new Scanner(System.in);
	private String MaNSX;
	private String TenNSX;
	private String DcNSX;
	public NSX() {
		
	}
	
	
	public NSX(String MaNSX, String TenNSX, String DcNSX) {
		this.MaNSX = MaNSX;
		this.TenNSX = TenNSX;
		this.DcNSX = DcNSX;
	}
	
	
	public void setMaNSX(String MaNSX) {
		this.MaNSX = MaNSX;
	}
	
	
	public String getMaNSX() {
		return this.MaNSX;
	}
	
	
	public void setTenNSX(String TenNSX) {
		this.TenNSX = TenNSX;
	}
	
	
	public String getTenNSX() {
		return this.TenNSX;
	}
	
	
	public void setDcNSX(String DcNSX) {
		this.DcNSX = DcNSX;
	}
	
	
	public String getDcNSX() {
		return this.DcNSX;
	}
	
	
	public void nhap() {
		System.out.print("Nhập mã nhà sản xuất: ");
		this.MaNSX = sc.nextLine();
		System.out.print("Nhập tên nhà sản xuất: ");
		this.TenNSX = sc.nextLine();
		System.out.print("Nhập địa chỉ nhà sản xuất: ");
		this.DcNSX = sc.nextLine();
	}
	
	
	public void xuat() {
		System.out.println("Mã nhà sản xuất: " + this.getMaNSX());		
		System.out.println("Tên nhà sản xuất: " + this.getTenNSX());
		System.out.println("Địa chỉ nhà sản xuất: " + this.getDcNSX());
	}
}
