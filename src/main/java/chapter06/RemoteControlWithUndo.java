package chapter06;

public class RemoteControlWithUndo {
    private final int Slot_COUNT = 7;

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo() {
        this.onCommands = new Command[Slot_COUNT];
        this.offCommands = new Command[Slot_COUNT];

        Command noCommand = new NoCommand();
        for (int i = 0; i < Slot_COUNT; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n--리모컨--\n");
        for (int i = 0; i < Slot_COUNT; i++) {
            stringBuff.append("[slot ")
                    .append(i)
                    .append("]")
                    .append(onCommands[i].getClass().getName())
                    .append("   ")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }
        stringBuff.append("[undo]")
                .append(undoCommand.getClass().getName())
                .append("\n");
        return stringBuff.toString();
    }
}
