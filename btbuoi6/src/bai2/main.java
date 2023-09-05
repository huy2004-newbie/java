package bai2;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng học sinh: ");
		int n = sc.nextInt();
		Student[] students = new Student[n];
		for(int i=0; i < students.length; i++) {
			System.out.println("Học sinh thứ " + (i+1));
			students[i] = new Student();
			students[i].input();
		}
		
		
		System.out.printf("%-5s%-10s%-10s%-10s%-15s%-12s%-10s%-10s", "STT", "Tên", "Tuổi", "Địa chỉ", "Sinh nhật", "ID", "Lớp", "Trường");
		for(int i=0; i < students.length; i++) {
			System.out.println("");
			System.out.printf("%-5d", (i+1));
			students[i].output();
		}
	}
	
}
