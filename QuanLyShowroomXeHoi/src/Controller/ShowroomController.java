/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;

import Model.Showroom;
import Model.Xe;
import Model.NhanVien;
import Model.KhachHang;
import Model.HoaDon;

/**
 *
 * @author Shifu
 */
public class ShowroomController {
    
    private Showroom Model;
    
    public ShowroomController() {
        this.Model = new Showroom();
    }
    
    public ShowroomController(Showroom Model) {
        this.Model = Model;
    }
    
    public String getMaSo() {
        return this.Model.getMaSo();
    }
    
    public void setMaSo(String sMaSo) {
        this.Model.setMaSo(sMaSo);
    }
    
    public String getTen() {
        return this.Model.getTen();
    }
    
    public void setTen(String sTen) {
        this.Model.setTen(sTen);
    }
    
    public ArrayList<Xe> getDSXe() {
        return this.Model.getDSXe();
    }
    
    public void themXe(Xe DoiTuong) {
        this.Model.themXe(DoiTuong);
    }
    
    public void xoaXe(String sMSXe) {
        this.Model.xoaXe(sMSXe);
    }
    
    public ArrayList<NhanVien> getDSNV() {
        return this.Model.getDSNV();
    }
    
    public void themNV(NhanVien DoiTuong) {
        this.Model.themNV(DoiTuong);
    }
    
    public void xoaNV(String sMSNV) {
        this.Model.xoaNV(sMSNV);
    }
    
    public ArrayList<KhachHang> getDSKH() {
        return this.Model.getDSKH();
    }
    
    public void themKH(KhachHang DoiTuong) {
        this.Model.themKH(DoiTuong);
    }
    
    public void xoaKH(String sMSKH) {
        this.Model.xoaKH(sMSKH);
    }
    
    public ArrayList<HoaDon> getDSHD() {
        return this.Model.getDSHD();
    }
    
    public void themHD(HoaDon DoiTuong) {
        this.Model.themHD(DoiTuong);
    }
    
    public void xoaHD(String sMSHD) {
        this.Model.xoaHD(sMSHD);
    }
    
    public ResultSet loadXe(Connection KetNoi) {
        return this.Model.loadXe(KetNoi);
    }
    
    public ResultSet loadNV(Connection KetNoi) {
        return this.Model.loadNV(KetNoi);
    }
    
    public ResultSet loadNVBH(Connection KetNoi) {
        return this.Model.loadNVBH(KetNoi);
    }
    
    public ResultSet loadKH(Connection KetNoi) {
        return this.Model.loadKH(KetNoi);
    }
    
    public ResultSet loadHD(Connection KetNoi) {
        return this.Model.loadHD(KetNoi);
    }
    
    public ResultSet loadCTHD(Connection KetNoi) {
        return this.Model.loadCTHD(KetNoi);
    }
    
    public Xe timXe(Connection KetNoi, String sMSXe) {
        return this.Model.timXe(KetNoi, sMSXe);
    }
    
    public NhanVien timNV(Connection KetNoi, String sMaSo) {
        return this.Model.timNV(KetNoi, sMaSo);
    }
    
    public KhachHang timKH(Connection KetNoi, String sMaSo) {
        return this.Model.timKH(KetNoi, sMaSo);
    }
}
