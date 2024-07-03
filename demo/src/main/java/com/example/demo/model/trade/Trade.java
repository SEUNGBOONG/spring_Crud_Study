package com.example.demo.model.trade;

import com.example.demo.model.Investment.InvestmentProducts;
import com.example.demo.model.userData.User;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Table(name = "tradeData")
@Entity
public class Trade {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tradeId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private InvestmentProducts investmentProducts;

    private LocalDate tradeDate;
    private String transactionType; //
    private double transactionMoney;
    private int tradingVolume;
}
