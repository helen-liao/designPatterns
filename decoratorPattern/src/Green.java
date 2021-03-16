public class Green extends ColorDecorator{
    public Green(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String getColor() {
        return "green";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + this.getColor() + " " + shape.getType());
    }

    @Override
    public void resize() {
        System.out.print("Resizing a " + this.getColor() + " " + shape.getType());
    }

    @Override
    public void delete() {
        System.out.println("Deleting a " + this.getColor() + " " + shape.getType());
    }
}
