package Bridge.remotes;

import Bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {
    protected Device device;

    public AdvancedRemote(Device device) {
        this.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        this.device.setVolume(0);
    }
}
