package toms.rubikskub3x3;

/**
 * Created by Tom on 2017-04-30.
 */
public class Kub2 {
    private Kubsida[] orientering = new Kubsida[6];
    private Hörn2[] hörn = new Hörn2[8];
    private Kant2[] kant = new Kant2[12];
    private int antalVridningar = 0;

    private int[][] posListaHörn = new int[4][3];
    private int[][] posListaKant = new int[4][2];
    private int[] indexesHörn = null;
    private int[] indexesKant = null;

    public Kubsida[] getOrientering(){return orientering;}
    public void setOrientering(Kubsida[] orientering){
        this.orientering[0] = orientering[0];
        this.orientering[1] = orientering[1];
        this.orientering[2] = orientering[2];
        this.orientering[3] = orientering[3];
        this.orientering[4] = orientering[4];
        this.orientering[5] = orientering[5];
        this.orientering[6] = orientering[6];
    }

    public Hörn2[] getHörn(){return hörn;}
    public void setHörn(Hörn2[] hörn){this.hörn = hörn;}

    public Kant2[] getKant(){return kant;}
    public void setKant(Kant2[] kant){this.kant = kant;}

    public Kub2() {
        this.orientering = new Kubsida[]{Kubsida.T, Kubsida.F, Kubsida.H,
                Kubsida.V, Kubsida.B, Kubsida.b};

        this.hörn[0] = new Hörn2();
        this.hörn[1] = new Hörn2();
        this.hörn[2] = new Hörn2();
        this.hörn[3] = new Hörn2();
        this.hörn[4] = new Hörn2();
        this.hörn[5] = new Hörn2();
        this.hörn[6] = new Hörn2();
        this.hörn[7] = new Hörn2();

        this.hörn[0].setNummer(new int[]{1, 2, 4});
        this.hörn[0].setPosition(new int[]{1, 2, 4});
        this.hörn[0].setOrientering(new int[]{1, 2, 4});

        this.hörn[1].setNummer(new int[]{1, 4, 5});
        this.hörn[1].setPosition(new int[]{1, 4, 5});
        this.hörn[1].setOrientering(new int[]{1, 4, 5});

        this.hörn[2].setNummer(new int[]{1, 3, 5});
        this.hörn[2].setPosition(new int[]{1, 3, 5});
        this.hörn[2].setOrientering(new int[]{1, 3, 5});

        this.hörn[3].setNummer(new int[]{1, 2, 3});
        this.hörn[3].setPosition(new int[]{1, 2, 3});
        this.hörn[3].setOrientering(new int[]{1, 2, 3});

        this.hörn[4].setNummer(new int[]{4, 5, 6});
        this.hörn[4].setPosition(new int[]{4, 5, 6});
        this.hörn[4].setOrientering(new int[]{4, 5, 6});

        this.hörn[5].setNummer(new int[]{2, 4, 6});
        this.hörn[5].setPosition(new int[]{2, 4, 6});
        this.hörn[5].setOrientering(new int[]{2, 4, 6});

        this.hörn[6].setNummer(new int[]{2, 3, 6});
        this.hörn[6].setPosition(new int[]{2, 3, 6});
        this.hörn[6].setOrientering(new int[]{2, 3, 6});

        this.hörn[7].setNummer(new int[]{3, 5, 6});
        this.hörn[7].setPosition(new int[]{3, 5, 6});
        this.hörn[7].setOrientering(new int[]{3, 5, 6});

        this.kant[0] = new Kant2();
        this.kant[1] = new Kant2();
        this.kant[2] = new Kant2();
        this.kant[3] = new Kant2();
        this.kant[4] = new Kant2();
        this.kant[5] = new Kant2();
        this.kant[6] = new Kant2();
        this.kant[7] = new Kant2();
        this.kant[8] = new Kant2();
        this.kant[9] = new Kant2();
        this.kant[10] = new Kant2();
        this.kant[11] = new Kant2();

        this.kant[0].setNummer(new int[]{1, 2});
        this.kant[0].setPosition(new int[]{1, 2});
        this.kant[0].setOrientering(new int[]{1, 2});

        this.kant[1].setNummer(new int[]{1, 4});
        this.kant[1].setPosition(new int[]{1, 4});
        this.kant[1].setOrientering(new int[]{1, 4});

        this.kant[2].setNummer(new int[]{1, 5});
        this.kant[2].setPosition(new int[]{1, 5});
        this.kant[2].setOrientering(new int[]{1, 5});

        this.kant[3].setNummer(new int[]{1, 3});
        this.kant[3].setPosition(new int[]{1, 3});
        this.kant[3].setOrientering(new int[]{1, 3});

        this.kant[4].setNummer(new int[]{2, 3});
        this.kant[4].setPosition(new int[]{2, 3});
        this.kant[4].setOrientering(new int[]{2, 3});

        this.kant[5].setNummer(new int[]{3, 5});
        this.kant[5].setPosition(new int[]{3, 5});
        this.kant[5].setOrientering(new int[]{3, 5});

        this.kant[6].setNummer(new int[]{4, 5});
        this.kant[6].setPosition(new int[]{4, 5});
        this.kant[6].setOrientering(new int[]{4, 5});

        this.kant[7].setNummer(new int[]{2, 4});
        this.kant[7].setPosition(new int[]{2, 4});
        this.kant[7].setOrientering(new int[]{2, 4});

        this.kant[8].setNummer(new int[]{5, 6});
        this.kant[8].setPosition(new int[]{5, 6});
        this.kant[8].setOrientering(new int[]{5, 6});

        this.kant[9].setNummer(new int[]{4, 6});
        this.kant[9].setPosition(new int[]{4, 6});
        this.kant[9].setOrientering(new int[]{4, 6});

        this.kant[10].setNummer(new int[]{2, 6});
        this.kant[10].setPosition(new int[]{2, 6});
        this.kant[10].setOrientering(new int[]{2, 6});

        this.kant[11].setNummer(new int[]{3, 6});
        this.kant[11].setPosition(new int[]{3, 6});
        this.kant[11].setOrientering(new int[]{3, 6});
    }

    public Kub2 vridKuben(Kubsida sida, Vridningar vridning) {

        if(this.orientering[0] == sida){

            // Vita sidan

              posListaHörn[0][0] = 1;
              posListaHörn[0][1] = 2;
              posListaHörn[0][2] = 4;

              posListaHörn[1][0] = 1;
              posListaHörn[1][1] = 4;
              posListaHörn[1][2] = 5;

              posListaHörn[2][0] = 1;
              posListaHörn[2][1] = 3;
              posListaHörn[2][2] = 5;

              posListaHörn[3][0] = 1;
              posListaHörn[3][1] = 2;
              posListaHörn[3][2] = 3;

              posListaKant[0][0] = 1;
              posListaKant[0][1] = 2;

              posListaKant[1][0] = 1;
              posListaKant[1][1] = 4;

              posListaKant[2][0] = 1;
              posListaKant[2][1] = 5;

              posListaKant[3][0] = 1;
              posListaKant[3][1] = 3;


            indexesHörn = Helper2.hittaHörnPosIArray(this.hörn, posListaHörn);
            indexesKant = Helper2.hittaKantPosIArray(this.kant, posListaKant);


        }else if(this.orientering[1] == sida){

            // Blåa sidan

              posListaHörn[0][0] = 2;
              posListaHörn[0][1] = 4;
              posListaHörn[0][2] = 6;

              posListaHörn[1][0] = 1;
              posListaHörn[1][1] = 2;
              posListaHörn[1][2] = 4;

              posListaHörn[2][0] = 1;
              posListaHörn[2][1] = 2;
              posListaHörn[2][2] = 3;

              posListaHörn[3][0] = 2;
              posListaHörn[3][1] = 3;
              posListaHörn[3][2] = 6;

              posListaKant[0][0] = 2;
              posListaKant[0][1] = 6;

              posListaKant[1][0] = 2;
              posListaKant[1][1] = 4;

              posListaKant[2][0] = 1;
              posListaKant[2][1] = 2;

              posListaKant[3][0] = 2;
              posListaKant[3][1] = 3;

            indexesHörn = Helper2.hittaHörnPosIArray(this.hörn, posListaHörn);
            indexesKant = Helper2.hittaKantPosIArray(this.kant, posListaKant);

        }else if(this.orientering[2] == sida){

            // Orange sidan

              posListaHörn[0][0] = 2;
              posListaHörn[0][1] = 3;
              posListaHörn[0][2] = 6;

              posListaHörn[1][0] = 1;
              posListaHörn[1][1] = 2;
              posListaHörn[1][2] = 3;

              posListaHörn[2][0] = 1;
              posListaHörn[2][1] = 3;
              posListaHörn[2][2] = 5;

              posListaHörn[3][0] = 3;
              posListaHörn[3][1] = 5;
              posListaHörn[3][2] = 6;

              posListaKant[0][0] = 3;
              posListaKant[0][1] = 6;

              posListaKant[1][0] = 2;
              posListaKant[1][1] = 3;

              posListaKant[2][0] = 1;
              posListaKant[2][1] = 3;

              posListaKant[3][0] = 3;
              posListaKant[3][1] = 5;


            indexesHörn = Helper2.hittaHörnPosIArray(this.hörn, posListaHörn);
            indexesKant = Helper2.hittaKantPosIArray(this.kant, posListaKant);

        }else if(this.orientering[3] == sida){

            // Röda sidan

              posListaHörn[0][0] = 4;
              posListaHörn[0][1] = 5;
              posListaHörn[0][2] = 6;

              posListaHörn[1][0] = 1;
              posListaHörn[1][1] = 4;
              posListaHörn[1][2] = 5;

              posListaHörn[2][0] = 1;
              posListaHörn[2][1] = 2;
              posListaHörn[2][2] = 4;

              posListaHörn[3][0] = 2;
              posListaHörn[3][1] = 4;
              posListaHörn[3][2] = 6;

              posListaKant[0][0] = 4;
              posListaKant[0][1] = 6;

              posListaKant[1][0] = 4;
              posListaKant[1][1] = 5;

              posListaKant[2][0] = 1;
              posListaKant[2][1] = 4;

              posListaKant[3][0] = 2;
              posListaKant[3][1] = 4;

            indexesHörn = Helper2.hittaHörnPosIArray(this.hörn, posListaHörn);
            indexesKant = Helper2.hittaKantPosIArray(this.kant, posListaKant);

        }else if(this.orientering[4] == sida){

            // Gröna sidam

              posListaHörn[0][0] = 3;
              posListaHörn[0][1] = 5;
              posListaHörn[0][2] = 6;

              posListaHörn[1][0] = 1;
              posListaHörn[1][1] = 3;
              posListaHörn[1][2] = 5;

              posListaHörn[2][0] = 1;
              posListaHörn[2][1] = 4;
              posListaHörn[2][2] = 5;

              posListaHörn[3][0] = 4;
              posListaHörn[3][1] = 5;
              posListaHörn[3][2] = 6;

              posListaKant[0][0] = 5;
              posListaKant[0][1] = 6;

              posListaKant[1][0] = 3;
              posListaKant[1][1] = 5;

              posListaKant[2][0] = 1;
              posListaKant[2][1] = 5;

              posListaKant[3][0] = 4;
              posListaKant[3][1] = 5;

            indexesHörn = Helper2.hittaHörnPosIArray(this.hörn, posListaHörn);
            indexesKant = Helper2.hittaKantPosIArray(this.kant, posListaKant);

        }else if(this.orientering[5] == sida){

            // Gula sidan

            posListaHörn[0][0] = 4;
            posListaHörn[0][1] = 5;
            posListaHörn[0][2] = 6;

            posListaHörn[1][0] = 2;
            posListaHörn[1][1] = 4;
            posListaHörn[1][2] = 6;

            posListaHörn[2][0] = 2;
            posListaHörn[2][1] = 3;
            posListaHörn[2][2] = 6;

            posListaHörn[3][0] = 3;
            posListaHörn[3][1] = 5;
            posListaHörn[3][2] = 6;

            posListaKant[0][0] = 5;
            posListaKant[0][1] = 6;

            posListaKant[1][0] = 4;
            posListaKant[1][1] = 6;

            posListaKant[2][0] = 2;
            posListaKant[2][1] = 6;

            posListaKant[3][0] = 3;
            posListaKant[3][1] = 6;

            indexesHörn = Helper2.hittaHörnPosIArray(this.hörn, posListaHörn);
            indexesKant = Helper2.hittaKantPosIArray(this.kant, posListaKant);
        }

        //medurs eller moturs eller 180 graders

        if(vridning == Vridningar.T | vridning == Vridningar.F | vridning == Vridningar.H
                | vridning == Vridningar.V | vridning == Vridningar.BA | vridning == Vridningar.BO) {
            Helper2.bytNummerHörn(this.hörn[indexesHörn[0]], this.hörn[indexesHörn[1]]);
            Helper2.bytNummerHörn(this.hörn[indexesHörn[0]], this.hörn[indexesHörn[2]]);
            Helper2.bytNummerHörn(this.hörn[indexesHörn[0]], this.hörn[indexesHörn[3]]);

            Helper2.bytNummerKant(this.kant[indexesKant[0]], this.kant[indexesKant[1]]);
            Helper2.bytNummerKant(this.kant[indexesKant[0]], this.kant[indexesKant[2]]);
            Helper2.bytNummerKant(this.kant[indexesKant[0]], this.kant[indexesKant[3]]);

            // orienteringsändring

            switch (sida) {
                case T: {
                    int[] kopiaHörn = this.hörn[0].getOrientering();
                    int[] kopiaKant = this.kant[0].getOrientering();

                    this.hörn[0].setOrientering(
                              Helper2.bytaPlats(this.hörn[3].getOrientering(), 1, 2));

                    this.hörn[3].setOrientering(this.hörn[2].getOrientering());

                    this.hörn[2].setOrientering(
                            Helper2.bytaPlats(this.hörn[1].getOrientering(), 1, 2));

                    this.hörn[1].setOrientering(kopiaHörn);

                    this.kant[0].setOrientering(this.kant[3].getOrientering());
                    this.kant[3].setOrientering(this.kant[2].getOrientering());
                    this.kant[2].setOrientering(this.kant[1].getOrientering());
                    this.kant[1].setOrientering(kopiaKant);

                    break;
                }

                case F: {
                    int[] kopiaHörn = this.hörn[5].getOrientering();
                    int[] kopiaKant = this.kant[10].getOrientering();

                    this.hörn[5].setOrientering(
                            Helper2.bytaPlats(this.hörn[6].getOrientering(), 1, 2));

                    this.hörn[6].setOrientering(
                            Helper2.bytaPlats(this.hörn[3].getOrientering(), 0, 1));

                    this.hörn[3].setOrientering(
                            Helper2.bytaPlats(this.hörn[0].getOrientering(), 0, 2));

                    this.hörn[0].setOrientering(
                            Helper2.bytaPlats(kopiaHörn, 0, 1));

                    this.kant[10].setOrientering(this.kant[4].getOrientering());
                    this.kant[4].setOrientering(
                            Helper2.bytaPlats(this.kant[0].getOrientering(), 0, 1));
                    this.kant[0].setOrientering(
                            Helper2.bytaPlats(this.kant[7].getOrientering(), 0, 1));
                    this.kant[7].setOrientering(kopiaKant);

                    break;
                }

                case H: {
                    int[] kopiaHörn = this.hörn[6].getOrientering();
                    int[] kopiaKant = this.kant[11].getOrientering();

                    this.hörn[6].setOrientering(
                            Helper2.roteraMoturs(this.hörn[7].getOrientering()));

                    this.hörn[7].setOrientering(
                            Helper2.bytaPlats(this.hörn[2].getOrientering(), 0, 1));

                    this.hörn[2].setOrientering(
                            Helper2.roteraMedurs(this.hörn[3].getOrientering()));

                    this.hörn[3].setOrientering(
                            Helper2.bytaPlats(kopiaHörn, 1, 2));

                    this.kant[11].setOrientering(this.kant[5].getOrientering());
                    this.kant[5].setOrientering(
                            Helper2.bytaPlats(this.kant[3].getOrientering(), 0, 1));
                    this.kant[3].setOrientering(this.kant[4].getOrientering());
                    this.kant[4].setOrientering(
                            Helper2.bytaPlats(kopiaKant, 0, 1));

                    break;
                }

                case V: {
                    int[] kopiaHörn = this.hörn[4].getOrientering();
                    int[] kopiaKant = this.kant[9].getOrientering();

                    this.hörn[4].setOrientering(
                            Helper2.roteraMedurs(this.hörn[5].getOrientering()));

                    this.hörn[5].setOrientering(
                            Helper2.bytaPlats(this.hörn[0].getOrientering(), 1, 2));

                    this.hörn[0].setOrientering(
                            Helper2.roteraMoturs(this.hörn[1].getOrientering()));

                    this.hörn[1].setOrientering(
                            Helper2.bytaPlats(kopiaHörn, 0, 1));

                    this.kant[9].setOrientering(
                            Helper2.bytaPlats(this.kant[7].getOrientering(), 0, 1));
                    this.kant[7].setOrientering(this.kant[1].getOrientering());
                    this.kant[1].setOrientering(
                            Helper2.bytaPlats(this.kant[6].getOrientering(), 0, 1));
                    this.kant[6].setOrientering(kopiaKant);

                    break;
                }

                case B: {
                    int[] kopiaHörn = this.hörn[7].getOrientering();
                    int[] kopiaKant = this.kant[8].getOrientering();

                    this.hörn[7].setOrientering(
                            Helper2.bytaPlats(this.hörn[4].getOrientering(), 0, 2));

                    this.hörn[4].setOrientering(
                            Helper2.bytaPlats(this.hörn[1].getOrientering(), 1, 2));

                    this.hörn[1].setOrientering(
                            Helper2.bytaPlats(this.hörn[2].getOrientering(), 0, 1));

                    this.hörn[2].setOrientering(
                            Helper2.bytaPlats(kopiaHörn, 1, 2));

                    this.kant[8].setOrientering(
                            Helper2.bytaPlats(this.kant[6].getOrientering(), 0, 1));
                    this.kant[6].setOrientering(this.kant[2].getOrientering());
                    this.kant[2].setOrientering(this.kant[5].getOrientering());
                    this.kant[5].setOrientering(
                            Helper2.bytaPlats(kopiaKant, 0, 1));

                    break;
                }

                case b: {
                    int[] kopiaHörn = this.hörn[4].getOrientering();
                    int[] kopiaKant = this.kant[8].getOrientering();

                    this.hörn[4].setOrientering(
                            Helper2.bytaPlats(this.hörn[7].getOrientering(), 0, 1));

                    this.hörn[7].setOrientering(this.hörn[6].getOrientering());

                    this.hörn[6].setOrientering(
                            Helper2.bytaPlats(this.hörn[5].getOrientering(), 0, 1));

                    this.hörn[5].setOrientering(kopiaHörn);

                    this.kant[8].setOrientering(this.kant[11].getOrientering());
                    this.kant[11].setOrientering(this.kant[10].getOrientering());
                    this.kant[10].setOrientering(this.kant[9].getOrientering());
                    this.kant[9].setOrientering(kopiaKant);

                    break;
                }
            }
        }else if(vridning == Vridningar.t | vridning == Vridningar.f | vridning == Vridningar.h
                | vridning == Vridningar.v | vridning == Vridningar.ba | vridning == Vridningar.bo){
            Helper2.bytNummerHörn(this.hörn[indexesHörn[3]], this.hörn[indexesHörn[2]]);
            Helper2.bytNummerHörn(this.hörn[indexesHörn[3]], this.hörn[indexesHörn[1]]);
            Helper2.bytNummerHörn(this.hörn[indexesHörn[3]], this.hörn[indexesHörn[0]]);

            Helper2.bytNummerKant(this.kant[indexesKant[3]], this.kant[indexesKant[2]]);
            Helper2.bytNummerKant(this.kant[indexesKant[3]], this.kant[indexesKant[1]]);
            Helper2.bytNummerKant(this.kant[indexesKant[3]], this.kant[indexesKant[0]]);

            // orienteringsändring

            switch (sida) {
                case T: {
                    int[] kopiaHörn = this.hörn[0].getOrientering();
                    int[] kopiaKant = this.kant[0].getOrientering();

                    this.hörn[0].setOrientering(this.hörn[1].getOrientering());

                    this.hörn[1].setOrientering(
                            Helper2.bytaPlats(this.hörn[2].getOrientering(), 1, 2));

                    this.hörn[2].setOrientering(this.hörn[3].getOrientering());

                    this.hörn[3].setOrientering(
                            Helper2.bytaPlats(kopiaHörn, 1, 2));

                    this.kant[0].setOrientering(this.kant[1].getOrientering());
                    this.kant[1].setOrientering(this.kant[2].getOrientering());
                    this.kant[2].setOrientering(this.kant[3].getOrientering());
                    this.kant[3].setOrientering(kopiaKant);

                    break;
                }

                case F: {
                    int[] kopiaHörn = this.hörn[5].getOrientering();
                    int[] kopiaKant = this.kant[10].getOrientering();

                    this.hörn[5].setOrientering(
                            Helper2.bytaPlats(this.hörn[0].getOrientering(), 0, 1));

                    this.hörn[0].setOrientering(
                            Helper2.bytaPlats(this.hörn[3].getOrientering(), 0, 2));

                    this.hörn[3].setOrientering(
                            Helper2.bytaPlats(this.hörn[6].getOrientering(), 0, 1));

                    this.hörn[6].setOrientering(
                            Helper2.bytaPlats(kopiaHörn, 1, 2));

                    this.kant[10].setOrientering(this.kant[7].getOrientering());
                    this.kant[7].setOrientering(
                            Helper2.bytaPlats(this.kant[0].getOrientering(), 0, 1));
                    this.kant[0].setOrientering(
                            Helper2.bytaPlats(this.kant[4].getOrientering(), 0, 1));
                    this.kant[4].setOrientering(kopiaKant);

                    break;
                }

                case H: {
                    int[] kopiaHörn = this.hörn[6].getOrientering();
                    int[] kopiaKant = this.kant[11].getOrientering();

                    this.hörn[6].setOrientering(
                            Helper2.bytaPlats(this.hörn[3].getOrientering(), 1, 2));

                    this.hörn[3].setOrientering(
                            Helper2.roteraMoturs(this.hörn[2].getOrientering()));

                    this.hörn[2].setOrientering(
                            Helper2.bytaPlats(this.hörn[7].getOrientering(), 0, 1));

                    this.hörn[7].setOrientering(
                            Helper2.roteraMedurs(kopiaHörn));

                    this.kant[11].setOrientering(
                            Helper2.bytaPlats(this.kant[4].getOrientering(), 0, 1));
                    this.kant[4].setOrientering(this.kant[3].getOrientering());
                    this.kant[3].setOrientering(
                            Helper2.bytaPlats(this.kant[5].getOrientering(), 0, 1));
                    this.kant[5].setOrientering(kopiaKant);

                    break;
                }

                case V: {
                    int[] kopiaHörn = this.hörn[4].getOrientering();
                    int[] kopiaKant = this.kant[9].getOrientering();

                    this.hörn[4].setOrientering(
                            Helper2.bytaPlats(this.hörn[1].getOrientering(), 0, 1));

                    this.hörn[1].setOrientering(
                            Helper2.roteraMedurs(this.hörn[0].getOrientering()));

                    this.hörn[0].setOrientering(
                            Helper2.bytaPlats(this.hörn[5].getOrientering(), 1, 2));

                    this.hörn[5].setOrientering(
                            Helper2.roteraMoturs(kopiaHörn));

                    this.kant[9].setOrientering(this.kant[6].getOrientering());
                    this.kant[6].setOrientering(
                            Helper2.bytaPlats(this.kant[1].getOrientering(), 0, 1));
                    this.kant[1].setOrientering(this.kant[7].getOrientering());
                    this.kant[7].setOrientering(
                            Helper2.bytaPlats(kopiaKant, 0, 1));

                    break;
                }

                case B: {
                    int[] kopiaHörn = this.hörn[7].getOrientering();
                    int[] kopiaKant = this.kant[8].getOrientering();

                    this.hörn[7].setOrientering(
                            Helper2.bytaPlats(this.hörn[2].getOrientering(), 1, 2));

                    this.hörn[2].setOrientering(
                            Helper2.bytaPlats(this.hörn[1].getOrientering(), 0, 1));

                    this.hörn[1].setOrientering(
                            Helper2.bytaPlats(this.hörn[4].getOrientering(), 1, 2));

                    this.hörn[4].setOrientering(
                            Helper2.bytaPlats(kopiaHörn, 0, 2));

                    this.kant[8].setOrientering(
                            Helper2.bytaPlats(this.kant[5].getOrientering(), 0, 1));
                    this.kant[5].setOrientering(this.kant[2].getOrientering());
                    this.kant[2].setOrientering(this.kant[6].getOrientering());
                    this.kant[6].setOrientering(
                            Helper2.bytaPlats(kopiaKant, 0, 1));

                    break;
                }

                case b: {
                    int[] kopiaHörn = this.hörn[4].getOrientering();
                    int[] kopiaKant = this.kant[8].getOrientering();

                    this.hörn[4].setOrientering(this.hörn[5].getOrientering());

                    this.hörn[5].setOrientering(
                            Helper2.bytaPlats(this.hörn[6].getOrientering(), 0, 1));

                    this.hörn[6].setOrientering(this.hörn[7].getOrientering());

                    this.hörn[7].setOrientering(
                            Helper2.bytaPlats(kopiaHörn, 0, 1));

                    this.kant[8].setOrientering(this.kant[9].getOrientering());
                    this.kant[9].setOrientering(this.kant[10].getOrientering());
                    this.kant[10].setOrientering(this.kant[11].getOrientering());
                    this.kant[11].setOrientering(kopiaKant);

                    break;
                }
            }
        }else if(vridning == Vridningar.TT | vridning == Vridningar.FF | vridning == Vridningar.HH
                | vridning == Vridningar.VV | vridning == Vridningar.BABA | vridning == Vridningar.BOBO){
            Helper2.bytNummerHörn(this.hörn[indexesHörn[0]], this.hörn[indexesHörn[2]]);
            Helper2.bytNummerHörn(this.hörn[indexesHörn[1]], this.hörn[indexesHörn[3]]);

            Helper2.bytNummerKant(this.kant[indexesKant[0]], this.kant[indexesKant[2]]);
            Helper2.bytNummerKant(this.kant[indexesKant[1]], this.kant[indexesKant[3]]);

            // orienteringsändring

            switch (sida) {
                case T: {
                    int[] kopiaHörn = this.hörn[0].getOrientering();
                    int[] kopiaHörn2 = this.hörn[3].getOrientering();
                    int[] kopiaKant = this.kant[0].getOrientering();
                    int[] kopiaKant2 = this.kant[3].getOrientering();

                    this.hörn[0].setOrientering(
                            Helper2.bytaPlats(this.hörn[2].getOrientering(), 1, 2));

                    this.hörn[2].setOrientering(
                            Helper2.bytaPlats(kopiaHörn, 1, 2));

                    this.hörn[3].setOrientering(
                            Helper2.bytaPlats(this.hörn[1].getOrientering(), 1, 2));

                    this.hörn[1].setOrientering(
                            Helper2.bytaPlats(kopiaHörn2, 1, 2));

                    this.kant[0].setOrientering(this.kant[2].getOrientering());
                    this.kant[2].setOrientering(kopiaKant);
                    this.kant[3].setOrientering(this.kant[1].getOrientering());
                    this.kant[1].setOrientering(kopiaKant2);

                    break;
                }

                case F: {
                    int[] kopiaHörn = this.hörn[5].getOrientering();
                    int[] kopiaHörn2 = this.hörn[0].getOrientering();
                    int[] kopiaKant = this.kant[10].getOrientering();
                    int[] kopiaKant2 = this.kant[7].getOrientering();

                    this.hörn[5].setOrientering(
                            Helper2.roteraMedurs(this.hörn[3].getOrientering()));

                    this.hörn[3].setOrientering(
                            Helper2.roteraMoturs(kopiaHörn));

                    this.hörn[0].setOrientering(
                            Helper2.roteraMoturs(this.hörn[6].getOrientering()));

                    this.hörn[6].setOrientering(
                            Helper2.roteraMedurs(kopiaHörn2));

                    this.kant[10].setOrientering(
                            Helper2.bytaPlats(this.kant[0].getOrientering(), 0, 1));
                    this.kant[0].setOrientering(
                            Helper2.bytaPlats(kopiaKant, 0, 1));
                    this.kant[7].setOrientering(this.kant[4].getOrientering());
                    this.kant[4].setOrientering(kopiaKant2);

                    break;
                }

                case H: {
                    int[] kopiaHörn = this.hörn[6].getOrientering();
                    int[] kopiaHörn2 = this.hörn[3].getOrientering();
                    int[] kopiaKant = this.kant[11].getOrientering();
                    int[] kopiaKant2 = this.kant[4].getOrientering();

                    this.hörn[6].setOrientering(
                            Helper2.bytaPlats(this.hörn[2].getOrientering(), 0, 2));

                    this.hörn[2].setOrientering(
                            Helper2.bytaPlats(kopiaHörn, 0, 2));

                    this.hörn[3].setOrientering(
                            Helper2.bytaPlats(this.hörn[7].getOrientering(), 0, 2));

                    this.hörn[7].setOrientering(
                            Helper2.bytaPlats(kopiaHörn2, 0, 2));

                    this.kant[11].setOrientering(
                            Helper2.bytaPlats(this.kant[3].getOrientering(), 0, 1));
                    this.kant[3].setOrientering(
                            Helper2.bytaPlats(kopiaKant, 0, 1));
                    this.kant[4].setOrientering(
                            Helper2.bytaPlats(this.kant[5].getOrientering(), 0, 1));
                    this.kant[5].setOrientering(
                            Helper2.bytaPlats(kopiaKant2, 0, 1));

                    break;
                }

                case V: {
                    int[] kopiaHörn = this.hörn[4].getOrientering();
                    int[] kopiaHörn2 = this.hörn[1].getOrientering();
                    int[] kopiaKant = this.kant[9].getOrientering();
                    int[] kopiaKant2 = this.kant[6].getOrientering();

                    this.hörn[4].setOrientering(
                            Helper2.bytaPlats(this.hörn[0].getOrientering(), 0, 2));

                    this.hörn[0].setOrientering(
                            Helper2.bytaPlats(kopiaHörn, 0, 2));

                    this.hörn[1].setOrientering(
                            Helper2.bytaPlats(this.hörn[5].getOrientering(), 0, 2));

                    this.hörn[5].setOrientering(
                            Helper2.bytaPlats(kopiaHörn2, 0, 2));

                    this.kant[9].setOrientering(
                            Helper2.bytaPlats(this.kant[1].getOrientering(), 0, 1));
                    this.kant[1].setOrientering(
                            Helper2.bytaPlats(kopiaKant, 0, 1));
                    this.kant[6].setOrientering(
                            Helper2.bytaPlats(this.kant[7].getOrientering(), 0, 1));
                    this.kant[7].setOrientering(
                            Helper2.bytaPlats(kopiaKant2, 0, 1));

                    break;
                }

                case B: {
                    int[] kopiaHörn = this.hörn[7].getOrientering();
                    int[] kopiaHörn2 = this.hörn[2].getOrientering();
                    int[] kopiaKant = this.kant[8].getOrientering();
                    int[] kopiaKant2 = this.kant[5].getOrientering();

                    this.hörn[7].setOrientering(
                            Helper2.roteraMedurs(this.hörn[1].getOrientering()));

                    this.hörn[1].setOrientering(
                            Helper2.roteraMoturs(kopiaHörn));

                    this.hörn[2].setOrientering(
                            Helper2.roteraMoturs(this.hörn[4].getOrientering()));

                    this.hörn[4].setOrientering(
                            Helper2.roteraMedurs(kopiaHörn2));

                    this.kant[8].setOrientering(
                            Helper2.bytaPlats(this.kant[2].getOrientering(), 0, 1));
                    this.kant[2].setOrientering(
                            Helper2.bytaPlats(kopiaKant, 0, 1));
                    this.kant[5].setOrientering(this.kant[6].getOrientering());
                    this.kant[6].setOrientering(kopiaKant2);

                    break;
                }

                case b: {
                    int[] kopiaHörn = this.hörn[4].getOrientering();
                    int[] kopiaHörn2 = this.hörn[5].getOrientering();
                    int[] kopiaKant = this.kant[8].getOrientering();
                    int[] kopiaKant2 = this.kant[9].getOrientering();

                    this.hörn[4].setOrientering(
                            Helper2.bytaPlats(this.hörn[6].getOrientering(), 0, 1));

                    this.hörn[6].setOrientering(
                            Helper2.bytaPlats(kopiaHörn, 0, 1));

                    this.hörn[5].setOrientering(
                            Helper2.bytaPlats(this.hörn[7].getOrientering(), 0, 1));

                    this.hörn[7].setOrientering(
                            Helper2.bytaPlats(kopiaHörn2, 0, 1));

                    this.kant[8].setOrientering(this.kant[10].getOrientering());
                    this.kant[10].setOrientering(kopiaKant);
                    this.kant[9].setOrientering(this.kant[11].getOrientering());
                    this.kant[11].setOrientering(kopiaKant2);

                    break;
                }
            }
        }
        antalVridningar++;
        System.out.println(antalVridningar + ". " + vridning.getKortKod());
        return this;
    }
}
