public class GuitarAdapter implements MusicalInstrument{

    Guitar guitar = new Guitar();

    public GuitarAdapter(Guitar newGuitar) {
        this.guitar = newGuitar;
    }

    @Override
    public void tuning() {
            guitar.tuning();
    }

    @Override
    public void play(String musicName) {
        guitar.strum(musicName);
    }
}
