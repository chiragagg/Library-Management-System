/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niraj
 */

import java.sql.*;
import javax.swing.JOptionPane;
        public class javaconnet {
    Connection conn;
    public static Connection ConnecrDb()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Niraj\\Documents\\NetBeansProjects\\Library management system\\LibraryNew.sqlite");;;
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
 
        }
    }
}
