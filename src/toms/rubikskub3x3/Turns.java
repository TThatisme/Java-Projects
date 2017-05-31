package toms.rubikskub3x3;

public enum Turns {
    U("U"),
    u("U'"),
    UU("U2"),
    F ("F"),
    f ("F'"),
    FF ("F2"),
    R("R"),
    r("R'"),
    RR("R2"),
    L("L"),
    l("L'"),
    LL("L2"),
    B("B"),
    b("B'"),
    BB("B2"),
    D("D"),
    d("D'"),
    DD("D2")
    ;

    private final String shortCode;

    Turns(String code) {
        this.shortCode = code;
    }

    public String getShortCode() {
        return this.shortCode;
    }
}
