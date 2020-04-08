package spring.boot.hateoas.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import spring.boot.hateoas.model.Student;

@RestController
public class AppController {

	private static List<Student> studentList = new ArrayList<>();

	static {
		studentList.add(Student.builder().id("1").name("jim").build());
		studentList.add(Student.builder().id("2").name("jill").build());
		studentList.add(Student.builder().id("3").name("jane").build());
	}

	/**
	 * Status  - 201 Created
	 * Check Location header in response headers
	 * 
	 * @param student
	 * @return
	 */
	@PostMapping(value = "/students", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		UUID randomUUID = UUID.randomUUID();
		String id = randomUUID.toString();
		student.setId(id);
		studentList.add(student);

		// build path to get student by id
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();

		Resource<Student> resource = new Resource<>(student);

		return ResponseEntity.created(uri).body(student);
	}

	@GetMapping(value = "/students/{id}", produces = APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> findStudent(@PathVariable("id") String id) {
		for (Student student : studentList) {
			if (id.equals(student.getId())) {
				return ResponseEntity.ok(student);
			}
		}

		return ResponseEntity.noContent().build();
	}

	@GetMapping(value = "/students", produces = APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Student>> findAllStudent() {
		return ResponseEntity.ok(studentList);
	}

}