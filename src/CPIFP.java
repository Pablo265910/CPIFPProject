import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ab338505-81c2-495d-a73b-3704f230b6e8")
public class CPIFP {
    @objid ("41ee2652-a7c3-4629-81c5-dbfd63cb905b")
    private String nombre;

    @objid ("f9238422-20af-43ee-8d39-156ffd9be39b")
    private String direccion;

    @objid ("0c6bd6db-5eb9-45ab-b2b7-df265ca6d660")
    private String telefono;

    @objid ("d4a6bc93-99f9-4ed8-bf67-6e62bec1b9fc")
    private List<Estudiante> listaEstudiantes = new ArrayList<Estudiante> ();

    @objid ("54adfb3b-1054-4097-99cb-feaba53e96c6")
    private List<Departamento> listaDepartamentos = new ArrayList<Departamento> ();

    @objid ("27203417-66ff-4c01-941b-13793e4bb67f")
    public void añadirEstudiante(final Estudiante Estudiante) {
    }

    @objid ("2241061f-2851-4fbd-b403-d1911e842156")
    public void quitarEstudiante(final Estudiante estudiante) {
    }

    @objid ("6c4f9a84-6a2b-4492-9158-9932f2c818bf")
    public void añadirDepartamento(final Departamento departamento) {
    }

    @objid ("584c7af5-d7e0-404f-a1df-63cbe6aa1ed6")
    public void quitarDepartamento(final Departamento Departamento) {
    }

    @objid ("c8c9e282-c4aa-4ec8-92b5-c2aa5734f79f")
    public Estudiante getEstudiante(final String nombre) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("5d753d77-d368-489b-814e-0a07f755120a")
    public Departamento getDepartamento(final String nombre) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("facfc82a-2ebc-45ec-94da-19e7f7334a5c")
    public List<Departamento> getListaDepartamento() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("fd91e1a6-bde6-4de9-a9de-89b31dc53c29")
    public List<Estudiante> getListaEstudiante() {
        // TODO Auto-generated return
        return null;
    }

}
