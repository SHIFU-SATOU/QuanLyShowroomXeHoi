package Model;


import java.util.*;

/**
 * 
 */
public class QuanLy extends NhanVien {

    /**
     * Default constructor
     */
    public QuanLy() {
    }

    /**
     * Hàm khởi tạo nhân viên QuanLy
     * - Input:
     * + HoTen: String
     * + sHoTen: String
     * + GioiTinh: String
     * + sGioiTinh: String
     * + SDT: int
     * + sSDT: String
     * + DiaChi: String
     * + sDiaChi: String
     * + NgBD: String
     * + sThoiGian: String
     * + ChucVu: String
     * + sTenCV: String
     * + LuongCB: double
     * + dTien: double
     * - Output:
     * + Nhân viên QuanLy được khởi tạo
     * + HoTen = sHoTen
     * + GioiTinh = sGioiTinh
     * + SDT = sSDT
     * + DiaChi = sDiaChi
     * + NgBD = sThoiGian
     * + ChucVu = sTenCV
     * + LuongCB = dTien 
     * @param sHoTen 
     * @param sGioiTinh 
     * @param sSDT 
     * @param sDiaChi 
     * @param sThoiGian 
     * @param sChucVu 
     * @param dTien
     */
    public QuanLy(String sHoTen, String sGioiTinh, String sSDT, String sDiaChi, String sThoiGian, String sChucVu, double dTien) {
        // TODO implement here
        this.HoTen = sHoTen;
        this.GioiTinh = sGioiTinh;
        this.SDT = sSDT;
        this.DiaChi = sDiaChi;
        this.NgBD = sThoiGian;
        this.ChucVu = sChucVu;
        this.LuongCB = dTien;
    }

}