package com.ms.data.structures.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyAndSellStocksTest {

    BuyAndSellStocks buyAndSellStocks;

    @BeforeEach
    void setUp() {
        buyAndSellStocks = new BuyAndSellStocks();
    }

    @Test
    void getProfit() {
        int[] input = {2, 3, 6, 5, 4, 1, 7};
        assertEquals(6, buyAndSellStocks.getProfit(input));
    }

    @Test
    void getProfit_() {
        int[] input = {7, 6, 4, 3, 1};
        assertEquals(0, buyAndSellStocks.getProfit_(input));
    }

    @Test
    void _getProfit() {
        int[] input = {7, 1, 5, 3, 6, 4};
        assertEquals(5, buyAndSellStocks._getProfit(input));
    }
}