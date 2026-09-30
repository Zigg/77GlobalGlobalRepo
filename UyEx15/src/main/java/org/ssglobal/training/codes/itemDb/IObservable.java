package org.ssglobal.training.codes.itemDb;

public interface IObservable {
	void addSubscriber(ISubscriber subscriber);
    void removeSubscriber(ISubscriber subscriber);
    void notifySubscribers();

}
