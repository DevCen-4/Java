package Lap4.EX1;

public class KySu extends CanBo {
    private String NganhDaoTao;
    public KySu(String HoTen, int Tuoi,String GioiTinh, String DiaChi, String NganhDaoTao ) {
        super(HoTen, Tuoi, GioiTinh, DiaChi);
        this.NganhDaoTao = NganhDaoTao;
    }
    public String getNganhDaoTao() {
        return NganhDaoTao;
    }
    public void setNganhDaoTao(String NganhDaoTao) {
        this.NganhDaoTao = NganhDaoTao;
    }
}
