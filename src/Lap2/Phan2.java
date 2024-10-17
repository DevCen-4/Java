package Lap2;

import java.util.Scanner;

public class Phan2 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("----Nhập Lựa chọn của bạn----");
            System.out.println("1: Bài 3");
            System.out.println("2: Bài 4");
            System.out.println("3: Bài 5");
            System.out.println("0: Thoát!");
            Scanner sc = new Scanner(System.in);
            int x;
            x = sc.nextInt();
            if (x == 1) {
                Phan2_Bai3();
            } else if (x == 2) {
                Phan2_Bai4();
            } else if (x == 3) {
                Phan2_Bai5();
            } else {
                break;
            }
        }
    }

    public static void Phan2_Bai3() {
        Scanner sc = new Scanner(System.in);
        int sodien;
        do {
            System.out.println("Nhập số điện: ");
            sodien = sc.nextInt();
        } while (sodien < 0);
        if (0 < sodien && sodien < 50) {
            System.out.println("Tiền điện là: " + sodien * 1000);
        } else {
            System.out.println("Tiền điện là: " + 50 * 1000 + (sodien - 50) * 1200);
        }
    }

    public static void Phan2_Bai4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chữ cái: ");
        char kyTu = scanner.next().charAt(0);
        kyTu = Character.toLowerCase(kyTu);
        if (kyTu == 'a' || kyTu == 'e' || kyTu == 'i' || kyTu == 'o' || kyTu == 'u') {
            System.out.println(kyTu + " là nguyên âm.");
        } else {
            System.out.println(kyTu + " là phụ âm.");
        }
    }

    public static void Phan2_Bai5() {
        while (true) {
            System.out.println("----Nhập Lựa chọn của bạn----");
            System.out.println("1: Bài 5.1");
            System.out.println("2: Bài 5.2");
            System.out.println("3: Bài 5.3");
            System.out.println("0: Thoát!");
            Scanner sc = new Scanner(System.in);
            int x;
            x = sc.nextInt();
            if (x == 1) {
                Phan2_Bai5_1();
            } else if (x == 2) {
                Phan2_Bai5_2();
            } else if (x == 3) {
                Phan2_Bai5_3();
            } else {
                break;
            }
        }
    }

    public static void Phan2_Bai5_1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên x (0->10): ");
        int x = sc.nextInt();
        switch (x) {
            case 0:
                System.out.println("Không");
                break;
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("Chín");
                break;
            case 10:
                System.out.println("Mười");
                break;
            default:
                break;

        }

    }

    public static void Phan2_Bai5_2() {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        do {
            System.out.println("Nhập 3 số: ");
            System.out.println("Nhập số a: ");
            a = sc.nextInt();
            System.out.println("Nhập số b: ");
            b = sc.nextInt();
            System.out.println("Nhập số c: ");
            c = sc.nextInt();
        } while (a < 0 || b < 0 || c < 0);
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Ba số a, b, c này là 3 cạnh của một tam giác !!");
        } else {
            System.out.println("Ba cạnh này không tạo thành một tam giác !");
        }
    }

    public static void Phan2_Bai5_3() {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        do {
            System.out.println("Nhập 3 số: ");
            System.out.println("Nhập số a: ");
            a = sc.nextInt();
            System.out.println("Nhập số b: ");
            b = sc.nextInt();
            System.out.println("Nhập số c: ");
            c = sc.nextInt();
        } while (a < 0 || b < 0 || c < 0);
        if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
            System.out.println("Ba số a, b, c này là 3 cạnh của một tam giác vuông !!");
        } else {
            System.out.println("Ba cạnh này không tạo thành một tam giác vuông !");
        }
    }

}

