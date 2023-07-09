package Model;

import java.util.*;
import java.io.PrintStream;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Xe;

/**
 *
 */
public class HoaDon {

    private static PrintStream err = new PrintStream(System.err, true, UTF_8);

    /**
     * Default constructor
     */
    public HoaDon() {
        this.DSXe = new ArrayList<>();
    }

    /**
     *
     */
    private String MSHD;

    /**
     *
     */
    private String NgHD;

    /**
     *
     */
    private String MSNV;

    /**
     *
     */
    private String MSKH;

    /**
     *
     */
    private ArrayList<Xe> DSXe;

    /**
     *
     */
    private double ThanhTien;

    /**
     * Hàm khởi tạo HoaDon - Input: + NgHD: String + sThoiGian: String + MSNV:
     * String + sMSNV: String + MSKH: String + sMSKH: String - Output: + Đối
     * tượng HoaDon được khởi tạo + NgHD = sThoiGian + MSNV = sMSNV + MSKH =
     * sMSKH
     *
     * @param sThoiGian
     * @param sMSNV
     * @param sMSKH
     */
    public HoaDon(String sThoiGian, String sMSNV, String sMSKH) {
        // TODO implement here
        this.NgHD = sThoiGian;
        this.MSNV = sMSNV;
        this.MSKH = sMSKH;
        this.DSXe = new ArrayList<>();
    }

    /**
     * Hàm lấy MSHD - Input: + MSHD: String - Output: + MSHD: String
     *
     * @return
     */
    public String getMSHD() {
        // TODO implement here
        return this.MSHD;
    }

    /**
     * Hàm cập nhật MSHD - Input: + MSHD: String + sMaSo: String - Output: +
     * MSHD = sMaSo
     *
     * @param sMaSo
     */
    public void setMSHD(String sMaSo) {
        // TODO implement here
        this.MSHD = sMaSo;
    }

    /**
     * Hàm lấy NgHD - Input: + NgHD: String - Output: + NgHD: String
     *
     * @return
     */
    public String getNgHD() {
        // TODO implement here
        return this.NgHD;
    }

    /**
     * Hàm cập nhật Ngày hóa đơn - Input: + NgHD: String + sThoiGian: String -
     * Output: + NgHD = sThoiGian
     *
     * @param sThoiGian
     */
    public void setNgHD(String sThoiGian) {
        // TODO implement here
        this.NgHD = sThoiGian;
    }

    /**
     * Hàm lấy MSNV của HoaDon - Input: + MSNV: String - Output: + MSNV: String
     *
     * @return
     */
    public String getMSNV() {
        // TODO implement here
        return this.MSNV;
    }

    /**
     * Hàm cập nhật MSNV của HoaDon - Input: + MSNV: String + sMaSo: String -
     * Output: + MSNV = sMaSo
     *
     * @param sMaSo
     */
    public void setMSNV(String sMaSo) {
        // TODO implement here
        this.MSNV = sMaSo;
    }

    /**
     * Hàm lấy MSKH của HoaDon - Input: + MSKH: String - Output: + MSKH: String
     *
     * @return
     */
    public String getMSKH() {
        // TODO implement here
        return this.MSKH;
    }

    /**
     * Hàm cập nhật MSKH của HoaDon - Input: + MSKH: String + sMaSo: String -
     * Output: + MSKH = sMaSo
     *
     * @param sMaSo
     */
    public void setMSKH(String sMaSo) {
        // TODO implement here
        this.MSKH = sMaSo;
    }

    /**
     * Hàm lấy DSXe - Input: + DSXe: ArrayList<Xe>
     * - Output: + DSXe: ArrayList<Xe>
     *
     * @return
     */
    public ArrayList<Xe> getDSXe() {
        // TODO implement here
        return this.DSXe;
    }

    /**
     * Hàm lấy Xe trong DSXe - Input: + DSXe: ArrayList<Xe>
     * + sMaSo: String - Output: + Xe có MSXe = sMaSo
     *
     * @param sMaSo
     * @return
     */
    public Xe getXe(String sMaSo) {
        // TODO implement here
        for (Xe key : this.DSXe) {
            if (key.getMSXe().equals(sMaSo)) {
                return key;
            }
        }
        return null;
    }

    /**
     * Hàm thêm Xe vào DSXe - Input: + DSXe: ArrayList<Xe>
     * + DoiTuong: Xe - Output: + DoiTuong được thêm vâo DSXe
     *
     * @param DoiTuong
     */
    public void themXe(Xe DoiTuong) {
        // TODO implement here
        this.DSXe.add(DoiTuong);
    }

    /**
     * Hàm xóa Xe khỏi DSXe - Input: + DSXe: ArrayList<Xe>
     * + sMaSo: String - Output: + Xe có MSXe = sMaSo bị xóa khỏi DSXe
     *
     * @param sMaSo
     */
    public void xoaXe(String sMaSo) {
        // TODO implement here
        for (Xe key : this.DSXe) {
            if (key.getMSXe().equals(sMaSo)) {
                this.DSXe.remove(key);
            }
        }
    }

    /**
     * Hàm lấy ThanhTien của HoaDon - Input: + ThanhTien: double - Output: +
     * ThanhTien: double
     *
     * @return
     */
    public double getThanhTien() {
        // TODO implement here
        return this.ThanhTien;
    }

    /**
     * Hàm cập nhật ThanhTien của HoaDon - Input: + ThanhTien: double + dTien:
     * double - Output: + ThanhTien = dTien
     *
     * @param dTien
     */
    public void setThanhTien(double dTien) {
        // TODO implement here
        this.ThanhTien = dTien;
    }

    /**
     * Hàm tạo MSHD mới - Input: + KetNoi: Connection + HD_VIEW của
     * QUAN_LY_SHOWROOM_XE_HOI - Output: + MSHD mới
     *
     * @param KetNoi
     * @return
     */
    public String taoMSHD(Connection KetNoi) {
        // TODO implement here
        try {
            String SQL = "SELECT MAX(MSHD) AS MSHD FROM HD_VIEW;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ResultSet rs = ps.executeQuery();

            String sMaSo = null;
            while (rs.next()) {
                sMaSo = rs.getString("MSHD");
            }

            if (sMaSo != null) {
                sMaSo = sMaSo.substring(2);
                int temp = Integer.parseInt(sMaSo) + 1;
                if (temp < 10) {
                    sMaSo = "HD0" + Integer.toString(temp);
                } else {
                    sMaSo = "HD" + Integer.toString(temp);
                }
            } else {
                sMaSo = "HD01";
            }
            
            return sMaSo;

        } catch (SQLException ex) {
            err.println("Không thể truy vấn HD_VIEW! Chi tiết lỗi: " + ex);
        }
        return null;
    }

    /**
     * Hàm thêm HoaDon vào cơ sở dữ liệu - Input: + Bảng HOADON của cơ sở dữ
     * liệu QUAN_LY_SHOWROOM_XE_HOI + KetNoi: Connection + DoiTuong: HoaDon -
     * Output: + DoiTuong được thêm vào bảng HOADON
     *
     * @param KetNoi
     * @param DoiTuong
     */
    public void insertHD(Connection KetNoi, HoaDon DoiTuong) {
        // TODO implement here
        try {
            String SQL = "SET DATEFORMAT DMY;"
                    + "INSERT INTO HOADON(MSHD, NGHD, MSNV, MSKH, THANHTIEN)"
                    + "VALUES(?, ?, ?, ?, 0);";
            String SQL2 = "INSERT INTO CTHD(MSHD, MSXE, SOLUONG)"
                    + "VALUES(?, ?, ?);";

            String sMSHD = DoiTuong.taoMSHD(KetNoi);

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sMSHD);
            ps.setString(2, DoiTuong.getNgHD());
            ps.setString(3, DoiTuong.getMSNV());
            ps.setString(4, DoiTuong.getMSKH());
            ps.executeUpdate();

            for (Xe key : DoiTuong.getDSXe()) {
                ps = KetNoi.prepareCall(SQL2);
                ps.setString(1, sMSHD);
                ps.setString(2, key.getMSXe());
                ps.setInt(3, key.getSoLuong());
                ps.executeUpdate();
            }
        } catch (SQLException ex) {
            err.println("Không thể thêm hóa đơn " + DoiTuong.getMSHD() + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm xóa HoaDon khỏi cơ sở dữ liệu - Input: + Bảng HOADON của cơ sở dữ
     * liệu QUAN_LY_SHOWROOM_XE_HOI + sMSHD: String - Output: + HoaDon có MSHD
     * bằng sMSHD bị xóa khỏi bảng HOADON
     *
     * @param KetNoi
     * @param sMSHD
     */
    public void deleteHD(Connection KetNoi, String sMSHD) {
        // TODO implement here
        try {
            String SQL = "EXEC XOA_HOADON @MSHD = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sMSHD);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể xóa hóa đơn " + sMSHD + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật ngày hóa đơn trong cơ sở dữ liệu - Input: + KetNoi:
     * Connection + Bảng HOADON của QUAN_LY_SHOWROOM_XE_HOI + sMSHD: String +
     * sThoiGian: String - Output: + Thuộc tính NGHD = sThoiGian của HoaDon có
     * MSHD bằng sMSHD trong bảng HOADON
     *
     * @param KetNoi
     * @param sMSHD
     * @param sThoiGian
     */
    public void updateNgHD(Connection KetNoi, String sMSHD, String sThoiGian) {
        // TODO implement here
        try {
            String SQL = "UPDATE HOADON SET NGHD = ? WHERE MSHD = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sThoiGian);
            ps.setString(2, sMSHD);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể cập nhật ngày cho hóa đơn " + sMSHD + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật MSNV trong cơ sở dữ liệu - Input: + KetNoi: Connection +
     * Bảng HOADON của QUAN_LY_SHOWROOM_XE_HOI + sMSHD: String + sMSNV: String -
     * Output: + Thuộc tính MSNV = sMSNV của HoaDon có MSHD bằng sMSHD trong
     * bảng HOADON
     *
     * @param KetNoi
     * @param sMSHD
     * @param sMSNV
     */
    public void updateMSNV(Connection KetNoi, String sMSHD, String sMSNV) {
        // TODO implement here
        try {
            String SQL = "UPDATE HOADON SET MSNV = ? WHERE MSHD = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sMSNV);
            ps.setString(2, sMSHD);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể cập nhật mã số nhân viên cho hóa đơn " + sMSHD + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật MSKH trong cơ sở dữ liệu - Input: + KetNoi: Connection +
     * Bảng HOADON của QUAN_LY_SHOWROOM_XE_HOI + sMSHD: String + sMSKH: String -
     * Output: + Thuộc tính MSKH = sMSKH của HoaDon có MSHD bằng sMSHD trong
     * bảng HOADON
     *
     * @param KetNoi
     * @param sMSHD
     * @param sMSKH
     */
    public void updateMSKH(Connection KetNoi, String sMSHD, String sMSKH) {
        // TODO implement here
        try {
            String SQL = "UPDATE HOADON SET MSKH = ? WHERE MSHD = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sMSKH);
            ps.setString(2, sMSHD);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể cập nhật mã số khách hàng cho hóa đơn " + sMSHD + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật mã số xe của hóa đơn - Input: + KetNoi: Connection + CTHD
     * của QUAN_LY_SHOWROOM_XE_HOI + sMSHD: String + sMSXeCu: String + sMSXeMoi:
     * String - Output: + CTHD có MSHD = sMSHD và MSXE = sMSXeCu sẽ sẽ được cập
     * nhật MSXE = sMSXeMoi
     *
     * @param KetNoi
     * @param sMSHD
     * @param sMSXeCu
     * @param sMSXeMoi
     */
    public void updateMSXE(Connection KetNoi, String sMSHD, String sMSXeCu, String sMSXeMoi) {
        // TODO implement here
        try {
            String SQL = "UPDATE CTHD SET MSXE = ? WHERE MSHD = ? AND MSXE = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sMSXeMoi);
            ps.setString(2, sMSHD);
            ps.setString(3, sMSXeCu);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể cập nhật mã số cho xe " + sMSXeCu + " trên hóa đơn " + sMSHD + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật số lượng xe cho hóa đơn - Input: + KetNoi: Connection + CTHD
     * của QUAN_LY_SHOWROOM_XE_HOI + sMSHD: String + sMSXe: String + iSoLuong:
     * int - Output: + Hóa đơn có MSHD = sMSHD và MSXE = sMSXe sẽ được cập nhật
     * SOLUONG = iSoLuong
     *
     * @param KetNoi
     * @param sMSHD
     * @param sMSXe
     * @param iSoLuong
     */
    public void updateSLXe(Connection KetNoi, String sMSHD, String sMSXe, int iSoLuong) {
        // TODO implement here
        try {
            String SQL = "UPDATE CTHD SET SOLUONG = ? WHERE MSHD = ? AND MSXE = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setInt(1, iSoLuong);
            ps.setString(2, sMSHD);
            ps.setString(3, sMSXe);
            ps.executeUpdate();
        } catch (SQLException ex) {
            err.println("Không thể cập nhật số lượng xe " + sMSXe + " cho hóa đơn " + sMSHD + "! Chi tiết lỗi: " + ex);
        }
    }
    
    /**
     * Hàm tính trị giá hóa đơn
     * - Input:
     * + DSXe: ArrayList<Xe>
     * - Output:
     * + Trị giá hóa đơn
     * @param
     */
    public void tinhTriGiaHD() {
        // TODO implement here
        Double dTien = 0d;
        for (Xe key : this.DSXe) {
            dTien += key.getGiaXe() * key.getSoLuong();
        }
        
        this.ThanhTien = dTien;
    }

}
