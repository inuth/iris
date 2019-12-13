package be.iris;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import be.iris.dao.AlbumDAO;

@SpringBootApplication
public class MusiqueIrisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusiqueIrisApplication.class, args);
	}

	@Autowired
	private AlbumDAO albumDAO;
	
	@EventListener(ApplicationReadyEvent.class)
	public void insertUsers() {
		
	}
	
}
