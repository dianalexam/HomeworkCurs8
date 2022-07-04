package com.fasttrackit.Exercise1;

public class Facebook implements AdvertisingProvider{

    private final String NAME = "Facebook";
    private int advertisingNr;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String advertisedAsRequired() {
        advertisingNr++;
        return "Your company's services have been advertised on Facebook";
    }

    @Override
    public int advertisingLog() {
        return advertisingNr;
    }
}
