package com.vuejs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vuejs.entity.Employee;
import com.vuejs.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagerBeckendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagerBeckendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = Employee.builder().firstName("Rizwan").lastName("Khan").email("rizwan@gmail.com").build();
		Employee employee2 = Employee.builder().firstName("Tannu").lastName("Khan").email("tannu@gmail.com").build();
		Employee employee3 = Employee.builder().firstName("Mohd").lastName("Faishal").email("rizwan@gmail.com").build();
		Employee employee4 = Employee.builder().firstName("John").lastName("Abrahm").email("rizwan@gmail.com").build();

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		employeeRepository.save(employee4);
	}

}
