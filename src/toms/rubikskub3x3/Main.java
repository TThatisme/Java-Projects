package toms.rubikskub3x3;

public class Main {

    public static void main(String[] args) {
        Kub2 användarKub = new Kub2();

        //Felaktig blandning, Två hörn blir fel
        //Jag vet dock inte vilken bit som är fel,
        //tror jag skrev dit något värde felaktigt
        //av misstag

        String[] s1 = new String[8];

        // position 124
        s1[0] = "3 5 6 3 5 6";
        // position 145
        s1[1] = "1 2 3 3 2 1";
        // position 135
        s1[2] = "4 5 6 4 5 6";
        // position 123
        s1[3] = "1 2 4 1 4 2";
        // position 456
        s1[4] = "2 3 6 3 2 6";
        // position 246
        s1[5] = "1 4 5 1 5 4";
        // position 236
        s1[6] = "1 3 5 5 3 1";
        // position 356
        s1[7] = "2 4 6 2 6 4";

        String[] s2 = new String[12];

        // position 12
        s2[0] = "4 6 4 6";
        // position 14
        s2[1] = "5 6 5 6";
        // position 15
        s2[2] = "2 4 4 2";
        // position 13
        s2[3] = "2 3 2 3";
        // position 23
        s2[4] = "1 2 2 1";
        // position 35
        s2[5] = "1 5 1 5";
        // position 45
        s2[6] = "2 6 2 6";
        // position 24
        s2[7] = "3 5 3 5";
        // position 56
        s2[8] = "3 6 6 3";
        // position 46
        s2[9] = "1 4 1 4";
        // position 26
        s2[10] = "4 5 4 5";
        // position 36
        s2[11] = "1 3 3 1";

        //Korrekt blandning

//        String[] s1 = new String[8];
//
//        // position 124
//        s1[0] = "2 4 6 2 6 4";
//        // position 145
//        s1[1] = "3 5 6 5 6 3";
//        // position 135
//        s1[2] = "1 3 5 5 1 3";
//        // position 123
//        s1[3] = "2 3 6 3 2 6";
//        // position 456
//        s1[4] = "1 2 3 2 3 1";
//        // position 246
//        s1[5] = "1 4 5 4 1 5";
//        // position 236
//        s1[6] = "1 2 4 2 4 1";
//        // position 356
//        s1[7] = "4 5 6 5 4 6";
//
//        String[] s2 = new String[12];
//
//        // position 12
//        s2[0] = "3 6 3 6";
//        // position 14
//        s2[1] = "1 3 3 1";
//        // position 15
//        s2[2] = "1 5 5 1";
//        // position 13
//        s2[3] = "4 6 4 6";
//        // position 23
//        s2[4] = "3 5 5 3";
//        // position 35
//        s2[5] = "2 4 2 4";
//        // position 45
//        s2[6] = "5 6 5 6";
//        // position 24
//        s2[7] = "1 2 2 1";
//        // position 56
//        s2[8] = "2 6 2 6";
//        // position 46
//        s2[9] = "1 4 1 4";
//        // position 26
//        s2[10] = "4 5 5 4";
//        // position 36
//        s2[11] = "2 3 3 2";

        användarKub = blandaKuben(s1, s2);
        användarKub = Algoritmer.lösFörstaHörnet(användarKub);
        System.out.println();
        användarKub = Algoritmer.lösAndraHörnet(användarKub);
        System.out.println();
        användarKub = Algoritmer.lösTredjeHörnet(användarKub);
        System.out.println();
        användarKub = Algoritmer.lösFjärdeHörnet(användarKub);
        System.out.println();
        användarKub = Algoritmer.lösFörstaKanten(användarKub);
        System.out.println();
        användarKub = Algoritmer.lösAndraKanten(användarKub);
        System.out.println();
        användarKub = Algoritmer.lösTredjeKanten(användarKub);
        System.out.println();
        användarKub = Algoritmer.lösFjärdeKanten(användarKub);
        System.out.println();
        användarKub = Algoritmer.lösFemteKanten(användarKub);
        System.out.println();
        användarKub = Algoritmer.lösSjätteKanten(användarKub);
        System.out.println();
        användarKub = Algoritmer.lösSjundeKanten(användarKub);
        System.out.println();
        användarKub = Algoritmer.lösÅttondeKanten(användarKub);
        användarKub = Algoritmer.lösKanterSistaLagret(användarKub);

        try {
            användarKub = Algoritmer.lösHörnenSistaLagret(användarKub);
        }catch(FelaktigBlandningHörnException e) {
            System.out.println(e.getMessage());
        }
        skrivaUtKuben(användarKub);


    }
    private static Kub2 blandaKuben(String[] s1, String[] s2) {
        Kub2 användarKub = new Kub2();
        String[] nummerOrienteringHörn = new String[6];
        String[] nummerOrienteringKant = new String[4];
        for(int i = 0; i < 8; i++) {
            nummerOrienteringHörn = s1[i].split(" ");

            int i0 = Integer.parseInt(nummerOrienteringHörn[0]);
            int i1 = Integer.parseInt(nummerOrienteringHörn[1]);
            int i2 = Integer.parseInt(nummerOrienteringHörn[2]);

            int i3 = Integer.parseInt(nummerOrienteringHörn[3]);
            int i4 = Integer.parseInt(nummerOrienteringHörn[4]);
            int i5 = Integer.parseInt(nummerOrienteringHörn[5]);

            användarKub.getHörn()[i].setNummer(new int[]{i0, i1, i2});
            användarKub.getHörn()[i].setOrientering(new int[]{i3, i4, i5});
        }
        for(int i = 0; i < 12; i++) {
            nummerOrienteringKant = s2[i].split(" ");

            int i0 = Integer.parseInt(nummerOrienteringKant[0]);
            int i1 = Integer.parseInt(nummerOrienteringKant[1]);

            int i2 = Integer.parseInt(nummerOrienteringKant[2]);
            int i3 = Integer.parseInt(nummerOrienteringKant[3]);

            användarKub.getKant()[i].setNummer(new int[]{i0, i1});
            användarKub.getKant()[i].setOrientering(new int[]{i2, i3});
        }
        return användarKub;
    }

    private static void skrivaUtKuben(Kub2 minFörstaKub) {
        System.out.println("Nummer: " + minFörstaKub.getHörn()[0].getNummer()[0] +
                minFörstaKub.getHörn()[0].getNummer()[1] + minFörstaKub.getHörn()[0].getNummer()[2]);
        System.out.println("Position: " + minFörstaKub.getHörn()[0].getPosition()[0] +
                minFörstaKub.getHörn()[0].getPosition()[1] + minFörstaKub.getHörn()[0].getPosition()[2]);
        System.out.println("Orientering: " + minFörstaKub.getHörn()[0].getOrientering()[0] +
                minFörstaKub.getHörn()[0].getOrientering()[1] + minFörstaKub.getHörn()[0].getOrientering()[2]);

        System.out.println();

        System.out.println("Nummer: " + minFörstaKub.getHörn()[1].getNummer()[0] +
                minFörstaKub.getHörn()[1].getNummer()[1] + minFörstaKub.getHörn()[1].getNummer()[2]);
        System.out.println("Position: " + minFörstaKub.getHörn()[1].getPosition()[0] +
                minFörstaKub.getHörn()[1].getPosition()[1] + minFörstaKub.getHörn()[1].getPosition()[2]);
        System.out.println("Orientering: " + minFörstaKub.getHörn()[1].getOrientering()[0] +
                minFörstaKub.getHörn()[1].getOrientering()[1] + minFörstaKub.getHörn()[1].getOrientering()[2]);

        System.out.println();

        System.out.println("Nummer: " + minFörstaKub.getHörn()[2].getNummer()[0] +
                minFörstaKub.getHörn()[2].getNummer()[1] + minFörstaKub.getHörn()[2].getNummer()[2]);
        System.out.println("Position: " + minFörstaKub.getHörn()[2].getPosition()[0] +
                minFörstaKub.getHörn()[2].getPosition()[1] + minFörstaKub.getHörn()[2].getPosition()[2]);
        System.out.println("Orientering: " + minFörstaKub.getHörn()[2].getOrientering()[0] +
                minFörstaKub.getHörn()[2].getOrientering()[1] + minFörstaKub.getHörn()[2].getOrientering()[2]);

        System.out.println();

        System.out.println("Nummer: " + minFörstaKub.getHörn()[3].getNummer()[0] +
                minFörstaKub.getHörn()[3].getNummer()[1] + minFörstaKub.getHörn()[3].getNummer()[2]);
        System.out.println("Position: " + minFörstaKub.getHörn()[3].getPosition()[0] +
                minFörstaKub.getHörn()[3].getPosition()[1] + minFörstaKub.getHörn()[3].getPosition()[2]);
        System.out.println("Orientering: " + minFörstaKub.getHörn()[3].getOrientering()[0] +
                minFörstaKub.getHörn()[3].getOrientering()[1] + minFörstaKub.getHörn()[3].getOrientering()[2]);

        System.out.println();

        System.out.println("Nummer: " + minFörstaKub.getHörn()[4].getNummer()[0] +
                minFörstaKub.getHörn()[4].getNummer()[1] + minFörstaKub.getHörn()[4].getNummer()[2]);
        System.out.println("Position: " + minFörstaKub.getHörn()[4].getPosition()[0] +
                minFörstaKub.getHörn()[4].getPosition()[1] + minFörstaKub.getHörn()[4].getPosition()[2]);
        System.out.println("Orientering: " + minFörstaKub.getHörn()[4].getOrientering()[0] +
                minFörstaKub.getHörn()[4].getOrientering()[1] + minFörstaKub.getHörn()[4].getOrientering()[2]);

        System.out.println();

        System.out.println("Nummer: " + minFörstaKub.getHörn()[5].getNummer()[0] +
                minFörstaKub.getHörn()[5].getNummer()[1] + minFörstaKub.getHörn()[5].getNummer()[2]);
        System.out.println("Position: " + minFörstaKub.getHörn()[5].getPosition()[0] +
                minFörstaKub.getHörn()[5].getPosition()[1] + minFörstaKub.getHörn()[5].getPosition()[2]);
        System.out.println("Orientering: " + minFörstaKub.getHörn()[5].getOrientering()[0] +
                minFörstaKub.getHörn()[5].getOrientering()[1] + minFörstaKub.getHörn()[5].getOrientering()[2]);

        System.out.println();

        System.out.println("Nummer: " + minFörstaKub.getHörn()[6].getNummer()[0] +
                minFörstaKub.getHörn()[6].getNummer()[1] + minFörstaKub.getHörn()[6].getNummer()[2]);
        System.out.println("Position: " + minFörstaKub.getHörn()[6].getPosition()[0] +
                minFörstaKub.getHörn()[6].getPosition()[1] + minFörstaKub.getHörn()[6].getPosition()[2]);
        System.out.println("Orientering: " + minFörstaKub.getHörn()[6].getOrientering()[0] +
                minFörstaKub.getHörn()[6].getOrientering()[1] + minFörstaKub.getHörn()[6].getOrientering()[2]);

        System.out.println();

        System.out.println("Nummer: " + minFörstaKub.getHörn()[7].getNummer()[0] +
                minFörstaKub.getHörn()[7].getNummer()[1] + minFörstaKub.getHörn()[7].getNummer()[2]);
        System.out.println("Position: " + minFörstaKub.getHörn()[7].getPosition()[0] +
                minFörstaKub.getHörn()[7].getPosition()[1] + minFörstaKub.getHörn()[7].getPosition()[2]);
        System.out.println("Orientering: " + minFörstaKub.getHörn()[7].getOrientering()[0] +
                minFörstaKub.getHörn()[7].getOrientering()[1] + minFörstaKub.getHörn()[7].getOrientering()[2]);

        System.out.println();

        System.out.println("Nummer: " + minFörstaKub.getKant()[0].getNummer()[0] +
                minFörstaKub.getKant()[0].getNummer()[1]);
        System.out.println("Position: " + minFörstaKub.getKant()[0].getPosition()[0] +
                minFörstaKub.getKant()[0].getPosition()[1]);
        System.out.println("Orientering: " + minFörstaKub.getKant()[0].getOrientering()[0] +
                minFörstaKub.getKant()[0].getOrientering()[1]);

        System.out.println();

        System.out.println("Nummer: " + minFörstaKub.getKant()[1].getNummer()[0] +
                minFörstaKub.getKant()[1].getNummer()[1]);
        System.out.println("Position: " + minFörstaKub.getKant()[1].getPosition()[0] +
                minFörstaKub.getKant()[1].getPosition()[1]);
        System.out.println("Orientering: " + minFörstaKub.getKant()[1].getOrientering()[0] +
                minFörstaKub.getKant()[1].getOrientering()[1]);

        System.out.println();

        System.out.println("Nummer: " + minFörstaKub.getKant()[2].getNummer()[0] +
                minFörstaKub.getKant()[2].getNummer()[1]);
        System.out.println("Position: " + minFörstaKub.getKant()[2].getPosition()[0] +
                minFörstaKub.getKant()[2].getPosition()[1]);
        System.out.println("Orientering: " + minFörstaKub.getKant()[2].getOrientering()[0] +
                minFörstaKub.getKant()[2].getOrientering()[1]);

        System.out.println();

        System.out.println("Nummer: " + minFörstaKub.getKant()[3].getNummer()[0] +
                minFörstaKub.getKant()[3].getNummer()[1]);
        System.out.println("Position: " + minFörstaKub.getKant()[3].getPosition()[0] +
                minFörstaKub.getKant()[3].getPosition()[1]);
        System.out.println("Orientering: " + minFörstaKub.getKant()[3].getOrientering()[0] +
                minFörstaKub.getKant()[3].getOrientering()[1]);

        System.out.println();

        System.out.println("Nummer: " + minFörstaKub.getKant()[4].getNummer()[0] +
                minFörstaKub.getKant()[4].getNummer()[1]);
        System.out.println("Position: " + minFörstaKub.getKant()[4].getPosition()[0] +
                minFörstaKub.getKant()[4].getPosition()[1]);
        System.out.println("Orientering: " + minFörstaKub.getKant()[4].getOrientering()[0] +
                minFörstaKub.getKant()[4].getOrientering()[1]);

        System.out.println();

        System.out.println("Nummer: " + minFörstaKub.getKant()[5].getNummer()[0] +
                minFörstaKub.getKant()[5].getNummer()[1]);
        System.out.println("Position: " + minFörstaKub.getKant()[5].getPosition()[0] +
                minFörstaKub.getKant()[5].getPosition()[1]);
        System.out.println("Orientering: " + minFörstaKub.getKant()[5].getOrientering()[0] +
                minFörstaKub.getKant()[5].getOrientering()[1]);

        System.out.println();

        System.out.println("Nummer: " + minFörstaKub.getKant()[6].getNummer()[0] +
                minFörstaKub.getKant()[6].getNummer()[1]);
        System.out.println("Position: " + minFörstaKub.getKant()[6].getPosition()[0] +
                minFörstaKub.getKant()[6].getPosition()[1]);
        System.out.println("Orientering: " + minFörstaKub.getKant()[6].getOrientering()[0] +
                minFörstaKub.getKant()[6].getOrientering()[1]);

        System.out.println();

        System.out.println("Nummer: " + minFörstaKub.getKant()[7].getNummer()[0] +
                minFörstaKub.getKant()[7].getNummer()[1]);
        System.out.println("Position: " + minFörstaKub.getKant()[7].getPosition()[0] +
                minFörstaKub.getKant()[7].getPosition()[1]);
        System.out.println("Orientering: " + minFörstaKub.getKant()[7].getOrientering()[0] +
                minFörstaKub.getKant()[7].getOrientering()[1]);

        System.out.println();

        System.out.println("Nummer: " + minFörstaKub.getKant()[8].getNummer()[0] +
                minFörstaKub.getKant()[8].getNummer()[1]);
        System.out.println("Position: " + minFörstaKub.getKant()[8].getPosition()[0] +
                minFörstaKub.getKant()[8].getPosition()[1]);
        System.out.println("Orientering: " + minFörstaKub.getKant()[8].getOrientering()[0] +
                minFörstaKub.getKant()[8].getOrientering()[1]);

        System.out.println();

        System.out.println("Nummer: " + minFörstaKub.getKant()[9].getNummer()[0] +
                minFörstaKub.getKant()[9].getNummer()[1]);
        System.out.println("Position: " + minFörstaKub.getKant()[9].getPosition()[0] +
                minFörstaKub.getKant()[9].getPosition()[1]);
        System.out.println("Orientering: " + minFörstaKub.getKant()[9].getOrientering()[0] +
                minFörstaKub.getKant()[9].getOrientering()[1]);

        System.out.println();

        System.out.println("Nummer: " + minFörstaKub.getKant()[10].getNummer()[0] +
                minFörstaKub.getKant()[10].getNummer()[1]);
        System.out.println("Position: " + minFörstaKub.getKant()[10].getPosition()[0] +
                minFörstaKub.getKant()[10].getPosition()[1]);
        System.out.println("Orientering: " + minFörstaKub.getKant()[10].getOrientering()[0] +
                minFörstaKub.getKant()[10].getOrientering()[1]);

        System.out.println();

        System.out.println("Nummer: " + minFörstaKub.getKant()[11].getNummer()[0] +
                minFörstaKub.getKant()[11].getNummer()[1]);
        System.out.println("Position: " + minFörstaKub.getKant()[11].getPosition()[0] +
                minFörstaKub.getKant()[11].getPosition()[1]);
        System.out.println("Orientering: " + minFörstaKub.getKant()[11].getOrientering()[0] +
                minFörstaKub.getKant()[11].getOrientering()[1]);
    }
}
