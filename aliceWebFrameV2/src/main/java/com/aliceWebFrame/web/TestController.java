package com.aliceWebFrame.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aliceWebFrame.web.domain.test.AcTemp;
import com.aliceWebFrame.web.service.test.AcTempService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/test")
public class TestController {
	
	@Value("${Main.TableHeader}") 
	private String tableHeader;

	@Autowired
	private AcTempService acTempService;
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws Exception 
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {
		AcTemp acTemp = new AcTemp(1L);
		
		List<AcTemp> list = acTempService.list(acTemp);
		return "home";
	}
	
}
