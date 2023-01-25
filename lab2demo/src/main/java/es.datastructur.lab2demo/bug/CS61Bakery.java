package es.datastructur.lab2demo.bug;

import java.util.ArrayList;

/**
 * Let's get this bread!
 * @author Elana Ho
 */

public class CS61Bakery {

    private int stock;
    private int price;
    private ArrayList<Integer> purchaseRecord = new ArrayList<>();

    public CS61Bakery(int stock, int price) {
        this.stock = stock;
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }

    public ArrayList<Integer> getPurchaseRecord() {
        return purchaseRecord;
    }

    /**
     * Adds more bread to the current stock.
     * @param amount
     */
    public void restock(int amount) {
        stock = amount;
    }

    /**
     * Buy bread from the bakery. You get as much as your money can buy.
     * @param payment
     * @return amountBought
     */
    public int buy(int payment) {
        int amountBought = payment / price;
        if (amountBought > stock) {
            amountBought = stock;
        }
        stock -= amountBought;
        purchaseRecord.add(amountBought);
        System.out.println("You bought " + amountBought + " loaves!");
        return amountBought;
    }

    /**
     * Restock bread and buy bread from the bakery in 1 stop.
     * @param amount
     * @param payment
     * @return amountBought
     */
    public int restockAndBuy(int amount, int payment) {
        restock(amount);
        int amountBought = buy(payment);
        return amountBought;
    }

    /**
     * Find the maximum amount of bread that has been bought by 1 customer in 1 transaction.
     * @return maxPurchase
     */
    public int getMaxPurchase() {
        int maxPurchase = purchaseRecord.get(0);
        for (int i = 0; i < purchaseRecord.size(); i++) {
            if (maxPurchase > purchaseRecord.get(i)) {
                maxPurchase = purchaseRecord.get(i);
            }
        }
        return maxPurchase;
    }

}
