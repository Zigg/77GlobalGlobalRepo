package org.ssglobal.training.codes.itemDb;

public class CarRadioSubscriber implements ISubscriber {
	private String currentStream;

    @Override
    public void update(String content) {
        this.currentStream = content;
    }

    @Override
    public void pullContent(SiriuxXMStation station) {
        this.currentStream = station.getContent();
    }

	public String getCurrentStream() {
		return currentStream;
	}

	public void setCurrentStream(String currentStream) {
		this.currentStream = currentStream;
	}
    

}
