
class Persona {
    private int id;
    private String nombre;
    private int edad;
    private double salario;

    // Constructor
    public Persona(int id, String nombre, int edad, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    // Método para mostrar la información de la persona
    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }
}
