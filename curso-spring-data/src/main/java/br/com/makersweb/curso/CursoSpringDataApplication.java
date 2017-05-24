package br.com.makersweb.curso;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.makersweb.curso.entity.Document;
import br.com.makersweb.curso.entity.Person;
import br.com.makersweb.curso.repository.IPersonRepository;

@SpringBootApplication
public class CursoSpringDataApplication implements CommandLineRunner {
	
	@Autowired
	private IPersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoSpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		testSavePerson();
	}

	private void testSavePerson() {
		Person p1 = new Person();
		p1.setFirstName("Alisson");
		p1.setLastName("Souza");
		p1.setAge(25);
		p1.setDocument(new Document("741.321.365-96", 963258852));
		
		Person p2 = new Person();
		p2.setFirstName("Bruno");
		p2.setLastName("Pereira");
		p2.setAge(63);
		p2.setDocument(new Document("741.369.212-96", 123654741));
		
		Person p3 = new Person();
		p3.setFirstName("Carlos Ricardo");
		p3.setLastName("Pereira");
		p3.setAge(45);
		p3.setDocument(new Document("701.309.212-96", 123054701));
		
		Person p4 = new Person();
		p4.setFirstName("Fabio");
		p4.setLastName("Guimarães");
		p4.setAge(33);
		p4.setDocument(new Document("742.329.212-96", 123624721));
		
		Person p5 = new Person();
		p5.setFirstName("Vinicius");
		p5.setLastName("Pereira");
		p5.setAge(23);
		p5.setDocument(new Document("141.319.212-96", 113614741));
		
		Person p6 = new Person();
		p6.setFirstName("Carla");
		p6.setLastName("Ribas");
		p6.setAge(23);
		p6.setDocument(new Document("541.315.212-96", 113655745));
		
		List<Person> persons = 		
				personRepository.save(Arrays.asList(p1, p2, p3, p4, p5 ,p6));
		
		persons.forEach(System.out::println);
	}
}
