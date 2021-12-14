package org.zerock.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.GoogleVO;
import org.zerock.domain.ListCmd;
import org.zerock.domain.ModalCmd;
import org.zerock.domain.NameCmd;
import org.zerock.domain.SelectCmd;
import org.zerock.domain.SelectVO;
import org.zerock.mapper.BoardMapper;
import org.zerock.mapper.GoogleMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@RequiredArgsConstructor
public class GoogleServiceImpl implements GoogleService{
	
	private final GoogleMapper mapper;

	@Override
	public List<GoogleVO> selectTest() throws Exception {
		
		return mapper.selectTest();
	}

	@Override
	public List<GoogleVO> selectTest2(ListCmd list) throws Exception {
		
		System.out.println("Test2....................");
		
		return mapper.selectTest2(list);	
}

	@Override
	public void update(ModalCmd modal) {
		
		mapper.update(modal);
		System.out.println("Service update........................" + modal.toString());
		
	}


	@Override
	public List<GoogleVO> selectTest3(NameCmd name) {
		
		System.out.println("Test3..........................");
		return mapper.selectTest3(name);	
	}

	@Override
	public ModalCmd selectTest4() {

		System.out.println("Test4..........................");
		return mapper.selectTest4();	
	}


}
