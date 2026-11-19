package com.data;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author fatim
 */
public class Conexion {
    
     
private static final String URL ="jdbc:mysql://localhost:3306/appempresa";
private static final String USER = "root";
private static final String PASSWORD = "0";

Connection conn = null;

public Connection conectar(){
    try{
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
        System.out.println("conexion establecida");
        
        
    }catch(SQLException exc){
        System.out.println("Exception:"+ exc);
    }
     return conn;
}  
}
