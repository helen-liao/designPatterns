public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle();
        shape1.draw();
        shape1.resize();
        shape1.delete();

        Shape shape2 = new Circle();
        shape2.draw();
        shape2 = new Green(shape2);
        shape2.draw();
        shape2.resize();
        shape2.delete();
    }
}
