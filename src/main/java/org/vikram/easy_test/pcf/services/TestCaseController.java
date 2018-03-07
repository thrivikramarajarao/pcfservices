package org.vikram.easy_test.pcf.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.vikram.easy_test.pcf.dao.TestCaseDao;
import org.vikram.easy_test_domain.TestCase;

@RestController
public class TestCaseController {

	@Autowired
	TestCaseDao dao;
	
	@RequestMapping("/addtestcase")
	public TestCase addTestCase(@RequestParam TestCase testCase) {
		return testCase;
	}

	@RequestMapping("/gettestcase")
	public TestCase getTestCase(@RequestParam String testId) {
		TestCase testCase = new TestCase();

		testCase.setURL("http://localhost:8383/greeting");
		testCase.setHttpMethod("GET");
		testCase.setRequestbody(null);
		testCase.setRequestbody("{\"id\":1,\"content\":\"Hello, World!\"}");
		return testCase;
	}

	@RequestMapping("/savetestcase")
	public TestCase saveTestCase(@RequestParam TestCase testcase) {
		return dao.save(testcase);
		//return testcase;
	}
}