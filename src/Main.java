import abstraction.AdvancedRemoteControl;
import concrete_implementation.Radio;
import concrete_implementation.SmartSpeaker;
import concrete_implementation.TV;
import interfaces.Device;

/**
 * BridgePatternDemo - client code.
 * Demonstrates controlling different devices through the Bridge pattern.
 */
public class Main {
    public static void main(String[] args) {
        //create instances of objects
        Device tv = new TV();
        Device radio = new Radio();
        Device speaker = new SmartSpeaker();

        //Manages TV
        System.out.println("\n--- Manages TV ---");
        AdvancedRemoteControl remoteTv = new AdvancedRemoteControl(tv);
        remoteTv.togglePower();
        remoteTv.volumeUp();
        remoteTv.channelUp();
        remoteTv.togglePower();

        //Manages Radio
        System.out.println("\n--- Manages Radio ---");
        AdvancedRemoteControl remoteRadio = new AdvancedRemoteControl(radio);
        remoteRadio.togglePower();
        remoteRadio.volumeDown();
        remoteRadio.channelUp();

        //Manages Smart Speaker
        System.out.println("\n--- Manages Smart Speaker ---");
        AdvancedRemoteControl remoteSpeaker = new AdvancedRemoteControl(speaker);
        remoteSpeaker.togglePower();
        remoteSpeaker.volumeUp();
        remoteSpeaker.channelUp(); // Smart Speaker does not supporting channels
    }
}
