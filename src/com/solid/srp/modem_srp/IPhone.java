package com.solid.srp.modem_srp;

public interface IPhone {
    void dial(String phoneNumber);

    void disconnect();

    void send(String message);

    int receive();
}
