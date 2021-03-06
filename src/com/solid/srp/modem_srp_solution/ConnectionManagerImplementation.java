package com.solid.srp.modem_srp_solution;

public class ConnectionManagerImplementation implements IConnectionManager {

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Connection established");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected successfully");
    }
}
