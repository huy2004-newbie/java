package bai2;

import java.util.Scanner;

public class Faculty {
	static Scanner sc = new Scanner(System.in);
	private String Name;
	private String Date;
	private School x = new School();
	public Faculty() {
		
	}
	
	
	public Faculty(String Name, String Date) {
		this.Name = Name;
		this.Date = Date;
	}
	
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	
	public String getName() {
		return this.Name;
	}
	
	
	public void setDate(String Date) {
		this.Date = Date;
	}
	
	
	public String getDate() {
		return this.Date;
	}
	
	
	public void Input() {
		System.out.print("Nhập tên khoa: ");
		this.Name = sc.nextLine();
		System.out.print("Nhập ngày vào khoa: ");
		this.Date = sc.nextLine();
		System.out.print("Tên trường: ");
		String Name_school = sc.nextLine();
		x.setName(Name_school);
		System.out.print("Ngày vào trường: ");
		String Date_school = sc.nextLine();
		x.setDate(Date_school);
	}
	
	
	public void Output() {
		System.out.println("Tên khoa: " + getName());
		System.out.println("Ngày vào khoa: " + getDate());
		System.out.println("Tên trường: " + x.getName());
		System.out.println("Ngày vào trường: " + x.getDate());
	}
	
	public static void main(String[] args) {
		Faculty fac = new Faculty();
		fac.Input();
		fac.Output();
	}
}
