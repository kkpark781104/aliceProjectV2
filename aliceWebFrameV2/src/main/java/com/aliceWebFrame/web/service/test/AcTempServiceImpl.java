package com.aliceWebFrame.web.service.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliceWebFrame.web.dao.test.AcTempDao;
import com.aliceWebFrame.web.domain.test.AcTemp;

@Service
public class AcTempServiceImpl implements AcTempService{

	@Autowired
	private AcTempDao acTempDao;
	
	public List<AcTemp> list(AcTemp acTemp) throws Exception{
		List<AcTemp> list = acTempDao.list(acTemp);
		return null;
	}
}
