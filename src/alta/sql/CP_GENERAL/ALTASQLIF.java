/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alta.sql.CP_GENERAL;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LCE X - XX
 */
public class ALTASQLIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Connection cn = null;
        PreparedStatement pst = null;
        System.out.println("Tipo de operacion, 1 o 2");
         System.out.println("1-------------------Objeto encontrado");
         System.out.println("2-----------------------Reporte de perdida");
        Scanner sc = new Scanner(System.in);
        int Voption= sc.nextInt();
        if(Voption == 1){
                    System.out.println("Agrege el ID de su objeto");
                    int VopID= sc.nextInt();
                        sc.nextLine();
                    System.out.println("Agrege el nombre de su objeto");
                    String VopNM= sc.nextLine();
                    
                    System.out.println("Agrege una descripcion de su objeto");
                    String VopDC= sc.nextLine();
                    
                    System.out.println("Agrege una ubicacion aproximada de su objeto");
                    String VopUB= sc.nextLine();
                    
                    System.out.println("Agrege una estado actual de su objeto, ej: DAÑADO, INTACTO");
                    String VopST= sc.nextLine();
                    
                    //INICIO REPORTE CONEXION CON OP
                    
                     try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/cosasperdidas", "root", "");
            System.out.println("Conectado");

            String query = "INSERT INTO op (ID_OP, NAME_OP, DESC_OP, LUGAR_OP, EST_OP) VALUES (?, ?, ?, ?, ?)";
            pst = cn.prepareStatement(query);
            pst.setInt(1, VopID);
            pst.setString(2, VopNM);
            pst.setString(3, VopDC);
            pst.setString(4, VopUB);
            pst.setString(5, VopST);


           pst.executeUpdate();
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ALTASQL.class.getName()).log(Level.SEVERE, "Error al cargar el driver", ex);
        } catch (SQLException ex) {
            Logger.getLogger(ALTASQL.class.getName()).log(Level.SEVERE, "Error en la base de datos", ex);
        } finally {
            try {
                if (pst != null) pst.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                Logger.getLogger(ALTASQL.class.getName()).log(Level.SEVERE, "Error al cerrar recursos", e);
            }
        }
    } if(Voption==2){
                System.out.println("Agrege el ID de su reporte");
                    int VrpID= sc.nextInt();
                        sc.nextLine();
                System.out.println("Agrege su usuario");
                    String VrpUSER= sc.nextLine();
                System.out.println("Agrege su zona de trabajo");
                    String VrpZn= sc.nextLine();
                    
     //INICIO CONEXION
      try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/cosasperdidas", "root", "");
            System.out.println("Conectado");

            String query = "INSERT INTO rp (ID_RP,USER_RP,CNTC_RP) VALUES (?, ?, ?)";
            pst = cn.prepareStatement(query);
            pst.setInt(1, VrpID);
            pst.setString(2, VrpUSER);
            pst.setString(3, VrpZn);
            


           pst.executeUpdate();
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ALTASQL.class.getName()).log(Level.SEVERE, "Error al cargar el driver", ex);
        } catch (SQLException ex) {
            Logger.getLogger(ALTASQL.class.getName()).log(Level.SEVERE, "Error en la base de datos", ex);
        } finally {
            try {
                if (pst != null) pst.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                Logger.getLogger(ALTASQL.class.getName()).log(Level.SEVERE, "Error al cerrar recursos", e);
            }
                   
    }
  }
         
    }
}
    

