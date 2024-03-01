package org.osvaldo.prueba.models;

public class Animal { //Clase Padre

    protected String name; //Creamos los atributos
    protected String cientificName;

    protected String descripcion;

    //Agregamos el modificador de acceso para hacer la Herencia

    public Animal(){ //Creamos un constructor vacio, para no llamar algun atributo.

    }

    //Creamos getters y setter para obtener y definir.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCientificName() {
        return cientificName;
    }

    public void setCientificName(String cientificName) {
        this.cientificName = cientificName;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
//Cramos setters y getters


    public Animal(String name, String cientificName, String descripcion) { //Metodo constructor con los parametros definidos.
        this.name = name;
        this.cientificName = cientificName;
        this.descripcion = descripcion;
    }

}
