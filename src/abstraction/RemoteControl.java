package abstraction;

import interfaces.Device;

/**
 * RemoteControl - abstraction layer.
 * Provides basic control for any Device (turn on/off).
 */
public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isOn()) {
            device.powerOff();
        } else {
            device.powerOn();
        }
    }
}
