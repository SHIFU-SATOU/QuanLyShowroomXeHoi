/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import java.io.PrintStream;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Model.QuanLy;
import Model.NhanVien;
import Controller.NhanVienController;
import Controller.KhachHangController;
import Controller.HoaDonController;
import View.MainView;

/**
 *
 * @author Shifu
 */
public class Test {

//    /**
//     * @param args the command line arguments
//     */
//    
//    private static PrintStream out = new PrintStream(System.out, true, UTF_8);
//    private static PrintStream err = new PrintStream(System.err, true, UTF_8);
//    
//    private static Connection taoKetNoi() {
//        try {
//            String URI = "jdbc:sqlserver://localhost:1433;"
//                    + "databaseName=QUAN_LY_SHOWROOM_XE_HOI;user=sa;password=11021873;"
//                    + "encrypt=false;";
//            Connection conn = DriverManager.getConnection(URI);
//            if (conn != null) {
//                out.println("Kết nối cơ sở dữ liệu thành công!");
//                return conn;
//            }
//        } catch(SQLException ex) {
//            err.println("Kết nối cơ sở dữ liệu thất bại! Chi tiết: " + ex);
//        }
//        return null;
//    }
//    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainView(taoKetNoi()).setVisible(true);
//                
//            }
//        });
//    }
//    
}
