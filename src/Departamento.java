import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("782fed87-83aa-48dd-afb4-65644ee0e6ec")
public class Departamento {
    @objid ("dc392425-f72d-45e8-852b-c1ca3ac66331")
    private String nombre;

    @objid ("d41c9669-0c30-4ed1-9972-054ec58562e4")
    private CPIFP cpifp;

    @objid ("a12a2c84-7eb4-4433-aa9d-273b13395a91")
    private List<Modulo> listaModulos = new ArrayList<Modulo> ();

    @objid ("988fb872-373f-42ec-bb08-2c8f84475e8e")
    private List<Profesor> listaProfesores = new ArrayList<Profesor> ();

    @objid ("9c72a353-f95c-41b4-b4d5-aebb053eb1f4")
    private Profesor jefe;

    @objid ("a14e390b-af00-43b0-a454-60200798e2e0")
    public void añadirProfesor(final Profesor profesor) {
        this.listaProfesores.add(profesor);
    }

    @objid ("c2ddfb61-6f89-4253-80ba-9494e296395a")
    public void quitarProfesor(final Profesor profesor) {
    }

    @objid ("5d603e76-56d9-4b48-b22d-23ae924c94d7")
    public Profesor getProfesor(final String nombre) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("ebb3abc1-e000-4a7e-8b1e-8a16dfcf37cc")
    public List<Profesor> getListaProfesor() {
        // TODO Auto-generated return
        return listaProfesores;
    }

    @objid ("fb3abac2-1a51-4a34-bb33-acb86830f2f9")
    public List<Modulo> getListaModulos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaModulos;
    }

    @objid ("a5027e18-55a1-4c71-8274-952ac60f89d9")
    public void setListaModulos(final List<Modulo> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaModulos = value;
    }

    @objid ("12fe14ef-c300-4eb4-8e8e-7f216468660a")
    public Profesor getJefe() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.jefe;
    }

    @objid ("05c02cf5-2605-4096-9181-cdcc609234a5")
    public void setJefe(final Profesor value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.jefe = value;
    }

    @objid ("c8969e97-aca6-4930-a355-54c617c688b6")
    public CPIFP getCpifp() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.cpifp;
    }

    @objid ("dc1d4fe5-47ab-4fc0-99ec-61e75ae4d475")
    public void setCpifp(final CPIFP value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.cpifp = value;
    }

    @objid ("4ca62d73-551a-4c0d-807e-07c770f2b622")
    public Departamento(final String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return String.format("Nombre del departamento: %s\nDatos del jefe: %s\nDatos de los profesores: %s\n",this.nombre, getJefe(), getListaProfesor());
    }
}
