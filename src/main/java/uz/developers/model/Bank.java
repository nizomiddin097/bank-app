package uz.developers.model;

import java.util.Arrays;

public class Bank {
    private String name;
    private double balanceSum;
    private double balanceUsd;
    private Card[] cards ; // = new Card[10]
    private double usdSaleRate;
    private double usdBuyRate;

    public Bank() {
    }

    public Bank(String name, double balanceSum, double balanceUsd, Card[] cards, double usdSaleRate, double usdBuyRate) {
        this.name = name;
        this.balanceSum = balanceSum;
        this.balanceUsd = balanceUsd;
        this.cards = cards;
        this.usdSaleRate = usdSaleRate;
        this.usdBuyRate = usdBuyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalanceSum() {
        return balanceSum;
    }

    public void setBalanceSum(double balanceSum) {
        this.balanceSum = balanceSum;
    }

    public double getBalanceUsd() {
        return balanceUsd;
    }

    public void setBalanceUsd(double balanceUsd) {
        this.balanceUsd = balanceUsd;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public double getUsdSaleRate() {
        return usdSaleRate;
    }

    public void setUsdSaleRate(double usdSaleRate) {
        this.usdSaleRate = usdSaleRate;
    }

    public double getUsdBuyRate() {
        return usdBuyRate;
    }

    public void setUsdBuyRate(double usdBuyRate) {
        this.usdBuyRate = usdBuyRate;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", balanceSum=" + balanceSum +
                ", balanceUsd=" + balanceUsd +
                ", cards=" + Arrays.toString(cards) +
                ", usdSaleRate=" + usdSaleRate +
                ", usdBuyRate=" + usdBuyRate +
                '}';
    }
}
