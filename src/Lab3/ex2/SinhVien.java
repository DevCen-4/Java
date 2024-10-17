package Lab3.ex2;

import java.util.Scanner;

public class SinhVien {
    private String name; // Tên sinh viên
    private String id; // Mã số sinh viên
    private double pointC; //Điểm C++
    private double pointHDT; //Điểm hướng đối tượng
    private double pointANM; //Điểm an ninh mạng

    public SinhVien() {
        this.id = "N**DC**___";
    }
    public SinhVien(String name, String id, double pointC, double pointHDT, double pointANM) {
        this.name = name;
        this.id = id;
        this.pointC = pointC;
        this.pointHDT = pointHDT;
        this.pointANM = pointANM;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public double getPointC() {
        return pointC;
    }
    public void setPointC(double pointC) {
        this.pointC = pointC;
    }
    public double getPointANM() {
        return pointANM;
    }
    public void setPointANM(double pointANM) {
        this.pointANM = pointANM;
    }
    public double getPointHDT() {
        return pointHDT;
    }
    public void setPointHDT(double pointHDT) {
        this.pointHDT = pointHDT;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void init(){
        Scanner sc = new Scanner(System.in);
        System.out.println("----Sinh Vien----");
        System.out.print("Name: " );
        this.name = sc.nextLine();
        System.out.print("Id: " );
        this.id =sc.nextLine();
        System.out.print("PointC: ");
        this.pointC = sc.nextDouble();
        System.out.print("PointHDT: ");
        this.pointHDT = sc.nextDouble();
        System.out.print("PointANM: " );
        this.pointANM = sc.nextDouble();
    }
    public double getDTB(){
        return (this.getPointC() + this.getPointHDT() + this.getPointANM()) / 3;
    }
    public String getAcademic(){
        double point = getDTB();
        if(point <= 10 && point >= 9){
            return "Giỏi";
        }else if (point < 9 && point >= 7 ){
            return  "Khá";
        }else if (point < 7 && point >= 5){
            return  "Trung bình";
        }else{
            return "Không đạt";
        }
    }

    @Override
    public String toString() {
        return "Họ tên sinh viên: " + name+
                "\nMã số sinh viên: " + id+
                "\nĐiểm ngôn ngữ lập trình C++: "+ pointC+
                "\nĐiểm lập trình hướng đối tượng: " + pointHDT+
                "\nĐiểm an ninh mạng: "+ pointANM+
                "\nXếp loại học lực: " + getAcademic();
    }
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.init();
        System.out.println(sv.toString());
    }
}
