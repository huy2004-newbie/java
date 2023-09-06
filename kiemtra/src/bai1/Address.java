package bai1;

import java.util.Scanner;

public class Address {
	private String city;
	private String district;
	public Address() {
		
	}
	public Address(String city, String district) {
		super();
		this.city = city;
		this.district = district;
	}
	
	
	public String getCity() {
		return city;
	}
	
	
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public String getDistrict() {
		return district;
	}
	
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập thành phố: ");
		this.city = sc.nextLine();
		System.out.print("Nhập huyện: ");
		this.district = sc.nextLine();
	}
	
	
	public void output() {
		System.out.println("Thành phố: " + getCity());
		System.out.println("Huyện: " + getDistrict());
	}
}
