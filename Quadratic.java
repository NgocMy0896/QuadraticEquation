/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Truong Ngoc My
 */
public class Quadratic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        a = Input("Nhap he so a : ");
        b = Input("Nhap he so a : ");
        c = Input("Nhap he so a : ");
        Caculator(a, b, c);       
    }
    public static int Input (String str) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.err.println(str);
        x = sc.nextInt();
        return x;
    }
    public static void Caculator (int a, int b, int c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) 
                    System.out.println("Phuong trinh bac hai vo so nghiem");
                else
                    System.out.println("Phuong trinh bac hai vo nghiem");                
            } else 
                System.out.println("Phuong trinh bac hai co nghiem la x = " + (-c/b));
        }
        else {
            double x1;
            double x2;
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0)
                System.out.println("Phuong trinh vo nghiem");
            else if (delta > 0) {
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co nghiem x1 = " + x1);
                System.out.println("Phuong trinh co nghiem x1 = " + x2);
            }
            else System.out.println("Phuong trinh co nghiem kep x1 = x2"+ (-b/(2*a)));
        }
    }
}
