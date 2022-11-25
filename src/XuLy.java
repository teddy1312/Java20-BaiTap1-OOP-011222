/*  Mục đích: OOP - Bài tập 1: Quản lý sinh viên
 *  Người tạo: Java20 - Nguyễn Anh Tú
 *  Ngày tạo: 25/11/2022
 *  Version: 1.00
 * */

import java.util.Scanner;

public class XuLy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SinhVien sinhVien;
        byte chon;
        do{
            System.out.print("Nhấn 1 để tiếp tục, 2 để thoát : ");
            chon = Byte.parseByte(scan.nextLine());

            switch (chon){
                case 1:
                    sinhVien = new SinhVien();
                    sinhVien.nhap(scan);
                    sinhVien.tinhDiemTB();
                    sinhVien.xepLoai();
                    sinhVien.xuat();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Vui lòng chỉ chọn 1 hoặc 2");
                    break;
            }

        } while(chon!=2);

    }

}
