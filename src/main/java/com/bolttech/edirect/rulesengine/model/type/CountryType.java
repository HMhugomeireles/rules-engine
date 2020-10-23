package com.bolttech.edirect.rulesengine.model.type;

public enum CountryType {
    HK_HK("hl-HK"),
    TH_TH("th-TH"),
    ;

    private String countryCode;

    CountryType(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
