package org.ssglobal.training.codes.itemDb;

public class WebPlayerSubscriber implements ISubscriber {
    private String currentTrack;

    @Override
    public void update(String content) {
        this.setCurrentTrack(content);
    }

    @Override
    public void pullContent(SiriuxXMStation station) {
        this.setCurrentTrack(station.getContent());
    }

	public String getCurrentTrack() {
		return currentTrack;
	}

	public void setCurrentTrack(String currentTrack) {
		this.currentTrack = currentTrack;
	}
}