package models;

import interfaces.Alimentable;
import interfaces.Comunicacion;

public class Dolphine extends CriaturasMarinas implements Comunicacion, Alimentable{

    public Dolphine(String name){
        super(name);
    }

    @Override 
    public void nadar(){
        System.out.println(name + " the Dolphine swim!");
    }

    @Override
    public void comunicarse() {
        System.out.println("Se comunica mediante ruidos y movimientos");
    }

    @Override
    public void alimentar(int numeroDePeces) {
        System.out.println("Se ha alimentado a " + name + " con " + numeroDePeces + " peces.");
    }

    

}
