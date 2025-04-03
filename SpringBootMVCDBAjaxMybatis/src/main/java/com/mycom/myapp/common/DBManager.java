package com.mycom.myapp.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBManager {
	//Connection Pool (DataSource) 객체를 직접 획득 X <= SpringDI
//    public static Connection getConnection() {
//        Connection con = null;
//        try {
//        	Context context = new InitialContext();
//        	
//        	DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/madang");
//            con = ds.getConnection();
//        }catch(Exception e) {
//            e.printStackTrace();
//        }
//        
//        return con;     
//    }
    
    public static void releaseConnection(PreparedStatement pstmt, Connection con) {
        try {
            if( pstmt != null ) pstmt.close();
            if( con != null ) con.close();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void releaseConnection(ResultSet rs, PreparedStatement pstmt, Connection con) {
        try {
            if( rs != null ) rs.close();
            if( pstmt != null ) pstmt.close();
            if( con != null ) con.close();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
}