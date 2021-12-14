package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void testGetList() {
		
		log.info("-----------------------------------------");
		boardMapper.getList();
		
	}
	
	@Test
	public void testInsert() {
		
		BoardVO vo = new BoardVO();
		vo.setTitle("Test 테스트");
		vo.setContent("Content 테스트");
		vo.setWriter("tester");
		
		boardMapper.insert(vo);
		log.info("-----------------------------------------");
		log.info("after insert " + vo.getBno());
		
	}
	@Test
	public void testInsertSelectKey() {
		BoardVO vo = new BoardVO();
		vo.setTitle("AAATest 테스트");
		vo.setContent("AAAContent 테스트");
		vo.setWriter("AAAtester");
		
		boardMapper.inserSelectKey(vo);
		
		log.info("-----------------------------------------");
		log.info("after insertSelectKey " + vo.getBno());
	}
	@Test
	public void testRead() {
		
		BoardVO vo = boardMapper.read(21L);
		log.info(vo);
		
	}
	@Test
	public void testDelete() {
		
		int count = boardMapper.delete(22L);
		
		log.info("count:" + count);
		
	}
	@Test
	public void testUpdate() {
		
		BoardVO vo = new BoardVO();
		vo.setBno(21L);
		vo.setTitle("Update Title");
		vo.setContent("Update Content");
		vo.setWriter("uesr00");
		
		log.info("count:" + boardMapper.update(vo));
		
	}

}
