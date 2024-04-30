public class Rectangle extends Figure {

    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calcularArea() {
        return width * height;
    }

}
