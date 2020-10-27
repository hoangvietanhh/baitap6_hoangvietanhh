public class CongNhan extends CanBo {
    private String bac;

    public CongNhan() {
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return  "\nCông nhân {" +
                "Họ và Tên: " + getHoVaTen() +
                ", Ngày sinh: " + getNgaySinh() +
                ", Giới tính: " + getGioiTinh() +
                ", Địa chỉ: " + getDiaChi() +
                ", Bậc: " + bac +
                '}';
    }
}
