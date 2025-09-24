public class Empleado {

    // 🔒 Encapsulamiento: atributos privados
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // 🧮 Atributo estático para contar empleados y generar id automático
    private static int totalEmpleados = 0;

    // 🏗️ Constructor completo con todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // 🏗️ Constructor sobrecargado: solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados; // id automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000.0; // salario por defecto
    }

    // 🔧 Método sobrecargado: actualizar salario con porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    // 🔧 Método sobrecargado: actualizar salario con monto fijo
    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }

    // 📢 Método toString para mostrar la información
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: $" + salario;
    }

    // 📊 Método estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // 📥 Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}