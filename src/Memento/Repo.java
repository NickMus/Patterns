package Memento;

public class Repo {
    private Saver saver;

    public Saver getSaver() {
        return saver;
    }

    public void setSaver(Saver saver) {
        this.saver = saver;
    }
}
