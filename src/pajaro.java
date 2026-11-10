public class pajaro extends animales {
    private double pesoGramos;

    public pajaro(String nombre, int edad, String nombreDueno, double pesoGramos) {
        super(nombre, edad, nombreDueno);
        this.pesoGramos = pesoGramos;
    }

    @Override
    public double calcularCostoConsulta() {
        return 28000 + 100 * pesoGramos;
    }
}
