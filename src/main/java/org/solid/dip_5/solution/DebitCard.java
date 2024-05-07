package org.solid.dip_5.solution;

public class DebitCard implements BankCard {

    @Override
    public void doTransaction(long amount) {
        System.out.println("Payment using Debit Card");
    }
}
