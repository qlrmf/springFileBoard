package org.service;

import java.util.List;

import org.dao.BoardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vo.BoardVo;

@Service //로직처리 : 서비스레이어, 내부에서 자바 로직을 처리함
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDao boardDao;
	
	@Override
	public void insert(BoardVo vo) throws Exception {
		boardDao.insert(vo);
	}

	@Override
	public List<BoardVo> list(int start, int end) throws Exception {
		return boardDao.selectAll(start, end);
	}

	@Override
	public int listSize() {
		System.out.println(boardDao.boardCount());
		return boardDao.boardCount();
	}
	
}