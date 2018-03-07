package org.vikram.easy_test.pcf.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.vikram.easy_test_domain.TestCase;

public interface TestCaseDao extends CrudRepository<TestCase, Long> {

    List<TestCase> findByLastName(String lastName);
}
