package welcome;

import java.sql.*;
import javax.swing.*;


public class MyData {
    public static void createPasswordTable(){
        try{
            getStatement().executeUpdate("CREATE TABLE IF NOT EXISTS medical_code_and_pass(name VARCHAR(100), code VARCHAR(100) PRIMARY KEY, password VARCHAR(100));");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Creating password table problem");
        }
    }
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
            String sql = "SELECT * FROM division";
            getStatement().executeQuery(sql);
            } catch(Exception e){
                String div[] = {"Barisal", "Chittagong", "Dhaka", "Khulna", "Mymensingh", "Rajshahi", "Rangpur", "Sylhet"}; //!Divisions list
                String sql = "CREATE TABLE IF NOT EXISTS division (name VARCHAR(45));";
                String sql2 =  "INSERT INTO division (name) VALUES('" + div[0] + "'), ('" + div[1] + "'), ('" + div[2] + "'), ('" + div[3] + "'), ('" + div[4] + "'),('" + div[5] + "'), ('" + div[6] + "'), ('" + div[7] + "');";
                try{
                    getStatement().executeUpdate(sql);
                    getStatement().executeUpdate(sql2);
                    sql = "SELECT * FROM division";
                    String barisal[] = {"Bagura", "Barisal", "Bhola", "Jhalokati", "Patuakhali", "Pirojpur"};
                    String chittagong[] = {"Bandarban", "Brahmanbaria", "Chandpur", "Chhittagong", "Comilla", "Coxs_Bazar", "Feni", "Khagrachhari", "Lakshmipur", "Noakhali", "Rangamati"};
                    String dhaka[] = {"Dhaka", "Faridpur", "Gazipur", "Gopalganj", "Kishoreganj", "Madaripur", "Manikganj", "Munshiganj", "Narayanganj", "Narsingdi", "Rajbari", "Shariatpur", "Tangail"};
                    String khulna[] = {"Bagerhat", "Chuadanga", "Jessore", "Jhenaidah", "Khulna", "Kushtia", "Magura", "Meherpur", "Narail", "Satkhira"};
                    String mymensingh[] = {"Jamalpur", "Mymensingh", "Netrokona", "Sherpur"};
                    String rajshahi[] = {"Bogra", "Joypurhat", "Naogaon", "Natore", "Chapainawabganj", "Pabna", "Rajshahi", "Sirajganj"};String rangpur[] = {"Dinajpur", "Gaibandha", "Kurigram", "Lalmonirhat", "Nilphamari", "Panchagarh", "Rangpur", "Thakurgaon"};
                    String sylhet[] = {"Habiganj", "Moulvibazar", "Sunamganj", "Sylhet"};
                    ResultSet res = getStatement().executeQuery(sql);
                    while(res.next()){
                        String division = res.getString("name");
                        sql = "CREATE TABLE IF NOT EXISTS " + division + "(districts VARCHAR(45));";
                        getStatement().executeUpdate(sql);
                        // String div[] = {"Barisal", "Chittagong", "Dhaka", "Khulna", "Mymensingh", "Rajshahi", "Rangpur", "Sylhet"}; //!Divisions list
                        sql = "INSERT INTO " + division + "(districts) VALUES ('";
                        if(division.equals("Barisal")){
                            sql += (barisal[0] + "')");
                            for(int i=1; i<barisal.length; i++){
                                sql += (",('" + barisal[i] + "')");
                            }
                            sql += (";");
                            getStatement().executeUpdate(sql);
                        }
                        else if(division.equals("Chittagong")){
                            sql += (chittagong[0] + "')");
                            for(int i=1; i<chittagong.length; i++){
                                sql += (",('" + chittagong[i] + "')");
                            }
                            sql += (";");
                            getStatement().executeUpdate(sql);
                        }
                        else if(division.equals("Dhaka")){
                            sql += (dhaka[0] + "')");
                            for(int i=1; i<dhaka.length; i++){
                                sql += (",('" + dhaka[i] + "')");
                            }
                            sql += (";");
                            getStatement().executeUpdate(sql);
                        }
                        else if(division.equals("Khulna")){
                            sql += (khulna[0] + "')");
                            for(int i=1; i<khulna.length; i++){
                                sql += (",('" + khulna[i] + "')");
                            }
                            sql += (";");
                            getStatement().executeUpdate(sql);
                        }
                        else if(division.equals("Mymensingh")){
                            sql += (mymensingh[0] + "')");
                            for(int i=1; i<mymensingh.length; i++){
                                sql += (",('" + mymensingh[i] + "')");
                            }
                            sql += (";");
                            getStatement().executeUpdate(sql);
                        }
                        else if(division.equals("Rajshahi")){
                            sql += (rajshahi[0] + "')");
                            for(int i=1; i<rajshahi.length; i++){
                                sql += (",('" + rajshahi[i] + "')");
                            }
                            sql += (";");
                            getStatement().executeUpdate(sql);
                        }
                        else if(division.equals("Rangpur")){
                            sql += (rangpur[0] + "')");
                            for(int i=1; i<rangpur.length; i++){
                                sql += (",('" + rangpur[i] + "')");
                            }
                            sql += (";");
                            getStatement().executeUpdate(sql);
                        }
                        else{
                            sql += (sylhet[0] + "')");
                            for(int i=1; i<sylhet.length; i++){
                                sql += (",('" + sylhet[i] + "')");
                            }
                            sql += (";");
                            getStatement().executeUpdate(sql);
                        }
                        sql = "";
                    }
                } catch(SQLException f){
                    JOptionPane.showMessageDialog(null, "Can't create division database " + f);
                }
        }
    }
    
    public static ResultSet getDivisionDistrict(String division){
        try{
            return getStatement().executeQuery("SELECT * FROM " + division);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Division not found");
        }
        return null;
    }
}
