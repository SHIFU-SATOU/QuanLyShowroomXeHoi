package Model;


import java.util.*;
import java.sql.Connection;

/**
 * 
 */
public interface InterfaceNhanVien {

    /**
     * Hàm lấy MSNV
     * - Input:
     * + MSNV: String
     * - Output:
     * + MSNV: String
     * @return
     */
    public String getMSNV();

    /**
     * Hàm cập nhật MSNV
     * - Input:
     * + MSNV: String
     * + sMaSo: String
     * - Output:
     * + MSNV = sMaSo
     * @param sMaSo
     */
    public void setMSNV(String sMaSo);

    /**
     * Hàm lấy HoTen của NhanVien
     * - Input:
     * + HoTen: String
     * - Output:
     * + HoTen: String
     * @return Hàm lấy HoTen của NhanVien
     * - Input:
     * + HoTen: String
     * - Output:
     * + HoTen: String
     */
    public String getHoTen();

    /**
     * Hàm cập nhật HoTen của NhanVien
     * - Input:
     * + HoTen: String
     * + sHoTen: String
     * - Output:
     * + HoTen = sHoTen
     * @param sHoTen
     */
    public void setHoTen(String sHoTen);

    /**
     * Hàm lấy GioiTinh
     * - Input:
     * + GioiTinh: String
     * - Ouput:
     * + GioiTinh: String
     * @return
     */
    public String getGioiTinh();

    /**
     * Hàm cập nhật GioiTinh của NhanVien
     * - Input:
     * + GioiTinh: String
     * + sGioiTinh: String
     * - Output:
     * + GioiTinh = sGioiTinh
     * @param sGioiTinh
     */
    public void setGioiTinh(String sGioiTinh);

    /**
     * Hàm lấy SDT của NhanVien
     * - Input:
     * + SDT:  String
     * - Output:
     * + SDT: int
     * @return
     */
    public String getSDT();

    /**
     * Hàm cập nhật SDT của NhanVien
     * - Input:
     * + SDT: String
     * + sSo: String
     * - Output:
     * + SDT = sSo
     * @param sSo
     */
    public void setSDT(String sSo);

    /**
     * Hàm lấy DiaChi của NhanVien
     * - Input:
     * + DiaChi: String
     * - Output:
     * + DiaChi: String
     * @return
     */
    public String getDiaChi();

    /**
     * Hàm cập nhật DiaChi của NhanVien
     * - Input:
     * + DiaChi: String
     * + sDiaChi: String
     * - Output:
     * + DiaChi = sDiaChi
     * @param sDiaChi
     */
    public void setDiaChi(String sDiaChi);

    /**
     * Hàm lấy ngày vào làm của NhanVien
     * - Input:
     * + NgBD: String
     * - Output:
     * + NgBD: String
     * @return
     */
    public String getNgBD();

    /**
     * Hàm cập nhật ngày vào làm của NhanVien
     * - Input:
     * + NgBD: String
     * + sThoiGian: String
     * - Output:
     * + NgBD = sThoiGian
     * @param sThoiGian
     */
    public void setNgBD(String sThoiGian);

    /**
     * Hàm lấy ngày nghỉ việc của NhanVien
     * - Input:
     * + NgKT: String
     * - Output:
     * + NgKT: String
     * @return
     */
    public String getNgKT();

    /**
     * Hàm cập nhật ngày nghỉ việc của NhanVien
     * - Input:
     * + NgKT: String
     * + sThoiGian: String
     * - Output:
     * + NgKT = sThoiGian
     * @param sThoiGian
     */
    public void setNgKT(String sThoiGian);

    /**
     * Hàm lấy ChucVu của NhanVien
     * - Input:
     * + ChucVu: String
     * - Output:
     * + ChucVu: String
     * @return
     */
    public String getChucVu();

    /**
     * Hàm cập nhật ChucVu của NhanVien
     * - Input:
     * + ChucVu: String
     * + sTenCV: String
     * - Output:
     * + ChucVu = sTenCV
     * @param sTenCV
     */
    public void setChucVu(String sTenCV);

    /**
     * Hàm lấy LuongCB của NhanVien
     * - Input:
     * + LuongCB: double
     * - Output:
     * + LuongCB: double
     * @return
     */
    public double getLuongCB();

    /**
     * Hàm cập nhật LuongCB của NhanVien
     * - Input:
     * + LuongCB: double
     * + dTien: double
     * - Output:
     * + LuongCB = dTien
     * @param dTien
     */
    public void setLuongCB(double dTien);

    /**
     * Hàm tạo mã số nhân viên mới nhất
     * - Input:
     * + KetNoi: Connection
     * + NV_VIEW của QUAN_LY_SHOWROOM_XE_HOI
     * -  Ouput:
     * + MSNV mới
     * @param KetNoi 
     * @return
     */
    public String taoMSNV(Connection KetNoi);

    /**
     * Hàm thêm NhanVien vào cơ sở dữ liệu
     * - Input:
     * + Bảng NHANVIEN của cơ sở dữ liệu QUAN_LY_SHOWROOM_XE_HOI
     * + KetNoi: Connection
     * + DoiTuong: NhanVien
     * - Output:
     * + NhanVien được thêm vào bảng NHANVIEN
     * @param KetNoi 
     * @param DoiTuong
     */
    public void insertNV(Connection KetNoi, NhanVien DoiTuong);

    /**
     * Hàm xóa NhanVien khỏi cơ sở dữ liệu
     * - Input:
     * + Bảng NHANVIEN  của cơ sở dữ liệu QUAN_LY_SHOWROOM_XE_HOI
     * + KetNoi: Connection
     * + sMSNV: String
     * - Output:
     * + NhanVien có MSNV bằng sMSNV bị xóa khỏi bảng NHANVIEN
     * @param KetNoi 
     * @param sMSNV
     */
    public void deleteNV(Connection KetNoi, String sMSNV);

    /**
     * Hàm cập nhật HoTen NhanVien trong cơ sở dữ liệu
     * - Input:
     * + KetNoi: Connection
     * + Bảng NHANVIEN của QUAN_LY_SHOWROOM_XE_HOI
     * + sMSNV: String
     * + sHoTen: String
     * - Output:
     * + Thuộc tính HOTEN = sHoTen của NhanVien có MSNV bằng sMSNV trong bảng NHANVIEN
     * @param KetNoi 
     * @param sMSNV 
     * @param sHoTen
     */
    public void updateHoTen(Connection KetNoi, String sMSNV, String sHoTen);

    /**
     * Hàm cập nhật GioiTinh NhanVien trong cơ sở dữ liệu
     * - Input:
     * + KetNoi: Connection
     * + Bảng NHANVIEN của QUAN_LY_SHOWROOM_XE_HOI
     * + sMSNV: String
     * + sGioiTinh: String
     * - Output:
     * + Thuộc tính GIOITINH = sGioiTinh của NhanVien có MSNV bằng sMSNV trong bảng NHANVIEN
     * @param KetNoi 
     * @param sMSNV 
     * @param sGioiTinh
     */
    public void updateGioiTinh(Connection KetNoi, String sMSNV, String sGioiTinh);

    /**
     * Hàm cập nhật ngày vào làm của NhanVien trong cơ sở dữ liệu
     * - Input:
     * + KetNoi: Connection
     * + Bảng NHANVIEN của QUAN_LY_SHOWROOM_XE_HOI
     * + sMSNV: String
     * + sThoiGian: String
     * - Output:
     * + Thuộc tính NGBD = sThoiGian của NhanVien có MSNV bằng sMSNV trong bảng NHANVIEN
     * @param KetNoi 
     * @param sMSNV 
     * @param sThoiGian
     */
    public void updateNgBD(Connection KetNoi, String sMSNV, String sThoiGian);

    /**
     * Hàm cập nhật ngày nghỉ việc của NhanVien trong cơ sở dữ liệu
     * - Input:
     * + KetNoi: Connection
     * + Bảng NHANVIEN của QUAN_LY_SHOWROOM_XE_HOI
     * + sMSNV: String
     * + sThoiGian: String
     * - Output:
     * + Thuộc tính NGKT = sThoiGian của NhanVien có MSNV bằng sMSNV trong bảng NHANVIEN
     * @param KetNoi 
     * @param sMSNV 
     * @param sThoiGian
     */
    public void updateNgKT(Connection KetNoi, String sMSNV, String sThoiGian);

    /**
     * Hàm cập nhật SDT của NhanVien trong cơ sở dữ liệu
     * - Input:
     * + KetNoi: Connection
     * + Bảng NHANVIEN của QUAN_LY_SHOWROOM_XE_HOI
     * + sMSNV: String
     * + sSo: String
     * - Output:
     * + Thuộc tính SDT = sSo của NhanVien có MSNV bằng sMSNV trong bảng NHANVIEN
     * @param KetNoi 
     * @param sMSNV 
     * @param sSo
     */
    public void updateSDT(Connection KetNoi, String sMSNV, String sSo);

    /**
     * Hàm cập nhật DiaChi của NhanVien trong cơ sở dữ liệu
     * - Input:
     * + KetNoi: Connection
     * + Bảng NHANVIEN của QUAN_LY_SHOWROOM_XE_HOI
     * + sMSNV: String
     * + sDiaChi: String
     * - Output:
     * + Thuộc tính DIACHI = sDiaChi của NhanVien có MSNV bằng sMSNV trong bảng NHANVIEN
     * @param KetNoi 
     * @param sMSNV 
     * @param sDiaChi
     */
    public void updateDiaChi(Connection KetNoi, String sMSNV, String sDiaChi);

    /**
     * Hàm cập nhật ChucVu của NhanVien trong cơ sở dữ liệu
     * - Input:
     * + KetNoi: Connection
     * + Bảng NHANVIEN của QUAN_LY_SHOWROOM_XE_HOI
     * + sMSNV: String
     * + sTenCVi: String
     * - Output:
     * + Thuộc tính CHUCVU = sTenCV của NhanVien có MSNV bằng sMSNV trong bảng NHANVIEN
     * @param KetNoi 
     * @param sMSNV 
     * @param sTenCV
     */
    public void updateChucVu(Connection KetNoi, String sMSNV, String sTenCV);

    /**
     * Hàm cập nhật lương cơ bản của NhanVien trong cơ sở dữ liệu
     * - Input:
     * + KetNoi: Connection
     * + Bảng NHANVIEN của QUAN_LY_SHOWROOM_XE_HOI
     * + sMSNV: String
     * + dTien: double
     * - Output:
     * + Thuộc tính LUONGCB = dTien của NhanVien có MSNV bằng sMSNV trong bảng NHANVIEN
     * @param KetNoi 
     * @param sMSNV 
     * @param dTien
     */
    public void updateLuongCB(Connection KetNoi, String sMSNV, double dTien);

}