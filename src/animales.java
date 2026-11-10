public abstract class animales {
    protected String nombre;
    protected int edad;
    protected String nombreDueno;

    public animales(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }

    public abstract double calcularCostoConsulta();

    public void imprimirFicha() {
        System.out.println("Animal: " + nombre + " | Edad: " + edad + " años | Dueño: " + nombreDueno
                + " | Costo consulta: $" + String.format("%,.0f", calcularCostoConsulta()));
    }
}