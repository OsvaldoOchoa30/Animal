package org.osvaldo.prueba.models;

import java.util.ArrayList;

public class Wikipedia {

    private ArrayList<Animal> listAnimal = new ArrayList(); //Arraylist de la clase Animal.


    public ArrayList<Animal> getListAnimal() {
        return listAnimal;
    } //Mando a llamar el contenido de la lista.

    public void setListAnimal(ArrayList<Animal> animal) {
        listAnimal = animal;
    }
    public boolean addAnimal(Animal animals){
        return listAnimal.add(animals);
    } //Agregar a la lista

    public boolean eliminarAnimal(String nombre){ //Metodo para eliminar animales creados.
        boolean encontrado = false;
        for (int i = 0; i < listAnimal.size(); i++) {
            if(listAnimal.get(i).getName().equals(nombre)) {
                encontrado = true;
                listAnimal.remove(i);
            }
        }
        return encontrado;
    }
}
