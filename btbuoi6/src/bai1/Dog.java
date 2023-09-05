package bai1;

import java.util.Scanner;

public class Dog extends Animal {
	private String Charater;
	public Dog() {
		
	}
	

	public Dog(String charater) {
		super();
		this.Charater = charater;
	}


	public String getCharater() {
		return Charater;
	}


	public void setCharater(String charater) {
		Charater = charater;
	}
	
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thông tin của chó:");
		super.input();
		System.out.print("Nhập tính cách của chó: ");
		this.Charater = sc.nextLine();
	}
	
	
	@Override
	public void output() {
		System.out.println("----Các thông tin của chó----");
		System.out.printf("%-10s%-10s%-15s%-10s", "Tên", "Tuổi", "Cân nặng", "Tích cách");
		System.out.println("");
		System.out.printf("%-10s%-10d%.2f%-10s%-10s", super.getName(), super.getAge(), super.getWeight(), " ", this.Charater);
		System.out.println("");
//		super.output();
//		System.out.println("Tính cách: " + getCharater());
	}
	
	
	@Override
	public void tiengKeu() {
		System.out.println("Tiếng kêu: gâu gâu");
	}
	
}
