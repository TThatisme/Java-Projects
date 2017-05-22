package toms.rubikskub3x3;

/**
 * Created by Tom on 2017-05-09.
 */
public class Algoritmer {

    // Solving the first corner piece
    public static Kub2 lösFörstaHörnet(Kub2 kub) {
        System.out.println("lösFörstaHörnet");

        Hörn2 hörnet = Helper2.hittaHörn(kub.getHörn(), new int[]{1, 2, 4});
        String hörnetsPosition =
                (String.valueOf(hörnet.getPosition()[0]) + hörnet.getPosition()[1] + hörnet.getPosition()[2]).intern();
        String hörnetsOrientering =
                (String.valueOf(hörnet.getOrientering()[0]) + hörnet.getOrientering()[1]
                        + hörnet.getOrientering()[2]).intern();

        switch (hörnetsPosition){
            case "124":
            {
                if(hörnetsOrientering == "124")
                {

                }else if(hörnetsOrientering == "412")
                {
                    kub = kub.vridKuben(Kubsida.V, Vridningar.v);       //V'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);       //T'

                }else if(hörnetsOrientering == "241")
                {
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);       //F
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);       //T
                }
                break;
            }
            case "145":
            {
                if(hörnetsOrientering == "124")
                {
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);       //T'
                }else if(hörnetsOrientering == "412")
                {
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);      //B'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);      //2T

                }else if(hörnetsOrientering == "241")
                {
                    kub = kub.vridKuben(Kubsida.V, Vridningar.V);       //V
                }
                break;
            }
            case "135":
            {
                if(hörnetsOrientering == "142")
                {
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);      //2T
                }else if(hörnetsOrientering == "214")
                {
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);      //B
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);       //T'

                }else if(hörnetsOrientering == "421")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);       //H'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);       //T
                }
                break;
            }
            case "123":
            {
                if(hörnetsOrientering == "142")
                {
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);       //T
                }else if(hörnetsOrientering == "214")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);       //H
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);      //2T

                }else if(hörnetsOrientering == "421")
                {
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);       //F'
                }
                break;
            }
            case "456":
            {
                if(hörnetsOrientering == "421")
                {
                    kub = kub.vridKuben(Kubsida.V, Vridningar.VV);      //2V
                }else if(hörnetsOrientering == "142")
                {
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);      //B'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);       //T'

                }else if(hörnetsOrientering == "214")
                {
                    kub = kub.vridKuben(Kubsida.V, Vridningar.V);        //V
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);        //T'
                }
                break;
            }
            case "246":
            {
                if(hörnetsOrientering == "421")
                {
                    kub = kub.vridKuben(Kubsida.V, Vridningar.VV);       //2V
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);        //T'
                }else if(hörnetsOrientering == "142")
                {
                    kub = kub.vridKuben(Kubsida.V, Vridningar.v);        //V'

                }else if(hörnetsOrientering == "214")
                {
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);        //F
                }
                break;
            }
            case "236":
            {
                if(hörnetsOrientering == "241")
                {
                    kub = kub.vridKuben(Kubsida.F, Vridningar.FF);       //2F
                }else if(hörnetsOrientering == "124")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);        //H
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);        //T

                }else if(hörnetsOrientering == "412")
                {
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);        //F'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);        //T
                }
                break;
            }
            case "356":
            {
                if(hörnetsOrientering == "241")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.HH);       //2H
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);        //T
                }else if(hörnetsOrientering == "124")
                {
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);       //B
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);       //2T

                }else if(hörnetsOrientering == "412")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);        //H'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);       //2T
                }
                break;
            }
        }

        System.out.println("----------");
        return kub;
    }

    // Solving the second corner piece
    public static Kub2 lösAndraHörnet(Kub2 kub) {
        System.out.println("lösAndraHörnet");

        Hörn2 hörnet = Helper2.hittaHörn(kub.getHörn(), new int[]{1, 4, 5});
        String hörnetsPosition =
                (String.valueOf(hörnet.getPosition()[0]) + hörnet.getPosition()[1] + hörnet.getPosition()[2]).intern();
        String hörnetsOrientering =
                (String.valueOf(hörnet.getOrientering()[0]) + hörnet.getOrientering()[1]
                        + hörnet.getOrientering()[2]).intern();

        switch (hörnetsPosition){
            case "145":
            {
                if(hörnetsOrientering == "145")
                {
                }else if(hörnetsOrientering == "514")
                {
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BABA);       //2B

                }else if(hörnetsOrientering == "451")
                {
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BABA);       //2B
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                }
                break;
            }
            case "135":
            {
                if(hörnetsOrientering == "154")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                }else if(hörnetsOrientering == "415")
                {
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B

                }else if(hörnetsOrientering == "541")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BABA);       //2B
                }
                break;
            }
            case "123":
            {
                if(hörnetsOrientering == "154")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.HH);         //2H
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BABA);       //2B
                }else if(hörnetsOrientering == "415")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BABA);       //2B

                }else if(hörnetsOrientering == "541")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B
                }
                break;
            }
            case "456":
            {
                if(hörnetsOrientering == "541")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BABA);       //2B
                }else if(hörnetsOrientering == "154")
                {
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'

                }else if(hörnetsOrientering == "415")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BABA);       //2B
                }
                break;
            }
            case "246":
            {
                if(hörnetsOrientering == "541")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BABA);       //2B
                }else if(hörnetsOrientering == "154")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'

                }else if(hörnetsOrientering == "415")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BABA);       //2B
                }
                break;
            }
            case "236":
            {
                if(hörnetsOrientering == "451")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BABA);       //2B
                }else if(hörnetsOrientering == "145")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BABA);       //2B

                }else if(hörnetsOrientering == "514")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                }
                break;
            }
            case "356":
            {
                if(hörnetsOrientering == "451")
                {
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BABA);       //2B
                }else if(hörnetsOrientering == "145")
                {
                    kub = kub.vridKuben(Kubsida.V, Vridningar.v);          //V'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.V, Vridningar.V);          //V

                }else if(hörnetsOrientering == "514")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                }
                break;
            }
        }

        System.out.println("----------");
        return kub;
    }

    // Solving the third corner piece
    public static Kub2 lösTredjeHörnet(Kub2 kub) {
        System.out.println("lösTredjeHörnet");

        Hörn2 hörnet = Helper2.hittaHörn(kub.getHörn(), new int[]{1, 3, 5});
        String hörnetsPosition =
                (String.valueOf(hörnet.getPosition()[0]) + hörnet.getPosition()[1] + hörnet.getPosition()[2]).intern();
        String hörnetsOrientering =
                (String.valueOf(hörnet.getOrientering()[0]) + hörnet.getOrientering()[1]
                        + hörnet.getOrientering()[2]).intern();

        switch (hörnetsPosition){
            case "135":
            {
                if(hörnetsOrientering == "135")
                {
                }else if(hörnetsOrientering == "513")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.HH);         //2H
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'

                }else if(hörnetsOrientering == "351")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.H, Vridningar.HH);         //2H
                }
                break;
            }
            case "123":
            {
                if(hörnetsOrientering == "135")
                {
                    kub = kub.vridKuben(Kubsida.V, Vridningar.VV);         //2V
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                    kub = kub.vridKuben(Kubsida.V, Vridningar.VV);         //2V
                }else if(hörnetsOrientering == "513")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                }else if(hörnetsOrientering == "351")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                }
                break;
            }
            case "456":
            {
                if(hörnetsOrientering == "351")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.HH);         //2H
                }else if(hörnetsOrientering == "135")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                }else if(hörnetsOrientering == "513")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                }
                break;
            }
            case "246":
            {
                if(hörnetsOrientering == "351")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.HH);         //2H
                }else if(hörnetsOrientering == "135")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'

                }else if(hörnetsOrientering == "513")
                {
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                    kub = kub.vridKuben(Kubsida.H, Vridningar.HH);         //2H
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                }
                break;
            }
            case "236":
            {
                if(hörnetsOrientering == "531")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.HH);         //2H
                }else if(hörnetsOrientering == "153")
                {
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B
                }else if(hörnetsOrientering == "315")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                }
                break;
            }
            case "356":
            {
                if(hörnetsOrientering == "531")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.H, Vridningar.HH);         //2H
                }else if(hörnetsOrientering == "153")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'

                }else if(hörnetsOrientering == "315")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                }
                break;
            }
        }

        System.out.println("----------");
        return kub;
    }

    // Solving the fourth corner piece
    public static Kub2 lösFjärdeHörnet(Kub2 kub) {
        System.out.println("lösFjärdeHörnet");

        Hörn2 hörnet = Helper2.hittaHörn(kub.getHörn(), new int[]{1, 2, 3});
        String hörnetsPosition =
                (String.valueOf(hörnet.getPosition()[0]) + hörnet.getPosition()[1] + hörnet.getPosition()[2]).intern();
        String hörnetsOrientering =
                (String.valueOf(hörnet.getOrientering()[0]) + hörnet.getOrientering()[1]
                        + hörnet.getOrientering()[2]).intern();

        switch (hörnetsPosition){
            case "123":
            {
                if(hörnetsOrientering == "123")
                {
                }else if(hörnetsOrientering == "312")
                {
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                }else if(hörnetsOrientering == "231")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                }
                break;
            }
            case "456":
            {
                if(hörnetsOrientering == "231")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);      //2b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);         //H'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);        //b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);         //H
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);         //F
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);      //2b
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);         //F'
                }else if(hörnetsOrientering == "123")
                {
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);         //F
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);      //2b
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);         //F'
                }else if(hörnetsOrientering == "312")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);         //H'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);      //2b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);         //H
                }
                break;
            }
            case "246":
            {
                if(hörnetsOrientering == "231")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                }else if(hörnetsOrientering == "123")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'

                }else if(hörnetsOrientering == "312")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                }
                break;
            }
            case "236":
            {
                if(hörnetsOrientering == "321")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                }else if(hörnetsOrientering == "132")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                }else if(hörnetsOrientering == "213")
                {

                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                }
                break;
            }
            case "356":
            {
                if(hörnetsOrientering == "321")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                }else if(hörnetsOrientering == "132")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                }else if(hörnetsOrientering == "213")
                {
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                }
                break;
            }
        }

        System.out.println("----------");
        return kub;
    }

    // Solving the first edge piece
    public static Kub2 lösFörstaKanten(Kub2 kub) {
        System.out.println("lösFörstaKanten");

        Kant2 kanten = Helper2.hittaKant(kub.getKant(), new int[]{1, 2});
        String kantensPosition =
                (String.valueOf(kanten.getPosition()[0]) + kanten.getPosition()[1]).intern();
        String hörnetsOrientering =
                (String.valueOf(kanten.getOrientering()[0]) + kanten.getOrientering()[1]).intern();

        switch (kantensPosition){
            case "12":
            {
                if(hörnetsOrientering == "12")
                {
                }else if(hörnetsOrientering == "21")
                {
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.V, Vridningar.VV);         //2V
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                }
                break;
            }
            case "14":
            {
                if(hörnetsOrientering == "12")
                {
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                }else if(hörnetsOrientering == "21")
                {
                    kub = kub.vridKuben(Kubsida.V, Vridningar.v);          //V'
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                }
                break;
            }
            case "15":
            {
                if(hörnetsOrientering == "12")
                {
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BABA);       //2B
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                }else if(hörnetsOrientering == "21")
                {
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.V, Vridningar.V);          //V
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'

                }
                break;
            }
            case "13":
            {
                if(hörnetsOrientering == "12")
                {
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B
                    kub = kub.vridKuben(Kubsida.V, Vridningar.v);          //V'
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                }else if(hörnetsOrientering == "21")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B
                    kub = kub.vridKuben(Kubsida.V, Vridningar.v);          //V'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                }
                break;
            }
            case "23":
            {
                if(hörnetsOrientering == "12")
                {
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                }else if(hörnetsOrientering == "21")
                {
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.V, Vridningar.V);          //V
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                }
                break;
            }
            case "35":
            {
                if(hörnetsOrientering == "12")
                {
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);           //F'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);          //2T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);        //2b
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);          //B
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);          //2T
                }else if(hörnetsOrientering == "21")
                {
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                }
                break;
            }
            case "45":
            {
                if(hörnetsOrientering == "12")
                {
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                }else if(hörnetsOrientering == "21")
                {
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.V, Vridningar.V);          //V
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                }
                break;
            }
            case "24":
            {
                if(hörnetsOrientering == "21")
                {
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F

                }else if(hörnetsOrientering == "12")
                {
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.V, Vridningar.v);          //V'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                }
                break;
            }
            case "56":
            {
                if(hörnetsOrientering == "21")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = nummerEtt12(kub);
                }else if(hörnetsOrientering == "12")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = nummerTvå12(kub);
                }
                break;
            }
            case "46":
            {
                if(hörnetsOrientering == "21")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = nummerEtt12(kub);
                }else if(hörnetsOrientering == "12")
                {
                    kub = nummerTvå12(kub);
                }
                break;
            }
            case "26":
            {
                if(hörnetsOrientering == "21")
                {
                    kub = nummerEtt12(kub);
                }else if(hörnetsOrientering == "12")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
                    kub = nummerTvå12(kub);
                }
                break;
            }
            case "36":
            {
                if(hörnetsOrientering == "21")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
                    kub = nummerEtt12(kub);
                }else if(hörnetsOrientering == "12")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = nummerTvå12(kub);
                }
                break;
            }
        }

        System.out.println("----------");
        return kub;
    }

    // Solving the second edge piece
    public static Kub2 lösAndraKanten(Kub2 kub) {
        System.out.println("lösAndraKanten");

        Kant2 kanten = Helper2.hittaKant(kub.getKant(), new int[]{1, 4});
        String kantensPosition =
                (String.valueOf(kanten.getPosition()[0]) + kanten.getPosition()[1]).intern();
        String hörnetsOrientering =
                (String.valueOf(kanten.getOrientering()[0]) + kanten.getOrientering()[1]).intern();

        switch (kantensPosition){
            case "14":
            {
                if(hörnetsOrientering == "14")
                {
                }else if(hörnetsOrientering == "41")
                {
                    kub = kub.vridKuben(Kubsida.V, Vridningar.V);          //V
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BABA);       //2B
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                }
                break;
            }
            case "15":
            {
                if(hörnetsOrientering == "14")
                {
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                    kub = kub.vridKuben(Kubsida.V, Vridningar.v);          //V'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                }else if(hörnetsOrientering == "41")
                {
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                    kub = kub.vridKuben(Kubsida.V, Vridningar.V);          //V
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                }
                break;
            }
            case "13":
            {
                if(hörnetsOrientering == "14")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.V, Vridningar.v);          //V'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.V, Vridningar.V);          //V
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                }else if(hörnetsOrientering == "41")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.V, Vridningar.V);          //V
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T

                }
                break;
            }
            case "23":
            {
                if(hörnetsOrientering == "41")
                {
                    kub = kub.vridKuben(Kubsida.V, Vridningar.V);          //V
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                }else if(hörnetsOrientering == "14")
                {
                    kub = kub.vridKuben(Kubsida.V, Vridningar.v);          //V'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                }
                break;
            }
            case "35":
            {
                if(hörnetsOrientering == "14")
                {
                    kub = kub.vridKuben(Kubsida.V, Vridningar.v);           //V'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);           //T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);          //b'
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);          //B
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);           //T'
                }else if(hörnetsOrientering == "41")
                {
                    kub = kub.vridKuben(Kubsida.V, Vridningar.V);           //V
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);          //2T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);        //2b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);           //H'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);          //2T
                }
                break;
            }
            case "45":
            {
                if(hörnetsOrientering == "41")
                {
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.V, Vridningar.V);          //V
                }else if(hörnetsOrientering == "14")
                {
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                }
                break;
            }
            case "24":
            {
                if(hörnetsOrientering == "41")
                {
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T

                }else if(hörnetsOrientering == "14")
                {
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.V, Vridningar.v);          //V'
                }
                break;
            }
            case "56":
            {
                if(hörnetsOrientering == "41")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
                    kub = nummerEtt14(kub);
                }else if(hörnetsOrientering == "14")
                {
                    kub = nummerTvå14(kub);
                }
                break;
            }
            case "46":
            {
                if(hörnetsOrientering == "41")
                {
                    kub = nummerEtt14(kub);
                }else if(hörnetsOrientering == "14")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = nummerTvå14(kub);
                }
                break;
            }
            case "26":
            {
                if(hörnetsOrientering == "41")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
                    kub = nummerEtt14(kub);
                }else if(hörnetsOrientering == "14")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = nummerTvå14(kub);
                }
                break;
            }
            case "36":
            {
                if(hörnetsOrientering == "41")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = nummerEtt14(kub);
                }else if(hörnetsOrientering == "14")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
                    kub = nummerTvå14(kub);
                }
                break;
            }
        }

        System.out.println("----------");
        return kub;
    }

    // Solving the third edge piece
    public static Kub2 lösTredjeKanten(Kub2 kub) {
        System.out.println("lösTredjeKanten");

        Kant2 kanten = Helper2.hittaKant(kub.getKant(), new int[]{1, 5});
        String kantensPosition =
                (String.valueOf(kanten.getPosition()[0]) + kanten.getPosition()[1]).intern();
        String hörnetsOrientering =
                (String.valueOf(kanten.getOrientering()[0]) + kanten.getOrientering()[1]).intern();

        switch (kantensPosition){
            case "15":
            {
                if(hörnetsOrientering == "15")
                {
                }else if(hörnetsOrientering == "51")
                {
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.H, Vridningar.HH);         //2H
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.V, Vridningar.V);          //V
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                }
                break;
            }
            case "13":
            {
                if(hörnetsOrientering == "15")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                }else if(hörnetsOrientering == "51")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                    kub = kub.vridKuben(Kubsida.V, Vridningar.V);          //V
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                }
                break;
            }
            case "23":
            {
                if(hörnetsOrientering == "51")
                {
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                }else if(hörnetsOrientering == "15")
                {
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                }
                break;
            }
            case "35":
            {
                if(hörnetsOrientering == "15")
                {
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                    kub = kub.vridKuben(Kubsida.V, Vridningar.v);          //V'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B
                }else if(hörnetsOrientering == "51")
                {
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                }
                break;
            }
            case "45":
            {
                if(hörnetsOrientering == "15")
                {
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                }else if(hörnetsOrientering == "51")
                {
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.V, Vridningar.V);          //V
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                }
                break;
            }
            case "24":
            {
                if(hörnetsOrientering == "51")
                {
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                }else if(hörnetsOrientering == "15")
                {
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.V, Vridningar.v);          //V'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                }
                break;
            }
            case "56":
            {
                if(hörnetsOrientering == "51")
                {
                    kub = nummerEtt15(kub);
                }else if(hörnetsOrientering == "15")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
                    kub = nummerTvå15(kub);
                }
                break;
            }
            case "46":
            {
                if(hörnetsOrientering == "51")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
                    kub = nummerEtt15(kub);
                }else if(hörnetsOrientering == "15")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);         //2b
                    kub = nummerTvå15(kub);
                }
                break;
            }
            case "26":
            {
                if(hörnetsOrientering == "51")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = nummerEtt15(kub);
                }else if(hörnetsOrientering == "15")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
                    kub = nummerTvå15(kub);
                }
                break;
            }
            case "36":
            {
                if(hörnetsOrientering == "51")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
                    kub = nummerEtt15(kub);
                }else if(hörnetsOrientering == "15")
                {
                    kub = nummerTvå15(kub);
                }
                break;
            }
        }

        System.out.println("----------");
        return kub;
    }

    // Solving the fourth edge piece
    public static Kub2 lösFjärdeKanten(Kub2 kub) {
        System.out.println("lösFjärdeKanten");

        Kant2 kanten = Helper2.hittaKant(kub.getKant(), new int[]{1, 3});
        String kantensPosition =
                (String.valueOf(kanten.getPosition()[0]) + kanten.getPosition()[1]).intern();
        String hörnetsOrientering =
                (String.valueOf(kanten.getOrientering()[0]) + kanten.getOrientering()[1]).intern();

        switch (kantensPosition){
            case "13":
            {
                if(hörnetsOrientering == "13")
                {
                }else if(hörnetsOrientering == "31")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.F, Vridningar.FF);         //2F
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                }
                break;
            }
            case "23":
            {
                if(hörnetsOrientering == "31")
                {
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.V, Vridningar.V);          //V
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.F, Vridningar.f);          //F'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                }else if(hörnetsOrientering == "13")
                {
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                }
                break;
            }
            case "35":
            {
                if(hörnetsOrientering == "13")
                {
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.V, Vridningar.v);          //V'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.B, Vridningar.BA);         //B
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                }else if(hörnetsOrientering == "31")
                {
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                }
                break;
            }
            case "45":
            {
                if(hörnetsOrientering == "13")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = kub.vridKuben(Kubsida.B, Vridningar.ba);         //B'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                }else if(hörnetsOrientering == "31")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.V, Vridningar.V);          //V
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                }
                break;
            }
            case "24":
            {
                if(hörnetsOrientering == "31")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.h);          //H'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.T);          //T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = kub.vridKuben(Kubsida.F, Vridningar.F);          //F
                    kub = kub.vridKuben(Kubsida.T, Vridningar.t);          //T'
                }else if(hörnetsOrientering == "13")
                {
                    kub = kub.vridKuben(Kubsida.H, Vridningar.H);          //H
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = kub.vridKuben(Kubsida.V, Vridningar.v);          //V'
                    kub = kub.vridKuben(Kubsida.T, Vridningar.TT);         //2T
                }
                break;
            }
            case "56":
            {
                if(hörnetsOrientering == "31")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
                    kub = nummerEtt13(kub);
                }else if(hörnetsOrientering == "13")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = nummerTvå13(kub);
                }
                break;
            }
            case "46":
            {
                if(hörnetsOrientering == "31")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = nummerEtt13(kub);
                }else if(hörnetsOrientering == "13")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = nummerTvå13(kub);
                }
                break;
            }
            case "26":
            {
                if(hörnetsOrientering == "31")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
                    kub = nummerEtt13(kub);
                }else if(hörnetsOrientering == "13")
                {
                    kub = nummerTvå13(kub);
                }
                break;
            }
            case "36":
            {
                if(hörnetsOrientering == "31")
                {
                    kub = nummerEtt13(kub);
                }else if(hörnetsOrientering == "13")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
                    kub = nummerTvå13(kub);
                }
                break;
            }
        }

        System.out.println("----------");
        return kub;
    }

    // Solving the fifth edge piece
    public static Kub2 lösFemteKanten(Kub2 kub) {
        System.out.println("lösFemteKanten");

        Kant2 kanten = Helper2.hittaKant(kub.getKant(), new int[]{2, 3});
        String kantensPosition =
                (String.valueOf(kanten.getPosition()[0]) + kanten.getPosition()[1]).intern();
        String hörnetsOrientering =
                (String.valueOf(kanten.getOrientering()[0]) + kanten.getOrientering()[1]).intern();

        switch (kantensPosition){
            case "23":
            {
                if(hörnetsOrientering == "23")
                {
                }else if(hörnetsOrientering == "32")
                {
                    kub = blå23(kub);
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);          //b
                    kub = blå23(kub);
                }
                break;
            }
            case "35":
            {
                if(hörnetsOrientering == "23")
                {
                    kub = grön35(kub);
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);          //b'
                    kub = blå23(kub);
                }else if(hörnetsOrientering == "32")
                {
                    kub = orange35(kub);
                    kub = blå23(kub);
                }
                break;
            }
            case "45":
            {
                if(hörnetsOrientering == "23")
                {
                    kub = grön45(kub);
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);          //b'
                    kub = blå23(kub);
                }else if(hörnetsOrientering == "32")
                {
                    kub = röd45(kub);
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);         //2b
                    kub = blå23(kub);
                }
                break;
            }
            case "24":
            {
                if(hörnetsOrientering == "23")
                {
                    kub = röd24(kub);
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);          //2b
                    kub = blå23(kub);
                }else if(hörnetsOrientering == "32")
                {
                    kub = blå24(kub);
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);         //b
                    kub = blå23(kub);
                }
                break;
            }
            case "56":
            {
                if(hörnetsOrientering == "23")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
                    kub = blå23(kub);
                }else if(hörnetsOrientering == "32")
                {
                    kub = orange23(kub);
                }
                break;
            }
            case "46":
            {
                if(hörnetsOrientering == "23")
                {
                    kub = blå23(kub);
                }else if(hörnetsOrientering == "32")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = orange23(kub);
                }
                break;
            }
            case "26":
            {
                if(hörnetsOrientering == "23")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
                    kub = blå23(kub);
                }else if(hörnetsOrientering == "32")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = orange23(kub);
                }
                break;
            }
            case "36":
            {
                if(hörnetsOrientering == "23")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = blå23(kub);
                }else if(hörnetsOrientering == "32")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
                    kub = orange23(kub);
                }
                break;
            }
        }

        System.out.println("----------");
        return kub;
    }

    // Solving the sixth edge piece
    public static Kub2 lösSjätteKanten(Kub2 kub) {
        System.out.println("lösSjätteKanten");

        Kant2 kanten = Helper2.hittaKant(kub.getKant(), new int[]{3, 5});
        String kantensPosition =
                (String.valueOf(kanten.getPosition()[0]) + kanten.getPosition()[1]).intern();
        String hörnetsOrientering =
                (String.valueOf(kanten.getOrientering()[0]) + kanten.getOrientering()[1]).intern();

        switch (kantensPosition){
            case "35":
            {
                if(hörnetsOrientering == "35")
                {
                }else if(hörnetsOrientering == "53")
                {
                    kub = orange35(kub);
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
                    kub = orange35(kub);
                }
                break;
            }
            case "45":
            {
                if(hörnetsOrientering == "35")
                {
                    kub = grön45(kub);
                    kub = orange35(kub);
                }else if(hörnetsOrientering == "53")
                {
                    kub = röd45(kub);
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = orange35(kub);
                }
                break;
            }
            case "24":
            {
                if(hörnetsOrientering == "35")
                {
                    kub = röd24(kub);
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);          //b'
                    kub = orange35(kub);
                }else if(hörnetsOrientering == "53")
                {
                    kub = blå24(kub);
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);         //2b
                    kub = orange35(kub);
                }
                break;
            }
            case "56":
            {
                if(hörnetsOrientering == "35")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = orange35(kub);
                }else if(hörnetsOrientering == "53")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
                    kub = grön35(kub);
                }
                break;
            }
            case "46":
            {
                if(hörnetsOrientering == "35")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
                    kub = orange35(kub);
                }else if(hörnetsOrientering == "53")
                {
                    kub = grön35(kub);
                }
                break;
            }
            case "26":
            {
                if(hörnetsOrientering == "35")
                {
                    kub = orange35(kub);
                }else if(hörnetsOrientering == "53")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
                    kub = grön35(kub);
                }
                break;
            }
            case "36":
            {
                if(hörnetsOrientering == "35")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
                    kub = orange35(kub);
                }else if(hörnetsOrientering == "53")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = grön35(kub);
                }
                break;
            }
        }

        System.out.println("----------");
        return kub;
    }

    // Solving the seventh edge piece
    public static Kub2 lösSjundeKanten(Kub2 kub) {
        System.out.println("lösSjundeKanten");

        Kant2 kanten = Helper2.hittaKant(kub.getKant(), new int[]{4, 5});
        String kantensPosition =
                (String.valueOf(kanten.getPosition()[0]) + kanten.getPosition()[1]).intern();
        String hörnetsOrientering =
                (String.valueOf(kanten.getOrientering()[0]) + kanten.getOrientering()[1]).intern();

        switch (kantensPosition){
            case "45":
            {
                if(hörnetsOrientering == "45")
                {
                }else if(hörnetsOrientering == "54")
                {
                    kub = röd45(kub);
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = röd45(kub);
                }
                break;
            }
            case "24":
            {
                if(hörnetsOrientering == "45")
                {
                    kub = röd24(kub);
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);          //b'
                    kub = röd45(kub);
                }else if(hörnetsOrientering == "54")
                {
                    kub = blå24(kub);
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);         //2b
                    kub = röd45(kub);
                }
                break;
            }
            case "56":
            {
                if(hörnetsOrientering == "45")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = röd45(kub);
                }else if(hörnetsOrientering == "54")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
                    kub = grön45(kub);
                }
                break;
            }
            case "46":
            {
                if(hörnetsOrientering == "45")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
                    kub = röd45(kub);
                }else if(hörnetsOrientering == "54")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = grön45(kub);
                }
                break;
            }
            case "26":
            {
                if(hörnetsOrientering == "45")
                {
                    kub = röd45(kub);
                }else if(hörnetsOrientering == "54")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
                    kub = grön45(kub);
                }
                break;
            }
            case "36":
            {
                if(hörnetsOrientering == "45")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
                    kub = röd45(kub);
                }else if(hörnetsOrientering == "54")
                {
                    kub = grön45(kub);
                }
                break;
            }
        }

        System.out.println("----------");
        return kub;
    }

    // Solving the eight edge piece
    public static Kub2 lösÅttondeKanten(Kub2 kub) {
        System.out.println("lösÅttondeKanten");

        Kant2 kanten = Helper2.hittaKant(kub.getKant(), new int[]{2, 4});
        String kantensPosition =
                (String.valueOf(kanten.getPosition()[0]) + kanten.getPosition()[1]).intern();
        String hörnetsOrientering =
                (String.valueOf(kanten.getOrientering()[0]) + kanten.getOrientering()[1]).intern();

        switch (kantensPosition){
            case "24":
            {
                if(hörnetsOrientering == "24")
                {
                }else if(hörnetsOrientering == "42")
                {
                    kub = blå24(kub);
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);         //b'
                    kub = blå24(kub);
                }
                break;
            }
            case "56":
            {
                if(hörnetsOrientering == "24")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
                    kub = blå24(kub);
                }else if(hörnetsOrientering == "42")
                {
                    kub = röd24(kub);
                }
                break;
            }
            case "46":
            {
                if(hörnetsOrientering == "24")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = blå24(kub);
                }else if(hörnetsOrientering == "42")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
                    kub = röd24(kub);
                }
                break;
            }
            case "26":
            {
                if(hörnetsOrientering == "24")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
                    kub = blå24(kub);
                }else if(hörnetsOrientering == "42")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
                    kub = röd24(kub);
                }
                break;
            }
            case "36":
            {
                if(hörnetsOrientering == "24")
                {
                    kub = blå24(kub);
                }else if(hörnetsOrientering == "42")
                {
                    kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
                    kub = röd24(kub);
                }
                break;
            }
        }

        System.out.println("----------");
        return kub;
    }

    //Solve the edges on the last layer
    public static Kub2 lösKanterSistaLagret(Kub2 kub) {
        System.out.println("lösKanterSistaLagret");
        System.out.println("vända kanter");
        //Vända kanterna

        if((String.valueOf(kub.getKant()[8].getOrientering()[0]).intern() == "6") &
                (String.valueOf(kub.getKant()[9].getOrientering()[0]).intern() == "6") &
                (String.valueOf(kub.getKant()[10].getOrientering()[0]).intern() == "6") &
                (String.valueOf(kub.getKant()[11].getOrientering()[0]).intern() == "6") )
        {
            kub = vändaKantbitarBlåRödGrönOrange(kub);
        }else if((String.valueOf(kub.getKant()[8].getOrientering()[0]).intern() == "6") &
                (String.valueOf(kub.getKant()[9].getOrientering()[1]).intern() == "6") &
                (String.valueOf(kub.getKant()[10].getOrientering()[1]).intern() == "6") &
                (String.valueOf(kub.getKant()[11].getOrientering()[0]).intern() == "6") )
        {
            kub = vändaKantbitarGrönBlåx2(kub);
        }else if((String.valueOf(kub.getKant()[8].getOrientering()[1]).intern() == "6") &
                (String.valueOf(kub.getKant()[9].getOrientering()[1]).intern() == "6") &
                (String.valueOf(kub.getKant()[10].getOrientering()[0]).intern() == "6") &
                (String.valueOf(kub.getKant()[11].getOrientering()[0]).intern() == "6") )
        {
            kub = vändaKantbitarOrangeRödx2(kub);
        }else if((String.valueOf(kub.getKant()[8].getOrientering()[1]).intern() == "6") &
                (String.valueOf(kub.getKant()[9].getOrientering()[0]).intern() == "6") &
                (String.valueOf(kub.getKant()[10].getOrientering()[0]).intern() == "6") &
                (String.valueOf(kub.getKant()[11].getOrientering()[1]).intern() == "6") )
        {
            kub = vändaKantbitarBlåGrönx2(kub);
        }else if((String.valueOf(kub.getKant()[8].getOrientering()[0]).intern() == "6") &
                (String.valueOf(kub.getKant()[9].getOrientering()[0]).intern() == "6") &
                (String.valueOf(kub.getKant()[10].getOrientering()[1]).intern() == "6") &
                (String.valueOf(kub.getKant()[11].getOrientering()[1]).intern() == "6") )
        {
            kub = vändaKantbitarRödOrangex2(kub);
        }else if((String.valueOf(kub.getKant()[8].getOrientering()[1]).intern() == "6") &
                (String.valueOf(kub.getKant()[9].getOrientering()[0]).intern() == "6") &
                (String.valueOf(kub.getKant()[10].getOrientering()[1]).intern() == "6") &
                (String.valueOf(kub.getKant()[11].getOrientering()[0]).intern() == "6") )
        {
            kub = vändaKantbitarBlåGrön(kub);
        }else if((String.valueOf(kub.getKant()[8].getOrientering()[0]).intern() == "6") &
                (String.valueOf(kub.getKant()[9].getOrientering()[1]).intern() == "6") &
                (String.valueOf(kub.getKant()[10].getOrientering()[0]).intern() == "6") &
                (String.valueOf(kub.getKant()[11].getOrientering()[1]).intern() == "6") )
        {
            kub = vändaKantbitarOrangeRöd(kub);
        }

        System.out.println("positionera kanterna");
        //Positionera kanterna

        if(String.valueOf(kub.getKant()[10].getOrientering()[0]).intern() == "3")
        {
            kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        }else if(String.valueOf(kub.getKant()[9].getOrientering()[0]).intern() == "3")
        {
            kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);      //2b
        }else if(String.valueOf(kub.getKant()[8].getOrientering()[0]).intern() == "3")
        {
            kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'
        }

        if((String.valueOf(kub.getKant()[8].getOrientering()[0]).intern() == "5") &
                (String.valueOf(kub.getKant()[9].getOrientering()[0]).intern() == "2") &
                (String.valueOf(kub.getKant()[10].getOrientering()[0]).intern() == "4") &
                (String.valueOf(kub.getKant()[11].getOrientering()[0]).intern() == "3") )
        {
            kub = positioneraKantbitarBlåRöd(kub);
        }else if((String.valueOf(kub.getKant()[8].getOrientering()[0]).intern() == "4") &
                (String.valueOf(kub.getKant()[9].getOrientering()[0]).intern() == "5") &
                (String.valueOf(kub.getKant()[10].getOrientering()[0]).intern() == "2") &
                (String.valueOf(kub.getKant()[11].getOrientering()[0]).intern() == "3") )
        {
            kub = positioneraKantbitarRödGrön(kub);
        }else if((String.valueOf(kub.getKant()[8].getOrientering()[0]).intern() == "4") &
                (String.valueOf(kub.getKant()[9].getOrientering()[0]).intern() == "2") &
                (String.valueOf(kub.getKant()[10].getOrientering()[0]).intern() == "5") &
                (String.valueOf(kub.getKant()[11].getOrientering()[0]).intern() == "3") )
        {
            kub = positioneraKantbitarGrönOrange1(kub);
        }else if((String.valueOf(kub.getKant()[8].getOrientering()[0]).intern() == "2") &
                (String.valueOf(kub.getKant()[9].getOrientering()[0]).intern() == "5") &
                (String.valueOf(kub.getKant()[10].getOrientering()[0]).intern() == "4") &
                (String.valueOf(kub.getKant()[11].getOrientering()[0]).intern() == "3") )
        {
            kub = positioneraKantbitarOrangeBlå(kub);
        }else if((String.valueOf(kub.getKant()[8].getOrientering()[0]).intern() == "2") &
                (String.valueOf(kub.getKant()[9].getOrientering()[0]).intern() == "5") &
                (String.valueOf(kub.getKant()[10].getOrientering()[0]).intern() == "4") &
                (String.valueOf(kub.getKant()[11].getOrientering()[0]).intern() == "6") )
        {
            kub = positioneraKantbitarGrönOrange2(kub);
        }

        System.out.println("----------");
        return kub;
    }

    //Solve the corners on the last layer
    public static Kub2 lösHörnenSistaLagret(Kub2 kub) throws FelaktigBlandningHörnException {
        System.out.println("lösHörnenSistaLagret");
        System.out.println("positionera hörn");
        int check = 0;
        boolean c4,c5,c6,c7;
        if(((String.valueOf(kub.getHörn()[4].getNummer()[0]) +
                kub.getHörn()[4].getNummer()[1] +
                kub.getHörn()[4].getNummer()[2]).intern() != "456") &
                ((String.valueOf(kub.getHörn()[5].getNummer()[0]) +
                        kub.getHörn()[5].getNummer()[1] +
                        kub.getHörn()[5].getNummer()[2]).intern() != "246") &
                ((String.valueOf(kub.getKant()[6].getNummer()[0]) +
                        kub.getHörn()[6].getNummer()[1] +
                        kub.getHörn()[6].getNummer()[2]).intern() != "236") &
                ((String.valueOf(kub.getKant()[7].getNummer()[0]) +
                        kub.getHörn()[7].getNummer()[1] +
                        kub.getHörn()[7].getNummer()[2]).intern() != "356"))
        {
            if (((String.valueOf(kub.getHörn()[6].getNummer()[0]) +
                    kub.getHörn()[6].getNummer()[1] +
                    kub.getHörn()[6].getNummer()[2]).intern() == "456") |
                    ((String.valueOf(kub.getHörn()[4].getNummer()[0]) +
                            kub.getHörn()[4].getNummer()[1] +
                            kub.getHörn()[4].getNummer()[2]).intern() == "356") |
                    ((String.valueOf(kub.getKant()[7].getNummer()[0]) +
                            kub.getHörn()[7].getNummer()[1] +
                            kub.getHörn()[7].getNummer()[2]).intern() == "236")) {
                kub = positioneraHörnBlåRöd(kub);
                c6 = (String.valueOf(kub.getHörn()[6].getNummer()[0]) +
                        kub.getHörn()[6].getNummer()[1] +
                        kub.getHörn()[6].getNummer()[2]).intern() == "236";
                c4 = (String.valueOf(kub.getHörn()[4].getNummer()[0]) +
                        kub.getHörn()[4].getNummer()[1] +
                        kub.getHörn()[4].getNummer()[2]).intern() == "456";
                c7 = (String.valueOf(kub.getHörn()[7].getNummer()[0]) +
                        kub.getHörn()[7].getNummer()[1] +
                        kub.getHörn()[7].getNummer()[2]).intern() == "356";
                c5 = (String.valueOf(kub.getHörn()[5].getNummer()[0]) +
                        kub.getHörn()[5].getNummer()[1] +
                        kub.getHörn()[5].getNummer()[2]).intern() == "246";
                if(c6 & !c4 & !c7)
                {
                    kub = positioneraHörnOrangeBlå(kub);
                    if(!(c4 & c5 & c7))
                    {
                        kub = positioneraHörnOrangeBlå(kub);
                    }
                }else if(c4 & !c6 & !c7)
                {
                    kub = positioneraHörnRödGrön(kub);
                    if(!(c5 & c6 & c7))
                    {
                        kub = positioneraHörnRödGrön(kub);
                    }
                }else if(c7 & !c4 & !c5)
                {
                    kub = positioneraHörnGrönOrange(kub);
                    if(!(c4 & c5 & c6))
                    {
                        kub = positioneraHörnGrönOrange(kub);
                    }
                }

            }else if (((String.valueOf(kub.getHörn()[7].getNummer()[0]) +
                    kub.getHörn()[7].getNummer()[1] +
                    kub.getHörn()[7].getNummer()[2]).intern() == "246") |
                    ((String.valueOf(kub.getHörn()[5].getNummer()[0]) +
                            kub.getHörn()[5].getNummer()[1] +
                            kub.getHörn()[5].getNummer()[2]).intern() == "456") |
                    ((String.valueOf(kub.getHörn()[4].getNummer()[0]) +
                            kub.getHörn()[4].getNummer()[1] +
                            kub.getHörn()[4].getNummer()[2]).intern() == "356")) {
                kub = positioneraHörnOrangeBlå(kub);
                c6 = (String.valueOf(kub.getHörn()[6].getNummer()[0]) +
                        kub.getHörn()[6].getNummer()[1] +
                        kub.getHörn()[6].getNummer()[2]).intern() == "236";
                c4 = (String.valueOf(kub.getHörn()[4].getNummer()[0]) +
                        kub.getHörn()[4].getNummer()[1] +
                        kub.getHörn()[4].getNummer()[2]).intern() == "456";
                c7 = (String.valueOf(kub.getHörn()[7].getNummer()[0]) +
                        kub.getHörn()[7].getNummer()[1] +
                        kub.getHörn()[7].getNummer()[2]).intern() == "356";
                c5 = (String.valueOf(kub.getHörn()[5].getNummer()[0]) +
                        kub.getHörn()[5].getNummer()[1] +
                        kub.getHörn()[5].getNummer()[2]).intern() == "246";
                if(c7 & !c4 & !c5)
                {
                    kub = positioneraHörnGrönOrange(kub);
                    if(!(c4 & c5 & c6))
                    {
                        kub = positioneraHörnGrönOrange(kub);
                    }
                }else if(c5 & !c4 & !c7)
                {
                    kub = positioneraHörnBlåRöd(kub);
                    if(!(c4 & c6 & c7))
                    {
                        kub = positioneraHörnBlåRöd(kub);
                    }
                }else if(c4 & !c5 & !c7)
                {
                    kub = positioneraHörnRödGrön(kub);
                    if(!(c5 & c6 & c7))
                    {
                        kub = positioneraHörnRödGrön(kub);
                    }
                }
            }else if (((String.valueOf(kub.getHörn()[4].getNummer()[0]) +
                    kub.getHörn()[4].getNummer()[1] +
                    kub.getHörn()[4].getNummer()[2]).intern() == "236") |
                    ((String.valueOf(kub.getHörn()[6].getNummer()[0]) +
                            kub.getHörn()[6].getNummer()[1] +
                            kub.getHörn()[6].getNummer()[2]).intern() == "246") |
                    ((String.valueOf(kub.getHörn()[5].getNummer()[0]) +
                            kub.getHörn()[5].getNummer()[1] +
                            kub.getHörn()[5].getNummer()[2]).intern() == "456")) {
                kub = positioneraHörnGrönOrange(kub);
                c6 = (String.valueOf(kub.getHörn()[6].getNummer()[0]) +
                        kub.getHörn()[6].getNummer()[1] +
                        kub.getHörn()[6].getNummer()[2]).intern() == "236";
                c4 = (String.valueOf(kub.getHörn()[4].getNummer()[0]) +
                        kub.getHörn()[4].getNummer()[1] +
                        kub.getHörn()[4].getNummer()[2]).intern() == "456";
                c7 = (String.valueOf(kub.getHörn()[7].getNummer()[0]) +
                        kub.getHörn()[7].getNummer()[1] +
                        kub.getHörn()[7].getNummer()[2]).intern() == "356";
                c5 = (String.valueOf(kub.getHörn()[5].getNummer()[0]) +
                        kub.getHörn()[5].getNummer()[1] +
                        kub.getHörn()[5].getNummer()[2]).intern() == "246";
                if(c4 & !c5 & !c6)
                {
                    kub = positioneraHörnRödGrön(kub);
                    if(!(c5 & c6 & c7))
                    {
                        kub = positioneraHörnRödGrön(kub);
                    }
                }else if(c6 & !c4 & !c5)
                {
                    kub = positioneraHörnOrangeBlå(kub);
                    if(!(c4 & c5 & c7))
                    {
                        kub = positioneraHörnOrangeBlå(kub);
                    }
                }else if(c5 & !c4 & !c6)
                {
                    kub = positioneraHörnBlåRöd(kub);
                    if(!(c4 & c6 & c7))
                    {
                        kub = positioneraHörnBlåRöd(kub);
                    }
                }
            }else if (((String.valueOf(kub.getHörn()[5].getNummer()[0]) +
                    kub.getHörn()[5].getNummer()[1] +
                    kub.getHörn()[5].getNummer()[2]).intern() == "356") |
                    ((String.valueOf(kub.getHörn()[7].getNummer()[0]) +
                            kub.getHörn()[7].getNummer()[1] +
                            kub.getHörn()[7].getNummer()[2]).intern() == "236") |
                    ((String.valueOf(kub.getKant()[6].getNummer()[0]) +
                            kub.getHörn()[6].getNummer()[1] +
                            kub.getHörn()[6].getNummer()[2]).intern() == "246")) {
                kub = positioneraHörnRödGrön(kub);
                c6 = (String.valueOf(kub.getHörn()[6].getNummer()[0]) +
                        kub.getHörn()[6].getNummer()[1] +
                        kub.getHörn()[6].getNummer()[2]).intern() == "236";
                c4 = (String.valueOf(kub.getHörn()[4].getNummer()[0]) +
                        kub.getHörn()[4].getNummer()[1] +
                        kub.getHörn()[4].getNummer()[2]).intern() == "456";
                c7 = (String.valueOf(kub.getHörn()[7].getNummer()[0]) +
                        kub.getHörn()[7].getNummer()[1] +
                        kub.getHörn()[7].getNummer()[2]).intern() == "356";
                c5 = (String.valueOf(kub.getHörn()[5].getNummer()[0]) +
                        kub.getHörn()[5].getNummer()[1] +
                        kub.getHörn()[5].getNummer()[2]).intern() == "246";
                if(c5 & !c6 & !c7)
                {
                    kub = positioneraHörnBlåRöd(kub);
                    if(!(c4 & c6 & c7))
                    {
                        kub = positioneraHörnBlåRöd(kub);
                    }
                }else if(c7 & !c5 & !c6)
                {
                    kub = positioneraHörnGrönOrange(kub);
                    if(!(c4 & c5 & c6))
                    {
                        kub = positioneraHörnGrönOrange(kub);
                    }
                }else if(c6 & !c5 & !c7)
                {
                    kub = positioneraHörnOrangeBlå(kub);
                    if(!(c4 & c5 & c7))
                    {
                        kub = positioneraHörnOrangeBlå(kub);
                    }
                }
            }
        }else if(((String.valueOf(kub.getHörn()[4].getNummer()[0]) +
                kub.getHörn()[4].getNummer()[1] +
                kub.getHörn()[4].getNummer()[2]).intern() == "456") &
                ((String.valueOf(kub.getHörn()[5].getNummer()[0]) +
                        kub.getHörn()[5].getNummer()[1] +
                        kub.getHörn()[5].getNummer()[2]).intern() != "246") &
                ((String.valueOf(kub.getKant()[6].getNummer()[0]) +
                        kub.getHörn()[6].getNummer()[1] +
                        kub.getHörn()[6].getNummer()[2]).intern() != "236") &
                ((String.valueOf(kub.getKant()[7].getNummer()[0]) +
                        kub.getHörn()[7].getNummer()[1] +
                        kub.getHörn()[7].getNummer()[2]).intern() != "356")) {
            kub = positioneraHörnRödGrön(kub);
            c6 = (String.valueOf(kub.getHörn()[6].getNummer()[0]) +
                    kub.getHörn()[6].getNummer()[1] +
                    kub.getHörn()[6].getNummer()[2]).intern() == "236";
            c4 = (String.valueOf(kub.getHörn()[4].getNummer()[0]) +
                    kub.getHörn()[4].getNummer()[1] +
                    kub.getHörn()[4].getNummer()[2]).intern() == "456";
            c7 = (String.valueOf(kub.getHörn()[7].getNummer()[0]) +
                    kub.getHörn()[7].getNummer()[1] +
                    kub.getHörn()[7].getNummer()[2]).intern() == "356";
            c5 = (String.valueOf(kub.getHörn()[5].getNummer()[0]) +
                    kub.getHörn()[5].getNummer()[1] +
                    kub.getHörn()[5].getNummer()[2]).intern() == "246";
            if(!(c4 & c5 & c6 & c7))
            {
                kub = positioneraHörnRödGrön(kub);
            }
        }else if(((String.valueOf(kub.getHörn()[4].getNummer()[0]) +
                kub.getHörn()[4].getNummer()[1] +
                kub.getHörn()[4].getNummer()[2]).intern() != "456") &
                ((String.valueOf(kub.getHörn()[5].getNummer()[0]) +
                        kub.getHörn()[5].getNummer()[1] +
                        kub.getHörn()[5].getNummer()[2]).intern() == "246") &
                ((String.valueOf(kub.getKant()[6].getNummer()[0]) +
                        kub.getHörn()[6].getNummer()[1] +
                        kub.getHörn()[6].getNummer()[2]).intern() != "236") &
                ((String.valueOf(kub.getKant()[7].getNummer()[0]) +
                        kub.getHörn()[7].getNummer()[1] +
                        kub.getHörn()[7].getNummer()[2]).intern() != "356")) {
            kub = positioneraHörnBlåRöd(kub);
            c6 = (String.valueOf(kub.getHörn()[6].getNummer()[0]) +
                    kub.getHörn()[6].getNummer()[1] +
                    kub.getHörn()[6].getNummer()[2]).intern() == "236";
            c4 = (String.valueOf(kub.getHörn()[4].getNummer()[0]) +
                    kub.getHörn()[4].getNummer()[1] +
                    kub.getHörn()[4].getNummer()[2]).intern() == "456";
            c7 = (String.valueOf(kub.getHörn()[7].getNummer()[0]) +
                    kub.getHörn()[7].getNummer()[1] +
                    kub.getHörn()[7].getNummer()[2]).intern() == "356";
            c5 = (String.valueOf(kub.getHörn()[5].getNummer()[0]) +
                    kub.getHörn()[5].getNummer()[1] +
                    kub.getHörn()[5].getNummer()[2]).intern() == "246";
            if(!(c4 & c5 & c6 & c7))
            {
                kub = positioneraHörnBlåRöd(kub);
            }
        }else if(((String.valueOf(kub.getHörn()[4].getNummer()[0]) +
                kub.getHörn()[4].getNummer()[1] +
                kub.getHörn()[4].getNummer()[2]).intern() != "456") &
                ((String.valueOf(kub.getHörn()[5].getNummer()[0]) +
                        kub.getHörn()[5].getNummer()[1] +
                        kub.getHörn()[5].getNummer()[2]).intern() != "246") &
                ((String.valueOf(kub.getKant()[6].getNummer()[0]) +
                        kub.getHörn()[6].getNummer()[1] +
                        kub.getHörn()[6].getNummer()[2]).intern() == "236") &
                ((String.valueOf(kub.getKant()[7].getNummer()[0]) +
                        kub.getHörn()[7].getNummer()[1] +
                        kub.getHörn()[7].getNummer()[2]).intern() != "356")) {
            kub = positioneraHörnOrangeBlå(kub);
            c6 = (String.valueOf(kub.getHörn()[6].getNummer()[0]) +
                    kub.getHörn()[6].getNummer()[1] +
                    kub.getHörn()[6].getNummer()[2]).intern() == "236";
            c4 = (String.valueOf(kub.getHörn()[4].getNummer()[0]) +
                    kub.getHörn()[4].getNummer()[1] +
                    kub.getHörn()[4].getNummer()[2]).intern() == "456";
            c7 = (String.valueOf(kub.getHörn()[7].getNummer()[0]) +
                    kub.getHörn()[7].getNummer()[1] +
                    kub.getHörn()[7].getNummer()[2]).intern() == "356";
            c5 = (String.valueOf(kub.getHörn()[5].getNummer()[0]) +
                    kub.getHörn()[5].getNummer()[1] +
                    kub.getHörn()[5].getNummer()[2]).intern() == "246";
            if(!(c4 & c5 & c6 & c7))
            {
                kub = positioneraHörnOrangeBlå(kub);
            }
        }else if(((String.valueOf(kub.getHörn()[4].getNummer()[0]) +
                kub.getHörn()[4].getNummer()[1] +
                kub.getHörn()[4].getNummer()[2]).intern() != "456") &
                ((String.valueOf(kub.getHörn()[5].getNummer()[0]) +
                        kub.getHörn()[5].getNummer()[1] +
                        kub.getHörn()[5].getNummer()[2]).intern() != "246") &
                ((String.valueOf(kub.getKant()[6].getNummer()[0]) +
                        kub.getHörn()[6].getNummer()[1] +
                        kub.getHörn()[6].getNummer()[2]).intern() != "236") &
                ((String.valueOf(kub.getKant()[7].getNummer()[0]) +
                        kub.getHörn()[7].getNummer()[1] +
                        kub.getHörn()[7].getNummer()[2]).intern() == "356")) {
            kub = positioneraHörnGrönOrange(kub);
            c6 = (String.valueOf(kub.getHörn()[6].getNummer()[0]) +
                    kub.getHörn()[6].getNummer()[1] +
                    kub.getHörn()[6].getNummer()[2]).intern() == "236";
            c4 = (String.valueOf(kub.getHörn()[4].getNummer()[0]) +
                    kub.getHörn()[4].getNummer()[1] +
                    kub.getHörn()[4].getNummer()[2]).intern() == "456";
            c7 = (String.valueOf(kub.getHörn()[7].getNummer()[0]) +
                    kub.getHörn()[7].getNummer()[1] +
                    kub.getHörn()[7].getNummer()[2]).intern() == "356";
            c5 = (String.valueOf(kub.getHörn()[5].getNummer()[0]) +
                    kub.getHörn()[5].getNummer()[1] +
                    kub.getHörn()[5].getNummer()[2]).intern() == "246";
            if(!(c4 & c5 & c6 & c7))
            {
                kub = positioneraHörnGrönOrange(kub);
            }
        }

        System.out.println("vända hörn");

        if(kub.getHörn()[6].getOrientering()[1] == 6) {
            kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
            kub = fyraStegMetodenBak(kub);
            kub = fyraStegMetodenBak(kub);
            kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
        }else if(kub.getHörn()[6].getOrientering()[0] == 6) {
            kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
            kub = fyraStegMetodenFram(kub);
            kub = fyraStegMetodenFram(kub);
            kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
        }

        if(kub.getHörn()[5].getOrientering()[0] == 6) {
            kub = fyraStegMetodenBak(kub);
            kub = fyraStegMetodenBak(kub);
        }else if(kub.getHörn()[5].getOrientering()[1] == 6) {
            kub = fyraStegMetodenFram(kub);
            kub = fyraStegMetodenFram(kub);
        }

        if(kub.getHörn()[4].getOrientering()[0] == 6) {
            kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
            kub = fyraStegMetodenBak(kub);
            kub = fyraStegMetodenBak(kub);
            kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
        }else if(kub.getHörn()[4].getOrientering()[1] == 6) {
            kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
            kub = fyraStegMetodenFram(kub);
            kub = fyraStegMetodenFram(kub);
            kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
        }

        if(kub.getHörn()[7].getOrientering()[1] == 6) {
            kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
            kub = fyraStegMetodenBak(kub);
            kub = fyraStegMetodenBak(kub);
            kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
        }else if(kub.getHörn()[7].getOrientering()[0] == 6) {
            kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
            kub = fyraStegMetodenFram(kub);
            kub = fyraStegMetodenFram(kub);
            kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);       //2b
        }

        for(int i = 0; i < 8; i++)
        {
            if(((String.valueOf(kub.getHörn()[i].getOrientering()[0])
                    + kub.getHörn()[i].getOrientering()[1] + kub.getHörn()[i].getOrientering()[2]).intern() ==
                    (String.valueOf(kub.getHörn()[i].getPosition()[0])
                            + kub.getHörn()[i].getPosition()[1] + kub.getHörn()[i].getPosition()[2]).intern()) &
                    ((String.valueOf(kub.getKant()[i].getOrientering()[0])
                            + kub.getKant()[i].getOrientering()[1]).intern() ==
                            (String.valueOf(kub.getKant()[i].getPosition()[0])
                                    + kub.getKant()[i].getPosition()[1]).intern()))
            {
                check++;
            }
        }

        if(check != 8)
            throw new FelaktigBlandningHörnException("Felaktig blandad kub, försök igen");

        System.out.println("----------");
        return kub;
    }

    private static Kub2 nummerEtt12(Kub2 kub){
        System.out.println("nummerEtt12");

        kub = kub.vridKuben(Kubsida.V, Vridningar.v);       //V'
        kub = kub.vridKuben(Kubsida.H, Vridningar.H);       //H
        kub = kub.vridKuben(Kubsida.F, Vridningar.FF);      //2F
        kub = kub.vridKuben(Kubsida.V, Vridningar.V);       //V
        kub = kub.vridKuben(Kubsida.H, Vridningar.h);       //H'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 nummerTvå12(Kub2 kub){
        System.out.println("nummerTvå12");

        kub = kub.vridKuben(Kubsida.V, Vridningar.v);       //V'
        kub = kub.vridKuben(Kubsida.H, Vridningar.H);       //H
        kub = kub.vridKuben(Kubsida.F, Vridningar.F);       //F
        kub = kub.vridKuben(Kubsida.V, Vridningar.V);       //V
        kub = kub.vridKuben(Kubsida.H, Vridningar.h);       //H'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 nummerEtt14(Kub2 kub){
        System.out.println("nummerEtt14");

        kub = kub.vridKuben(Kubsida.B, Vridningar.ba);      //B'
        kub = kub.vridKuben(Kubsida.F, Vridningar.F);       //F
        kub = kub.vridKuben(Kubsida.V, Vridningar.VV);      //2V
        kub = kub.vridKuben(Kubsida.B, Vridningar.BA);      //B
        kub = kub.vridKuben(Kubsida.F, Vridningar.f);       //F'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 nummerTvå14(Kub2 kub){
        System.out.println("nummerEtt14");

        kub = kub.vridKuben(Kubsida.B, Vridningar.ba);      //B'
        kub = kub.vridKuben(Kubsida.F, Vridningar.F);       //F
        kub = kub.vridKuben(Kubsida.V, Vridningar.V);       //V
        kub = kub.vridKuben(Kubsida.B, Vridningar.BA);      //B
        kub = kub.vridKuben(Kubsida.F, Vridningar.f);       //F'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 nummerEtt15(Kub2 kub){
        System.out.println("nummerEtt15");

        kub = kub.vridKuben(Kubsida.H, Vridningar.h);       //H'
        kub = kub.vridKuben(Kubsida.V, Vridningar.V);       //V
        kub = kub.vridKuben(Kubsida.B, Vridningar.BABA);    //2B
        kub = kub.vridKuben(Kubsida.H, Vridningar.H);       //H
        kub = kub.vridKuben(Kubsida.V, Vridningar.v);       //V'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 nummerTvå15(Kub2 kub){
        System.out.println("nummerTvå15");

        kub = kub.vridKuben(Kubsida.H, Vridningar.h);       //H'
        kub = kub.vridKuben(Kubsida.V, Vridningar.V);       //V
        kub = kub.vridKuben(Kubsida.B, Vridningar.BA);      //B
        kub = kub.vridKuben(Kubsida.H, Vridningar.H);       //H
        kub = kub.vridKuben(Kubsida.V, Vridningar.v);       //V'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 nummerEtt13(Kub2 kub){
        System.out.println("nummerEtt13");

        kub = kub.vridKuben(Kubsida.F, Vridningar.f);       //F'
        kub = kub.vridKuben(Kubsida.B, Vridningar.BA);      //B
        kub = kub.vridKuben(Kubsida.H, Vridningar.HH);      //2H
        kub = kub.vridKuben(Kubsida.F, Vridningar.F);       //F
        kub = kub.vridKuben(Kubsida.B, Vridningar.ba);      //B'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 nummerTvå13(Kub2 kub){
        System.out.println("nummerTvå13");

        kub = kub.vridKuben(Kubsida.F, Vridningar.f);       //F'
        kub = kub.vridKuben(Kubsida.B, Vridningar.BA);      //B
        kub = kub.vridKuben(Kubsida.H, Vridningar.H);       //H
        kub = kub.vridKuben(Kubsida.F, Vridningar.F);       //F
        kub = kub.vridKuben(Kubsida.B, Vridningar.ba);      //B'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 blå23(Kub2 kub){
        System.out.println("blå23");

        kub = kub.vridKuben(Kubsida.H, Vridningar.h);      //H'
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);     //b
        kub = kub.vridKuben(Kubsida.H, Vridningar.H);      //H
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);     //b
        kub = kub.vridKuben(Kubsida.F, Vridningar.F);      //F
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);     //b'
        kub = kub.vridKuben(Kubsida.F, Vridningar.f);      //F'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 orange23(Kub2 kub){
        System.out.println("orange23");

        kub = kub.vridKuben(Kubsida.F, Vridningar.F);       //F
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'
        kub = kub.vridKuben(Kubsida.F, Vridningar.f);       //F'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'
        kub = kub.vridKuben(Kubsida.H, Vridningar.h);       //H'
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.H, Vridningar.H);       //H

        System.out.println("----------");
        return kub;
    }

    private static Kub2 orange35(Kub2 kub){
        System.out.println("orange35");

        kub = kub.vridKuben(Kubsida.B, Vridningar.ba);      //B'
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.B, Vridningar.BA);      //B
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.H, Vridningar.H);       //H
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'
        kub = kub.vridKuben(Kubsida.H, Vridningar.h);       //H'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 grön35(Kub2 kub){
        System.out.println("grön35");

        kub = kub.vridKuben(Kubsida.H, Vridningar.H);       //H
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'
        kub = kub.vridKuben(Kubsida.H, Vridningar.h);       //H'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'
        kub = kub.vridKuben(Kubsida.B, Vridningar.ba);      //B'
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.B, Vridningar.BA);      //B

        System.out.println("----------");
        return kub;
    }

    private static Kub2 röd45(Kub2 kub){
        System.out.println("röd45");

        kub = kub.vridKuben(Kubsida.B, Vridningar.BA);      //B
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'
        kub = kub.vridKuben(Kubsida.B, Vridningar.ba);      //B'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'
        kub = kub.vridKuben(Kubsida.V, Vridningar.v);       //V'
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.V, Vridningar.V);       //V

        System.out.println("----------");
        return kub;
    }

    private static Kub2 grön45(Kub2 kub){
        System.out.println("grön45");

        kub = kub.vridKuben(Kubsida.V, Vridningar.v);       //V'
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.V, Vridningar.V);       //V
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.B, Vridningar.BA);      //B
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'
        kub = kub.vridKuben(Kubsida.B, Vridningar.ba);      //B'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 blå24(Kub2 kub){
        System.out.println("blå24");

        kub = kub.vridKuben(Kubsida.V, Vridningar.V);       //V
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'
        kub = kub.vridKuben(Kubsida.V, Vridningar.v);       //V'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'
        kub = kub.vridKuben(Kubsida.F, Vridningar.f);       //F'
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.F, Vridningar.F);       //F

        System.out.println("----------");
        return kub;
    }

    private static Kub2 röd24(Kub2 kub){
        System.out.println("röd24");

        kub = kub.vridKuben(Kubsida.F, Vridningar.f);       //F'
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.F, Vridningar.F);       //F
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.V, Vridningar.V);       //V
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'
        kub = kub.vridKuben(Kubsida.V, Vridningar.v);       //V'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 fyraStegMetodenFram(Kub2 kub){
        System.out.println("fyraStegMetodenFram");

        kub = kub.vridKuben(Kubsida.T, Vridningar.T);        //T
        kub = kub.vridKuben(Kubsida.V, Vridningar.v);        //V'
        kub = kub.vridKuben(Kubsida.T, Vridningar.t);        //T'
        kub = kub.vridKuben(Kubsida.V, Vridningar.V);        //V

        System.out.println("----------");
        return kub;
    }

    private static Kub2 fyraStegMetodenBak(Kub2 kub){
        System.out.println("fyraStegMetodenBak");

        kub = kub.vridKuben(Kubsida.V, Vridningar.v);        //V'
        kub = kub.vridKuben(Kubsida.T, Vridningar.T);        //T
        kub = kub.vridKuben(Kubsida.V, Vridningar.V);        //V
        kub = kub.vridKuben(Kubsida.T, Vridningar.t);        //T'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 vändaKantbitarBlåGrön(Kub2 kub) {
        System.out.println("vändaKantbitarBlåGrön");

        kub = kub.vridKuben(Kubsida.F, Vridningar.F);       //F
        kub = kub.vridKuben(Kubsida.V, Vridningar.V);       //V
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.V, Vridningar.v);       //V'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'
        kub = kub.vridKuben(Kubsida.F, Vridningar.f);       //F'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 vändaKantbitarOrangeRöd(Kub2 kub) {
        System.out.println("vändaKantbitarOrangeRöd");

        kub = kub.vridKuben(Kubsida.H, Vridningar.H);       //H
        kub = kub.vridKuben(Kubsida.F, Vridningar.F);       //F
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.F, Vridningar.f);       //F'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'
        kub = kub.vridKuben(Kubsida.H, Vridningar.h);       //H'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 vändaKantbitarBlåGrönx2(Kub2 kub) {
        System.out.println("vändaKantbitarBlåGrönx2");

        kub = kub.vridKuben(Kubsida.F, Vridningar.F);       //F
        kub = kub.vridKuben(Kubsida.V, Vridningar.V);       //V
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.V, Vridningar.v);       //V'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'

        kub = kub.vridKuben(Kubsida.V, Vridningar.V);       //V
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.V, Vridningar.v);       //V'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'
        kub = kub.vridKuben(Kubsida.F, Vridningar.f);       //F'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 vändaKantbitarRödOrangex2(Kub2 kub) {
        System.out.println("vändaKantbitarRödOrangex2");

        kub = kub.vridKuben(Kubsida.V, Vridningar.V);       //V
        kub = kub.vridKuben(Kubsida.B, Vridningar.BA);      //H
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.B, Vridningar.ba);      //B'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'

        kub = kub.vridKuben(Kubsida.B, Vridningar.BA);      //H
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.B, Vridningar.ba);      //B'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'
        kub = kub.vridKuben(Kubsida.V, Vridningar.v);       //V'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 vändaKantbitarGrönBlåx2(Kub2 kub) {
        System.out.println("vändaKantbitarGrönBlåx2");

        kub = kub.vridKuben(Kubsida.B, Vridningar.BA);      //B
        kub = kub.vridKuben(Kubsida.H, Vridningar.H);       //H
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.H, Vridningar.h);       //H'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'

        kub = kub.vridKuben(Kubsida.H, Vridningar.H);       //H
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.H, Vridningar.h);       //H'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'
        kub = kub.vridKuben(Kubsida.B, Vridningar.ba);      //B'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 vändaKantbitarOrangeRödx2(Kub2 kub) {
        System.out.println("vändaKantbitarOrangeRödx2");

        kub = kub.vridKuben(Kubsida.H, Vridningar.H);       //H
        kub = kub.vridKuben(Kubsida.F, Vridningar.F);       //F
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.F, Vridningar.f);       //F'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'

        kub = kub.vridKuben(Kubsida.F, Vridningar.F);       //F
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.F, Vridningar.f);       //F'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'
        kub = kub.vridKuben(Kubsida.H, Vridningar.h);       //H'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 vändaKantbitarBlåRödGrönOrange(Kub2 kub) {
        System.out.println("vändaKantbitarBlåRödGrönOrange");

        kub = vändaKantbitarBlåGrön(kub);

        kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);    //2b

        kub = kub.vridKuben(Kubsida.F, Vridningar.F);       //F
        kub = kub.vridKuben(Kubsida.V, Vridningar.V);       //V
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.V, Vridningar.v);       //V'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'

        kub = kub.vridKuben(Kubsida.V, Vridningar.V);       //V
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);      //b
        kub = kub.vridKuben(Kubsida.V, Vridningar.v);       //V'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);      //b'
        kub = kub.vridKuben(Kubsida.F, Vridningar.f);       //F'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 positioneraKantbitarBlåRöd(Kub2 kub) {
        System.out.println("positioneraKantbitarBlåRöd");

        kub = kub.vridKuben(Kubsida.B, Vridningar.BA);       //B
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
        kub = kub.vridKuben(Kubsida.B, Vridningar.ba);       //B'
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
        kub = kub.vridKuben(Kubsida.B, Vridningar.BA);       //B
        kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);     //2b
        kub = kub.vridKuben(Kubsida.B, Vridningar.ba);       //B'
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //T

        System.out.println("----------");
        return kub;
    }

    private static Kub2 positioneraKantbitarRödGrön(Kub2 kub) {
        System.out.println("positioneraKantbitarRödGrön");

        kub = kub.vridKuben(Kubsida.H, Vridningar.H);        //H
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
        kub = kub.vridKuben(Kubsida.H, Vridningar.h);        //H'
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
        kub = kub.vridKuben(Kubsida.H, Vridningar.H);        //H
        kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);     //2b
        kub = kub.vridKuben(Kubsida.H, Vridningar.h);        //H'
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b

        System.out.println("----------");
        return kub;
    }

    private static Kub2 positioneraKantbitarGrönOrange1(Kub2 kub) {
        System.out.println("positioneraKantbitarGrönOrange1");

        kub = kub.vridKuben(Kubsida.F, Vridningar.F);        //F
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
        kub = kub.vridKuben(Kubsida.F, Vridningar.f);        //F'
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
        kub = kub.vridKuben(Kubsida.F, Vridningar.F);        //F
        kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);     //2b
        kub = kub.vridKuben(Kubsida.F, Vridningar.f);        //F'

        System.out.println("----------");
        return kub;
    }

    private static Kub2 positioneraKantbitarOrangeBlå(Kub2 kub) {
        System.out.println("positioneraKantbitarOrangeBlå");

        kub = kub.vridKuben(Kubsida.V, Vridningar.V);        //V
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
        kub = kub.vridKuben(Kubsida.V, Vridningar.v);        //V'
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
        kub = kub.vridKuben(Kubsida.V, Vridningar.V);        //V
        kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);     //2b
        kub = kub.vridKuben(Kubsida.V, Vridningar.v);        //V'
        kub = kub.vridKuben(Kubsida.b, Vridningar.BOBO);     //2b

        System.out.println("----------");
        return kub;
    }

    private static Kub2 positioneraKantbitarGrönOrange2(Kub2 kub) {
        System.out.println("positioneraKantbitarGrönOrange2");

        kub = positioneraKantbitarGrönOrange1(kub);
        kub = positioneraKantbitarRödGrön(kub);

        System.out.println("----------");
        return kub;
    }

    private static Kub2 positioneraHörnBlåRöd(Kub2 kub) {
        System.out.println("positioneraHörnBlåRöd");

        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
        kub = kub.vridKuben(Kubsida.V, Vridningar.V);        //V
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
        kub = kub.vridKuben(Kubsida.H, Vridningar.h);        //H'
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
        kub = kub.vridKuben(Kubsida.V, Vridningar.v);        //V'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
        kub = kub.vridKuben(Kubsida.H, Vridningar.H);        //H

        System.out.println("----------");
        return kub;
    }

    private static Kub2 positioneraHörnOrangeBlå(Kub2 kub) {
        System.out.println("positioneraHörnOrangeBlå");

        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
        kub = kub.vridKuben(Kubsida.F, Vridningar.F);        //F
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
        kub = kub.vridKuben(Kubsida.B, Vridningar.ba);       //B'
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
        kub = kub.vridKuben(Kubsida.F, Vridningar.f);        //F'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
        kub = kub.vridKuben(Kubsida.B, Vridningar.BA);       //B

        System.out.println("----------");
        return kub;
    }

    private static Kub2 positioneraHörnGrönOrange(Kub2 kub) {
        System.out.println("positioneraHörnGrönOrange");

        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
        kub = kub.vridKuben(Kubsida.H, Vridningar.H);        //H
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
        kub = kub.vridKuben(Kubsida.V, Vridningar.v);        //V'
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //BO
        kub = kub.vridKuben(Kubsida.H, Vridningar.h);        //H'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
        kub = kub.vridKuben(Kubsida.V, Vridningar.V);        //V

        System.out.println("----------");
        return kub;
    }

    private static Kub2 positioneraHörnRödGrön(Kub2 kub) {
        System.out.println("positioneraHörnRödGrön");

        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
        kub = kub.vridKuben(Kubsida.B, Vridningar.BA);       //B
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
        kub = kub.vridKuben(Kubsida.F, Vridningar.f);        //F'
        kub = kub.vridKuben(Kubsida.b, Vridningar.BO);       //b
        kub = kub.vridKuben(Kubsida.B, Vridningar.ba);       //B'
        kub = kub.vridKuben(Kubsida.b, Vridningar.bo);       //b'
        kub = kub.vridKuben(Kubsida.F, Vridningar.F);        //F

        System.out.println("----------");
        return kub;
    }
}
