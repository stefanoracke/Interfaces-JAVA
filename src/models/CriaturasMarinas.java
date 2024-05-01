package models;

public abstract class CriaturasMarinas {

    //Attributes
    String name;

    public CriaturasMarinas(String name){
        this.name = name;
    }

    abstract void nadar();
}
