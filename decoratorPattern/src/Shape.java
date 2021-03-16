public abstract class Shape {
    private String type = "Unknown";

    public String getType(){
        return this.type;
    }

    public abstract void draw();
    public abstract void resize();
    public abstract void delete();
}

