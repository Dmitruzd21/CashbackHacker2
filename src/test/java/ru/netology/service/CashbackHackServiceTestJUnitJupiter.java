package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTestJUnitJupiter {
    @Test
    public void shouldTestRemainIfAmountIs900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected,actual);
    }

    @Test
    public void shouldTestRemainIfAmountIs999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected,actual);
    }

    @Test
    public void shouldTestRemainIfAmountIs1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected,actual);
    }

    @Test
    public void shouldTestRemainIfAmountIs1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected,actual);
    }

}
