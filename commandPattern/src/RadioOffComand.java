public class RadioOffComand implements Command{
    private Radio radio;

    public RadioOffComand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.off();
    }

    @Override
    public void undo() {
        radio.on();
    }

    @Override
    public String toString() {
        return "OFF: " + this.radio.getRadio();
    }
}
