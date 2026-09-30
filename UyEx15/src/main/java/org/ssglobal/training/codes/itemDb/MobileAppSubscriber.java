package org.ssglobal.training.codes.itemDb;

public class MobileAppSubscriber implements ISubscriber {
    private String feedContent;

    @Override
    public void update(String content) {
        this.setFeedContent(content);
    }

    @Override
    public void pullContent(SiriuxXMStation station) {
        this.setFeedContent(station.getContent());
    }

	public String getFeedContent() {
		return feedContent;
	}

	public void setFeedContent(String feedContent) {
		this.feedContent = feedContent;
	}
}