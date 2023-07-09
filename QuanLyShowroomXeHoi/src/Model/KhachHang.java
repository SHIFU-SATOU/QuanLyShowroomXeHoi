package Model;

import java.util.*;
import java.io.PrintStream;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 */
public class KhachHang {

    private static PrintStream err = new PrintStream(System.err, true, UTF_8);

    /**
     * Default constructor
     */
    public KhachHang() {
    }

    /**
     *
     */
    private String MSKH;

    /**
     *
     */
    private String HoTen;

    /**
     *
     */
    private String GioiTinh;

    /**
     *
     */
    private String SDT;

    /**
     *
     */
    private String DiaChi;

    /**
     *
     */
    private String NgDK;

    /**
     *
     */
    private double DoanhThu;

    /**
     * Hàm khởi tạo KhachHang có tham số - Input: + HoTen: String + sHoTen:
     * String + GioiTinh: String + sGioiTinh: String + DiaChi: String + sDiaChi:
     * String + NgDK: String + sThoiGian: String - Output: + HoTen = sHoTen +
     * GioiTinh = sGioiTinh + DiaChi = sDiaChi + NgDK = sThoiGian
     *
     * @param sHoTen
     * @param sGioiTinh
     * @param sDiaChi
     * @param sThoiGian
     */
    public KhachHang(String sHoTen, String sGioiTinh, String sDiaChi, String sThoiGian) {
        // TODO implement here
        this.HoTen = sHoTen;
        this.GioiTinh = sGioiTinh;
        this.DiaChi = sDiaChi;
        this.NgDK = sThoiGian;
    }

    /**
     * Hàm lấy MSKH - Input: + MSKH: String - Output: + MSKH: String
     *
     * @return
     */
    public String getMSKH() {
        // TODO implement here
        return this.MSKH;
    }

    /**
     * Hàm cập nhật MSKH - Input: + MSKH: String + sMaSo: String - Output: +
     * MSKH = sMaSo
     *
     * @param sMaSo
     */
    public void setMSKH(String sMaSo) {
        // TODO implement here
        this.MSKH = sMaSo;
    }

    /**
     * Hàm lấy HoTen của KhachHang - Input: + HoTen: String - Output: + HoTen:
     * String
     *
     * @return
     */
    public String getHoTen() {
        // TODO implement here
        return this.HoTen;
    }

    /**
     * Hàm cập nhật HoTen của KhachHang - Input: + HoTen: String + sHoTen:
     * String - Output: + HoTen = sHoTen
     *
     * @param sHoTen
     */
    public void setHoTen(String sHoTen) {
        // TODO implement here
        this.HoTen = sHoTen;
    }

    /**
     * Hàm lấy GioiTinh của KhachHang - Input: + GioiTinh: String - Output: +
     * GioiTinh: String
     *
     * @return
     */
    public String getGioiTinh() {
        // TODO implement here
        return this.GioiTinh;
    }

    /**
     * Hàm cập nhật GioiTinh của KhachHang - Input: + GioiTinh: String +
     * sGioiTinh: String - Output: + GioiTinh = sGioiTinh
     *
     * @param sGioiTinh
     */
    public void setGioiTinh(String sGioiTinh) {
        // TODO implement here
        this.GioiTinh = sGioiTinh;
    }

    /**
     * Hàm lấy SDT của KhachHang - Input: + SDT: String - Output: + SDT: String
     *
     * @return
     */
    public String getSDT() {
        // TODO implement here
        return this.SDT;
    }

    /**
     * Hàm cập nhật SDT của KhachHang - Input: + SDT: String + sSo: String -
     * Output: + SDT = sSo
     *
     * @param sSDT
     */
    public void setSDT(String sSDT) {
        // TODO implement here
        this.SDT = sSDT;
    }

    /**
     * Hàm lấy DiaChi của KhachHang - Input: + DiaChi: String - Output: +
     * DiaChi: String
     *
     * @return
     */
    public String getDiaChi() {
        // TODO implement here
        return this.DiaChi;
    }

    /**
     * Hàm cập nhật DiaChi của KhachHang - Input: + DiaChi: String + sDiaChi:
     * String - Output: + DiaChi = sDiaChi
     *
     * @param sDiaChi
     */
    public void setDiaChi(String sDiaChi) {
        // TODO implement here
        this.DiaChi = sDiaChi;
    }

    /**
     * Hàm lấy ngày đăng ký thành viên của KhachHang - Input: + NgDK: String -
     * Output: + NgDK: String
     *
     * @return
     */
    public String getNgDK() {
        // TODO implement here
        return this.NgDK;
    }

    /**
     * Hàm cập nhật ngày đăng ký khách hàng thành viên - Input: + NgDK: String +
     * sThoiGian: String - Output: + NgDK = sThoiGian
     *
     * @param sThoiGian
     */
    public void setNgDK(String sThoiGian) {
        // TODO implement here
        this.NgDK = sThoiGian;
    }

    /**
     * Hàm lấy DoanhThu của KhachHang - Input: + DoanhThu: double - Output: +
     * DoanhThu: double
     *
     * @return
     */
    public double getDoanhThu() {
        // TODO implement here
        return this.DoanhThu;
    }

    /**
     * Hàm cập nhật DoanhThu của KhachHang - Input: + DoanhThu: double + dTien:
     * double - Output: + DoanhThu = dTien
     *
     * @param dTien
     */
    public void setDoanhThu(double dTien) {
        // TODO implement here
        this.DoanhThu = dTien;
    }

    /**
     * Hàm tạo MSKH mới - Input: + KetNoi: Connection + KH_VIEW của
     * QUAN_LY_SHOWROOM_XE_HOI - Output: + MSKH mới
     *
     * @param KetNoi
     * @return
     */
    public String taoMSKH(Connection KetNoi) {
        // TODO implement here
        try {
            String SQL = "SELECT MAX(MSKH) AS MSKH FROM KH_VIEW;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);

            ResultSet rs = ps.executeQuery();

            String sMaSo = null;
            while (rs.next()) {
                sMaSo = rs.getString("MSKH");
            }

            if (sMaSo != null) {
                sMaSo = sMaSo.substring(2);

                int temp = Integer.parseInt(sMaSo) + 1;
                if (temp < 10) {
                    sMaSo = "KH0" + Integer.toString(temp);
                } else {
                    sMaSo = "KH" + Integer.toString(temp);
                }
            } else {
                sMaSo = "KH01";
            }
            
            

            return sMaSo;

        } catch (SQLException ex) {
            err.println("Không thể truy vấn KH_VIEW! Chi tiết lỗi: " + ex);
        }
        return "";
    }

    /**
     * Hàm thêm KhachHang vào cơ sở dữ liệu - Input: + Bảng KHACHHANG của cơ sở
     * dữ liệu QUAN_LY_SHOWROOW_XE_HOI + KetNoi: Connection + DoiTuong:
     * KhachHang - Output: + DoiTuong được thêm vào bảng KHACHHANG
     *
     * @param KetNoi
     * @param DoiTuong
     */
    public void insertKH(Connection KetNoi, KhachHang DoiTuong) {
        // TODO implement here
        try {
            String SQL = "SET DATEFORMAT DMY;"
                    + "INSERT INTO KHACHHANG(MSKH, HOTEN, GIOITINH, SDT, DIACHI, NGDK, DOANHTHU)"
                    + "VALUES(?, ?, ?, ?, ?, ?, ?);";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, DoiTuong.taoMSKH(KetNoi));
            ps.setString(2, DoiTuong.getHoTen());
            ps.setString(3, DoiTuong.getGioiTinh());
            ps.setString(4, DoiTuong.getSDT());
            ps.setString(5, DoiTuong.getDiaChi());
            ps.setString(6, DoiTuong.getNgDK());
            ps.setString(7, Double.toString(DoiTuong.getDoanhThu()));
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể thêm khách hàng! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm xóa KhachHang khỏi cơ sở dữ liệu - Input: + Bảng KHACHHANG của cơ sở
     * dữ liệu QUAN_LY_SHOWROOM_XE_HOI + KetNoi: Connection + sMSKH: String -
     * Output: + KhachHang có MSKH bằng sMSKH bị xóa khỏi bảng KHACHHANG
     *
     * @param KetNoi
     * @param sMSKH
     */
    public void deleteKH(Connection KetNoi, String sMSKH) {
        // TODO implement here
        try {
            String SQL = "EXEC XOA_KHACHHANG @MSKH = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sMSKH);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể xóa khách hàng " + sMSKH + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật họ tên khách hàng trong cơ sở dữ liệu - Input: + KetNoi:
     * Connection + Bảng KHACHHANG của QUAN_LY_SHOWROOM_XE_HOI + sMSKH: String +
     * sHoTen: String - Output: + Thuộc tính HOTEN = sHoTen của KhachHang có
     * MSKH bằng sMSKH trong bảng KHACHHANG
     *
     * @param KetNoi
     * @param sMSKH
     * @param sHoTen
     */
    public void updateHoTen(Connection KetNoi, String sMSKH, String sHoTen) {
        // TODO implement here
        try {
            String SQL = "UPDATE KHACHHANG SET HOTEN = ? WHERE MSKH = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sHoTen);
            ps.setString(2, sMSKH);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể cập nhật họ tên cho nhân viên " + sMSKH + "! Lỗi chi tiết: " + ex);
        }
    }

    /**
     * Hàm cập nhật giới tính khách hàng trong cơ sở dữ liệu - Input: + KetNoi:
     * Connection + Bảng KHACHHANG của QUAN_LY_SHOWROOM_XE_HOI + sMSKH: String +
     * sGioiTinh: String - Output: + Thuộc tính GIOITINH = sGioiTinh của
     * KhachHang có MSKH bằng sMSKH trong bảng KHACHHANG
     *
     * @param KetNoi
     * @param sMSKH
     * @param sGioiTinh
     */
    public void updateGioiTinh(Connection KetNoi, String sMSKH, String sGioiTinh) {
        // TODO implement here
        try {
            String SQL = "UPDATE KHACHHANG SET GIOITINH = ? WHERE MSKH = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sGioiTinh);
            ps.setString(2, sMSKH);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể cập nhật giới tính cho nhân viên " + sMSKH + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật SDT khách hàng trong cơ sở dữ liệu - Input: + KetNoi:
     * Connection + Bảng KHACHHANG của QUAN_LY_SHOWROOM_XE_HOI + sMSKH: String +
     * sSo: String - Output: + Thuộc tính SDT = sSo của KhachHang có MSKH bằng
     * sMSKH trong bảng KHACHHANG
     *
     * @param KetNoi
     * @param sMSKH
     * @param sSo
     */
    public void updateSDT(Connection KetNoi, String sMSKH, String sSo) {
        // TODO implement here
        try {
            String SQL = "UPDATE KHACHHANG SET SDT = ? WHERE MSKH = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sSo);
            ps.setString(2, sMSKH);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể cập nhật số điện thoại cho nhân viên " + sMSKH + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật địa chỉ khách hàng trong cơ sở dữ liệu - Input: + KetNoi:
     * Connection + Bảng KHACHHANG của QUAN_LY_SHOWROOM_XE_HOI + sMSKH: String +
     * sDiaChi: String - Output: + Thuộc tính DIACHI = sDiaChi của KhachHang có
     * MSKH bằng sMSKH trong bảng KHACHHANG
     *
     * @param KetNoi
     * @param sMSKH
     * @param sDiaChi
     */
    public void updateDiaChi(Connection KetNoi, String sMSKH, String sDiaChi) {
        // TODO implement here
        try {
            String SQL = "UPDATE KHACHHANG SET DIACHI = ? WHERE MSKH = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sDiaChi);
            ps.setString(2, sMSKH);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể cập nhật địa chỉ cho nhân viên " + sMSKH + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật ngày đăng ký thành viên của khách hàng trong cơ sở dữ liệu -
     * Input: + KetNoi: Connection + Bảng KHACHHANG của QUAN_LY_SHOWROOM_XE_HOI
     * + sMSKH: String + sThoiGian: String - Output: + Thuộc tính NGDK =
     * sThoiGian của KhachHang có MSKH bằng sMSKH trong bảng KHACHHANG
     *
     * @param KetNoi
     * @param sMSKH
     * @param sThoiGian
     */
    public void updateNgDK(Connection KetNoi, String sMSKH, String sThoiGian) {
        // TODO implement here
        try {
            String SQL = "SET DATEFORMAT DMY;"
                    + "UPDATE KHACHHANG SET NGDK = ? WHERE MSKH = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sThoiGian);
            ps.setString(2, sMSKH);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể cập nhật ngày đắng ký cho khách hàng " + sMSKH + "! Chi tiết lỗi: " + ex);
        }
    }

}
