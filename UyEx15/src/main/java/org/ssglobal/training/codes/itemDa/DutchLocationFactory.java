package org.ssglobal.training.codes.itemDa;

public class DutchLocationFactory extends LocationFactory {

    @Override
    public IAddress createAddress() {
        return new DutchAddress();
    }

    @Override
    public IPhoneNumber createPhoneNumber() {
        return new DutchPhoneNumber();
    }
}