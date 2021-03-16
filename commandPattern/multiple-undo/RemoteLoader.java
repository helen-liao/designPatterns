public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(5);

        // Light 1 in slot 0
        Light studyLight = new Light("study light");
        LightOnCommand studyLightOnCommand = new LightOnCommand(studyLight);
        LightOffCommand studyLightOffCommand = new LightOffCommand(studyLight);
        remoteControl.addCommand(0, studyLightOnCommand, studyLightOffCommand);

        // Television in slot 1
        Television tv = new Television("tv");
        TelevisionOnCommand televisionOnCommand = new TelevisionOnCommand(tv);
        TelevisionOffCommand televisionOffCommand = new TelevisionOffCommand(tv);
        remoteControl.addCommand(1, televisionOnCommand, televisionOffCommand);

        // Radio in slot 2
        Radio radio = new Radio("radio");
        RadioOnComand radioOnComand = new RadioOnComand(radio);
        RadioOffComand radioOffComand = new RadioOffComand(radio);
        remoteControl.addCommand(2, radioOnComand, radioOffComand);

        // Light 2 in slot 3
        Light kitchenLight = new Light("kitchen light");
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
        remoteControl.addCommand(3, kitchenLightOnCommand, kitchenLightOffCommand);

        // slot 4 is empty

        System.out.println(remoteControl.toString());

        System.out.println("-------- RANDOM --------\n");
        remoteControl.pressUndoCommand();
        remoteControl.pressOnCommand(2);
        remoteControl.pressOffCommand(1);
        remoteControl.pressUndoCommand();
        remoteControl.pressOnCommand(0);
        remoteControl.pressOnCommand(4);
        remoteControl.pressUndoCommand();
        remoteControl.pressUndoCommand();
        System.out.println("------------------------\n");

        System.out.println("----- PRESSING ON -----\n");
        remoteControl.pressOnCommand(1);
        remoteControl.pressOnCommand(3);
        remoteControl.pressOnCommand(4);
        System.out.println("------------------------\n");

        System.out.println("----- PRESSING OFF -----\n");
        remoteControl.pressOnCommand(2);
        remoteControl.pressOnCommand(1);
        remoteControl.pressOnCommand(0);
        System.out.println("------------------------\n");
    }
}
