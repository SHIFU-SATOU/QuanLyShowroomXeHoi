package Model;

import java.util.*;
import java.io.PrintStream;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Xe;
import Controller.XeController;
import Model.NhanVien;
import Controller.NhanVienController;
import Model.KhachHang;
import Controller.KhachHangController;
import Model.HoaDon;

/**
 *
 */
public class Showroom {

    private static PrintStream err = new PrintStream(System.err, true, UTF_8);

    /**
     * Default constructor
     */
    public Showroom() {
        this.DSXe = new ArrayList<>();
        this.DSNV = new ArrayList<>();
        this.DSKH = new ArrayList<>();
        this.DSHD = new ArrayList<>();
    }

    /**
     *
     */
    private String MaSo;

    /**
     *
     */
    private String Ten;

    /**
     *
     */
    private ArrayList<Xe> DSXe;

    /**
     *
     */
    private ArrayList<NhanVien> DSNV;

    /**
     *
     */
    private ArrayList<KhachHang> DSKH;

    /**
     *
     */
    private ArrayList<HoaDon> DSHD;

    /**
     * Hàm khởi tạo đối tượng Showroom có tham số - Input: + MaSo: String +
     * sMaSo: String + Ten: String + sTen: String - Output: + Đối tượng Showroom
     * được khởi tạo + MaSo = sMaSo + Ten = sTen
     *
     * @param sMaSo
     * @param sTen
     */
    public Showroom(String sMaSo, String sTen) {
        // TODO implement here
        this.MaSo = sMaSo;
        this.Ten = sTen;
        this.DSXe = new ArrayList<>();
        this.DSNV = new ArrayList<>();
        this.DSKH = new ArrayList<>();
        this.DSHD = new ArrayList<>();
    }

    /**
     * Hàm lấy MaSo của Showroom - Input: + MaSo: String - Output: + MaSo:
     * String
     *
     * @return
     */
    public String getMaSo() {
        // TODO implement here
        return this.MaSo;
    }

    /**
     * Hàm cập nhật MaSo của Showroom - Input: + MaSo: String + sMaSo: String -
     * Output: + MaSo = sMaSo
     *
     * @param sMaSo
     */
    public void setMaSo(String sMaSo) {
        // TODO implement here
        this.MaSo = sMaSo;
    }

    /**
     * Hàm lấy Ten của Showroom - Input: + Ten: String - Output: + Ten: String
     *
     * @return
     */
    public String getTen() {
        // TODO implement here
        return this.Ten;
    }

    /**
     * Hàm cập nhật Ten của Showroom - Input: + Ten: String + sTen: String -
     * Output: + Ten = sTen
     *
     * @param sTen
     */
    public void setTen(String sTen) {
        // TODO implement here
        this.Ten = sTen;
    }

    /**
     * Hàm lấy DSXe của Showroom - Input: + DSXe: ArrayList<Xe>
     * - Output: + DSXe: ArrayList<Xe>
     *
     * @return
     */
    public ArrayList<Xe> getDSXe() {
        // TODO implement here
        return this.DSXe;
    }

    /**
     * Hàm thêm Xe vào DSXe của Showroom - Input: + DSXe: ArrayList<Xe>
     * + DoiTuong: Xe - Output: + DoiTuong được thêm vào DSXe
     *
     * @param DoiTuong
     */
    public void themXe(Xe DoiTuong) {
        // TODO implement here
        this.DSXe.add(DoiTuong);
    }

    /**
     * Hàm xóa Xe khỏi DSXe của Showroom - Input: + DSXe: ArrayList<Xe>
     * + sMSXe: String - Output: + Xe có MSXe bằng sMSXe bị xóa khỏi DSXe
     *
     * @param sMSXe
     */
    public void xoaXe(String sMSXe) {
        // TODO implement here
        for (Xe key : this.DSXe) {
            if (key.getMSXe().equals(sMSXe)) {
                this.DSXe.remove(key);
            }
        }
    }

    /**
     * Hàm lấy DSNV của Showroom - Input: + DSNV: ArrayList<NhanVien>
     * - Output: + DSNV: ArrayList< NhanVien>
     *
     * @return
     */
    public ArrayList<NhanVien> getDSNV() {
        // TODO implement here
        return this.DSNV;
    }

    /**
     * Hàm thêm NhanVien vào DSNV của Showroom - Input: + DSNV:
     * ArrayList<NhanVien>
     * + DoiTuong: NhanVien - Output: + DoiTuong được thêm vào DSNV
     *
     * @param DoiTuong
     */
    public void themNV(NhanVien DoiTuong) {
        // TODO implement here
        this.DSNV.add(DoiTuong);
    }

    /**
     * Hàm xóa NhanVien khỏi DSNV của Showroom - Input: + DSNV:
     * ArrayList<NhanVien>
     * + sMSNV: String - Output: + NhanVien có MSNV bằng sMSNV bị xóa khỏi DSNV
     *
     * @param sMSNV
     */
    public void xoaNV(String sMSNV) {
        // TODO implement here
        for (NhanVien key : this.DSNV) {
            if (key.getMSNV().equals(key)) {
                this.DSNV.remove(key);
            }
        }
    }

    /**
     * Hàm lấy DSKH của Showroom - Input: + DSKH: ArrayList<KhachHang>
     * - Output: + DSKH: ArrayList<KhachHang>
     *
     * @return
     */
    public ArrayList<KhachHang> getDSKH() {
        // TODO implement here
        return this.DSKH;
    }

    /**
     * Hàm thêm KhachHang vào DSKH của Showroom - Input: + DSKH:
     * ArrayList<KhachHang>
     * + DoiTuong: KhachHang - Output: + DoiTuong được thêm vào DSKH
     *
     * @param DoiTuong
     */
    public void themKH(KhachHang DoiTuong) {
        // TODO implement here
        this.DSKH.add(DoiTuong);
    }

    /**
     * Hàm xóa KhachHang khỏi DSKH của Showroom - Input: + DSKH:
     * ArrayList<KhachHang>
     * + sMSKH: String - Output: + KhachHang bị xóa khỏi DSKH
     *
     * @param sMSKH
     */
    public void xoaKH(String sMSKH) {
        // TODO implement here
        for (KhachHang key : this.DSKH) {
            if (key.getMSKH().equals(sMSKH)) {
                this.DSKH.remove(key);
            }
        }
    }

    /**
     * Hàm thêm HoaDon vào DSHD của Showroom - Input: + DSHD: ArrayList<HoaDon>
     * - Output: + DSHD: ArrayList<HoaDon>
     *
     * @return
     */
    public ArrayList<HoaDon> getDSHD() {
        // TODO implement here
        return this.DSHD;
    }

    /**
     * Hàm thêm HoaDon vào DSHD của Showroom - Input: + DSHD: ArrayList<HoaDon>
     * + DoiTuong: HoaDon - Output: + DoiTuong được thêm vào DSHD
     *
     * @param DoiTuong
     */
    public void themHD(HoaDon DoiTuong) {
        // TODO implement here
        this.DSHD.add(DoiTuong);
    }

    /**
     * Hàm xóa HoaDon khỏi DSHD của Showroom - Input: + DSHD: ArrayList<HoaDon>
     * + sMSHD: String - Output: + HoaDon có MSHD bằng sMSHD bị xóa khỏi DSHD
     *
     * @param sMSHD
     */
    public void xoaHD(String sMSHD) {
        // TODO implement here
        for (HoaDon key : this.DSHD) {
            if (key.getMSHD().equals(sMSHD)) {
                this.DSHD.remove(key);
            }
        }
    }

    /**
     * Hàm tải danh sách Xe từ cơ sở dữ liệu - Input: + XE_VIEW của cơ sở dữ
     * liệu QUAN_LY_SHOWROOM_XE_HOI + KetNoi: Connection - Output: + XE_VIEW
     *
     * @param KetNoi
     * @return
     */
    public ResultSet loadXe(Connection KetNoi) {
        // TODO implement here
        try {
            String SQL = "SELECT * FROM XE_VIEW;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);

            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            err.println("Không thể tải danh sách xe! Nguyên nhân: " + ex);
        }
        return null;
    }

    /**
     * Hàm tải danh sách NhanVien từ cơ sở dữ liệu - Input: + NV_VIEW của cơ sở
     * dữ liệu QUAN_LY_SHOWROOM_XE_HOI + KetNoi: Connection - Output: + Danh
     * sách NhanVien của bảng NHANVIEN
     *
     * @param KetNoi
     * @return
     */
    public ResultSet loadNV(Connection KetNoi) {
        // TODO implement here
        try {
            String SQL = "SELECT * FROM NV_VIEW;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);

            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            err.println("Không thể tải danh sách nhân viên! Nguyên nhân: " + ex);
        }
        return null;
    }

    /**
     * Hàm tải danh sách nhân viên bán hàng từ cơ sở dữ liệu - Input; +
     * NVBH_VIEW của cơ sở dữ liệu QUAN_LY_SHOWROOM_XE_HOI + KetNoi: Connection
     * - Output: + NVBH_VIEW
     *
     * @param KetNoi
     * @return
     */
    public ResultSet loadNVBH(Connection KetNoi) {
        // TODO implement here
        try {
            String SQL = "SELECT * FROM NVBH_VIEW;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);

            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            err.println("Không thể tải danh sách nhân viên bán hàng! Nguyên nhân: " + ex);
        }
        return null;
    }

    /**
     * Hàm tải danh sách khách hàng từ cơ sở dữ liệu - Input: + KH_VIEW của cơ
     * sở dữ liệu QUAN_LY_SHOWROOM_XE_HOI + KetNoi: Connection - Output: +
     * KH_VIEW
     *
     * @param KetNoi
     * @return
     */
    public ResultSet loadKH(Connection KetNoi) {
        // TODO implement here
        try {
            String SQL = "SELECT * FROM KH_VIEW;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);

            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            err.println("Không thể tải danh sách khách hàng! Nguyên nhân: " + ex);
        }
        return null;
    }

    /**
     * Hàm tải danh sách HoaDon từ cơ sở dữ liệu - Input: + HD_VIEW của cơ sở dữ
     * liệu QUAN_LY_SHOWROOM_XE_HOI + KetNoi: Connection - Output: + HD_VIEW
     *
     * @param KetNoi
     * @return
     */
    public ResultSet loadHD(Connection KetNoi) {
        // TODO implement here
        try {
            String SQL = "SELECT * FROM HD_VIEW;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);

            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            err.println("Không thể tải danh sách hóa đơn! Nguyên nhân: " + ex);
        }
        return null;
    }

    /**
     * Hàm tải danh sách HoaDon từ cơ sở dữ liệu - Input: + CTHD_VIEW của cơ sở
     * dữ liệu QUAN_LY_SHOWROOM_XE_HOI + KetNoi: Connection - Output: + HD_VIEW
     *
     * @param KetNoi
     * @return
     */
    public ResultSet loadCTHD(Connection KetNoi) {
        // TODO implement here
        try {
            String SQL = "SELECT * FROM CTHD_VIEW;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);

            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            err.println("Không thể tải danh sách chi tiết hóa đơn! Nguyên nhân: " + ex);
        }
        return null;
    }

    /**
     * Hàm tìm xe trong cơ sở dữ liệu bằng mã số xe - Input: + KetNoi:
     * Connection + sMSXe: String + Bảng XE_VIEW của QUAN_LY_SHOWROOM_XE_HOI -
     * Output: + Xe có MSXE = sMSXe
     *
     * @param KetNoi
     * @param sMSXe
     * @return
     */
    public Xe timXe(Connection KetNoi, String sMSXe) {
        // TODO implement here
        try {
            String SQL = "SELECT * FROM XE_VIEW WHERE MSXE = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sMSXe);

            ResultSet rs = ps.executeQuery();

            Xe Model = new Xe();

            XeController XeC = new XeController(Model);

            while (rs.next()) {
                XeC.setMSXe(rs.getString("MSXE"));
                XeC.setHangXe(rs.getString("HANG"));
                XeC.setDongXe(rs.getString("DONG"));
                XeC.setGiaXe(Double.parseDouble(rs.getString("GIA")));
                XeC.setSLXe(Integer.parseInt(rs.getString("SOLUONG")));
            }

            return Model;

        } catch (SQLException ex) {
            err.println("Không thể tìm thấy xe! Nguyên nhân: " + ex);
        }
        return null;
    }

    /**
     * Hàm tìm xe trong cơ sở dữ liệu bằng mã số xe - Input: + KetNoi:
     * Connection + sMSNV: String + Bảng NV_VIEW của QUAN_LY_SHOWROOM_XE_HOI -
     * Output: + Xe có MSNV = sMSNV
     *
     * @param KetNoi
     * @param sMSNV
     * @return
     */
    public NhanVien timNV(Connection KetNoi, String sMSNV) {
        // TODO implement here
        try {
            String SQL = "SELECT * FROM NV_VIEW WHERE MSNV = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sMSNV);

            ResultSet rs = ps.executeQuery();

            NhanVien Model = new QuanLy();
            NhanVienController NVC = new NhanVienController(Model);

            while (rs.next()) {
                NVC.setMSNV(rs.getString("MSNV"));
                NVC.setHoTen(rs.getString("HOTEN"));
                NVC.setGioiTinh(rs.getString("GIOITINH"));
                NVC.setSDT(rs.getString("SDT"));
                NVC.setDiaChi(rs.getString("DIACHI"));
                NVC.setNGBD(rs.getString("NGBD"));
                NVC.setNGKT(rs.getString("NGKT"));
                NVC.setLuongCB(Double.parseDouble(rs.getString("LUONGCB")));
            }

            return Model;

        } catch (SQLException ex) {
            err.println("Không thể tìm thấy nhân viên! Nguyên nhân: " + ex);
        }
        return null;
    }

    /**
     * Hàm tìm xe trong cơ sở dữ liệu bằng mã số xe - Input: + KetNoi:
     * Connection + sMSKH: String + Bảng KH_VIEW của QUAN_LY_SHOWROOM_XE_HOI -
     * Output: + Xe có MSKH = sMSKH
     *
     * @param KetNoi
     * @param sMSKH
     * @return
     */
    public KhachHang timKH(Connection KetNoi, String sMSKH) {
        // TODO implement here
        try {
            String SQL = "SELECT * FROM KH_VIEW WHERE MSKH = ?;";

            PreparedStatement ps = KetNoi.prepareCall(SQL);
            ps.setString(1, sMSKH);

            ResultSet rs = ps.executeQuery();

            KhachHang Model = new KhachHang();
            KhachHangController KHC = new KhachHangController();
            
            String temp = null;

            while (rs.next()) {
                KHC.setMSKH(sMSKH);
                
                temp = rs.getString("HOTEN");
                KHC.setHoTen(temp);
                KHC.setGioiTinh(rs.getString("GIOITINH"));
                KHC.setSDT(rs.getString("SDT"));
                KHC.setDiaChi(rs.getString("DIACHI"));
                KHC.setNGDK(rs.getString("NGDK"));
                KHC.setDoanhThu(Double.parseDouble(rs.getString("DOANHTHU")));
            }

            return Model;

        } catch (SQLException ex) {
            err.println("Không thể tìm thấy khách hàng! Nguyên nhân: " + ex);
        }
        return null;
    }

}
