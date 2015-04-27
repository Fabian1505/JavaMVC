package com.basic.crud.dao;

import com.basic.crud.dto.DataBase;
import com.basic.crud.dto.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ZedGe
 */
public class StudentDao{

    private PreparedStatement state;
    private ResultSet res;

    public void insert(Student student) {
        try {
            String sql=" INSERT INTO student (name, rut, age) values " +
                    "('"+student.getName()+"','"+student.getRut()+"','"+Integer.toString(student.getAge())+"')";
            Connection con = DataBase.getConnection();
            PreparedStatement stmt;
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
                    
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Student> select() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            Connection con = DataBase.getConnection();
          
            String sql="Select * from student";
            state = con.prepareStatement(sql);
            res = state.executeQuery(sql);
            while (res.next()) {
                Student student = new Student();
                student.setName(res.getString("name"));
                student.setRut(res.getString("rut"));
                student.setAge(res.getInt("age"));
                
                students.add(student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);  
        } 
        return students;
    }

    public Student search(String var) {
        Student student = new Student();
        try {
            Connection con = DataBase.getConnection();
          
            String sql="Select * from student where rut = '"+var+"'";
            state = con.prepareStatement(sql);
            res = state.executeQuery(sql);
            while (res.next()) { 
                student.setName(res.getString("name"));
                student.setRut(res.getString("rut"));
                student.setAge(res.getInt("age"));
              }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);  
        } 
        return student;
    }

    public void update(Student student, String rutOld) {
        try {
            Connection con = DataBase.getConnection();
          
            String sql="UPDATE student SET name = '"+student.getName()+"', rut='"+student.getRut()+"', age = '"+Integer.toString(student.getAge())+"'"+
                        "WHERE rut ='"+rutOld+"'";
            state = con.prepareStatement(sql);
            state.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);  
        } 
    }

    public void delete(String var) {
        try {
            Connection con = DataBase.getConnection();
            System.out.println(var);
            String sql="DELETE FROM student WHERE rut ='"+var+"'";
            state = con.prepareStatement(sql);
            state.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);  
        } 
    }
    
}
