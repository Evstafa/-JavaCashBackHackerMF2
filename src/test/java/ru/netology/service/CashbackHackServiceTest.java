package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void remainIfUnder1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected,actual);
    }
    @Test
    public void remainIf0() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(expected,actual);
    }
    @Test
    public void remainIfAbove1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1300);
        assertEquals(expected,actual);
    }

}