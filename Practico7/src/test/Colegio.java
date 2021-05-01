
package test;
import entidades.*;


public class Colegio {

   
    public static void main(String[] args) {
        //a) crear las materias
        Materia ingles = new Materia(111, "Inglés 1", 1);
        Materia matematica = new Materia(222, "Matemáticas", 1);
        Materia laboratorio = new Materia(333, "Laboratorio 1", 1);
        
        //b)crear 2 alumnos
        Alumno lopez= new Alumno (1001, "Lopez", "Martin");
        Alumno martinez = new Alumno(111111, "Martinez", "Brenda");
        
        //c) Inscribir a lopez a 3 materias
        lopez.agregarMateria(ingles);
        lopez.agregarMateria(matematica);
        lopez.agregarMateria(laboratorio);
        
        //d) inscribir a martinez a 4 materias
        martinez.agregarMateria(matematica);
        martinez.agregarMateria(ingles);
        martinez.agregarMateria(laboratorio);
        martinez.agregarMateria(laboratorio);
        
        //e) visualizar la cantidad de materias en la que esta inscripto cada uno
        System.out.println("cantidad de materias de lopez: "+lopez.cantidadMaterias());
        System.out.println("cantidad de materias de martinez: "+martinez.cantidadMaterias());
    }
    
}
