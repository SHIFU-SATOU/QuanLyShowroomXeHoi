/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.HoaDon;
import Model.Xe;
import java.util.ArrayList;
import java.sql.Connection;

/**
 *
 * @author Shifu
 */
public class HoaDonController {
    
    private HoaDon Model;
    
    public HoaDonController() {
        this.Model = new HoaDon();
    }
    
    public HoaDonController(HoaDon Model) {
        this.Model = Model;
    }
    
    public String getMSHD() {
        return this.Model.getMSHD();
    }
    
    public void setMSHD(String sMaSo) {
        this.Model.setMSHD(sMaSo);
    }
    
    public String getNGHD() {
        return this.Model.getNgHD();
    }
    
    public void setNGHD(String sThoiGian) {
        this.Model.setNgHD(sThoiGian);
    }
    
    public String getMSNV() {
        return this.Model.getMSNV();
    }
    
    public void setMSNV(String sMaSo) {
        this.Model.setMSNV(sMaSo);
    }
    
    public String getMSKH() {
        return this.Model.getMSKH();
    }
    
    public void setMSKH(String sMaSo) {
        this.Model.setMSKH(sMaSo);
    }
    
    public ArrayList<Xe> getDSXe() {
        return this.Model.getDSXe();
    }
    
    public Xe getXe(String sMSXe) {
        return this.Model.getXe(sMSXe);
    }
    
    public void themXe(Xe DoiTuong) {
        this.Model.themXe(DoiTuong);
    }
    
    public void xoaXe(String sMSXe) {
        this.Model.xoaXe(sMSXe);
    }
    
    public double getThanhTien() {
        return this.Model.getThanhTien();
    }
    
    public void setThanhTien(double dTien) {
        this.Model.setThanhTien(dTien);
    }
    
    public String taoMSHD(Connection KetNoi) {
        return this.Model.taoMSHD(KetNoi);
    }
    
    public void insertHD(Connection KetNoi, HoaDon DoiTuong) {
        this.Model.insertHD(KetNoi, DoiTuong);
    }
    
    public void deleteHD(Connection KetNoi, String sMSHD) {
        this.Model.deleteHD(KetNoi, sMSHD);
    }
    
    public void updateNGHD(Connection KetNoi, String sMSHD, String sThoiGian) {
        this.Model.updateNgHD(KetNoi, sMSHD, sThoiGian);
    }
    
    public void updateMSNV(Connection KetNoi, String sMSHD, String sMSNV) {
        this.Model.updateMSNV(KetNoi, sMSHD, sMSNV);
    }
    
    public void updateMSKH(Connection KetNoi, String sMSHD, String sMSKH) {
        this.Model.updateMSKH(KetNoi, sMSHD, sMSKH);
    }
    
    public void updateMSXE(Connection KetNoi, String sMSHD, String sMSXeCu, String sMSXeMoi) {
        this.Model.updateMSXE(KetNoi, sMSHD, sMSXeCu, sMSXeMoi);
    }
    
    public void updateSLXe(Connection KetNoi, String sMSHD, String sMSXe, int iSoLuong) {
        this.Model.updateSLXe(KetNoi, sMSHD, sMSXe, iSoLuong);
    }
    
    public void tinhTriGiaHD() {
        this.Model.tinhTriGiaHD();
    }
    
}
