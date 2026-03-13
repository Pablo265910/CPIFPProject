import java.util.ArrayList;
import java.util.List;


public class Modulo {
    private String nombre;
    private String identificador;
    private List<Profesor> listaProfesores = new ArrayList<Profesor> ();
    private List<Estudiante> listaEstudiantes = new ArrayList<Estudiante> ();
    private Departamento departamento;

    public List<Profesor> getListaProfesores() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaProfesores;
    }

    public void setListaProfesores(final List<Profesor> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaProfesores = value;
    }

}
