package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void testRemainIfUnder1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 200;
        int actual = service.remain(800);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainIf0() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainIfAbove1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1200);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainIfAbove1001() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain_1_000_000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(1_000_000);
        assertEquals(actual, expected);

    }
}