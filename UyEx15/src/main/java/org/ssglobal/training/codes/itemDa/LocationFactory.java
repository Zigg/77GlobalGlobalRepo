package org.ssglobal.training.codes.itemDa;

public abstract class LocationFactory {
    public abstract IAddress createAddress();
    public abstract IPhoneNumber createPhoneNumber();
}