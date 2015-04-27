/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.crud.dto;

/**
 *
 * @author ZedGe
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase{

    public static Connection con = null;

    public static Connection getConnection(){
        // Definimos el driver y la url
	String sDriver = "com.mysql.jdbc.Driver";
	String sURL = "jdbc:mysql://localhost:3306/student";
        // Cargamos el driver y realizamos la conexión
        try{
           Class.forName(sDriver).newInstance();    
           con = DriverManager.getConnection(sURL,"root","");
           return con;
        }catch (SQLException sqle){
           System.out.println("SQLState: " 
                   + sqle.getSQLState());
           System.out.println("SQLErrorCode: " 
                   + sqle.getErrorCode());
           System.out.println("SQLException: " + sqle.getMessage());
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException e){
            System.out.println(e.toString());
        }		
    return null;
    }
}
 