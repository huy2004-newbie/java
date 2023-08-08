package btbuoi2;

import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so qua chanh:");
		int x = sc.nextInt();
		System.out.println("Nhap so qua tao:");
		int y = sc.nextInt();
		System.out.println("Nhap so qua le:");
		int z = sc.nextInt();
		int a=0,b=0,c=0;
		for(int i = 1; i <= x; i++) {
			a=i;
			if(2*i <= y && 4*i <= z) {
				b=2*i;
				c=4*i;
			}			
		}
		a=b/2;
		if(a == 0 || b == 0 || c == 0)
			System.out.println("Ko co gt thoa man ti le 1 chanh : 2 tao : 3 le");
		else
			System.out.println(a);
			System.out.println("=> Tong so qua toi da: " +(a+b+c)+" ("+a+" chanh, "+b+" tao, "+c+" le )");
	}
}
