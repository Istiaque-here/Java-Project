package welcome;

import java.sql.*;
import javax.swing.*;

public class MyData {
    private static Statement getStatement(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/medical_database","root","").createStatement();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Create Statement ERROR!", "Statement Loader", JOptionPane.WARNING_MESSAGE);
            return null;
        }
    }
    private static String genMedicalCode(String medicalName){
        int temp = 0;
        for(int i=0; i<medicalName.length(); i++){
            temp += Integer.valueOf(medicalName.charAt(i));
        }
        return String.valueOf(temp);
    }
    public static void insert(String medicalName, String password){
        try{
            String sql = "INSERT INTO medical_code_and_pass(name, code, password) VALUES('" + medicalName + "', '" + genMedicalCode(medicalName) + "', '" + password + "');";
            getStatement().executeUpdate(sql);
        }
        catch(Exception e){
            // JOptionPane.showMessageDialog(null, e, "Medical Name", JOptionPane.WARNING_MESSAGE); warnning
            JOptionPane.showMessageDialog(null, "College Aleady Registered", "Medical Name", JOptionPane.WARNING_MESSAGE);
        }
    }
    public static void updateDivision(){
        try{
            String div[] = {"Barisal", "Chittagong", "Dhaka", "Khulna", "Mymensingh", "Rajshahi", "Rangpur", "Sylhet"}; //!Divisions list
            String sql = "CREATE TABLE IF NOT EXISTS division (name VARCHAR(45));";
            String sql2 = "SELECT * FROM division";
            getStatement().executeUpdate(sql);
            if(getStatement().executeQuery(sql2).next() == false){
                sql = "INSERT INTO division (name) VALUES('"  + div[0] + "', '" + div[1] + "', '" + div[2] + "', '" + div[3] + "', '" + div[4] + "', '" + div[5] + "', '" + div[6] + "', '" + div[7] + "');"; 
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Can't update Division list");
        }
    }

}
