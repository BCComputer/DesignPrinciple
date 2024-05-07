package org.solid.dip_5.problem;

import org.solid.dip_5.solution.CreditCard;

public class ShoppingMall {
    private CreditCard creditCard;

    public ShoppingMall(CreditCard creditCard){
        this.creditCard=creditCard;
    }

    public void doPurchaseSomething(long amount){
        creditCard.doTransaction(amount);
    }
    /*
    private DebitCard debitCard;

    public ShoppingMall(DebitCard debitCard){
        this.debitCard=debitCard;
    }

    public void doPurchaseSomething(long amount){
        debitCard.doTransaction(amount);
    }
     */

    public static void main(String[] args) {

        //DebitCard debitCard1 = new DebitCard();
        //runtime polymorphism
        //ShoppingMall shoppingMall_P1 = new ShoppingMall(debitCard1);
        //shoppingMall_P1.doPurchaseSomething(5000);

        CreditCard creditCard1 = new CreditCard();
        ShoppingMall shoppingMall_P2 = new ShoppingMall(creditCard1);
        shoppingMall_P2.doPurchaseSomething(5000);


    }

}
