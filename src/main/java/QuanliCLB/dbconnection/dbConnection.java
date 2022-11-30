package QuanliCLB.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
	private static String url = "jbdc:mysql://sql6.freesqldatabase.com:3306/sql6580911";       
    private static String username = "sql6580911";   
    private static String password = "1pxhNkIdab";
    private static Connection connection = null;
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        if(connection == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection(url,username,password);
            System.out.print("connected");
        }
        return connection;
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	System.out.println(getConnection());
}
}
