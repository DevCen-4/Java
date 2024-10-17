/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lap4.EX4;

import java.util.Scanner;

public class Lab4Bai2_Phan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KhuPho khuPho = new KhuPho();

        System.out.print("Nhập số lượng hộ dân: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Làm sạch dòng

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số nhà: ");
            String soNha = scanner.nextLine();
            HoDan hoDan = new HoDan(soNha);

            System.out.print("Nhập số thành viên trong hộ: ");
            int soThanhVien = scanner.nextInt();
            scanner.nextLine(); // Làm sạch dòng

            for (int j = 0; j < soThanhVien; j++) {
                System.out.print("Nhập họ tên: ");
                String hoTen = scanner.nextLine();
                System.out.print("Nhập tuổi: ");
                int tuoi = scanner.nextInt();
                scanner.nextLine(); // Làm sạch dòng
                System.out.print("Nhập năm sinh: ");
                String namSinh = scanner.nextLine();
                System.out.print("Nhập nghề nghiệp: ");
                String ngheNghiep = scanner.nextLine();

                Nguoi nguoi = new Nguoi(hoTen, tuoi, namSinh, ngheNghiep);
                hoDan.themThanhVien(nguoi);
            }

            khuPho.themHoDan(hoDan);
        }

        System.out.println("\nThông tin các hộ trong khu phố:");
        for (HoDan hoDan : khuPho.getHoDans()) {
            System.out.println(hoDan);
        }
    }
}

