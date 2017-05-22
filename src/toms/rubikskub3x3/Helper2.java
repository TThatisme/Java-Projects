package toms.rubikskub3x3;

/**
 * Created by Tom on 2017-05-01.
 */
public class Helper2 {
    public static int[] hittaHörnPosIArray(Hörn2[] hörn, int[][] position) {
        int[] indexes = new int[4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 8; j++){
                if(position[i][0] == hörn[j].getPosition()[0] & position[i][1] == hörn[j].getPosition()[1]
                        & position[i][2] == hörn[j].getPosition()[2])
                    indexes[i] = j;
            }
        }
        return indexes;
    }

    public static int[] hittaKantPosIArray(Kant2[] kant, int[][] position) {
        int[] indexes = new int[4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 12; j++){
                if(position[i][0] == kant[j].getPosition()[0] & position[i][1] == kant[j].getPosition()[1])
                    indexes[i] = j;
            }
        }
        return indexes;
    }

    public static void bytNummerHörn(Hörn2 hörn1, Hörn2 hörn2) {
        Hörn2 hörn3 = new Hörn2();
        hörn3.setNummer(hörn1.getNummer());
        hörn1.setNummer(hörn2.getNummer());
        hörn2.setNummer(hörn3.getNummer());
    }

    public static void bytNummerKant(Kant2 kant1, Kant2 kant2) {
        Kant2 kant3 = new Kant2();
        kant3.setNummer(kant1.getNummer());
        kant1.setNummer(kant2.getNummer());
        kant2.setNummer(kant3.getNummer());
    }

    public static int[] bytaPlats(int[] lista, int index1, int index2) {
        int kopia = lista[index1];
        lista[index1] = lista[index2];
        lista[index2] = kopia;
        return lista;
    }

    public static int[] roteraMedurs(int[] lista) {
        int kopia = lista[0];
        lista[0] = lista[1];
        lista[1] = lista[2];
        lista[2] = kopia;
        return lista;
    }

    public static int[] roteraMoturs(int[] lista) {
        int kopia = lista[2];
        lista[2] = lista[1];
        lista[1] = lista[0];
        lista[0] = kopia;
        return lista;
    }

    public static Hörn2 hittaHörn(Hörn2[] hörn, int[] nummer) {
            for(int j = 0; j < 8; j++){
                if(nummer[0] == hörn[j].getNummer()[0] & nummer[1] == hörn[j].getNummer()[1]
                        & nummer[2] == hörn[j].getNummer()[2])
                    return hörn[j];
            }
            return null;
    }

    public static Kant2 hittaKant(Kant2[] kant, int[] nummer) {
        for(int j = 0; j < 12; j++){
            if(nummer[0] == kant[j].getNummer()[0] & nummer[1] == kant[j].getNummer()[1])
                return kant[j];
        }
        return null;
    }
}
