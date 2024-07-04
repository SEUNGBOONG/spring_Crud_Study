package com.example.demo.service;

import com.example.demo.domain.Investment.InvestmentProductRepository;
import com.example.demo.domain.Investment.InvestmentProducts;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InvestmentProductService {

    private final InvestmentProductRepository investmentProductRepository;

    public InvestmentProducts saveProduct(InvestmentProducts product) {
        return investmentProductRepository.save(product);
    }

    public Optional<InvestmentProducts> findProductById(Long productId) {
        return investmentProductRepository.findById(productId);
    }

    public void deleteProductById(Long productId) {
        investmentProductRepository.deleteById(productId);
    }
}
