package ci.digitalacademy.monetab;

import ci.digitalacademy.monetab.Model.Address;
import ci.digitalacademy.monetab.Model.User;
import ci.digitalacademy.monetab.Repository.AddressRepository;
import ci.digitalacademy.monetab.Repository.UserRepository;
import ci.digitalacademy.monetab.Service.AddressService;
import ci.digitalacademy.monetab.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
@AllArgsConstructor
public class MonEtabApplication {


    private UserRepository userRepository;
    private UserService userService;
    private AddressService addressService;

    public static void main(String[] args) {
        SpringApplication.run(MonEtabApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        Address address = new Address(null,"abidjan","cote d'ivoire","riviera",null);
//       User utilisateur = new User(null,"admine","admine", Instant.now(),address);
//        Address addressservice = addressService.save(address);
//        User userservice = userService.save(utilisateur);
//        System.out.println(userService.findAll());
//
//    }
}
