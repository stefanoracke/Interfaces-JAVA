public class App {
    public static void main(String[] args) throws Exception {

        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(2, 4);

        System.out.println("El area del circulo es: " + circle.calcularArea());
        System.out.println("El area del rectángulo es: " + rectangle.calcularArea());
        rectangle.imprimirInfo();
    }
}
