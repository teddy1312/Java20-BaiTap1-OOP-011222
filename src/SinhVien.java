/* Mục đích: Quản lý các nghiệp vụ liên quan đến lớp Sinh Vien
*  Người tạo: Java20 - Nguyễn Anh Tú
*  Ngày tạo: 25/11/2022
*  Version: 1.00
* */

import java.util.Scanner;

public class SinhVien {
    // Constants
    final float DIEM_XUAT_SAC = 9.5f;
    final float DIEM_GIOI = 8.5f;
    final float DIEM_KHA = 7.5f;
    final float DIEM_TB_KHA = 6.5f;
    final byte DIEM_TB = 5;

    // 1. Attributes
    private String tenSV;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    private float diemTB;
    private String xepLoai;

    // 2. Get, set
    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    // 3. Constructors
    public SinhVien() {
    }

    public SinhVien(String tenSV, float diemToan, float diemLy, float diemHoa) {
        this.tenSV = tenSV;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    // 4. Input, output
    public void nhap(Scanner scan){
        System.out.print("Nhập tên sinh viên: ");
        this.tenSV = scan.nextLine();

        System.out.print("Nhập điểm toán: ");
        this.diemToan = Float.parseFloat(scan.nextLine());

        System.out.print("Nhập điểm lý: ");
        this.diemLy = Float.parseFloat(scan.nextLine());

        System.out.print("Nhập điểm hóa: ");
        this.diemHoa = Float.parseFloat(scan.nextLine());
    }

    public void xuat(){
        String row = "";
        row += String.format("%-15s","Tên: "+this.tenSV)+" | ";
        row += String.format("%-15s","Điểm toán: "+this.diemToan)+" | ";
        row += String.format("%-15s","Điểm lý: "+this.diemLy)+" | ";
        row += String.format("%-15s","Điểm hóa: "+this.diemHoa)+" | ";
        row += String.format("%-15s","Điểm TB: "+this.diemTB)+" | ";
        row += String.format("%-15s","Xếp loại: "+this.xepLoai);

        System.out.println("Thông tin sinh viên:\n"+row);
    }

    // 5. Businesses
    public void tinhDiemTB(){
        this.diemTB = Math.round((this.diemToan+this.diemLy+this.diemHoa)/3*100)/100.0f;
    }

    public void xepLoai(){
        if(this.diemTB >= DIEM_XUAT_SAC){
            this.xepLoai = "Xuất sắc";
        } else if(this.diemTB >= DIEM_GIOI){
            this.xepLoai = "Giỏi";
        } else if(this.diemTB >= DIEM_KHA){
            this.xepLoai = "Khá";
        } else if(this.diemTB >= DIEM_TB_KHA){
            this.xepLoai = "Trung bình khá";
        } else if(this.diemTB >= DIEM_TB){
            this.xepLoai = "Trung bình";
        } else{
            this.xepLoai = "Yếu";
        }
    }

}
