package com.fasttrackit.Exercise1;

public class Print implements AdvertisingProvider {

    private final String NAME = "Paper Print";
    private int advertisingNr;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String advertisedAsRequired() {
        advertisingNr++;
        return "Your company's services have been advertised in our paper";
    }

    @Override
    public int advertisingLog() {
        return advertisingNr;
    }
}
