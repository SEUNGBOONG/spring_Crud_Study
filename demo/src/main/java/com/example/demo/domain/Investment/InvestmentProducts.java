package com.example.demo.domain.Investment;

import com.example.demo.domain.trade.ProductsType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Table(name = "InvestmentProducts")
@Entity
public class InvestmentProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productsId;

    private String productsName;

    @Enumerated(EnumType.STRING)
    private ProductsType productsType;

    private double currentPrice;

    @ElementCollection
    private List<Double> pastPrices;
}
