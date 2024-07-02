package com.example.demo.service;

import com.example.demo.model.Investment.InvestmentProducts;
import com.example.demo.model.trade.TradeData;
import com.example.demo.model.userData.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InvestService {
    private InvestmentProducts investmentProducts;
    private User user;
    private TradeData tradeData;
}
