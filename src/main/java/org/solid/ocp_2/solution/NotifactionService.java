package org.solid.ocp_2.solution;

public interface NotifactionService {
    public void sentOtp(String midum);
    public void sentTransactionReport(String medium);
}
