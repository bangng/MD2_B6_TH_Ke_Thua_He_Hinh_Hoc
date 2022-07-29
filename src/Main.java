public class Main {
    public static void main(String[] args) {
        System.out.println("============Shape=========");

        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);

        System.out.println("===========Circle============");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        System.out.println("================Rectangle===========");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(3.3, 5.5);
        System.out.println(rectangle);
        rectangle = new Rectangle(3.3, 5.5, "Orange", true);
        System.out.println(rectangle);
    }
}
