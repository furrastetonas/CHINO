/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alta.sql.CP_GENERAL;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LCE X - XX
 */
public class ALTASQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Teclea tu número de ID:");
        int Vnumero = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Teclea tu nombre:");
        String VNombre = sc.nextLine();

        System.out.println("Teclea tu color favorito:");
        String VColor = sc.nextLine();

        Connection cn = null;
        PreparedStatement pst = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/holamundo", "root", "");
            System.out.println("Conectado");

            String query = "INSERT INTO username (PersonID, Nombre, Co_fav) VALUES (?, ?, ?)";
            pst = cn.prepareStatement(query);
            pst.setInt(1, Vnumero);
            pst.setString(2, VNombre);
            pst.setString(3, VColor);


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
    

