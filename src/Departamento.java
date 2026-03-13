import java.util.ArrayList;
import java.util.List;


public class Departamento {
    private String nombre;
    private CPIFP cpifp;
    private List<Modulo> listaModulos = new ArrayList<Modulo> ();
    private List<Profesor> listaProfesores = new ArrayList<Profesor> ();
    private Profesor jefe;


    public void añadirProfesor(final Profesor profesor) {
    }

    public void quitarProfesor(final Profesor profesor) {
    }

    public Profesor getProfesor(final String nombre) {
        // TODO Auto-generated return
        return null;
    }

    public List<Profesor> getListaProfesor() {
        // TODO Auto-generated return
        return null;
    }

    public List<Modulo> getListaModulos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaModulos;
    }

    public void setListaModulos(final List<Modulo> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaModulos = value;
    }

    public Profesor getJefe() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.jefe;
    }

    public void setJefe(final Profesor value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.jefe = value;
    }

    public CPIFP getCpifp() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.cpifp;
    }

    public void setCpifp(final CPIFP value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.cpifp = value;
    }

}
