package bt;

import java.util.Scanner;

public class bai3 {
	static Scanner sc = new Scanner(System.in);
	public long maSinhVien;
	public String hoTen;
	public int diemToan;
	public int diemLy;
	public int diemHoa;	
	public void bai3() {
		
	}
	
	
	public void bai3(int maSinhVien, String hoTen, int diemToan, int diemLy, int diemHoa) {
		
	}
	
	
	public void setMaSinhVien(long maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	
	
	public long getMaSinhVien() {
		return this.maSinhVien;
	}
	
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	
	public String getHoTen() {
		return this.hoTen;
	}
	
	
	public void setDiemToan(int diemToan) {
		this.diemToan = diemToan;
	}
	
	
	public int getDiemToan() {
		return this.diemToan;
	}
	
	
	public void setDiemLy(int diemLy) {
		this.diemLy = diemLy;
	}
	
	
	public int getDiemLy() {
		return this.diemLy;
	}
	
	
	public void setDiemHoa(int diemHoa) {
		this.diemHoa = diemHoa;
	}
	
	
	public int getDiemHoa() {
		return this.diemHoa;
	}
	
	
	public void nhap() {
		System.out.print("Nhap ma sinh vien:");	
		maSinhVien = sc.nextLong();
		System.out.print("Nhap ho ten:");	
		hoTen = sc.next();
		System.out.print("Nhap diem toan:");	
		diemToan = sc.nextInt();
		System.out.print("Nhap diem ly:");	
		diemLy = sc.nextInt();
		System.out.print("Nhap diem hoa:");	
		diemHoa = sc.nextInt();
	}
	
	
	public void xuat() {
		System.out.println(this.maSinhVien + "\t\t" + this.hoTen + "\t\t" + this.diemToan + "\t\t" + this.diemLy + "\t\t" + this.diemHoa + "\t\t" + this.diemTB());
	}
	
	
	public float diemTB() {
		return (this.diemToan + this.diemLy + this.diemHoa)/3;
	}
	
	
	public static void main(String[] args) {
		bai3[] danhSachSinhVien = new bai3[5];
		for(int i = 0; i < danhSachSinhVien.length; i++) {
			System.out.println("Nhap sinh vien thu " + (i + 1));
			danhSachSinhVien[i] = new bai3();
			danhSachSinhVien[i].nhap();      
		}
		
		
		System.out.println("MSV" + "\t\t" + "Ho ten" + "\t\t" + "Diem toan" + "\t" + "Diem ly" + "\t\t" + "Diem hoa" + "\t" + "Diem TB");
		for(bai3 sinhVien : danhSachSinhVien) {
			sinhVien.xuat();
		}
		
		
	}
}
