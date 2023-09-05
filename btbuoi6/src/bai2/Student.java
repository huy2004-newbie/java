package bai2;

import java.util.Scanner;

public class Student extends Person {
	private String id;
	private String Class;
	private String school;
	public Student() {
		
	}
	
	
	public Student(String id, String class1, String school) {
		super();
		this.id = id;
		Class = class1;
		this.school = school;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getCLASS() {
		return Class;
	}


	public void setClass(String class1) {
		Class = class1;
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}
	
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("ID: ");
		this.id = sc.nextLine();
		System.out.print("Lớp: ");
		this.Class = sc.nextLine();
		System.out.print("Trường: ");
		this.school = sc.nextLine();
	}
	
	
	@Override
	public void output() {
		super.output();
		System.out.printf("%-5s%-12s%-10s%-10s", " ", getId(), getCLASS(), getSchool());
	}
	
	
	public static void main(String[] args) {
		Student st = new Student();
		st.input();
		st.output();
	}
}
