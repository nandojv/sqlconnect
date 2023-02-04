package sql;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import java.util.logging.Level;

import java.util.logging.Logger;

public class mysql {

   

    public static void main(String[] args) {

    	try{  

    		Class.forName("com.mysql.cj.jdbc.Driver");  

    		Connection con=DriverManager.getConnection(  

    		"jdbc:mysql://ipserver","root","pswrd");  

    		//here sonoo is database name, root is username and password  

    		Statement stmt=con.createStatement();  

    		ResultSet rs=stmt.executeQuery("select * from java"); 

    		System.out.println("connsessione riuscita!");

    		while(rs.next())  

    		System.out.println(rs.getInt(1)+"  "+rs.getString(2));  

    		con.close();  

    		}catch(Exception e){ System.out.println(e);}  

    		}  

    	

    }