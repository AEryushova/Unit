package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void shouldBeOfferedToBuyInAdditionForMaximumCashback() {
        CashbackHackService cashback = new CashbackHackService();
        int expected = 500;
        int actual = cashback.remain(500);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeOfferedToBuyInAdditionForMaximumCashbackOnTheLowerBorder() {
        CashbackHackService cashback = new CashbackHackService();
        int expected = 1;
        int actual = cashback.remain(999);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeOfferedToBuyInAdditionForMaximumCashbackAtTheLowerBorder() {
        CashbackHackService cashback = new CashbackHackService();
        int expected = 2;
        int actual = cashback.remain(998);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeOfferedToBuyInAdditionForMaximumCashbackOnTheUpperBorder() {
        CashbackHackService cashback = new CashbackHackService();
        int expected = 999;
        int actual = cashback.remain(1001);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeOfferedToBuyInAdditionForMaximumCashbackAtTheUpperBorder() {
        CashbackHackService cashback = new CashbackHackService();
        int expected = 998;
        int actual = cashback.remain(1002);
        assertEquals(expected, actual);

    }

    @Test
    public void shouldBeOfferedToBuyInAdditionForMaximumCashbackBorder() {
        CashbackHackService cashback = new CashbackHackService();
        int expected = 0;
        int actual = cashback.remain(1000);
        assertEquals(expected, actual);

    }
}