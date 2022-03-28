package dmacc;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Computer;
import dmacc.beans.User;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.UserRepository;

@SpringBootApplication
public class GamersApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamersApplication.class, args);
	}
	/**
	@Autowired
	UserRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		User c = appContext.getBean("user", User.class);
		c.setUsername("the_darthswiftee");
		repo.save(c);
		
		User d = new User("slaymeplease", LocalDate.of(1997, 7, 23));
		Computer a = new Computer("Linux", "AMD Athlon", 24, 1500);
		d.setCpu(a);
		repo.save(d);
		
		List<User> allMyUsers = repo.findAll();
		for(User user : allMyUsers) {
			System.out.println(user.toString());
		}
		
		((AbstractApplicationContext)appContext).close();
	}**/

}
