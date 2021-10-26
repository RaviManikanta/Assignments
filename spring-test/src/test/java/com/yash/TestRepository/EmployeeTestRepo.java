package com.yash.TestRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.yash.model.Employee;
import com.yash.repository.EmployeeRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
class EmployeeTestRepo {

	@Autowired
	private EmployeeRepository repo;

	@Test
   @Rollback(false)
	public void testCreateEmp() {
		Employee e =new Employee(101,"Anvesh",3000.0,"Hyd");
		Employee saveTest = repo.save(e);
		assertNotNull(saveTest);
	}
	
	@Test
	public void testFindEmp() {
		String name="Test";
		Employee e = repo.findByName(name);

		assertThat(e.getName()).isEqualTo(name);	
	}
@Test
public void testGetList() {
	List<Employee> ee =(List<Employee>) repo.findAll();
	assertThat(ee).size().isGreaterThan(0);
}

}
