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
public class Xe {
    
    private static PrintStream err = new PrintStream(System.err, true, UTF_8);

    /**
     * Default constructor
     */
    public Xe() {
    }

    /**
     * 
     */
    private String MSXe;

    /**
     * 
     */
    private String HangXe;

    /**
     * 
     */
    private String DongXe;

    /**
     * 
     */
    private double GiaXe;

    /**
     * 
     */
    private int SoLuong;

    /**
     * Hàm khởi tạo đối tượng Xe có tham số
     * - Input:
     * + sMaSo: String
     * + MSXe: String
     * + sTenHang: String
     * + HangXe: String
     * + sTenDong: String
     * + DongXe: String
     * + dGiaTien: double
     * + GiaXe: double
     * - Output:
     * + Đối tượng Xe được khởi tạo
     * + MSXe = sMaSo
     * + HangXe = sTenHang
     * + DongXe = sTenDong
     * + GiaXe = dGiaTien
     * + SoLuong = iSoLuong
     * @param sMaSo
     * @param sTenHang 
     * @param sTenDong 
     * @param dGiaTien 
     * @param iSoLuong
     */
    public Xe(String sMaSo, String sTenHang, String sTenDong, double dGiaTien, int iSoLuong) {
        // TODO implement here
        this.MSXe = sMaSo;
        this.HangXe = sTenHang;
        this.DongXe = sTenDong;
        this.GiaXe = dGiaTien;
        this.SoLuong = iSoLuong;
    }

    /**
     * Hàm lấy MSXe
     * - Input:
     * + MSXe: String
     * - Output:
     * + MSXe: String
     * @return
     */
    public String getMSXe() {
        // TODO implement here
        return this.MSXe;
    }

    /**
     * Hàm cập nhật MSXe
     * - Input:
     * + sMaSo: String
     * + MSXe: String
     * - Output:
     * + MSXe = sMaSo
     * @param sMaSo
     */
    public void setMSXe(String sMaSo) {
        // TODO implement here
        this.MSXe = sMaSo;
    }

    /**
     * Hàm lấy HangXe
     * - Input:
     * + HangXe: String
     * - Output:
     * + HangXe: String
     * @return
     */
    public String getHangXe() {
        // TODO implement here
        return this.HangXe;
    }

    /**
     * Hàm cập nhật HangXe
     * - Input:
     * + sTenHang: String
     * + HangXe: String
     * - Output:
     * + HangXe = sTenHang
     * @param sTenHang
     */
    public void setHangXe(String sTenHang) {
        // TODO implement here
        this.HangXe = sTenHang;
    }

    /**
     * Hàm lấy DongXe
     * - Input:
     * + DongXe: String
     * - Output:
     * + DongXe: String
     * @return
     */
    public String getDongXe() {
        // TODO implement here
        return this.DongXe;
    }

    /**
     * Hàm cập nhật DongXe
     * - Input:
     * + DongXe: String
     * + sTenDong: String
     * - Output:
     * + DongXe = sTenDong
     * @param sTenDong 
     */
    public void setDongXe(String sTenDong) {
        // TODO implement here
        this.DongXe = sTenDong;
    }

    /**
     * @return
     */
    public double getGiaXe() {
        // TODO implement here
        return this.GiaXe;
    }

    /**
     * Hàm cập nhật GiaXe
     * - Input:
     * + GiaXe: double
     * + dGiaTien: double
     * - Output:
     * + GiaXe = dGiaTien
     * @param dGiaTien
     */
    public void setGiaXe(double dGiaTien) {
        // TODO implement here
        this.GiaXe = dGiaTien;
    }

    /**
     * Hàm lấy SoLuong Xe
     * - Input:
     * + SoLuong: int
     * - Output:
     * + SoLuong: int
     * @return
     */
    public int getSoLuong() {
        // TODO implement here
        return this.SoLuong;
    }

    /**
     * Hàm cập nhật SoLuong Xe
     * - Input:
     * + SoLuong: int
     * + iSoLuong: int
     * - Output
     * + SoLuong = iSoLuong
     * @param iSoLuong
     */
    public void setSoLuong(int iSoLuong) {
        // TODO implement here
        this.SoLuong = iSoLuong;
    }

    /**
     * Hàm thêm Xe vào  CSDL
     * - Input:
     * + Bảng XE của Cơ sở dữ liệu QUAN_LY_SHOWROOM_XE_HOI
     * + KetNoi: Connection
     * + DoiTuong: Xe
     * - Output:
     * + DoiTuong được thêm vào bảng XE
     * @param KetNoi 
     * @param DoiTuong
     */
    public void insertXe(Connection KetNoi, Xe DoiTuong) {
        // TODO implement here
        try {
            String SQL = "SET DATEFORMAT DMY;"
                    + "INSERT INTO XE(MSXE, HANG, DONG, GIA, SOLUONG)"
                    + "VALUES(?, ?, ?, ?, ?);";
            
            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, DoiTuong.getMSXe());
            ps.setString(2, DoiTuong.getHangXe());
            ps.setString(3, DoiTuong.getDongXe());
            ps.setDouble(4, DoiTuong.getGiaXe());
            ps.setInt(5, DoiTuong.getSoLuong());
            ps.executeUpdate();
        } catch(SQLException ex) {
            err.println("Không thể thêm xe! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm xóa Xe khỏi cơ sở dữ liệu
     * - Input:
     * + Bảng XE của cơ sở dữ liệu QUAN_LY_SHOWROOM_XE_HOI
     * + sMSXe: String
     * - Output:
     * + Xe có MSXE bằng sMSXe bị xóa khỏi bảng XE
     * @param KetNoi 
     * @param sMSXe
     */
    public void deleteXe(Connection KetNoi, String sMSXe) {
        // TODO implement here
        try {
            String SQL = "DELETE FROM XE WHERE MSXE = ?;";
            
            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sMSXe);
            ps.executeUpdate();
        } catch(SQLException ex) {
            err.println("Không thể xóa xe " + sMSXe + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật HangXe trong cơ sở dữ liệu
     * - Input:
     * + Bảng XE trong QUAN_LY_SHOWROOM_XE_HOI
     * + sMSXe: String
     * + sTenHang: String
     * + KetNoi: Connection
     * - Output:
     * + Thuộc tính HANG = sTenHang của Xe có MSXE bằng sMSXe trong bảng XE
     * @param KetNoi 
     * @param sMSXe 
     * @param sTenHang
     */
    public void updateHangXe(Connection KetNoi, String sMSXe, String sTenHang) {
        // TODO implement here
        try {
            String SQL = "UPDATE XE SET HANG = ? WHERE MSXE = ?;";
            
            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sTenHang);
            ps.setString(2, sMSXe);
            ps.executeUpdate();
        } catch(SQLException ex) {
            err.println("Không thể cập nhật tên hãng cho xe " + sMSXe + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật DongXe trong cở sở dữ liệu
     * - Input:
     * + KetNoi: Connection
     * + Bảng XE của QUAN_LY_SHOWROOM_XE_HOI
     * + sMSXe: String
     * + sTenDong: String
     * - Output:
     * + Thuộc tính DONG = sTenHang của Xe MSXE bằng sMSXe trong bảng XE
     * @param KetNoi 
     * @param sMSXe 
     * @param sTenDong
     */
    public void updateDongXe(Connection KetNoi, String sMSXe, String sTenDong) {
        // TODO implement here
        try {
            String SQL = "UPDATE XE SET DONG = ? WHERE MSXE = ?;";
            
            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sTenDong);
            ps.setString(2, sMSXe);
            ps.executeUpdate();
        } catch(SQLException ex) {
            err.println("Không thể cập nhật tên dòng cho xe " + sMSXe + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật GiaXe trong cơ sở dữ liệu
     * - Input:
     * + KetNoi: Connection
     * + Bảng XE của QUAN_LY_SHOWROOM_XE_HOI
     * + sMSXE: String
     * + dTien: double
     * - Output:
     * + Thuộc tính GIA = dTien của Xe có MSXE bằng sMSXe trong bảng XE
     * @param KetNoi 
     * @param sMSXe 
     * @param dTien
     */
    public void updateGiaXe(Connection KetNoi, String sMSXe, double dTien) {
        // TODO implement here
        try {
            String SQL = "UPDATE XE SET GIA = ? WHERE MSXE = ?;";
            
            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setDouble(1, dTien);
            ps.setString(2, sMSXe);
            ps.executeUpdate();
        } catch(SQLException ex) {
            err.println("Không thể cập nhật giá cho xe " + sMSXe + "! Chi tiết lỗi: " + ex);
        }
    }

    /**
     * Hàm cập nhật SoLuong Xe trong cơ sở dữ liệu
     * - Input:
     * + KetNoi: Connection
     * + Bảng XE của QUAN_LY_SHOWROOM_XE_HOI
     * + sMSXe: String
     * + iSoLuong: int
     * - Output:
     * + Thuộc tính SOLUONG = iSoLuong của Xe có MSXE bằng sMSXe trong bảng XE
     * @param KetNoi 
     * @param sMSXe 
     * @param iSoLuong
     */
    public void updateSoLuong(Connection KetNoi, String sMSXe, int iSoLuong) {
        // TODO implement here
        try {
            String SQL = "UPDATE XE SET SOLUONG = ? WHERE MSXE = ?;";
            
            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setInt(1, iSoLuong);
            ps.setString(2, sMSXe);
            ps.executeUpdate();
        } catch(SQLException ex) {
            err.println("Không thể cập nhật số lượng xe " + sMSXe + "! Chi tiết lỗi: " + ex);
        }
    }

}