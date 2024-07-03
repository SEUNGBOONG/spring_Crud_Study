package com.example.demo.service;

import com.example.demo.model.trade.Trade;
import com.example.demo.model.trade.TradeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class TradeService {
    private final TradeRepository tradeRepository;

    public Trade saveTrade(Trade trade) {
        return tradeRepository.save(trade);
    }

    public Optional<Trade> findTradeById(Long id) {
        return tradeRepository.findById(id);
    }

    public List<Trade> findAllTrades() {
        return tradeRepository.findAll();
    }
}
