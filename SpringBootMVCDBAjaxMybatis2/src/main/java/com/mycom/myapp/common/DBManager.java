package com.mycom.myapp.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

// ResultSet, PreparedStatement, Connection 객체 종료 close()

public class DBManager {

	// Connection pool (ds) 객체를 직접획득하지 X. <= spring di
	// dao에서 con을 쓰는데, DI를 통해 con 얻어옴.
//    public static Connection getConnection() {
//        Connection con = null;
//        try {
//            Context context = new InitialContext();
//            DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/madang"); // Connection pool
//        	con = ds.getConnection();
//            
//        }catch(Exception e) {
//            e.printStackTrace();
//        }
//        
//        return con;     
//    }
    
    // Connection pool로부터 얻는 Connection 객체의 close() 메소드는 overriding 되어있다.
    // Connection을 끊지 않고 Connection Pool에 반납되도록.
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