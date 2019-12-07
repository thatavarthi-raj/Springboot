package data.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import data.jpa.entity.EmployeeEntity;
import data.jpa.repository.EmployeeEntityRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	public CommandLineRunner initialize(@Autowired EmployeeEntityRepository employeeRepository) {
		return (args) -> {
			employeeRepository.save(EmployeeEntity.builder().name("jack").build());
			employeeRepository.save(EmployeeEntity.builder().name("jill").build());
			employeeRepository.save(EmployeeEntity.builder().name("jim").build());

			List<EmployeeEntity> allEmployees = employeeRepository.findAll();
			allEmployees.stream().forEach(employee -> log.info("employee = {}", employee));
		};
	}
}
