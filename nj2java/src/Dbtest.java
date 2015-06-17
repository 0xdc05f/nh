import java.sql.*;
import java.io.*;

public class Dbtest{
	

	public static void main(String args[]) throws Exception{
		Connection connection = null;
		Statement statement = null;
		
		try{
			Class.forName("org.sqlite.JDBC");
		}catch(ClassNotFoundException e){
			System.out.println("org.sqlite.JDBC룰 찾지 못했습니다.");
		}
		
		connection = DriverManager.getConnection("/bin/nj2.db");
		statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery("SELECT *"+"FROM member");
	
		while(resultSet.next()){
			//printWriter.printf("\"%s\", \"%s\", \"%s\". \"%d\", \"%d\", \"%d\"\n", new Object[]{resultSet.getString("field1"), new Integer(resultSet.getInt("field2"))});
		}
		resultSet.close();
		connection.close();
	}
}
