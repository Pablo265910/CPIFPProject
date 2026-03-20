import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("abdae7c4-4455-4c3a-b89b-0e8c7be2f5db")
public class Profesor {
    @objid ("7a0f3548-736d-4f52-9f19-aec8da28eca5")
    private String nombre;

    @objid ("8a41b0c2-9c59-4bc8-9a2b-39b55434d31c")
    private String especialidad;

    @objid ("ef072c65-25db-4def-bbfa-fbc88031b56b")
    private List<Modulo> listaModulos = new ArrayList<Modulo> ();

    @objid ("a209ad17-ee09-4488-8125-79d2153130fd")
    private Departamento esJefe;

    @objid ("9779ca0e-8300-4ec2-ad9e-e1c3faa6032b")
    private Departamento departamento;

    @objid ("c26cc55c-202c-4f9a-878b-db77d7e8f744")
    public Departamento getDepartamento() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.departamento;
    }

    @objid ("0793de49-5348-4ceb-9d90-5609ec63dd30")
    public void setDepartamento(final Departamento value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.departamento = value;
    }

    @objid ("514d6678-d453-4e55-a00f-f4af8c0fb52b")
    public Profesor(final String nombre, final String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString(){
        return String.format("Nombre: %s Especialidad: %s", this.nombre, this.especialidad);
    }
}
