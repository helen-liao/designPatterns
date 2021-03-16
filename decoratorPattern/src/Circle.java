public class Circle extends Shape{
    @Override
    public String getType() {
        return "CIRCLE";
    }
    @Override
    public void draw() {
        System.out.println("Drawing a " + this.getType());
    }

    @Override
    public void resize() {
        System.out.println("Resizing a " + this.getType());
    }

    @Override
    public void delete() {
        System.out.println("Deleting a " + this.getType());
    }
}
