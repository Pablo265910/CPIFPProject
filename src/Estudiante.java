import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5e944707-ba23-4d3b-b85f-a4a7d52c4bac")
public class Estudiante {
    @objid ("81db755f-9b61-4d19-96e2-c21e40e284e8")
    private String nombre;

    @objid ("fe4044fd-57aa-441d-a7a6-e53d358bfa73")
    private String identificador;

    @objid ("582af8c2-ccf5-4de2-a829-bae60775ff82")
    private CPIFP cpifp;

    @objid ("cfe97116-31bd-4ca0-a791-d49dfdb5999b")
    private List<Modulo> listaModulos = new ArrayList<Modulo> ();

    @objid ("b426b016-b889-4ef7-8f72-888eb42bcd6c")
    public CPIFP getCpifp() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.cpifp;
    }

    @objid ("1c4da880-a756-4525-9622-e1ff44f3f308")
    public void setCpifp(final CPIFP value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.cpifp = value;
    }

    @objid ("b81fbd97-cbbd-48bd-ae59-e44108ab0d94")
    public List<Modulo> getListaModulos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaModulos;
    }

    @objid ("4ad02150-4459-49d9-99a8-d38575f57dad")
    public void setListaModulos(final List<Modulo> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaModulos = value;
    }

}
