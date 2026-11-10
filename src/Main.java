public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Luna", 3, "Carlos", "Labrador");
        gato gato = new gato("Misu", 2, "Ana", true);
        pajaro pajaro = new pajaro("Piolín", 1, "Sofía", 300);

        animales[] animales = { perro, gato, pajaro };
        for (animales a : animales) {
            a.imprimirFicha();
        }

        perro.registrarVacuna("Rabia");
        perro.registrarVacuna("Parvovirus");
        gato.registrarVacuna("Triple felina");
        System.out.println("Luna: " + perro.getVacunasAplicadas() + " vacunas");
        System.out.println("Misu: " + gato.getVacunasAplicadas() + " vacunas");

        clinica clinica = new clinica("VetCare", "Calle 10 # 5-20");
        seguro[] asegurables = { perro, gato, clinica };
        for (seguro s : asegurables) {
            System.out.println(s.obtenerNumeroPoliza() + " | Prima anual: $"
                    + String.format("%,.0f", s.calcularPrimaSeguro()));
        }


        animales[] animales2 = { perro, gato, pajaro, new conejo("Bunny", 1, "Pedro") };
        for (animales a : animales2) {
            a.imprimirFicha();
        }
    }
}
