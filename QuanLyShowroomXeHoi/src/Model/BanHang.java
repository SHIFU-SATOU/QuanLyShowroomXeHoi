package Model;


import java.util.*;

/**
 * 
 */
public class BanHang extends NhanVien {

    /**
     * Default constructor
     */
    public BanHang() {
    }

    /**
     * 
     */
    protected int SLXe;

    /**
     * 
     */
    protected double LuongHT;

    /**
     * Hàm khởi tạo nhân viên BanHang
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
     * + Nhân viên BanHang được khởi tạo
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
     * @param sTenCV 
     * @param dTien
     */
    public BanHang(String sHoTen, String sGioiTinh, String sSDT, String sDiaChi, String sThoiGian, String sTenCV, double dTien) {
        // TODO implement here
        this.HoTen = sHoTen;
        this.GioiTinh = sGioiTinh;
        this.SDT = sSDT;
        this.DiaChi = sDiaChi;
        this.NgBD = sThoiGian;
        this.ChucVu = sTenCV;
        this.LuongCB = dTien;
    }

    /**
     * Hàm lấy SLXe của NhanVien
     * - Input:
     * + SLXe: int
     * - Output:
     * + SLXe: int
     * @return
     */
    public int getSLXe() {
        // TODO implement here
        return this.SLXe;
    }

    /**
     * Hàm lấy LuongHT của NhanVien
     * - Input:
     * + LuongHT: double
     * - Output:
     * + LuongHT: double
     * @return
     */
    public double getLuongHT() {
        // TODO implement here
        return this.LuongHT;
    }

    /**
     * Hàm cập nhật SLXe của NhanVien
     * - Input:
     * + SLXe: int
     * + iSoLuong: int
     * - Output:
     * + SLXe = iSoLuong
     * @param iSoLuong
     */
    public void setSLXe(int iSoLuong) {
        // TODO implement here
        this.SLXe = iSoLuong;
    }

    /**
     * Hàm cập nhật LuongHT của NhanVien
     * - Input:
     * + LuongHT: double
     * + dTien: double
     * - Output:
     * + LuongHT = dTien
     * @param dTien
     */
    public void setLuongHT(double dTien) {
        // TODO implement here
        this.LuongHT = dTien;
    }

}