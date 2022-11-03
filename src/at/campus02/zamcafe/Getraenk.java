package at.campus02.zamcafe;

public abstract class Getraenk {
    protected String beschreibung = "Unbekanntes Getraenk";
    public String getBeschreibung() {
        return beschreibung;
    }

    public abstract double kostet();
}
