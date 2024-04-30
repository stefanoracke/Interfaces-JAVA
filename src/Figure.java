public abstract class Figure{

    //Este comportamiento sera obligatorio en clases heredadas de figura
    abstract double calcularArea();

    void imprimirInfo(){
        System.out.println("Esta información viene de la clase abstracta");
    }

}