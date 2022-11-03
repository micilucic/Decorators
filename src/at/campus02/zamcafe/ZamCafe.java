package at.campus02.zamcafe;

public class ZamCafe {
    public static void main(String[] args) {
        Getraenk g = new CafeLatte();
        CafeLatte cafeLatte = new CafeLatte();
        Sirup s = new Sirup(cafeLatte);
        Milch m = new Milch(s);
        Milch m1 = new Milch(m);

        System.out.println(m1.getBeschreibung());
        System.out.println(m1.kostet());
    }
}
