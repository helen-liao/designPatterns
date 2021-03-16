public class RemoteControl{
    private Command[] onSlots;
    private Command[] offSlots;
    private Command undo;

    public RemoteControl(int slots) {
        onSlots = new Command[slots];
        offSlots = new Command[slots];
    }

    public void addCommand(int slot, Command onCommand, Command offCommand) {
        onSlots[slot] = onCommand;
        offSlots[slot] = offCommand;
        undo = null;
    }

    public void pressOnCommand(int slot) {
        if (onSlots[slot] != null) {
            onSlots[slot].execute();
            undo = onSlots[slot];
        }
        else
            System.out.println("No on command added for slot " + slot + "\n");
    }

    public void pressOffCommand(int slot) {
        if (offSlots[slot] != null) {
            onSlots[slot].execute();
            undo = offSlots[slot];
        }
        else
            System.out.println("No off command added for slot " + slot + "\n");
    }

    public void pressUndoCommand() {
        System.out.println("Undoing: ");
        if (undo == null)
            System.out.println("No command to undo\n");
        else
            undo.execute();
    }

    @Override
    public String toString(){
        StringBuilder remoteControl = new StringBuilder();

        remoteControl.append("----- REMOTE CONTROL -----\n");

        for (int i=0; i<onSlots.length; i++){
            remoteControl.append("Slot ").append(i);
            if(onSlots[i] != null)
                remoteControl.append(onSlots[i].toString() + "\t\t");
            else
                remoteControl.append("ON: Empty" + "\t\t");
            if(offSlots[i] != null)
                remoteControl.append(offSlots[i].toString());
            else
                remoteControl.append("OFF: Empty");
            remoteControl.append("\n");
        }

        remoteControl.append("--------------------------\n");

        return remoteControl.toString();
    }
}
