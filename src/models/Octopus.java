package models;

import interfaces.Alimentable;
import interfaces.Comunicacion;

public class Octopus extends CriaturasMarinas implements Comunicacion, Alimentable{

    public Octopus(String name){
        super(name);
    }

    @Override
    public void nadar() {
        System.out.println(name + " the octopus swim with its tentaclees");
    }

    @Override
    public void comunicarse() {
        System.out.println("Se comunica mediante movimientos");
    }

    @Override
    public void alimentar(int numeroCangrejos) {
        System.out.println("Se ha alimentado a " + name + " con " + numeroCangrejos + " cangrejos.");
    }

}
