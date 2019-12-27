package com.aliceWebFrame.web.dao.test;

import java.util.List;

import com.aliceWebFrame.web.domain.test.AcTemp;

/**
 * AcTest class
 * @author kkpark
 *
 */
public interface AcTempDao {
	
	
	public String getTime();
	
	public List<AcTemp> list(AcTemp acTemp);
	
	
}
