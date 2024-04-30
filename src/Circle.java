public class Circle extends Figure {

    double radio;

    public Circle(double radio){
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}
