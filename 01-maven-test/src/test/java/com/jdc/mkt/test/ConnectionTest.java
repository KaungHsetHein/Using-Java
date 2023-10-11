package com.jdc.mkt.test;
import static com.jdc.mkt.dto.MysqlConnection.connection;
import org.junit.jupiter.api.Test;
public class ConnectionTest {
	@Test
	void insert() {
		String sql = "insert into tbl1 values(?)";
		try(var con = connection();
				var stmt = con.prepareStatement(sql)){
			stmt.setString(1, "yy");
			stmt.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
