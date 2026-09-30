package org.ssglobal.training.codes.itemDb;

public interface ISubscriber {
	void update(String content);
    void pullContent(SiriuxXMStation station);
}
