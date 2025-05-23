public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[]{
                new Estudiante("Ana", 20, new double[]{8.5, 9.0, 7.5}),
                new Estudiante("Luis", 22, new double[]{6.0, 5.5}),
                new Estudiante("Marta", 19, new double[]{9.5, 10.0}),
                new Estudiante("Carlos", 21, new double[]{}) // Error: sin notas
        };
    /*  Codigo aññadido para pruebas
       double suma = GestorEstudiantes.calcularNotaMedia(estudiantes[3]);
       System.out.println("La nota de carlos es" + suma);*/

    Estudiante[] prueba = new  Estudiante[0];
    Estudiante pruebas = GestorEstudiantes.encontrarMejorEstudiante(prueba);

        System.out.println("Calculando el mejor estudiante...");
        Estudiante mejor = GestorEstudiantes.encontrarMejorEstudiante(estudiantes);
        System.out.println("El mejor estudiante es: " + mejor.getNombre()); // Posible NullPointerException

        System.out.println("Guardando resultados...");
        GestorEstudiantes.guardarResultados(estudiantes, "resultados.txt");

    }
}
