package org.zerock.test;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.log4j.Log4j;

@Log4j
public class JdbcTests {

	@Test
	public void testConnection() throws Exception {

		Class clz = Class.forName("oracle.jdbc.driver.OracleDriver");

		long start = System.currentTimeMillis();

//		for (int i = 0; i < 10; i++) {
//
//			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@220.76.95.42:3980:wisedb", "wise_user", "1234");
//			log.info(con);
//
//			con.close();
//		}
		log.info("--------------------------------------");
		try {
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@220.76.95.42:3980:wisedb", "wise_user", "1234");
			log.info(con);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		long end = System.currentTimeMillis();
		log.info("DB 연결 성공");
		log.info("--------------------------------------");
		log.info(end - start);
	}

}
