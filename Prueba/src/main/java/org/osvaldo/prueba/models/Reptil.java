package org.osvaldo.prueba.models;

public class Reptil extends Animal{

    private String veneno;

    public Reptil(){
        super();
    }

    public Reptil(String veneno) {

        this.veneno = veneno;
    }

    public Reptil(String name, String cientificName, String descripcion, String veneno) {
        super(name, cientificName, descripcion);
        this.veneno = veneno;
    }

    public String getVeneno() {

        return veneno;
    }

    public void setVeneno(String veneno) {
        this.veneno = veneno;
    }

    @Override
    public String toString() {
        return "Reptil{" +
                "veneno='" + veneno + '\'' +
                ", name='" + name + '\'' +
                ", cientificName='" + cientificName + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
