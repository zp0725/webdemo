package com.zp.utils;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBUtil {


//    private static Properties properties=new Properties();
//
//    //加载属性文件
//    static {
//        try {
//            properties.load(DBUtil.class.getClassLoader().getResourceAsStream("D:\\IDEA\\WebExercise\\src\\com\\zp\\utils\\db.properties"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    public static final String DRIVER_NAME = properties.getProperty("driver_name");
//    public static final String PROTOCAL = properties.getProperty("protocal");
//    public static final String HOST = properties.getProperty("host");
//    public static final String PORT = properties.getProperty("port");
//    public static final String DB_NAME = properties.getProperty("db_name");
//    public static final String USERNAME = properties.getProperty("username");
//    public static final String PWD = properties.getProperty("pwd");

    public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    public static final String PROTOCAL = "jdbc:mysql";
    public static final String HOST = "localhost";
    public static final String PORT = "3306";
    public static final String DB_NAME = "s_t";
    public static final String USERNAME = "root";
    public static final String PWD = "root";

    static {
        try {
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    //创建连接
    public static Connection getConnection(){
        Connection conn= null;
        try {
            conn = DriverManager.getConnection(PROTOCAL+"://"+HOST+":"+PORT+"/"+DB_NAME,USERNAME,PWD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //创建预编译
    public static PreparedStatement getPreparedStatement(Connection conn,String sql){
        PreparedStatement prep=null;
        try {
            prep=conn.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prep;
    }
    //获取结果集
    public static ResultSet getResultSet(PreparedStatement prep){
        ResultSet rs=null;
        try {
            rs=prep.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    //关闭资源的方法
    public static void close(ResultSet rs,PreparedStatement prep,Connection conn){
        try {
            if(rs!=null)rs.close();
            prep.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void close(PreparedStatement prep,Connection conn){
        try {
            prep.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //增
    public static void executeUpdate(String sql,Object... objs){
        Connection conn=null;
        PreparedStatement prep=null;

        try {
            conn= DBUtil.getConnection();
            prep=DBUtil.getPreparedStatement(conn,sql);
            if(objs!=null){
                for(int i=0;i<objs.length;i++){
                    prep.setObject(i+1,objs[i]);

                }
            }
            prep.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(prep,conn);
        }
    }
    //查
    public static <T> List<T> query(String sql, RowMap<T> rowMap, Object... objs){
        Connection conn=null;
        PreparedStatement prep=null;
        ArrayList<T> lists=new ArrayList<>();
        ResultSet rs=null;
        try {
            conn= DBUtil.getConnection();
            prep=DBUtil.getPreparedStatement(conn,sql);
            if(objs!=null){
                for(int i=0;i<objs.length;i++){
                    prep.setObject(i+1,objs[i]);

                }
            }
            rs=prep.executeQuery();
            while (rs.next()){
                T  t=rowMap.RowMapping(rs);
                lists.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(prep,conn);
        }
//        for(int i=0;i<lists.size();i++){
//            System.out.println(lists.get(i));
//        }
        return lists;
    }

    public static <T> T queryOne(String sql, RowMap<T> rowMap, Object... objs){
        Connection conn=null;
        PreparedStatement prep=null;
        T t=null;
        ResultSet rs=null;
        try {
            conn= DBUtil.getConnection();
            prep=DBUtil.getPreparedStatement(conn,sql);
            if(objs!=null){
                for(int i=0;i<objs.length;i++){
                    prep.setObject(i+1,objs[i]);

                }
            }
            rs=prep.executeQuery();
            while (rs.next()){
                t=rowMap.RowMapping(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(prep,conn);
        }
//        for(int i=0;i<lists.size();i++){
//            System.out.println(lists.get(i));
//        }
        return t;
    }

}
