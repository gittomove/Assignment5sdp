public class Dombra implements MusicalInstrument{
    @Override
    public void tuning() {
        System.out.println("Tune 2 strings");
    }

    @Override
    public void play(String musicName) {
        System.out.println("Playing "+musicName+" on dombra");
    }
}
