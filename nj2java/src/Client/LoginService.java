package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
import assets.DBConnectionMgr;
 
public class LoginService {
	public static void main(String[] args) 
	{
		boolean test = loginTest("test", "1234");
		System.out.println("�α��� ��� :" + test);
    }
	
	public static boolean loginTest(String id, String password) {
		boolean flag = false;
		
		DBConnectionMgr pool = DBConnectionMgr.getInstance();
 
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = null;
        String getPass = null;

        try {
            con = pool.getConnection();
 
            sql = "select password from member_test where id=?";
 
            pstmt = con.prepareStatement(sql);
 
            pstmt.setString(1, id);
 
            rs = pstmt.executeQuery();
 
            if (rs.next()){
            	
            	getPass = rs.getString("password");
 
                if (getPass.equals(password)){
                    System.out.println("�޾ƿ� ��й�ȣ : " + getPass);
                    flag = true;
                }
            }
 
        } catch (Exception e) {
        	e.printStackTrace();
        
        } finally {
        	pool.freeConnection(con, pstmt, rs);
        
        }
        
        return flag;
    }
}

//������ �� �ٵ� �� ������ DB�� �ڷᰡ ���� �����̴�.