package bai3;

import java.util.Scanner;

public class VatLieu {
	protected String ten;
	protected String mauSac;
	protected int doCung;
	public VatLieu() {
		
	}
	
	
	public VatLieu(String ten, String mauSac, int doCung) {
		super();
		this.ten = ten;
		this.mauSac = mauSac;
		this.doCung = doCung;
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public String getMauSac() {
		return mauSac;
	}


	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}


	public int getDoCung() {
		return doCung;
	}


	public void setDoCung(int doCung) {
		this.doCung = doCung;
	}
	
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Tên: ");
		this.ten = sc.nextLine();
		System.out.print("Màu sắc: ");
		this.mauSac = sc.nextLine();
		System.out.print("Độ cứng: ");
		this.doCung = sc.nextInt();
	}
	
	
	public void xuat() {
//		System.out.printf("%-10s%-10s%-10d", "Tên", "Màu sắc", "Độ cứng");
		System.out.printf("%-10s%-10s%-10d", getTen(), getMauSac(), getDoCung());
	}
	
	
	
}
