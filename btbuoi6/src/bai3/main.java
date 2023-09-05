package bai3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Nhập số luợng hàng hóa: ");
	    int n = sc.nextInt();
	    List<HangHoaDienTu> hhDT = new ArrayList<>(n);
	    List<HangHoaGiaDung> hhGD = new ArrayList<>(n);
	    
	    System.out.println("- Nhập thông tin hàng hóa gia dụng");
	    for(int i = 0 ; i < n ; i++){
	        System.out.println("Thông tin hàng hóa gia dụng " + (i + 1));
	        HangHoaGiaDung hhGD1 = new HangHoaGiaDung();
	        hhGD1.input();
	        hhGD.add(hhGD1);
	        System.out.println();
	    }

	    System.out.println("- Nhập thông tin hàng hóa điện tử");
	    for (int i = 0 ; i < n ; i++){
	        System.out.println("Thông tin hàng hóa điện tử " + (i + 1));
	        HangHoaDienTu hhDT1 = new HangHoaDienTu();
	        hhDT1.input();
	        hhDT.add(hhDT1);
	        System.out.println();
	    }

	    System.out.println("------Thông tin các mặt hàng------");
	    int i = 0;
	    System.out.println("- Thông tin hàng hóa gia dụng");
	    for (HangHoaGiaDung hangGD : hhGD){
	        System.out.println("+ Mặt hàng " +(i+1));
	        hangGD.output();
	        ++i;
	    }

	    int j =0;
	    System.out.println("-------------------------------------------------");
	    System.out.println("- Thông tin hàng hóa điện tử");
	    for (HangHoaDienTu hangDT : hhDT){
	        System.out.println("+ Mặt hàng "+(j+1));
	        hangDT.output();
	        ++j;
	    }	
	}
}
