package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.GoogleVO;
import org.zerock.domain.ListCmd;
import org.zerock.domain.ModalCmd;
import org.zerock.domain.NameCmd;
import org.zerock.domain.SelectCmd;
import org.zerock.domain.SelectVO;

public interface GoogleMapper {
	
	public List<GoogleVO> selectTest() throws Exception;
	//mapper.xml의 id와 메소드명이 일치 해야된다.
	public List<GoogleVO> selectTest2(ListCmd list) throws Exception;
	
	public int update(ModalCmd modal);
	
	public List<GoogleVO> selectTest3(NameCmd name);
	
	public ModalCmd selectTest4();

}
