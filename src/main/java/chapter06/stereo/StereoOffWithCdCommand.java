package chapter06.stereo;

import chapter06.Command;
import chapter06.light.Light;
import chapter06.light.LightOffCommand;

public class StereoOffWithCdCommand implements Command {
    Stereo stereo;

    public StereoOffWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
