package org.osvaldo.prueba.models;

public class Ave extends Animal{ //Ave aplica la herencia de la clase Padre Animal.

    private String vuela; //Creamos el atributo de la clase padre.

    public Ave(String name, String cientificName, String descripcion, String vuela) { //Creamos un constructor con los parametros
        //de la clase padre con el de la clase Ave.
        super(name, cientificName, descripcion);
        this.vuela = vuela;
    }

    public String getVuela() {
        return vuela;
    }

    public void setVuela(String vuela) {
        this.vuela = vuela;
    }


    @Override
    public String toString() { //Usamos to String para imprimir los datos.
        return "Ave{" +
                "vuela='" + vuela + '\'' +
                ", name='" + name + '\'' +
                ", cientificName='" + cientificName + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
