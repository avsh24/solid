package com.solid.srp.modem_srp;

public class PhoneClient {
    public static void main(String[] args) {
        IPhone phone = new Phone();
        phone.dial("0123445678");
        phone.send("message text");
        phone.receive();
        phone.disconnect();
    }
}
