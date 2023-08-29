package bai3;

import java.util.Scanner;

public class PhongMay {
	static Scanner sc = new Scanner(System.in);
	private String MaPhong;
	private String TenPhong;
	private Double DienTich;
	private Quanly x = new Quanly();
	private May[] y;
	private Integer n;
	public PhongMay() {
		
	}
	
	
	public PhongMay(String MaPhong, String TenPhong, Double DienTich) {
		this.MaPhong = MaPhong;
		this.TenPhong = TenPhong;
		this.DienTich = DienTich;
	}
	
	
	public void setMaPhong(String MaPhong) {
		this.MaPhong = MaPhong;
	}
	
	
	public String getMaPhong() {
		return this.MaPhong;
	}
	
	
	public void setTenPhong(String TenPhong) {
		this.TenPhong = TenPhong;
	}
	
	
	public String getTenPhong() {
		return this.TenPhong;
	}
	
	
	public void setDienTich(Double DienTich) {
		this.DienTich = DienTich;
	}
	
	
	public Double getDienTich() {
		return this.DienTich;
	}
	
	
	public void Nhap() {
		System.out.print("Mã phòng: ");
		this.MaPhong = sc.nextLine();
		System.out.print("Tên phòng: ");
		this.TenPhong = sc.nextLine();
		System.out.print("Diện tích: ");
		this.DienTich = sc.nextDouble();
		x.Nhap();
		System.out.print("Nhập số lượng máy: ");
		this.n = sc.nextInt();
		y = new May[this.n];
		for(int i = 0; i < this.n; i++) {
			May may = new May();
			System.out.println("Nhập máy thứ " + (i+1));
			may.Nhap();
			y[i] = may;
		}
	}
	
	
	public void Xuat() {
		System.out.println("-----XUẤT-----");
		System.out.println("Mã Phòng: " + getMaPhong());
		System.out.println("Tên Phòng: " + getTenPhong());
		System.out.println("Diện Tích: " + getDienTich());
		x.Xuat();
		for(int i = 0; i < this.n; i++) {
			System.out.println("Máy thứ " + (i+1));
			y[i].Xuat();
		}
	}
	
	
	public static void main(String[] args) {
		PhongMay pm = new PhongMay();
		pm.Nhap();
		pm.Xuat();
	}
}
