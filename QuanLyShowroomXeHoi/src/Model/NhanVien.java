package Model;

import java.util.*;
import java.io.PrintStream;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 */
public abstract class NhanVien implements InterfaceNhanVien {

    /**
     * Default constructor
     */
    public NhanVien() {
    }

    private static PrintStream err = new PrintStream(System.err, true, UTF_8);

    /**
     *
     */
    protected String MSNV;

    /**
     *
     */
    protected String HoTen;

    /**
     *
     */
    protected String GioiTinh;

    /**
     *
     */
    protected String SDT;

    /**
     *
     */
    protected String DiaChi;

    /**
     *
     */
    protected String NgBD;

    /**
     *
     */
    protected String NgKT;

    /**
     *
     */
    protected String ChucVu;

    /**
     *
     */
    protected double LuongCB;

    /**
     * Hàm lấy MSNV - Input: + MSNV: String - Output: + MSNV: String
     *
     * @return
     */
    @Override
    public String getMSNV() {
        // TODO implement here
        return this.MSNV;
    }

    /**
     * Hàm cập nhật MSNV - Input: + MSNV: String + sMaSo: String - Output: +
     * MSNV = sMaSo
     *
     * @param sMaSo
     */
    @Override
    public void setMSNV(String sMaSo) {
        // TODO implement here
        this.MSNV = sMaSo;
    }

    /**
     * Hàm lấy HoTen của NhanVien - Input: + HoTen: String - Output: + HoTen:
     * String
     *
     * @return
     */
    @Override
    public String getHoTen() {
        // TODO implement here
        return this.HoTen;
    }

    /**
     * Hàm cập nhật HoTen của NhanVien - Input: + HoTen: String + sHoTen: String
     * - Output: + HoTen = sHoTen
     *
     * @param sHoTen
     */
    @Override
    public void setHoTen(String sHoTen) {
        // TODO implement here
        this.HoTen = sHoTen;
    }

    /**
     * Hàm lấy GioiTinh - Input: + GioiTinh: String - Ouput: + GioiTinh: String
     *
     * @return
     */
    @Override
    public String getGioiTinh() {
        // TODO implement here
        return this.GioiTinh;
    }

    /**
     * Hàm cập nhật GioiTinh của NhanVien - Input: + GioiTinh: String +
     * sGioiTinh: String - Output: + GioiTinh = sGioiTinh
     *
     * @param sGioiTinh
     */
    @Override
    public void setGioiTinh(String sGioiTinh) {
        // TODO implement here
        this.GioiTinh = sGioiTinh;
    }

    /**
     * Hàm lấy SDT của NhanVien - Input: + SDT: String - Output: + SDT: int
     *
     * @return
     */
    @Override
    public String getSDT() {
        // TODO implement here
        return this.SDT;
    }

    /**
     * Hàm cập nhật SDT của NhanVien - Input: + SDT: String + sSo: String -
     * Output: + SDT = sSo
     *
     * @param sSo
     */
    @Override
    public void setSDT(String sSo) {
        // TODO implement here
        this.SDT = sSo;
    }

    /**
     * Hàm lấy DiaChi của NhanVien - Input: + DiaChi: String - Output: + DiaChi:
     * String
     *
     * @return
     */
    @Override
    public String getDiaChi() {
        // TODO implement here
        return this.DiaChi;
    }

    /**
     * Hàm cập nhật DiaChi của NhanVien - Input: + DiaChi: String + sDiaChi:
     * String - Output: + DiaChi = sDiaChi
     *
     * @param sDiaChi
     */
    @Override
    public void setDiaChi(String sDiaChi) {
        // TODO implement here
        this.DiaChi = sDiaChi;
    }

    /**
     * Hàm lấy ngày vào làm của NhanVien - Input: + NgBD: String - Output: +
     * NgBD: String
     *
     * @return
     */
    @Override
    public String getNgBD() {
        // TODO implement here
        return this.NgBD;
    }

    /**
     * Hàm cập nhật ngày vào làm của NhanVien - Input: + NgBD: String +
     * sThoiGian: String - Output: + NgBD = sThoiGian
     *
     * @param sThoiGian
     */
    @Override
    public void setNgBD(String sThoiGian) {
        // TODO implement here
        this.NgBD = sThoiGian;
    }

    /**
     * Hàm lấy ngày nghỉ việc của NhanVien - Input: + NgKT: String - Output: +
     * NgKT: String
     *
     * @return
     */
    @Override
    public String getNgKT() {
        // TODO implement here
        return this.NgKT;
    }

    /**
     * Hàm cập nhật ngày nghỉ việc của NhanVien - Input: + NgKT: String +
     * sThoiGian: String - Output: + NgKT = sThoiGian
     *
     * @param sThoiGian
     */
    @Override
    public void setNgKT(String sThoiGian) {
        // TODO implement here
        this.NgKT = sThoiGian;
    }

    /**
     * Hàm lấy ChucVu của NhanVien - Input: + ChucVu: String - Output: + ChucVu:
     * String
     *
     * @return
     */
    @Override
    public String getChucVu() {
        // TODO implement here
        return this.ChucVu;
    }

    /**
     * Hàm cập nhật ChucVu của NhanVien - Input: + ChucVu: String + sTenCV:
     * String - Output: + ChucVu = sTenCV
     *
     * @param sTenCV
     */
    @Override
    public void setChucVu(String sTenCV) {
        // TODO implement here
        this.ChucVu = sTenCV;
    }

    /**
     * Hàm lấy LuongCB của NhanVien - Input: + LuongCB: double - Output: +
     * LuongCB: double
     *
     * @return
     */
    @Override
    public double getLuongCB() {
        // TODO implement here
        return this.LuongCB;
    }

    /**
     * Hàm cập nhật LuongCB của NhanVien - Input: + LuongCB: double + dTien:
     * double - Output: + LuongCB = dTien
     *
     * @param dTien
     */
    @Override
    public void setLuongCB(double dTien) {
        // TODO implement here
        this.LuongCB = dTien;
    }

    /**
     * Hàm tạo mã số nhân viên mới nhất - Input: + KetNoi: Connection + NV_VIEW
     * của QUAN_LY_SHOWROOM_XE_HOI - Ouput: + MSNV mới
     *
     * @param KetNoi
     * @return
     */
    @Override
    public String taoMSNV(Connection KetNoi) {
        // TODO implement here
        try {
            String SQL = "SELECT MAX(MSNV) AS MSNV FROM NHANVIEN;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);

            ResultSet rs = ps.executeQuery();

            String sMaSo = null;
            while (rs.next()) {
                
                sMaSo = rs.getString("MSNV");
                
            }
            
            if (sMaSo != null) {
                sMaSo = sMaSo.substring(2);

                int temp = Integer.parseInt(sMaSo) + 1;
                if (temp < 10) {
                    sMaSo = "NV0" + Integer.toString(temp);
                } else {
                    sMaSo = "NV" + Integer.toString(temp);
                }
            } else {
                sMaSo = "NV01";
            }
            
            return sMaSo;

        } catch (SQLException ex) {
            err.println("Không thể tìm mã số nhân viên lớn nhất! Nguyên nhân: " + ex);
        }
        return null;
    }

    /**
     * Hàm thêm NhanVien vào cơ sở dữ liệu - Input: + Bảng NHANVIEN của cơ sở dữ
     * liệu QUAN_LY_SHOWROOM_XE_HOI + KetNoi: Connection + DoiTuong: NhanVien -
     * Output: + NhanVien được thêm vào bảng NHANVIEN
     *
     * @param KetNoi
     * @param DoiTuong
     */
    @Override
    public void insertNV(Connection KetNoi, NhanVien DoiTuong) {
        // TODO implement here
        try {
            String SQL = "SET DATEFORMAT DMY;"
                    + "INSERT INTO NHANVIEN(MSNV, HOTEN, GIOITINH, SDT, DIACHI, NGBD, LUONGCB)"
                    + "VALUES(?, ?, ?, ?, ?, ?, ?);";
            
            String sMaSo = DoiTuong.taoMSNV(KetNoi);

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sMaSo);
            ps.setString(2, DoiTuong.getHoTen());
            ps.setString(3, DoiTuong.getGioiTinh());
            ps.setString(4, DoiTuong.getSDT());
            ps.setString(5, DoiTuong.getDiaChi());
            ps.setString(6, DoiTuong.getNgBD());
            ps.setDouble(7, DoiTuong.getLuongCB());
            ps.executeUpdate();
            
            SQL = "INSERT INTO CHUCVU(MSNV, CHUCVU)" +
                    "VALUES(?, ?);";
            
            ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sMaSo);
            ps.setString(2, DoiTuong.getChucVu());
            ps.executeUpdate();

        } catch (SQLException ex) {
            err.println("Không thể thêm nhân viên! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm xóa NhanVien khỏi cơ sở dữ liệu - Input: + Bảng NHANVIEN của cơ sở dữ
     * liệu QUAN_LY_SHOWROOM_XE_HOI + KetNoi: Connection + sMSNV: String -
     * Output: + NhanVien có MSNV bằng sMSNV bị xóa khỏi bảng NHANVIEN
     *
     * @param KetNoi
     * @param sMSNV
     */
    @Override
    public void deleteNV(Connection KetNoi, String sMSNV) {
        // TODO implement here
        try {
            String SQL = "EXEC XOA_NHANVIEN @MSNV = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sMSNV);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể xóa nhân viên " + sMSNV + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật HoTen NhanVien trong cơ sở dữ liệu - Input: + KetNoi:
     * Connection + Bảng NHANVIEN của QUAN_LY_SHOWROOM_XE_HOI + sMSNV: String +
     * sHoTen: String - Output: + Thuộc tính HOTEN = sHoTen của NhanVien có MSNV
     * bằng sMSNV trong bảng NHANVIEN
     *
     * @param KetNoi
     * @param sMSNV
     * @param sHoTen
     */
    @Override
    public void updateHoTen(Connection KetNoi, String sMSNV, String sHoTen) {
        // TODO implement here
        try {
            String SQL = "UPDATE NHANVIEN SET HOTEN = ? WHERE MSNV = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sHoTen);
            ps.setString(2, sMSNV);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể cập nhật tên cho nhân viên " + sMSNV + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật GioiTinh NhanVien trong cơ sở dữ liệu - Input: + KetNoi:
     * Connection + Bảng NHANVIEN của QUAN_LY_SHOWROOM_XE_HOI + sMSNV: String +
     * sGioiTinh: String - Output: + Thuộc tính GIOITINH = sGioiTinh của
     * NhanVien có MSNV bằng sMSNV trong bảng NHANVIEN
     *
     * @param KetNoi
     * @param sMSNV
     * @param sGioiTinh
     */
    @Override
    public void updateGioiTinh(Connection KetNoi, String sMSNV, String sGioiTinh) {
        // TODO implement here
        try {
            String SQL = "UPDATE NHANVIEN SET GIOITINH = ? WHERE MSNV = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sGioiTinh);
            ps.setString(2, sMSNV);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể cập nhật giới tính cho nhân viên " + sMSNV + "! Chi tiết lỗi: ");
        }
    }

    /**
     * Hàm cập nhật ngày vào làm của NhanVien trong cơ sở dữ liệu - Input: +
     * KetNoi: Connection + Bảng NHANVIEN của QUAN_LY_SHOWROOM_XE_HOI + sMSNV:
     * String + sThoiGian: String - Output: + Thuộc tính NGBD = sThoiGian của
     * NhanVien có MSNV bằng sMSNV trong bảng NHANVIEN
     *
     * @param KetNoi
     * @param sMSNV
     * @param sThoiGian
     */
    @Override
    public void updateNgBD(Connection KetNoi, String sMSNV, String sThoiGian) {
        // TODO implement here
        try {
            String SQL = "UPDATE NHANVIEN SET NGBD = ? WHERE MSNV = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sThoiGian);
            ps.setString(2, sMSNV);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể cập nhật ngày vào làm cho nhân viên " + sMSNV + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật ngày nghỉ việc của NhanVien trong cơ sở dữ liệu - Input: +
     * KetNoi: Connection + Bảng NHANVIEN của QUAN_LY_SHOWROOM_XE_HOI + sMSNV:
     * String + sThoiGian: String - Output: + Thuộc tính NGKT = sThoiGian của
     * NhanVien có MSNV bằng sMSNV trong bảng NHANVIEN
     *
     * @param KetNoi
     * @param sMSNV
     * @param sThoiGian
     */
    @Override
    public void updateNgKT(Connection KetNoi, String sMSNV, String sThoiGian) {
        // TODO implement here
        try {
            String SQL = "UPDATE NHANVIEN SET NGKT = ? WHERE MSNV = ?;";
            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sThoiGian);
            ps.setString(2, sMSNV);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể cập nhật ngày nghỉ việc cho nhân viên " + sMSNV + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật SDT của NhanVien trong cơ sở dữ liệu - Input: +
     * KetNoi:Connection + Bảng NHANVIEN của QUAN_LY_SHOWROOM_XE_HOI + sMSNV:
     * String + sSo: String - Output: + Thuộc tính SDT = sSo của NhanVien có
     * MSNV bằng sMSNV trong bảng NHANVIEN
     *
     * @param KetNoi
     * @param sMSNV
     * @param sSo
     */
    @Override
    public void updateSDT(Connection KetNoi, String sMSNV, String sSo) {
        // TODO implement here
        try {
            String SQL = "UPDATE NHANVIEN SET SDT = ? WHERE MSNV = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sSo);
            ps.setString(2, sMSNV);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể cập nhật số điện thoại cho nhân viên " + sMSNV + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật DiaChi của NhanVien trong cơ sở dữ liệu - Input: + KetNoi:
     * Connection + Bảng NHANVIEN của QUAN_LY_SHOWROOM_XE_HOI + sMSNV: String +
     * sDiaChi: String - Output: + Thuộc tính DIACHI = sDiaChi của NhanVien có
     * MSNV bằng sMSNV trong bảng NHANVIEN
     *
     * @param KetNoi
     * @param sMSNV
     * @param sDiaChi
     */
    @Override
    public void updateDiaChi(Connection KetNoi, String sMSNV, String sDiaChi) {
        // TODO implement here
        try {
            String SQL = "UPDATE NHANVIEN SET DIACHI = ? WHERE MSNV = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sDiaChi);
            ps.setString(2, sMSNV);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể cập nhật địa chỉ cho nhân viên " + sMSNV + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật ChucVu của NhanVien trong cơ sở dữ liệu - Input: + KetNoi:
     * Connection + Bảng NHANVIEN của QUAN_LY_SHOWROOM_XE_HOI + sMSNV: String +
     * sTenCVi: String - Output: + Thuộc tính CHUCVU = sTenCV của NhanVien có
     * MSNV bằng sMSNV trong bảng NHANVIEN
     *
     * @param KetNoi
     * @param sMSNV
     * @param sTenCV
     */
    @Override
    public void updateChucVu(Connection KetNoi, String sMSNV, String sTenCV) {
        // TODO implement here
        try {
            String SQL = "UPDATE CHUCVU SET CHUCVU = ? WHERE MSNV = ?";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sTenCV);
            ps.setString(2, sMSNV);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể cập nhật chức vụ cho nhân viên " + sMSNV + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật lương cơ bản của NhanVien trong cơ sở dữ liệu - Input: +
     * KetNoi: Connection + Bảng NHANVIEN của QUAN_LY_SHOWROOM_XE_HOI + sMSNV:
     * String + dTien: double - Output: + Thuộc tính LUONGCB = dTien của
     * NhanVien có MSNV bằng sMSNV trong bảng NHANVIEN
     *
     * @param KetNoi
     * @param sMSNV
     * @param dTien
     */
    @Override
    public void updateLuongCB(Connection KetNoi, String sMSNV, double dTien) {
        // TODO implement here
        try {
            String SQL = "UPDATE NHANVIEN SET LUONGCB = ? WHERE MSNV = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setDouble(1, dTien);
            ps.setString(2, sMSNV);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể cập nhật lương cơ bản cho nhân viên " + sMSNV + "! Chi tiết lỗi: " + ex);
        }
    }

}
