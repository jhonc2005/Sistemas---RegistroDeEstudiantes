package ufps.principal;

import ufps.controlador.Controlador;
import ufps.modelo.Estudiante;
import ufps.vista.VerEstudiante;

public class Principal {
    public static void main(String[] args) {
        VerEstudiante vista = new VerEstudiante();
        Estudiante estudiante = new Estudiante();
        new Controlador(estudiante, vista);
    }
}
