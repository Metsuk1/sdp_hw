package concrete_implementation;

import interfaces.Device;

/**
 * TV - concrete implementation of Device.
 * Supports power, volume, and channel operations.
 */
public class TV implements Device {
    private boolean on = false;
    private  int volume = 10;
    private int channel  = 1;


    @Override
    public void powerOn() {
        on = true;
        System.out.println("TV turned on");
    }

    @Override
    public void powerOff() {
        on = false;
        System.out.println("TV turned off");
    }

    @Override
    public void setVolume(int value) {
        volume = value;
        System.out.println("TV volume: " + volume);
    }

    @Override
    public void setChannel(int value) {
        channel = value;
        System.out.println(" TV channel: " + channel);
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
        return channel;
    }
}

