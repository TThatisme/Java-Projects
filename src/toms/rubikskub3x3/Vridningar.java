package toms.rubikskub3x3;

/**
 * Created by Tom on 2017-04-28.
 */
public enum Vridningar {
    T ("T"),
    t ("T'"),
    TT ("2T"),
    F ("F"),
    f ("F'"),
    FF ("2F"),
    H ("H"),
    h ("H'"),
    HH ("2H"),
    V ("V"),
    v ("V'"),
    VV ("2V"),
    BA ("B"),
    ba ("B'"),
    BABA ("2B"),
    BO ("b"),
    bo ("b'"),
    BOBO ("2b")
    ;

    private final String kortKod;

    Vridningar(String code) {
        this.kortKod = code;
    }

    public String getKortKod() {
        return this.kortKod;
    }
}
