package BehaviorPatterns.Iterator;

/**
* RemoteControl class is the actual remote control and it behaves and makes
* use of ChannelSurfer.
*/
public class RemoteController {
	private ChannelSurfer channelSurfer;
	private Setting setting;
	
	public RemoteController() {
		channelSurfer = new ChannelSurfer();
		setting = new Setting();
	}
	
	public Program getProgram(int currentChannel) {
		return new Program(channelSurfer.nextChannel(currentChannel));
	}
}
