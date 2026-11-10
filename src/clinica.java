public class clinica implements seguro {
    private String nombre;
    private String direccion;

    public clinica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 5000000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLINICA-" + nombre.toUpperCase();
    }
}
