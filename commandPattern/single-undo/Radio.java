public class Radio {
    private String radio;
    private int volume;

    public Radio(String radio) {
        this.radio = radio;
        this.volume = 0;
    }

    public String getRadio() {
        return this.radio;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void on() {
        System.out.println("Turning " + this.radio + " on");
        setVolume(5);
        System.out.println("Setting the volume to " + getVolume() + "\n");
    }

    public void off() {
        System.out.println("Turning the " + this.radio + " off \n");
    }
}
