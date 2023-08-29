package bai3;

import java.util.Scanner;

public class Quanly {
	static Scanner sc = new Scanner(System.in);
	private String MaQL;
	private String Hoten;
	public Quanly() {
		
	}
	
	
	public Quanly(String MaQL, String Hoten) {
		this.MaQL = MaQL;
		this.Hoten = Hoten;
	}
	
	
	public void setMaQL(String MaQL) {
		this.MaQL = MaQL;
	}
	
	
	public String getMaQL() {
		return this.MaQL;
	}
	
	
	public void setHoTen(String Hoten) {
		this.Hoten = Hoten;
	}
	
	
	public String getHoTen() {
		return this.Hoten;
	}
	
	
	public void Nhap() {
		System.out.print("Mã quản lý: ");
		this.MaQL = sc.nextLine();
		System.out.print("Họ tên: ");
		this.Hoten = sc.nextLine();
	}
	

	public void Xuat() {
		System.out.println("Mã quản lý: " + getMaQL());
		System.out.println("Họ tên người quản lý: " + getHoTen());
	}
}
