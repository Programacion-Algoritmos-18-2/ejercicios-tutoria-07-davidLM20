/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class EjemploPolimorfismo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<PersonaEquipo> integrantes = new ArrayList<PersonaEquipo>();
        
        Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
        Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Volante Derecho");
        Masajista raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia");
        
        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        // ENTRENAMIENTO
        System.out.println("\nEntrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
        for (PersonaEquipo integrante : integrantes) {
            //System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.entrenamiento();
        }

        /*for (int i = 0; i < integrantes.size(); i++) {
            integrantes.get(i).entrenamiento();
            
        }*/

    }

}
