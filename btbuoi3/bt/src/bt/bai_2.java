package bt;

import java.util.Scanner;

public class bai_2 {
	public static int[] them(int a[], int n) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vi tri can them phan tu: ");
        int viTriThem = sc.nextInt();
        if (viTriThem < 0 || viTriThem > n) {
            System.out.println("Vi tri khong hop le.");
        return a;
        } 
        else {
            System.out.print("Nhap gt muon them: ");
            int x = sc.nextInt();//gt them

            int a_new[] = new int[n + 1];
            for (int i = 0, j = 0; i < a.length + 1; i++) {
                if (i == viTriThem-1) {
                    a_new[i] = x;
                } else {
                    a_new[i] = a[j++];
                }
            }
            
            System.out.print("Ket qua sau khi them: ");
            for (int num : a_new) {
                System.out.print(num + " ");
            }
            System.out.println();
            
            return a_new;
        }
        
	}
	
	
	public static int[] xoa(int a[], int n) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Nhap vi tri can xoa phan tu: ");
	    int viTriXoa = sc.nextInt();
	    if (viTriXoa < 0 || viTriXoa > n) {
	       System.out.println("Vi tri khong hop le.");
	       return a;
	    } 
	    else {
	    	int a_new[] = new int[n - 1];
	        for (int i = 0, j = 0; i < a.length ; i++) {
	        	if (i != viTriXoa-1) {
	        		a_new[j++] = a[i];
	        	}
	        }
	        System.out.print("Ket qua sau khi xoa: ");
	        for (int num : a_new) {
	        	System.out.print(num + " ");
	        }
	        System.out.println();
	        return a_new;
	    }
	
	}  
	
	
	public static void xuat(int a[], int n) {
		for(int i=0; i<n; i++) {
			System.out.print("a[" + i + "]=" + a[i] + "\t");
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong ptu:");
		int n = sc.nextInt(); 
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}
		//thêm
		a = them(a,n);
		n = n+1;
		
		//xóa
		a=xoa(a,n);
		n=n-1;
	}
}



