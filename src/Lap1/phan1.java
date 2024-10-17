package Lap1;

import java.util.Scanner;

public class phan1 {
    public static void main(String[] args) {
        while (true){
            System.out.println("----Nhập Lựa chọn của bạn----");
            System.out.println("1: Bài 1");
            System.out.println("2: Bài 2");
            System.out.println("0: Thoát!");
            Scanner sc = new Scanner(System.in);
            int x;
            x = sc.nextInt();
            if (x==1) {
                Phan1_Bai1();
            }else if (x==2) {
                Phan1_Bai2();
            }else{
                break;
            }
        }
    }
    public static void Phan1_Bai1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Họ và tên: ");
        String hoten = sc.nextLine();
        System.out.println("Điểm trung bình: ");
        Float dtb = sc.nextFloat();
        System.out.println("<<"+hoten+">><<"+dtb+">>điểm");
    }
    public static void Phan1_Bai2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều rộng: ");
            int chieuRong = sc.nextInt();
        System.out.println("Nhập chiều dài: ");
        int chieuDai = sc.nextInt();
        System.out.println("Diện tích: "+ (chieuRong * chieuDai));
        System.out.println("Chu vi: "+ ((chieuRong + chieuDai) * 2));

    }
}
