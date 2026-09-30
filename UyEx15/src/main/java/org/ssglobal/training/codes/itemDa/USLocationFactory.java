package org.ssglobal.training.codes.itemDa;

public class USLocationFactory extends LocationFactory {

    @Override
    public IAddress createAddress() {
        return new USAddress();
    }

    @Override
    public IPhoneNumber createPhoneNumber() {
        return new USPhoneNumber();
    }
}