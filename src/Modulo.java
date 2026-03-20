import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5449861b-60ba-40f2-ba02-e5a6611fac2f")
public class Modulo {
    @objid ("001e8eb6-473f-4120-b72b-06582bb58fcc")
    private String nombre;

    @objid ("8dc7c764-171f-476f-9894-d24039d89a71")
    private String identificador;

    @objid ("96423cc9-feb3-4a14-b9c6-400bafb7861e")
    private List<Profesor> listaProfesores = new ArrayList<Profesor> ();

    @objid ("20af4eb3-ea12-47c4-aa0b-b4c332196f0c")
    private List<Estudiante> listaEstudiantes = new ArrayList<Estudiante> ();

    @objid ("b606ebc8-ffe8-4f31-b465-7b7289f9cfa3")
    private Departamento departamento;

    @objid ("d2b153d8-316e-4eb8-9c25-abb3df2ba710")
    public List<Profesor> getListaProfesores() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaProfesores;
    }

    @objid ("b567b096-e9ae-4f4b-afc1-e85bd71b878d")
    public void setListaProfesores(final List<Profesor> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaProfesores = value;
    }

}
