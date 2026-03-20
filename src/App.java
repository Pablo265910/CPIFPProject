public class App {
    public static void main(String[] args) throws Exception {
        CPIFP cpif = new CPIFP("Alan Turing", "Calle Frederick Terman", "123456789");
        Estudiante estudiante1 = new Estudiante("Pepe", "1A");
        Estudiante estudiante2 = new Estudiante("Juan", "2B");
        Estudiante estudiante3 = new Estudiante("María", "3C");

        cpif.añadirEstudiante(estudiante1);
        cpif.añadirEstudiante(estudiante2);
        cpif.añadirEstudiante(estudiante3);

        Departamento departamento1 = new Departamento("Departamento de matemáticas");
        Departamento departamento2 = new Departamento("Departamento de programación");
        Profesor profesor1 = new Profesor("Juan", "Matemáticas");
        Profesor profesor2 = new Profesor("Julia", "Programación");
        Profesor profesor3 = new Profesor("Carmen", "Matemáticas");
        Profesor profesor4 = new Profesor("Ismael", "Programación");
        
        departamento1.añadirProfesor(profesor1);
        departamento1.añadirProfesor(profesor3);
        departamento1.setJefe(profesor1);

        departamento2.añadirProfesor(profesor2);
        departamento2.añadirProfesor(profesor4);
        departamento2.setJefe(profesor4);
        
        cpif.añadirDepartamento(departamento1);
        cpif.añadirDepartamento(departamento2);
        
        System.out.println(cpif);
        System.out.println(cpif.getListaDepartamento());
        System.out.println(cpif.getListaEstudiante());
    }
}
