package com.neoflex.testapp.controller;
import com.neoflex.testapp.entity.Users;
import com.neoflex.testapp.service.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {

    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping(value = "/users")
    public ResponseEntity<?> create(@RequestBody Users user) {
        final boolean created = usersService.create(user);
        return created
            ? new ResponseEntity<>(user.getId(), HttpStatus.CREATED)
            : new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    /*@GetMapping(value = "/clients")
    public ResponseEntity<List<Users>> read() {
           final List<Users> users = usersService.readAll();

       return users != null && !users.isEmpty()
               ? new ResponseEntity<>(users, HttpStatus.OK)
               : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }*/

    /*ZZz@GetMapping(value = "/users")
    public ResponseEntity<Users> read(@RequestBody Users Oid) {
       final Users user = usersService.read(Oid.getId());

       return user != null
               ? new ResponseEntity<>(user, HttpStatus.OK)
               : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }*/

    /*@PutMapping(value = "/clients/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Users user) {
       final boolean updated = usersService.update(user, id);

       return updated
               ? new ResponseEntity<>(HttpStatus.OK)
               : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }*/

    @DeleteMapping(value = "/users")
    public ResponseEntity<?> delete(@RequestBody Users user) {
       final boolean deleted = usersService.delete(user.getId());

       return deleted
               ? new ResponseEntity<>(HttpStatus.OK)
               : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
