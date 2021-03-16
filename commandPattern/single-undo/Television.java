public class Television {
    private String television;
    private int channel;
    private int volume;

    public Television(String television) {
        this.television = television;
        this.channel = 0;
        this.volume = 0;
    }

    public String getTelevision() {
        return this.television;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return this.channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void on() {
        System.out.println("Turning the " + this.television + " on");
        setChannel(7);
        System.out.println("Setting the channel to " + getChannel());
        setVolume(10);
        System.out.println("Setting the volume to " + getVolume() + "\n");
    }

    public void off() {
        System.out.println("Turning the " + this.television + " off \n");
    }
}
