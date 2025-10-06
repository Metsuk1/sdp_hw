package abstraction;

import interfaces.Device;

/**
 * AdvancedRemoteControl - refined abstraction.
 * Extends RemoteControl with volume and channel operations.
 */
public class AdvancedRemoteControl extends RemoteControl {

    //call the parent constructor
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }

    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }
}
