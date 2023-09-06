package bai1;

import java.util.Scanner;

public class Student extends Person {
	private String id;
	private Address address = new Address();
	private double gpa;
	public Student() {
		
	}
	
	
	public Student(String id, Address address, double gpa) {
		super();
		this.id = id;
		this.address = address;
		this.gpa = gpa;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("Nhập ID: ");
		this.id = sc.nextLine();
		System.out.println("--Nhập địa chỉ--");
		address.input();
		System.out.print("GPA: ");
		this.gpa = sc.nextDouble();
	}
	
	
	@Override
	public void output() {
		super.output();
		System.out.println("ID: " + getId());
		System.out.println("Địa chỉ");
		address.output();
		System.out.println("GPA: " + getGpa());
	}
}
