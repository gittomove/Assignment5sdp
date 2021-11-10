public class InstrumentTest {
    public static void main(String[] args) {
        Dombra dombra = new Dombra();
        Guitar guitar = new Guitar();
        MusicalInstrument guitarAdapter = new GuitarAdapter(guitar);

        System.out.println("--------Dombra--------");
        dombra.tuning();
        dombra.play("Aday");
        System.out.println("--------Guitar--------");
        guitar.tuning();
        guitar.strum("Canon");
        System.out.println("--------Guitar with adapter--------");
        guitarAdapter.tuning();
        guitarAdapter.play("Romance de Amor");
    }
}
