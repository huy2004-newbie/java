package bai1;

import java.util.Scanner;

public class Animal {
	protected String name;
	protected Byte age;
	protected Float weight;
	public Animal() {
		
	}
	
	
	public Animal(String name, Byte age, Float weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
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


	public Float getWeight() {
		return weight;
	}


	public void setWeight(Float weight) {
		this.weight = weight;
	}
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên: ");
		this.name = sc.nextLine();
		System.out.print("Nhập tuổi: ");
		this.age = sc.nextByte();
		System.out.print("Nhập cân nặng: ");
		this.weight = sc.nextFloat();
	}
	
	
	public void output() {
		System.out.printf("%-10s%-5d%f", this.name, this.age, this.weight);
//		System.out.println("Tên: " + getName());
//		System.out.println("Tuổi: " + getAge());
//		System.out.println("Cân nặng: " + getWeight());
	}
	
	
	public void tiengKeu() {
		System.out.println("tiếng kêu: ");
	}
}
