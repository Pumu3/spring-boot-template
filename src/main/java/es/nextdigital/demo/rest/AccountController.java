package es.nextdigital.demo.rest;

import org.springframework.web.bind.annotation.RestController;

import es.nextdigital.demo.repository.AccountRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AccountController {

    private final AccountRepository repository;

    AccountController(AccountRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/transferMoney")
    public String transferMoney(@RequestBody String entity) {
        // TODO: process POST request

        return entity;
    }
}
