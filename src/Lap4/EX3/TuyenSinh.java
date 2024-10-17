
package Lap4.EX3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh {
    private List<ThiSinh> thiSinhs;

    public TuyenSinh() {
        thiSinhs = new ArrayList<>();
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng thí sinh: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Làm sạch dòng

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số báo danh: ");
            String sbd = scanner.nextLine();
            System.out.print("Nhập họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Nhập địa chỉ: ");
            String diaChi = scanner.nextLine();
            System.out.print("Nhập khối thi: ");
            String khoiThi = scanner.nextLine();
            System.out.print("Nhập ưu tiên: ");
            String uuTien = scanner.nextLine(); // Nhập thuộc tính ưu tiên

            thiSinhs.add(new ThiSinh(sbd, hoTen, diaChi, khoiThi, uuTien));
        }
    }

    public void hienThiThongTin() {
        for (ThiSinh ts : thiSinhs) {
            System.out.println(ts);
        }
    }

    public void timKiemTheoSoBaoDanh(String sbd) {
        for (ThiSinh ts : thiSinhs) {
            if (ts.getSoBaoDanh().equals(sbd)) {
                System.out.println(ts);
                return;
            }
        }
        System.out.println("Không tìm thấy thí sinh với số báo danh: " + sbd);
    }

    public void sapXepTheoSoBaoDanh() {
        Collections.sort(thiSinhs, Comparator.comparing(ThiSinh::getSoBaoDanh));
    }

    public void tongSoSVTheoKhoi() {
        int[] count = new int[3]; // 0: A, 1: B, 2: C
        for (ThiSinh ts : thiSinhs) {
            switch (ts.getKhoiThi()) {
                case "A":
                    count[0]++;
                    break;
                case "B":
                    count[1]++;
                    break;
                case "C":
                    count[2]++;
                    break;
            }
        }
        System.out.println("Số thí sinh khối A: " + count[0]);
        System.out.println("Số thí sinh khối B: " + count[1]);
        System.out.println("Số thí sinh khối C: " + count[2]);
    }
}
