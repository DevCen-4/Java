package Lap4.EX1;

public class NhanVien extends CanBo{
    private String CongViec;
    public NhanVien(String HoTen, int Tuoi, String GioiTinh, String DiaChi, String CongViec) {
        super(HoTen, Tuoi, GioiTinh, DiaChi);
        this.CongViec = CongViec;
    }
    public String getCongViec() {
        return CongViec;
    }
    public void setCongViec(String CongViec) {
        this.CongViec = CongViec;
    }

}
