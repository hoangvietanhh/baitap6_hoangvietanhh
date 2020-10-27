import java.util.Scanner;

public class ThongTin {
    Scanner input = new Scanner(System.in);

    public CanBo themCanBo(CanBo canBo) {
        System.out.println("Nhập tên: ");
        canBo.setHoVaTen(input.nextLine());
        System.out.println("Nhập giới tính: ");
        canBo.setGioiTinh(input.nextLine());
        System.out.println("Nhập ngày sinh: ");
        canBo.setNgaySinh(input.nextLine());
        System.out.println("Địa chỉ: ");
        canBo.setDiaChi(input.nextLine());
        return canBo;
    }

    public void themKysu(CanBo canBo){
        System.out.println("nhap nganh dao tao: ");
        ((Kysu)canBo).setNganhDaoTao(input.nextLine());
    }

    public void themCongNhan(CanBo canBo){
        System.out.println("nhap bac luong: ");
        ((CongNhan)canBo).setBac(input.nextLine());
    }

    public void themNhanVien(CanBo canBo){
        System.out.println("Nhập công việc: ");
        ((NhanVien)canBo).setCongViec(input.nextLine());
    }


}
