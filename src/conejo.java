public class conejo extends animales {
    public conejo(String nombre, int edad, String nombreDueno) {
        super(nombre, edad, nombreDueno);
    }

    @Override
    public double calcularCostoConsulta() {
        return 35000;
    }
}
