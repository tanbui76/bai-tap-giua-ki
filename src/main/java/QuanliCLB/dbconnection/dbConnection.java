package QuanliCLB.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
	private static String url = "jdbc:sqlserver://nhattan.database.windows.net:1433;"
			+ "database=QuanLiCLB;"
			+ "user=quanliclb@nhattan;"
			+ "password={Nhattan12122002};"
			+ "encrypt=true;"
			+ "trustServerCertificate=false;"
			+ "hostNameInCertificate=*.database.windows.net;"
			+ "loginTimeout=30;";
	private static Connection connection = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if (connection == null) {
			connection=DriverManager.getConnection(url);
			System.out.print("connected");
		}
		return connection;
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println(getConnection());
	}
	
}
