public class Red extends ColorDecorator{
    public Red(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String getColor() {
        return "red";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + this. getColor() + " " + shape.getType());
    }

    @Override
    public void resize() {
        System.out.println("Resizing a " + this.getColor() + " " + shape.getType());
    }

    @Override
    public void delete() {
        System.out.println("Deleting a " + this.getColor() + " " + shape.getType());
    }
}
