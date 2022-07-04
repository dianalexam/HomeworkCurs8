package com.fasttrackit.Exercise1;

public class Email implements AdvertisingProvider{

    private final String NAME = "Email";
    private int advertisingNr;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String advertisedAsRequired() {
        advertisingNr++;
        return "Your company's services have been advertised via e-mail";
    }

    @Override
    public int advertisingLog() {
        return advertisingNr;
    }
}
