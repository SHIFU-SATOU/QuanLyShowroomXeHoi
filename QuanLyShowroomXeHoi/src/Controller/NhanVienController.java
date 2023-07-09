/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import Model.NhanVien;
import Model.QuanLy;

/**
 *
 * @author Shifu
 */
public class NhanVienController {
    private NhanVien Model;
    
    public NhanVienController() {
        this.Model = new QuanLy();
    }
    
    public NhanVienController(NhanVien Model) {
        this.Model = Model;
    }
    
    public String getMSNV() {
        return this.Model.getMSNV();
    }
    
    public void setMSNV(String sMaSo) {
        this.Model.setMSNV(sMaSo);
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
    
    public String getNGBD() {
        return this.Model.getNgBD();
    }
    
    public void setNGBD(String sThoiGian) {
        this.Model.setNgBD(sThoiGian);
    }
    
    public String getNGKT() {
        return this.Model.getNgKT();
    }
    
    public void setNGKT(String sThoiGian) {
        this.Model.setNgKT(sThoiGian);
    }
    
    public String getChucVu() {
        return this.Model.getChucVu();
    }
    
    public void setChucVu(String sTenCV) {
        this.Model.setChucVu(sTenCV);
    }
    
    public double getLuongCB() {
        return this.Model.getLuongCB();
    }
    
    public void setLuongCB(double dGiaTien) {
        this.Model.setLuongCB(dGiaTien);
    }
    
    public String taoMSNV(Connection KetNoi) {
        return this.Model.taoMSNV(KetNoi);
    }
    
    public void insertNV(Connection KetNoi, NhanVien DoiTuong) {
        this.Model.insertNV(KetNoi, Model);
    }
    
    public void deleteNV(Connection KetNoi, String sMSNV) {
        this.Model.deleteNV(KetNoi, sMSNV);
    }
    
    public void updateHoTen(Connection KetNoi, String sMSNV, String sHoTen) {
        this.Model.updateHoTen(KetNoi, sMSNV, sHoTen);
    }
    
    public void updateGioiTinh(Connection KetNoi, String sMSNV, String sGioiTinh) {
        this.Model.updateGioiTinh(KetNoi, sMSNV, sGioiTinh);
    }
    
    public void updateNGBD(Connection KetNoi, String sMSNV, String sThoiGian) {
        this.Model.updateNgBD(KetNoi, sMSNV, sThoiGian);
    }
    
    public void updateNGKT(Connection KetNoi, String sMSNV, String sThoiGian) {
        this.Model.updateNgKT(KetNoi, sMSNV, sThoiGian);
    }
    
    public void updateSDT(Connection KetNoi, String sMSNV, String sSDT) {
        this.Model.updateSDT(KetNoi, sMSNV, sSDT);
    }
    
    public void updateDiaChi(Connection KetNoi, String sMSNV, String sDiaChi) {
        this.Model.updateDiaChi(KetNoi, sMSNV, sDiaChi);
    }
    
    public void updateChucVu(Connection KetNoi, String sMSNV, String sTenCV) {
        this.Model.updateChucVu(KetNoi, sMSNV, sTenCV);
    }
    
    public void updateLuongCB(Connection KetNoi, String sMSNV, double dTien) {
        this.Model.updateLuongCB(KetNoi, sMSNV, dTien);
    }
}
