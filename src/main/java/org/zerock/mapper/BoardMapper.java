package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardMapper {

	List<BoardVO> getList();
	
	void insert(BoardVO board);
	
	void inserSelectKey(BoardVO board);
	
	BoardVO read(Long bno);
	//BoradVO 타입으로 리턴 파라미터는 bno로 조회
	
	int delete(Long bno);
	//수정과 삭제는 int 타입으로 사용. 몇건이 수정 삭제 되었는지 알기 위해
	
	int update(BoardVO board);
	
}
