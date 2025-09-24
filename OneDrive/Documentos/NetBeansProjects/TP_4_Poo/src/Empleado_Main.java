public class Empleado_Main {
    public static void main(String[] args) {

        // Instanciación con salario personalizado
        Empleado e1 = new Empleado(101, "Ana", "Administrativa", 1200000);
        Empleado e2 = new Empleado(102, "Luis", "Docente", 700000);

        // Instanciación con constructor sobrecargado
        Empleado e3 = new Empleado("Carla", "Directora");
        Empleado e4 = new Empleado("Marcos", "Portero");

        // Ajustar salarios directamente
        e3.setSalario(1150000); // Carla a la par de Ana
        e4.setSalario(400000);  // Marcos más bajo

        // Mostrar información de cada empleado
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        // Mostrar total de empleados creados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}