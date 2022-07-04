package com.fasttrackit.Exercise1;

import java.util.List;

public class Company {

    private List<AdvertisingProvider> advertisingProviders;

    public Company(List<AdvertisingProvider> advertisingProviders) {
        this.advertisingProviders = advertisingProviders;
    }

    public void advertiseWith(String name) {
        for (AdvertisingProvider advertisingProvider : advertisingProviders) {
            if (advertisingProvider.getName().equals(name)) {
                System.out.println(advertisingProvider.advertisedAsRequired());
            }
        }
    }

    public void printReport() {
        for (AdvertisingProvider advertisingProvider : advertisingProviders) {
            System.out.println("Advertised via: " + advertisingProvider.getName() + " - " + advertisingProvider.advertisingLog() + " times");
        }
    }


}
