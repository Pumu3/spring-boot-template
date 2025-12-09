package es.nextdigital.demo.model;

import java.util.Set;

import org.springframework.lang.NonNull;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Card {
    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    private CardType type;

    private Long limit;

    @NonNull
    private Integer pin;

    @OneToMany(mappedBy = "card")
    Set<CardOperation> operations;
}
