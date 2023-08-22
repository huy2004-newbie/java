package bt;

import java.util.Scanner;

public class bai2 {
	Scanner sc = new Scanner(System.in);
	public int chieuDai;
	public int chieuRong;
	public void bai2() {
		
	}
	
	
	public void bai2(int chieuDai, int chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	
	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}
	
	
	public int getChieuDai() {
		return this.chieuDai;
	}
	
	
	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	
	public int getChieuRong() {
		return this.chieuRong;
	}
	
	
	public void nhap() {
		System.out.println("Nhap chieu dai:");
		chieuRong = sc.nextInt();
		System.out.println("Nhap chieu rong:");
		setChieuRong(chieuRong);
		chieuDai = sc.nextInt();
		setChieuDai(chieuDai);
	}
	
	
	public void veHinhChuNhat() {
		for(int i = 0; i < this.chieuRong; i++) {
			System.out.print("*");
		}
		System.out.println("");
		
		
		for(int i = 0; i < this.chieuDai - 2; i++) {
			for(int j = 0; j < this.chieuRong; j++) {
				if(j == 0 || j == this.chieuRong - 1) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		
		for(int i = 0; i < this.chieuRong; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	
	
	public float chuVi() {
		float chuVi = (this.chieuDai + this.chieuRong)*2;
		return chuVi;
	}
	
	
	public float dienTich() {
		float dienTich = this.chieuDai * this.chieuRong;
		return dienTich;
	}
	
	
	public static void main(String[] args) {
		bai2 hinhChuNhat = new bai2();
		hinhChuNhat.nhap();
		hinhChuNhat.veHinhChuNhat();
		System.out.println("Chu vi hcn:" + hinhChuNhat.chuVi());
		System.out.println("Dien tich hcn:" + hinhChuNhat.dienTich());
	}
	
	
	
	
	
}
