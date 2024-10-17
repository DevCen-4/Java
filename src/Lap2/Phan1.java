package Lap2;

import java.awt.*;
import java.util.Scanner;

public class Phan1 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("----Nhập Lựa chọn của bạn----");
            System.out.println("1: Bài 1");
            System.out.println("2: Bài 2");
            System.out.println("0: Thoát!");
            Scanner sc = new Scanner(System.in);
            int x;
            x = sc.nextInt();
            if (x == 1) {
                Phan1_Bai1();
            } else if (x == 2) {
                Phan1_Bai2();
            } else {
                break;
            }
        }
    }

    public static void Phan1_Bai1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập các hệ số của phương trình ax + b = 0");
        System.out.println("Nhập a: ");
        int a = sc.nextInt();
        System.out.println("Nhập b: ");
        int b = sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình " + a + "x + " + b + " = 0 có vô số nghiệm!");

            } else {
                System.out.println("Phương trình " + a + "x + " + b + " = 0 vô nghiệm!");
            }
        } else {
            System.out.println("Phương trình " + a + "x + " + b + " = 0 có nghiệm x = " + -b / a);
        }

    }

    public static void Phan1_Bai2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập các hệ số của phương trình ax^2 + bx + c = 0 (a > 0): ");
        System.out.println("Nhập a: ");
        int a = sc.nextInt();
        System.out.println("Nhập b: ");
        int b = sc.nextInt();
        System.out.println("Nhập c: ");
        int c = sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trình " + a + "x^2 + " + b + "x + " + c + " = 0 có vô số nghiệm!");

                } else {
                    System.out.println("Phuong trình " + a + "x^2 + " + b + "x + " + c + " = 0 vô nghiệm");
                }
            } else {
                System.out.println("Phương trình " + a + "x^2 + " + b + "x + " + c + " = 0 có nghiệm x = " + -c / b);
            }
        } else {
            int Delta = (int) (Math.pow(b, 2) - 4 * a * c);
            if (Delta == 0) {
                System.out.println("Phuong trình " + a + "x^2 + " + b + "x + " + c + " = 0 có nghiệm kép:  x1 = x2 = " + (-b / (2 * a)));
            } else if (Delta < 0) {
                System.out.println("Phuong trình Vô nghiệm");
            } else {
                System.out.println("Nghiệm của phương trình " + a + "x^2 + " + b + "x + " + c + " = 0 là: ");
                System.out.println("x1 = " + (-b + Math.pow(Delta, 0.5)) / (2 * a));
                System.out.println("x2 = " + (-b - Math.pow(Delta, 0.5)) / (2 * a));
            }
        }

    }
}
