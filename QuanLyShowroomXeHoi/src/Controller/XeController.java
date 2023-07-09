/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;

import Model.Xe;

/**
 *
 * @author Shifu
 */
public class XeController {
    private Xe Model;
    
    public XeController() {
        this.Model = new Xe();
    }
    
    public XeController(Xe Model) {
        this.Model = Model;
    }
    
    public String getMSXe() {
        return this.Model.getMSXe();
    }
    
    public void setMSXe(String sMaSo) {
        this.Model.setMSXe(sMaSo);
    }
    
    public String getHangXe() {
        return this.Model.getHangXe();
    }
    
    public void setHangXe(String sTenHang) {
        this.Model.setHangXe(sTenHang);
    }
    
    public String getDongXe() {
        return this.Model.getDongXe();
    }
    
    public void setDongXe(String sTenDong) {
        this.Model.setDongXe(sTenDong);
    }
    
    public double getGiaXe() {
        return this.Model.getGiaXe();
    }
    
    public void setGiaXe(double dGiaTien) {
        this.Model.setGiaXe(dGiaTien);
    }
    
    public int getSLXe() {
        return this.Model.getSoLuong();
    }
    
    public void setSLXe(int iSoLuong) {
        this.Model.setSoLuong(iSoLuong);
    }
    
    public void insertXe(Connection KetNoi, Xe DoiTuong) {
        this.Model.insertXe(KetNoi, DoiTuong);
    }
    
    public void deleteXe(Connection KetNoi, String sMaSo) {
        this.Model.deleteXe(KetNoi, sMaSo);
    }
    
    public void updateHangXe(Connection KetNoi, String sMSXe, String sTenHang) {
        this.Model.updateHangXe(KetNoi, sMSXe, sTenHang);
    }
    
    public void updateDongXe(Connection KetNoi, String sMSXe, String sTenDong) {
        this.Model.updateDongXe(KetNoi, sMSXe, sTenDong);
    }
    
    public void updateGiaXe(Connection KetNoi, String sMSXe, double dGiaTien) {
        this.Model.updateGiaXe(KetNoi, sMSXe, dGiaTien);
    }
    
    public void updateSLXe(Connection KetNoi, String sMSXe, int iSoLuong) {
        this.Model.updateSoLuong(KetNoi, sMSXe, iSoLuong);
    }
}
