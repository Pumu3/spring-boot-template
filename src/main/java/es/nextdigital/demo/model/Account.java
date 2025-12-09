package es.nextdigital.demo.model;

import java.util.Set;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Account {
    @Id
    @GeneratedValue
    private Long id;

    private String IBAN;

    private Long balance;

    @OneToMany(mappedBy = "card")
    Set<CardOperation> cardOperations;

    @OneToMany(mappedBy = "bank_account")
    Set<TransferOperation> transferOperations;
}
