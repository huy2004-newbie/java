package bai2;

import java.util.Scanner;

public class Student {
	static Scanner sc = new Scanner(System.in);
	private String Name;
	private String Class;
	private Double Score;
	private Faculty y;
	public Student() {
		
	}
	
	
	public Student(String Name, String Class, Double Score) {
		this.Name = Name;
		this.Class = Class;
		this.Score = Score;
	}
	
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	
	public String getName() {
		return this.Name;
	}
	
	
	public void set_Class(String Class) {
		this.Class = Class;
	}
	
	
	public String get_Class() {
		return this.Class;
	}
	
	
	public void setScore(Double Score) {
		this.Score = Score;
	}
	
	
	public Double getScore() {
		return this.Score;
	}
	
	
	Faculty fac = new Faculty();
	public void Input() {
		System.out.print("Nhập tên: ");
		this.Name = sc.nextLine();
		System.out.print("Nhập lớp: ");
		this.Class = sc.nextLine();
		System.out.print("Nhập điểm: ");
		this.Score = sc.nextDouble();
		sc.nextLine();
		fac.Input();
	}
	
	
	public void Output() {
		System.out.println("Tên: " + getName());
		System.out.println("Lớp: " + get_Class());
		System.out.println("Điểm: " + getScore());
		fac.Output();		
	}
	
	
	public static void main(String[] args) {
		Student[] students = new Student[5];
		for(int i = 0; i < 5; i++) {
			Student student = new Student();
			System.out.println("Sinh viên thứ " + (i+1));
			student.Input();
			students[i] = student;
		}
		
		System.out.println("------XUẤT------");
		for(int i = 0; i < 5; i++) {
			students[i].Output();
			System.out.println("----------------");
		}
	}
}
