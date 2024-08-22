package ci.digitalacademy.monetab;

import ci.digitalacademy.monetab.Model.User;
import ci.digitalacademy.monetab.Repository.UserRepository;
import ci.digitalacademy.monetab.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class MonEtabApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(MonEtabApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<User> userList = List.of(
                User.builder()
                        .pseudo("admin")
                        .password("admin")
                        .creationDate(Instant.now())
                        .build(),
                User.builder()
                        .pseudo("user")
                        .password("user")
                        .creationDate(Instant.now())
                        .build()
        );
        userRepository.saveAll(userList);

        List<User> users = userService.findAll();
        System.out.println(users);

        Optional<User> optionalUser = userService.findOne(2L);
        System.out.println(optionalUser);
        User userss = userList.get(1);
        userss.setPseudo("blabla");
        userService.save(userss);
    }
}
