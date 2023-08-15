package btbuoi2;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá trị của a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập giá trị của b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập giá trị của c: ");
        double c = sc.nextDouble();

        double denta = b * b - 4 * a * c;


        if (a == 0) {
            System.out.println("Ko la PT bac 4.");
        } else if (denta < 0) {
            System.out.println("PT ko co nghiem thuc.");
        } else {
            double a1 = (-b + Math.sqrt(denta)) / (2 * a);
            double a2 = (-b - Math.sqrt(denta)) / (2 * a);
    		if(a1 >= 0) {
            	if(a2 >= 0) {
            		System.out.println("pt co 4 nghiem:");
            		nghiem(a1);
            		nghiem(a2);
            	}
            	else {
            		System.out.println("PT co 2 nghiem:");
            		nghiem(a1);
            	}
            }
    		else {
    			if(a2 >= 0) {
    				System.out.println("PT co 2 nghiem:");
    				nghiem(a2);
    			}
    			else {
    				System.out.println("PT ko co nghiem thuc");
    			}
    		}
        }

        sc.close();        
	}    
    public static void nghiem(double a1){   
        if(a1>0) {
        	double x1 = Math.sqrt(a1);
        	double x2 = -Math.sqrt(a1);
        	System.out.println("x="+x1);
        	System.out.println("x="+x2);
        }
        else if(a1 == 0) {
        	double x1 = 0;
        	double x2 = 0;
        }	   
    }
 
    
}
