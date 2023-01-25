package es.datastructur.lab2demo.solution;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CS61BakeryTest {

    @Test
    public void restock() {
        CS61Bakery CS61B = new CS61Bakery(5, 4);
        CS61B.restock(2);
        assertEquals(7, CS61B.getStock());
    }

    @Test
    public void buy() {
        CS61Bakery CS61B = new CS61Bakery(5, 4);
        assertEquals(5, CS61B.buy(20));
    }

    @Test
    public void restockAndBuy() {
        CS61Bakery CS61B = new CS61Bakery(5, 4);
        int loaves = CS61B.restockAndBuy(5, 40);
        assertEquals(10, loaves);
    }

    @Test
    public void getMaxPurchase() {
        CS61Bakery CS61B = new CS61Bakery(10, 4);
        ArrayList<Integer> purchaseRecord = new ArrayList<>();
        CS61B.buy(4);
        purchaseRecord.add(1);
        assertEquals(purchaseRecord, CS61B.getPurchaseRecord());
        CS61B.restock(100);
        CS61B.buy(64);
        purchaseRecord.add(16);
        CS61B.buy(33);
        purchaseRecord.add(8);
        int maxPurchase = CS61B.getMaxPurchase();
        assertEquals(16, maxPurchase);
    }
}