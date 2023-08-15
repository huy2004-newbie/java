package bt;

import java.util.Scanner;

public class bai_3 {
	
	public static void sapXep(int a[], int n) {
		for(int i = 0; i < n; i++) {
			for(int j = i; j<n; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}	
			}
		}
	}
	
	public static void xuat(int a[], int n) {
		for(int i = 0; i<n; i++) {
			System.out.print("a[" + i + "]=" + a[i] + "\t");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu:");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}
		sapXep(a, n);
		System.out.println("Mang sau khi sx:");
		xuat(a, n);
	}
}
