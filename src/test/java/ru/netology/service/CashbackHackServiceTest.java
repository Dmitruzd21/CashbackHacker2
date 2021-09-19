package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldTestRemainIfAmountIs900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainIfAmountIs999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainIfAmountIs1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected,"Если пользователь купил ровно на 1000 рублей, то приложение не должно ему говорить, что нужно купить ещё на 1000.");
    }

    @Test
    public void shouldTestRemainIfAmountIs1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

}