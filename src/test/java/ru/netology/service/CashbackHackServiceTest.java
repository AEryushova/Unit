package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldBeOfferedToBuyInAdditionForMaximumCashback() {
        CashbackHackService cashback = new CashbackHackService();
        int expected = 500;
        int actual = cashback.remain(500);
        assertEquals(actual,expected);
    }

    @Test
    public void shouldBeOfferedToBuyInAdditionForMaximumCashbackOnTheLowerBorder() {
        CashbackHackService cashback = new CashbackHackService();
        int expected = 1;
        int actual = cashback.remain(999);
        assertEquals(actual,expected);
    }

    @Test
    public void shouldBeOfferedToBuyInAdditionForMaximumCashbackAtTheLowerBorder() {
        CashbackHackService cashback = new CashbackHackService();
        int expected = 2;
        int actual = cashback.remain(998);
        assertEquals(actual,expected);
    }

    @Test
    public void shouldBeOfferedToBuyInAdditionForMaximumCashbackOnTheUpperBorder() {
        CashbackHackService cashback = new CashbackHackService();
        int expected = 999;
        int actual = cashback.remain(1001);
        assertEquals(actual,expected);
    }

    @Test
    public void shouldBeOfferedToBuyInAdditionForMaximumCashbackAtTheUpperBorder() {
        CashbackHackService cashback = new CashbackHackService();
        int expected = 998;
        int actual = cashback.remain(1002);
        assertEquals(actual,expected);
    }

    @Test
    public void shouldBeOfferedToBuyInAdditionForMaximumCashbackBorder() {
        CashbackHackService cashback = new CashbackHackService();
        int expected = 0;
        int actual = cashback.remain(1000);
        assertEquals(actual,expected);
    }
}