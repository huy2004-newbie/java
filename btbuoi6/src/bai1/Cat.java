package bai1;

import java.util.Scanner;

public class Cat extends Animal {
	protected String color;
	protected String preferences;
	protected String ownerName;
	public Cat() {
		
	}
	
	
	public Cat(String color, String preferences, String ownerName) {
		super();
		this.color = color;
		this.preferences = preferences;
		this.ownerName = ownerName;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getPreferences() {
		return preferences;
	}


	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
	public void input() {
		System.out.println("Nhập các thông tin của mèo:");
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập màu của: ");
		this.color = sc.nextLine();
		System.out.print("Nhập sở thích của: ");
		this.preferences = sc.nextLine();
		System.out.print("Nhập người sở hữu: ");
		this.ownerName = sc.nextLine();
		System.out.println("");
	}
	
	
	public void output() {
		System.out.println("----Các thông tin của mèo----");
		System.out.printf("%-10s%-10s%-15s%-10s%-15s%-15s", "Tên", "Tuổi", "Cân nặng", "Màu", "Sở thích", "Người sở hữu");
		System.out.println("");
		System.out.printf("%-10s%-10d%.2f%-10s%-10s%-15s%-15s", super.getName(), super.getAge(), super.getWeight(), " ", this.color, this.preferences, this.ownerName);
		System.out.println("");
	}
	
	@Override
	public void tiengKeu() {
		System.out.println("Tiếng kêu: Meow meow");
	}
	
}
