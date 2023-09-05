package bai2;

import java.util.Scanner;

public class Date {
	protected Integer year;
	protected Byte month;
	protected Byte day;
	public Date(){
		
	}
	
	
	public Date(Integer year, Byte month, Byte day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	
	public Integer getYear() {
		return year;
	}
	
	
	public void setYear(Integer year) {
		this.year = year;
	}
	
	
	public Byte getMonth() {
		return month;
	}
	
	
	public void setMonth(Byte month) {
		this.month = month;
	}
	
	
	public Byte getDay() {
		return day;
	}
	
	
	public void setDay(Byte day) {
		this.day = day;
	}
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ngày: ");
		this.day = sc.nextByte();
		System.out.print("Tháng: ");
		this.month = sc.nextByte();
		System.out.print("Năm: ");
		this.year = sc.nextInt();		
	}
	
	
	public void output() {
		System.out.printf(getDay() + "/" + getMonth() + "/" + getYear());
	}
	
}
