package org.solid.dip_5.solution;

public class CreditCard implements BankCard {

    @Override
    public void doTransaction(long amount) {
        System.out.println("Payment using Credit Card");
    }
}
