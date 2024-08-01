package fr.dawan.demo_spring;

import fr.dawan.listener.BotListener;
import fr.dawan.models.User;
import lombok.extern.slf4j.Slf4j;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

@Slf4j
@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApplication.class, args);
	}

	@EventListener(ApplicationStartedEvent.class)
	public void init() {
		User user = new User().age(17).nom("ADEKALOM").prenom("Yanis");
		log.debug("user = \u001B[31m" + user + "\u001B[0m");
		BotListener listener = new BotListener();
		ListenerAdapter listenerAdapter;
	}
}
