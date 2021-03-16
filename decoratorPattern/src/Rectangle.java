public class Rectangle extends Shape{
    @Override
    public String getType() {
        return "RECTANGLE";
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
