package com.aliceWebFrame.web.dao.test;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aliceWebFrame.web.domain.test.AcTemp;

/**
 * AcTest class
 * @author kkpark
 *
 */
@Repository
public class AcTempDaoImpl implements AcTempDao{
	
	@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	
	private static final String GetTime = "AcTempMapper.getTime";
	private static final String SelectList = "AcTempMapper.selectList";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(GetTime);
		
	}
	@Override
	public List<AcTemp> list(AcTemp acTemp) {
		
		List<AcTemp> list = sqlSession.selectList(SelectList, acTemp.getId());
		return list;
	}
	
}
