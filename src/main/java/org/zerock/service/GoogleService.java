package org.zerock.service;

import java.util.List;
import java.util.Map;

import org.zerock.domain.GoogleVO;
import org.zerock.domain.ListCmd;
import org.zerock.domain.ModalCmd;
import org.zerock.domain.NameCmd;
import org.zerock.domain.SelectCmd;
import org.zerock.domain.SelectVO;

public interface GoogleService {

	public List<GoogleVO> selectTest() throws Exception;

	public List<GoogleVO> selectTest2(ListCmd list) throws Exception;

	public void update(ModalCmd modal);

	public List<GoogleVO> selectTest3(NameCmd name);

	public ModalCmd selectTest4();

}
