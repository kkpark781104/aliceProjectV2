package com.aliceWebFrame.web.domain.test;

import lombok.Data;

/**
 * AcTest class
 * @author kkpark
 *
 */
@Data
public class AcTemp {
	
	
	//key
	private Long id;
	//임시1
	private String tempStr1;
	//임시2
	private String tempStr2;
	//임시3
	private String tempStr3;
	//임시4
	private String tempStr4;
	
	public AcTemp(Long id) {
		this.id = id;
	}
}
