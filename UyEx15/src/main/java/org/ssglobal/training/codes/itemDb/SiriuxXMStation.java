package org.ssglobal.training.codes.itemDb;

import java.util.ArrayList;
import java.util.List;

public class SiriuxXMStation implements IObservable {
    private List<ISubscriber> subscribers = new ArrayList<>();
    private String latestContent;

    @Override
    public void addSubscriber(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (ISubscriber subscriber : subscribers) {
            subscriber.update(latestContent);
        }
    }

    public void pushContent(String content) {
        this.latestContent = content;
        notifySubscribers();
    }

    public String getContent() {
        return this.latestContent;
    }
}