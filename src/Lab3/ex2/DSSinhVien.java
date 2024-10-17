package Lab3.ex2;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.*;

public class DSSinhVien {
    private static int quantiy_sv;
    private static ArrayList<SinhVien> list_SV = new ArrayList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        quantiy_sv = sc.nextInt();
        for (int i = 0; i < quantiy_sv; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            init_SinhVien();
        }
        show_DS(list_SV);
        while (true) {
            System.out.println("""
                    ---Danh sách sinh viên ---
                    Vui lòng nhập lựa chọn của bạn!
                    1: Sắp xếp sinh viên theo thứ tự tăng dần.
                    2: Tìm kiếm sinh viên.
                    3: Số sinh viên có điểm lớn hơn hoặc bằng điểm nhập vào.
                    4: Sinh viên có điểm TB cao nhất
                    5: Thoát
                    """);
            System.out.print("Vui lòng nhập lựa chọn của bạn: ");
            int selection = sc.nextInt();
            //Xử lý lựa chọn của user
            if (selection == 1) {
                //Sắp xếp sinh viên theo thứ tự tăng dần
                ASC_ID();
                show_DS(list_SV);

            } else if (selection == 2) {
                //Tìm kiếm sinh viên
                System.out.print("Vui lòng nhập tên Sinh Viên cần tìm: ");
                sc.nextLine();

                String name_tmp = sc.nextLine();
                //Gọi hàm tìm kiếm
                search_sv(name_tmp);
            } else if (selection == 3) {
                //Trả về số sinh viên có điểm lớn hơn hoặc bằng số điểm user nhập vào
                System.out.print("Vui lòng nhập điểm: ");
                double point = sc.nextDouble();
                search_quatity(point);
            } else if (selection == 4) {
                //In ra thông tin điểm sinh viên có điểm cao nhất
                System.out.println("Thông tin sinh viên có điểm TB cao nhất là: ");
                search_max();
            } else if (selection == 5) {
                break;
            }
        }


    }

    public static void init_SinhVien() {
        SinhVien sv = new SinhVien();
        sv.init();
        list_SV.add(sv);
    }

    public static void show_DS(ArrayList<SinhVien> list) {
        System.out.printf("%-11s %-15s %-10s %-10s %-10s %-10s %-15s\n","MSSV",
                "HỌ VÀ TÊN", "ĐIỂM C++", "ĐIỂM LTHĐT", "ĐIỂM ANM", "ĐIỂM TB", "XẾP LOẠI");
        for (SinhVien i : list_SV) {
            System.out.printf("%-11s %-15s %-10.1f %-10.1f %-10.1f %-10.1f %-15s\n",i.getId(),
                    i.getName(), i.getPointC(), i.getPointHDT(), i.getPointANM(), i.getDTB(), i.getAcademic());
        }
        int sv_gioi = 0;
        int sv_kha = 0;
        int sv_tb = 0;
        int sv_kd = 0;
        for (SinhVien i : list) {
            if (i.getAcademic().equals("Giỏi")) {
                sv_gioi++;
            } else if (i.getAcademic().equals("Khá")) {
                sv_kha++;
            } else if (i.getAcademic().equals("Trung bình")) {
                sv_tb++;
            } else if (i.getAcademic().equals("Không đạt")) {
                sv_kd++;
            } else continue;
        }
        System.out.println("-Tổng s sinh viên xếp loại Giỏi: " + sv_gioi);
        System.out.println("-Tổng số sinh viên xếp loại Khá: " + sv_kha);
        System.out.println("-Tổng số sinh viên xếp loại Trung bình: " + sv_tb);
        System.out.println("-Tổng số sinh viên xếp loại Không đạt: " + sv_kd);
    }

    //Thực hiện việc sắp xếp theo id sinh viên
    public static void ASC_ID() {
        Collections.sort(list_SV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
    }
    //Tiìm kiếm sinh viên
    public static void search_sv(String name){
        ArrayList<SinhVien> tmp = new ArrayList();
        for (SinhVien i : list_SV) {
            if(i.getName().equalsIgnoreCase(name)){
                tmp.add(i);
            }
        }
        System.out.println("----------Danh sách sinh viên cần tìm ----------");
        System.out.printf("%-11s %-15s %-10s %-10s %-10s %-10s %-15s\n","MSSV",
                "HỌ VÀ TÊN", "ĐIỂM C++", "ĐIỂM LTHĐT", "ĐIỂM ANM", "ĐIỂM TB", "XẾP LOẠI");
        for (SinhVien i : tmp) {
            System.out.printf("%-11s %-15s %-10.1f %-10.1f %-10.1f %-10.1f %-15s\n",i.getId(),
                    i.getName(), i.getPointC(), i.getPointHDT(), i.getPointANM(), i.getDTB(), i.getAcademic());
        }
    }
    // Tìm danh sách sinh viên có điểm lớn hơn hoặc bằng điểm điền vào
    public static void search_quatity(Double quantity){
        int cnt = 0;
        for (SinhVien i : list_SV) {
            if (i.getDTB() >= quantity) {
                cnt++;
            }else continue;
        }
        System.out.println("Số lượng sinh viên có điểm lớn hơn hoặc bằng '"+quantity+"' là:" + cnt);
    }
    //Tìm sinh viên điểm trung bình cao nhất
    public static void search_max(){
        ArrayList<SinhVien> tmp = list_SV;
        Collections.sort(tmp, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return (int) (o1.getDTB()-(o2.getDTB()));
            }
        });
        System.out.printf("%-11s %-15s %-10s %-10s %-10s %-10s %-15s\n","MSSV",
                "HỌ VÀ TÊN", "ĐIỂM C++", "ĐIỂM LTHĐT", "ĐIỂM ANM", "ĐIỂM TB", "XẾP LOẠI");
        SinhVien i = tmp.get(tmp.size()-1);
        System.out.printf("%-11s %-15s %-10.1f %-10.1f %-10.1f %-10.1f %-15s\n",i.getId(),
                i.getName(), i.getPointC(), i.getPointHDT(), i.getPointANM(), i.getDTB(), i.getAcademic());
    }
}
