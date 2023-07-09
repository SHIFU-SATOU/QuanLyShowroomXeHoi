/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.KhachHang;
import java.sql.Connection;

/**
 *
 * @author Shifu
 */
public class KhachHangController {
    
    private KhachHang Model;
    
    public KhachHangController() {
        this.Model = new KhachHang();
    }
    
    public KhachHangController(KhachHang Model) {
        this.Model = Model;
    }
    
    public String getMSKH() {
        return this.Model.getMSKH();
    }
    
    public void setMSKH(String sMaSo) {
        this.Model.setMSKH(sMaSo);
    }
    
    public String getHoTen() {
        return this.Model.getHoTen();
    }
    
    public void setHoTen(String sHoTen) {
        this.Model.setHoTen(sHoTen);
    }
    
    public String getGioiTinh() {
        return this.Model.getGioiTinh();
    }
    
    public void setGioiTinh(String sGioiTinh) {
        this.Model.setGioiTinh(sGioiTinh);
    }
    
    public String getSDT() {
        return this.Model.getSDT();
    }
    
    public void setSDT(String sSDT) {
        this.Model.setSDT(sSDT);
    }
    
    public String getDiaChi() {
        return this.Model.getDiaChi();
    }
    
    public void setDiaChi(String sDiaChi) {
        this.Model.setDiaChi(sDiaChi);
    }
    
    public String getNGDK() {
        return this.Model.getNgDK();
    }
    
    public void setNGDK(String sThoiGian) {
        this.Model.setNgDK(sThoiGian);
    }
    
    public double getDoanhThu() {
        return this.Model.getDoanhThu();
    }
    
    public void setDoanhThu(double dTien) {
        this.Model.setDoanhThu(dTien);
    }
    
    public String taoMSKH(Connection KetNoi) {
        return this.Model.taoMSKH(KetNoi);
    } 
    
    public void insertKH(Connection KetNoi, KhachHang DoiTuong) {
        this.Model.insertKH(KetNoi, DoiTuong);
    }
    
    public void deleteKH(Connection KetNoi, String sMSKH) {
        this.Model.deleteKH(KetNoi, sMSKH);
    }
    
    public void updateHoTen(Connection KetNoi, String sMSKH, String sHoTen) {
        this.Model.updateHoTen(KetNoi, sMSKH, sHoTen);
    }
    
    public void updateGioiTinh(Connection KetNoi, String sMSKH, String sGioiTinh) {
        this.Model.updateGioiTinh(KetNoi, sMSKH, sGioiTinh);
    }
    
    public void updateSDT(Connection KetNoi, String sMSKH, String sSDT) {
        this.Model.updateSDT(KetNoi, sMSKH, sSDT);
    }
    
    public void updateDiaChi(Connection KetNoi, String sMSKH, String sDiaChi) {
        this.Model.updateDiaChi(KetNoi, sMSKH, sDiaChi);
    }
    
    public void updateNGDK(Connection KetNoi, String sMSKH, String sThoiGian) {
        this.Model.updateNgDK(KetNoi, sMSKH, sThoiGian);
    }
}
