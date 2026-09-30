package org.ssglobal.training.codes.itemDa;

public class USAddress implements IAddress {

    @Override
    public boolean validatePostalCode() {
        return false;
    }

    @Override
    public String getAddressDetails() {
        return null;
    }
}