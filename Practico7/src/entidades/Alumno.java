
package entidades;

import java.util.HashSet;
import javax.swing.JOptionPane;


public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet <Materia> materias= new HashSet <>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public void agregarMateria(Materia materia){
        if(materias.add(materia)){
            JOptionPane.showMessageDialog(null, "El alumno inscripto con exíto");
        }
        else{
            JOptionPane.showMessageDialog(null, "El alumno ya esta inscripto en esta materia");
        }
    }
    
    public int cantidadMaterias(){
        return(materias.size());
    }
    
    public String toString(){
        return(apellido+" "+nombre);
    }

    @Override
    public int hashCode() {
        return(legajo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
    
    
}
