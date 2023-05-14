package br.com.cursonelio.nelio.resources;

import br.com.cursonelio.nelio.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1,"Neuro", "neur1@gmail.com", "99999999", "15155");
        return ResponseEntity.ok().body(u);
    }

}
