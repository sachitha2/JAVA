package com.Uni;

import javax.swing.*;
import java.sql.*;

public class DB {

    public void getCourses(){
        DB obj_DB_Connection=new DB();
        Connection connection=null;
        connection=obj_DB_Connection.get_connection();
        PreparedStatement ps=null;
        String query="SELECT * FROM courses;";
        try {
            ps=connection.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("id")+" - "+rs.getString("course_code"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    //check user name and password
    public int checkLogin(signUpObj o){
        int numRow = 0;
        DB obj_DB_Connection=new DB();
        Connection connection=null;
        connection=obj_DB_Connection.get_connection();
        PreparedStatement ps=null;
        String query="SELECT COUNT(*) FROM user WHERE username LIKE '"+o.getUsername()+"' AND password LIKE '"+o.getPassword()+"';";
        try {
            ps=connection.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
                rs.next();

//                System.out.println(rs.getString("COUNT(*)")+" - ");

                numRow = rs.getInt("COUNT(*)");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  numRow;
    }


    //check user already available

    public int signUp(signUpObj o){
        int state = checkLogin(o);


        if(state == 0){
            //register user
            DB obj_DB_Connection=new DB();
            Connection connection=null;
            connection=obj_DB_Connection.get_connection();
            PreparedStatement ps=null;
            String query="INSERT INTO user (id, username, password, type) VALUES (NULL, '"+o.getUsername()+"', '"+o.getPassword()+"', '0');";
            try {
                ps=connection.prepareStatement(query);
                ps.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            Home home = new Home();
            //register user end



            return state;
        }else{
            //set msg
            JOptionPane.showMessageDialog(null, "This user already availabale, Please login");
            return state;
        }

    }

//    public int addStudent(Std std){
//        DB obj_DB_Connection=new DB();
//        Connection connection=null;
//        connection=obj_DB_Connection.get_connection();
//        PreparedStatement ps=null;
//        String query="INSERT INTO student (id, name, username, password, age) VALUES (NULL, '"+std.getName()+"', '"+std.getUsername()+"', '"+std.getUsername()+"', '"+std.getAge()+"');";
//        try {
//            ps=connection.prepareStatement(query);
//            ps.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//
//        return 1;
//    }

//    public int addLecture(Lecturer lecturer){
//        DB obj_DB_Connection=new DB();
//        Connection connection=null;
//        connection=obj_DB_Connection.get_connection();
//        PreparedStatement ps=null;
//        String query="INSERT INTO lecturer (id, name, username, password) VALUES (NULL, '"+lecturer.getName()+"', '"+lecturer.getUsername()+"', '"+lecturer.getPassword()+"');";
//        try {
//            ps=connection.prepareStatement(query);
//            ps.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//
//        return 1;
//    }


    public Connection get_connection(){
        Connection connection=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ums","root","");
        }catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }
}
