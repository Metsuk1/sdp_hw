package interfaces;

/**
 * Device interface - defines the basic operations for all devices.
 * Abstraction for concrete implementations (TV, Radio, SmartSpeaker).
 */
public interface Device {
    void powerOn();
    void powerOff();
    void setVolume(int value);
    void setChannel(int value);
    boolean isOn();
    int getVolume();
    int getChannel();
}
