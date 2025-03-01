package me.dio.controller;

import me.dio.domain.model.RPGCharacter;
import me.dio.service.RPGCharacterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class RPGCharacterController {

    private final RPGCharacterService userService;

    public RPGCharacterController(RPGCharacterService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<RPGCharacter> findById(@PathVariable Long id) {
       var user = userService.findById(id);
       return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<RPGCharacter> create(@RequestBody RPGCharacter userToCreate) {
        var userCreated = userService.create(userToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreated);
    }
}
