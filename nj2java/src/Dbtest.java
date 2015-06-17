import java.sql.*;
import java.io.*;

public class Dbtest{
	

	private static PrintStream printWriter;

	public static void main(String args[]) throws Exception{
		Connection connection = null;
		Statement statement = null;
		
		try{
			Class.forName("org.sqlite.JDBC");
		}catch(ClassNotFoundException e){
			System.out.println("org.sqlite.JDBC룰 찾지 못했습니다.");
		}
		String adress="jdbc:sqlite:nj2db.db";
		connection = DriverManager.getConnection(adress);
		statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery("SELECT *"+"FROM member;");
	
		while(resultSet.next()){
			printWriter.printf("\"%s\", \"%d\"\n", new Object[]{resultSet.getString("stdid"), new Integer(resultSet.getInt("passwd"))});
		}
		resultSet.close();
		connection.close();
	}
}
