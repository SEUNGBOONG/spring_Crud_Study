package com.example.demo.model.Investment;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "InvestmentProducts")
@Entity
public class InvestmentProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productsId;

    private Long productsName;

    @Enumerated(EnumType.STRING)
    private Long productsType;

    private int currentPrice;
    private int pastPrice;

}
