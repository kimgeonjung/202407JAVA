package com.board.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlMapConfig;

public class BoardDao {
	SqlSessionFactory sqlsession_f = SqlMapConfig.getSqlMapInstance();
	SqlSession session;

	public BoardDao() {
		session = sqlsession_f.openSession(true);
	}

	public int getNumRecords() {
		return session.selectOne("BoardMapper.getNumRecords");
	}
	
	public List<BoardDto> selectList(int start, int listsize) {
		Map<String, Integer> map = new HashMap<>();
		map.put("start", start);
		map.put("listsize", listsize);
		return session.selectList("BoardMapper.selectList", map);
	}
	
	public void updateHits(int num) {
		session.update("BoardMapper.updateHits", num);
	}

	public BoardDto selectOne(int num, boolean hitsIncreased) {
		if(hitsIncreased) {
			updateHits(num);
		}
		return session.selectOne("BoardMapper.selectOne", num);
	}

	public void insertOne(BoardDto dto) {
		session.insert("BoardMapper.insertOne", dto);
	}

	public void updateOne(BoardDto dto) {
		session.update("BoardMapper.updateOne", dto);
	}

	public void deleteOne(int num) {
		session.delete("BoardMapper.deleteOne", num);
	}
}
