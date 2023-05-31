package chapter06.ceilingFan;

import chapter06.Command;

public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
            return;
        }
        if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
            return;
        }
        if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
            return;
        }
        if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
