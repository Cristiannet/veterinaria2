import java.util.ArrayList;
import java.util.List;

public class gato extends animales implements vacunas1, seguro {
    private boolean esEsterilizado;
    private List<String> vacunas = new ArrayList<>();

    public gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
    }

    @Override
    public double calcularCostoConsulta() {
        return 38000;
    }

    @Override
    public void registrarVacuna(String nombre) {
        vacunas.add(nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunas.size();
    }

    @Override
    public double calcularPrimaSeguro() {
        return esEsterilizado ? 120000 : 200000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-GATO-" + nombre.toUpperCase();
    }
}
