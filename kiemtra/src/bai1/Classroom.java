package bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Classroom {
	private int classId;
	private int numberOfStudent;
	private List<Student> listStudents = new ArrayList<>();
	public Classroom() {
		
	}
	
	
	public Classroom(int classId, int numberOfStudent, List<Student> listStudents) {
		super();
		this.classId = classId;
		this.numberOfStudent = numberOfStudent;
		this.listStudents = listStudents;
	}


	public int getClassId() {
		return classId;
	}


	public void setClassId(int classId) {
		this.classId = classId;
	}


	public int getNumberOfStudent() {
		return numberOfStudent;
	}


	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}


	public List<Student> getListStudents() {
		return listStudents;
	}


	public void setListStudents(List<Student> listStudents) {
		this.listStudents = listStudents;
	}
	
	
	public void intput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã lớp: ");
		this.classId = sc.nextInt();
		System.out.print("Nhập số lượng học sinh: ");
		this.numberOfStudent = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < this.numberOfStudent; i++) {
			System.out.println("Nhập học sinh thứ " + (i+1));
			Student st = new Student();
			st.input();
			listStudents.add(st);
		}
	}
	
	
	public void output() {
		System.out.println("Mã lớp: " + getClassId());
		System.out.println("Số lượng học sinh: " + getNumberOfStudent());
		for(int i = 0; i < getNumberOfStudent(); i++) {
			System.out.println("Học sinh thứ " + (i+1));
			listStudents.get(i).output();
			System.out.println(".........................");
		}
	}
	
	
	public void searchByName() {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		for(int i = 0; i < numberOfStudent; i++) {
			if(listStudents.get(i).getName() == name) {
				System.out.println("Học sinh cần tìm là:");
				listStudents.get(i).output();
			}
			else {
				System.out.println("ko có học sinh trên!");
			}
		}
	}
}
