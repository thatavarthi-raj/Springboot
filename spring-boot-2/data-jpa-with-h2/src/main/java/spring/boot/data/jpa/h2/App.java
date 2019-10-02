package spring.boot.data.jpa.h2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import spring.boot.data.jpa.h2.entity.Employee;
import spring.boot.data.jpa.h2.repository.EmployeeRepository;

import java.util.List;

@Slf4j
@SpringBootApplication
public class App {

    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner initialize(@Autowired EmployeeRepository employeeRepository){
        return (args) -> {
            employeeRepository.save(Employee.builder().name("jack").designation("SE1").build());
            employeeRepository.save(Employee.builder().name("jill").designation("SE2").build());
            employeeRepository.save(Employee.builder().name("jim").designation("SE3").build());

            List<Employee> allEmployees = employeeRepository.findAll();
            allEmployees.stream().forEach(employee -> log.info("employee = {}", employee));
        };
    }
}
