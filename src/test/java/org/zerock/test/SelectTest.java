package org.zerock.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.zerock.domain.GoogleVO;
import org.zerock.mapper.GoogleMapper;

@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class SelectTest {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private SqlSessionFactory sqlSessionFactory;

	
	 @Before public void setUp() throws IOException { String resource =
	 "mybatis-config.xml"; InputStream inputStream =
	 Resources.getResourceAsStream(resource); sqlSessionFactory = new
	 SqlSessionFactoryBuilder().build(inputStream); }
	 
	
	/*
	 * @Autowired private GoogleMapper mapper;
	 */

	//@Test
	public void selectGoogle() throws IOException {

		try (SqlSession session = sqlSessionFactory.openSession()) {

			List<GoogleVO> googles = session.selectList("GoogleMapper.googleMap");

			for (GoogleVO google : googles) {

				/*
				 * logger.info("googleList 매핑 : {}:{}:{}:{}:{}:{}:{}:{}:{}:{}:{}:{}:{}:{}",
				 * google.getAreaCd(), google.getCdNm(), google.getClass(), google.getCol0(),
				 * google.getCol1(), google.getCol2(), google.getCol3(), google.getCol3(),
				 * google.getCol4(), google.getCol5(), google.getCol6(), google.getCol7(),
				 * google.getCol8(), google.getCol9());
				 */
				logger.info(" |- googleList 매핑 : {}", google);
			}
		}
	}

	//@Test
	public void selectGoogle2() throws IOException {

		try (SqlSession session = sqlSessionFactory.openSession()) {

			List<GoogleVO> googles = session.selectList("GoogleMapper.googleMap2", "10");

			for (GoogleVO google : googles) {

				/*
				 * logger.info("googleList 매핑 : {}:{}:{}:{}:{}:{}:{}:{}:{}:{}:{}:{}:{}:{}",
				 * google.getAreaCd(), google.getCdNm(), google.getClass(), google.getCol0(),
				 * google.getCol1(), google.getCol2(), google.getCol3(), google.getCol3(),
				 * google.getCol4(), google.getCol5(), google.getCol6(), google.getCol7(),
				 * google.getCol8(), google.getCol9());
				 * 
				 * logger.info(" |- googleList 매핑 : {}", google);
				 */
			}
		}
	}
	
	//@Test
	//파라미터 n개 => map으로 만들어 전달
	public void selectMultiParmMap() throws IOException{
		
		Map<String, Object> param = new HashMap<>();
		param.put("ARG_CNT", "6000000");
		param.put("ARG_GR","01");
		
		try( SqlSession session = sqlSessionFactory.openSession()) {
			
			List<GoogleVO> googles = session.selectList("GoogleMapper.googleMap3",param);
			
			for (GoogleVO google : googles) {

				/*
				 * logger.info("googleList 매핑 : {}:{}:{}:{}:{}:{}:{}:{}:{}:{}:{}:{}:{}:{}",
				 * google.getAreaCd(), google.getCdNm(), google.getClass(), google.getCol0(),
				 * google.getCol1(), google.getCol2(), google.getCol3(), google.getCol3(),
				 * google.getCol4(), google.getCol5(), google.getCol6(), google.getCol7(),
				 * google.getCol8(), google.getCol9());
				 * 
				 * logger.info(" |- googleList 매핑 : {}", google);
				 */
			}		
		}	
	}
	
	@Test
	//파라미터 n개 => map으로 만들어 전달
	public void selectMultiParmMap2() throws IOException{
		
		Map<String, Object> param = new HashMap<>();
		param.put("ARG_CNT", "6000000");
		param.put("ARG_GR","01");
		param.put("ARG_DIR","R");
		
		param.put("SEOUL","1");
		param.put("GYEONGI","4");
		param.put("WONJU","3");
		param.put("PYEONGTAEK","5");
		param.put("ULSAN","9");
		param.put("DAEJUN","8");
		param.put("BOOSAN","6");
		param.put("GWANGJU","7");
		param.put("PAJU","2");	
		
		try( SqlSession session = sqlSessionFactory.openSession()) {
			
			List<GoogleVO> googles = session.selectList("GoogleMapper.googleMap4",param);
			
			for (GoogleVO google : googles) {

				/*
				 * logger.info("googleList 매핑 : {}:{}:{}:{}:{}:{}:{}:{}:{}:{}:{}:{}:{}:{}",
				 * google.getAreaCd(), google.getCdNm(), google.getClass(), google.getCol0(),
				 * google.getCol1(), google.getCol2(), google.getCol3(), google.getCol3(),
				 * google.getCol4(), google.getCol5(), google.getCol6(), google.getCol7(),
				 * google.getCol8(), google.getCol9());
				 */

				logger.info(" |- googleList 매핑 : {}", google);
			}		
		}	
	}
}
