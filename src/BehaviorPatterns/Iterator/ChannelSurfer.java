package BehaviorPatterns.Iterator;


/**
* ChannelSurfer is a part of remote control which implements the Iterator
* interface. This class overrides the nextChannel and prevChannel methods.
*/
public class ChannelSurfer implements Iterator{

	@Override
	public Channel nextChannel(int currentChannel) {
		Channel channel = new Channel(currentChannel + 1);
		return channel;
	}

	@Override
	public Channel prevChannel(int currentChannel) {
		Channel channel = new Channel(currentChannel - 1);
		return channel;
	}
	
}
