package concrete_implementation;

import interfaces.Device;

/**
 * SmartSpeaker - concrete implementation of Device.
 * Supports power and volume, but does not support channels.
 */
public class SmartSpeaker implements Device {
    private boolean on = false;
    private int volume = 7;

    @Override
    public void powerOn() {
        on = true;
        System.out.println("SmartSpeaker is on");
    }

    @Override
    public void powerOff() {
        on = false;
        System.out.println("Smart Speaker is off");
    }

    @Override
    public void setVolume(int value) {
        volume = value;
        System.out.println("Smart Speaker volume: " + volume);
    }

    @Override
    public void setChannel(int value) {
        System.out.println("Smart speaker does not support setChannel!");
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public int getChannel() {
        return -1; // no channels
    }

}
