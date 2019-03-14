package my.sqltest;

import java.sql.*;


public class test {
    public static void main(String[] args) {
        String url="jdbc:mysql://smip.mysql.tools:3306/smip_romatest";
        String username="smip_romatest";
        String password="ds%E0p75)M";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection= DriverManager.getConnection(url, username, password);
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("CREATE TABLE testtable (id int, name varchar(10), sername varchar(20))");
            while (resultSet.next()){
                System.out.println(resultSet.getString(2));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}