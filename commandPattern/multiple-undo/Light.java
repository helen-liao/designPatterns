public class Light {
    private String light;

    public Light (String light) {
        this.light = light;
    }

    public String getLight() {
        return light;
    }

    public void on() {
        System.out.println("Turning the " + this.light + " on \n");
    }

    public void off() {
        System.out.println("Turning the " + this.light + " off \n");
    }
}
