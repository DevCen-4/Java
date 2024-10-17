package Lap1;

import java.util.Scanner;

public class phan2 {
    public static void main(String[] args) {
        while (true){
            System.out.println("----Nhập Lựa chọn của bạn----");
            System.out.println("1: Bài 3");
            System.out.println("2: Bài 4");
            System.out.println("3: Bài 5");
            System.out.println("0: Thoát!");
            Scanner sc = new Scanner(System.in);
            int x;
            x = sc.nextInt();
            if (x==1) {
                Phan2_Bai3();
            }else if (x==2) {
                Phan2_Bai4();
            } else if (x==3) {
                Phan2_Bai5();
            } else{
                break;
            }
        }
    }
    public static void Phan2_Bai3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cạnh hình lập phương: ");
        Float canh = sc.nextFloat();
        System.out.println("Thể tích hình lập phương: " + Math.pow(canh,3));
    }
    public static void Phan2_Bai4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập các hệ số của phương trình ax^2 + bx + c = 0 (a > 0): ");
        System.out.println("Nhập a: ");
        int a = sc.nextInt();
        System.out.println("Nhập b: ");
        int b = sc.nextInt();
        System.out.println("Nhập c: ");
        int c = sc.nextInt();
        int Delta = (int) (Math.pow(b,2) - 4 * a * c);
        if(Delta == 0){
            System.out.println("Phuong trình có nghiệm kép:  x1 = x2 = " + (-b/(2*a)));
        }else if(Delta < 0){
            System.out.println("Phuong trình Vô nghiệm");
        }else {
            System.out.println("Nghiệm của phương trình "+a+"x^2 + "+b+"x + "+c+" = 0 là: ");
            System.out.println("x1 = "+(-b + Math.pow(Delta,0.5))/(2*a));
            System.out.println("x2 = "+(-b - Math.pow(Delta,0.5))/(2*a));
        }
    }
    public static void Phan2_Bai5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm: ");
        int nam = sc.nextInt();
        if(nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)){
            System.out.println("Năm "+nam +" là năm nhuận !");
        }else {
            System.out.println("Năm "+nam +" không phải là năm nhuận !");
        }
    }
}
