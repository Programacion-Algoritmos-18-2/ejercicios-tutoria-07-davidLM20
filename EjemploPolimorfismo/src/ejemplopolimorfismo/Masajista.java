/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

/**
 *
 * @author reroes
 */
public class Masajista extends PersonaEquipo {

    private String titulacion;

   // constructor, getter y setter
    public Masajista(int id, String nombre, String apellidos, int edad, String tit) {
        super(id, nombre, apellidos, edad);
        setTitulacion(tit);
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String tit) {
        titulacion = tit;
    }

    @Override
    public void entrenamiento() {
        System.out.printf("%s %s, da asistencia en el entrenamiento(Clase Masajista). Su titulo es %s\n", super.getNombre(), super.getApellidos(), getTitulacion());
        //Raúl Martinez, da asistencia en el entrenamiento (Clase Masajista). Su título es Licenciado en Fisioterapia
    }

    public void darMasaje() {
        System.out.println("Da un Masaje");
    }
}
