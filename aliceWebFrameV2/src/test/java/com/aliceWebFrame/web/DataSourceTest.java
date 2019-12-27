package com.aliceWebFrame.web;

import static org.junit.Assert.*;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aliceWebFrame.web.dao.test.AcTempDao;
import com.aliceWebFrame.web.domain.test.AcTemp;

//Runner 클래스(테스트 메소드를 실행하는 클래스) 를 SpringJUnit4ClassRunner로 함
@RunWith(SpringJUnit4ClassRunner.class)
//location 속성 경로에 있는 xml 파일을 이용해서 스프링이 로딩됨
@ContextConfiguration("classpath:/spring/rootServlet/datasource-context.xml")

public class DataSourceTest {

	//DAO 를 구현한 객체 자동으로 생성
	@Inject
	private AcTempDao dao;
	
	@Before //@Test 전에 실행
	public void testInsertMember() throws Exception{
	}
	@Test
	public void testSelectMember() throws Exception{
		
	}

}
