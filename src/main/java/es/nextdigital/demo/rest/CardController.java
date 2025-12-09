package es.nextdigital.demo.rest;

import org.springframework.web.bind.annotation.RestController;

import es.nextdigital.demo.repository.CardRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class CardController {

    private final CardRepository repository;

    CardController(CardRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/getOperations")
    public String getOperations(@RequestParam String param) {
        return new String();
    }

    @PostMapping("/extractMoneyCard")
    public String extractMoneyCard(@RequestBody String entity) {
        // TODO: process POST request

        return entity;
    }

    @PostMapping("/insertMoneyCard")
    public String insertMoneyCard(@RequestBody String entity) {
        // TODO: process POST request

        return entity;
    }

    @PostMapping("/enableCard")
    public String enableCard(@RequestBody String entity) {
        // TODO: process POST request

        return entity;
    }

    @PostMapping("/changePIN")
    public String changePIN(@RequestBody String entity) {
        // TODO: process POST request

        return entity;
    }

    @PostMapping("/getCardSettings")
    public String getCardSettings(@RequestBody String entity) {
        // TODO: process POST request

        return entity;
    }

    @PostMapping("/changeCardSettings")
    public String changeCardSettings(@RequestBody String entity) {
        // TODO: process POST request

        return entity;
    }
}
