package com.zp.utils;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WorkDao {
//    //增
//    public static void executuUpdate(String sql,Object... objs){
//        Connection conn=null;
//        PreparedStatement prep=null;
//
//        try {
//            conn= DBUtil.getConnection();
//            prep=DBUtil.getPreparedStatement(conn,sql);
//            if(objs!=null){
//                for(int i=0;i<objs.length;i++){
//                    prep.setObject(i+1,objs[i]);
//
//                }
//            }
//            prep.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            DBUtil.close(prep,conn);
//        }
//    }
//    //查
//    public static <T> List<T> query(String sql, RowMap<T> rowMap, Object... objs){
//        Connection conn=null;
//        PreparedStatement prep=null;
//        ArrayList<T> lists=new ArrayList<>();
//        ResultSet rs=null;
//        try {
//            conn= DBUtil.getConnection();
//            prep=DBUtil.getPreparedStatement(conn,sql);
//            if(objs!=null){
//                for(int i=0;i<objs.length;i++){
//                    prep.setObject(i+1,objs[i]);
//
//                }
//            }
//            rs=prep.executeQuery();
//            while (rs.next()){
//                T  t=rowMap.RowMapping(rs);
//                lists.add(t);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            DBUtil.close(prep,conn);
//        }
////        for(int i=0;i<lists.size();i++){
////            System.out.println(lists.get(i));
////        }
//        return lists;
//    }
}
