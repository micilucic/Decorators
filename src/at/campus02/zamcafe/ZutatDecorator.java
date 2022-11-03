package at.campus02.zamcafe;

public abstract class ZutatDecorator extends Getraenk {
    protected Getraenk getraenk;

    public ZutatDecorator(Getraenk getraenk) {
        this.getraenk = getraenk;
    }

    public abstract String getBeschreibung();
}
