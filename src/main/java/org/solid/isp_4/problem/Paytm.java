package org.solid.isp_4.problem;

public class Paytm implements Payments{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {
    //This feature not applicable for Paytm
        // We should not force to implement the client
    }
}
