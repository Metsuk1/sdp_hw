package concrete_implementation;

import interfaces.Device;

/**
 * Radio - concrete implementation of Device.
 * Supports power, volume, and station (channel) operations.
 */
public class Radio implements Device {
    private boolean on = false;
    private int volume = 5;
    private int station = 90;

    @Override
    public void powerOn() {
        on = true;
        System.out.println("Radio is on");
    }

    @Override
    public void powerOff() {
        on = false;
        System.out.println("Radio turned off");
    }

    @Override
    public void setVolume(int value) {
        volume = value;
        System.out.println("Radio volume: " + volume);
    }

    @Override
    public void setChannel(int value) {
        station = value;
        System.out.println("Radio station: " + station + " FM");
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
        return station;
    }
}
