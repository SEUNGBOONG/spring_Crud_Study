package com.example.demo.model.trade;


import com.example.demo.model.Investment.InvestmentProducts;
import com.example.demo.model.userData.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "tradeData")
@Entity
public class tradeData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tradeId;
    private Long tradeDate;
    private Long transactionType;
    private int transactionMoney;
    private int tradingVolume;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "productsId") // 외래 키 컬럼의 이름을 지정
    private InvestmentProducts investmentProducts;
}
