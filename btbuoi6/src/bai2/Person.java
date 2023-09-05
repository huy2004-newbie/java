package bai2;

import java.util.Scanner;

public class Person {
	protected String name;
	protected Byte age;
	protected String address;
	protected Date birthDay = new Date();
	public Person() {
		
	}
	
	
	public Person(String name, Byte age, String address, Date birthDay) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.birthDay = birthDay;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Byte getAge() {
		return age;
	}


	public void setAge(Byte age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Date getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Tên: ");
		this.name = sc.nextLine();
		System.out.print("Tuổi: ");
		this.age = sc.nextByte();
		sc.nextLine();
		System.out.print("Địa chỉ: ");
		this.address = sc.nextLine();
		System.out.println("Nhập sinh nhật:");
		birthDay.input();
	}
	
	
	public void output() {
		System.out.printf("%-10s%-10d%-10s%-2d%-1s%-2d%-1s%-2d", getName(), getAge(), getAddress(), birthDay.day ,"/" , birthDay.month,"/" , birthDay.year);
	}
	
	public static void main(String[] args) {
		Person ps = new Person();
		ps.input();
		ps.output();
	}
}
