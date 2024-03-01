package org.osvaldo.prueba.models;

public class Mamifero extends Animal{

    private String nadar;

    public Mamifero (){
        super();
    }

    public Mamifero(String name, String cientificName, String descripcion, String nadar) {
        super(name, cientificName, descripcion);
        this.nadar = nadar;
    }

    public String getNadar() {
        return nadar;
    }

    public void setNadar(String nadar) {
        this.nadar = nadar;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "nadar='" + nadar + '\'' +
                ", name='" + name + '\'' +
                ", cientificName='" + cientificName + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
