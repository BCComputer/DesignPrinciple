package org.solid.dip_5.solution;

public class ShoppingMall {
    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard){
        this.bankCard=bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard = new CreditCard();
        BankCard bankCard1 = new DebitCard();
        //runtime polymorphism
        ShoppingMall shoppingMall_P1 = new ShoppingMall(bankCard);
        shoppingMall_P1.doPurchaseSomething(5000);


        ShoppingMall shoppingMall_P2 = new ShoppingMall(bankCard1);
        shoppingMall_P2.doPurchaseSomething(5000);


    }

}
