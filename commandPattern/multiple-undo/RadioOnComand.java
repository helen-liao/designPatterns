public class RadioOnComand implements Command{
    Radio radio;

    public RadioOnComand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.on();
    }

    @Override
    public void undo() {
        radio.off();
    }

    @Override
    public String toString() {
        return "ON: " + this.radio.getRadio();
    }
}
