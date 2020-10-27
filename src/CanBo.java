import java.time.LocalDate;

public class CanBo {
    private  String hoVaTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;


    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Cán bộ {" +
                "Họ và Tên: " + hoVaTen +
                ", Ngày sinh: " + ngaySinh +
                ", Giới tính: " + gioiTinh +
                ", Địa chỉ: " + diaChi +
                '}';
    }
}
