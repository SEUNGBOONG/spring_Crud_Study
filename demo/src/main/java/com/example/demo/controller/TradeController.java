package com.example.demo.controller;

import com.example.demo.model.trade.Trade;
import com.example.demo.service.TradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trades")
@RequiredArgsConstructor
public class TradeController {

    private final TradeService tradeService;

    @PostMapping
    public Trade createTrade(@RequestBody Trade trade) {
        return tradeService.saveTrade(trade);
    }

    @GetMapping("/{id}")
    public Trade findTradeById(@PathVariable Long id) {
        return tradeService.findTradeById(id).orElseThrow(RuntimeException::new);
    }

    @GetMapping
    public List<Trade> getAllTrades() {
        return tradeService.findAllTrades();
    }
}
