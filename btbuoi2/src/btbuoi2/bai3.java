package btbuoi2;
import java.util.Scanner;

public class bai3 {
	public static boolean kiemtra(int n){
		for(int i=2; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}	
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Nhap n:");
		int n = sc.nextInt();
		if(kiemtra(n))
			System.out.println(n + " la so nguyen to");
		else
			System.out.println(n + " ko la so nguyen to");
		
	}
}
