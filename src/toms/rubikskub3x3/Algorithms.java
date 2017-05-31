package toms.rubikskub3x3;

class Algorithms {

    // Solving the first corner piece
    static Cube solveTheFirstCorner(Cube cube) {
        System.out.println("solveTheFirstCorner");
        Corner theCorner = Helper.findCorner(cube.getCorners(), new int[]{1, 2, 4});
        String thePositionOfTheCorner =
                (String.valueOf(theCorner.getPosition()[0]) + theCorner.getPosition()[1]
                        + theCorner.getPosition()[2]).intern();
        String theOrientationOfTheCorner =
                (String.valueOf(theCorner.getOrientation()[0]) + theCorner.getOrientation()[1]
                            + theCorner.getOrientation()[2]).intern();


        switch (thePositionOfTheCorner){
            case "124":
            {
                switch(theOrientationOfTheCorner) {
                    case "412":
                    {
                        cube = cube.turnTheCube(CubeFace.L, Turns.l);       //L'
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);       //U'
                        break;
                    }
                    case "241":
                    {
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);       //F
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);       //U
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "145":
            {
                switch(theOrientationOfTheCorner) {
                    case "124":
                    {
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);       //U'
                        break;
                    }
                    case "412":
                    {
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);      //B'
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);     //U2
                        break;
                    }
                    case "241":
                    {
                        cube = cube.turnTheCube(CubeFace.L, Turns.L);      //L
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "135":
            {
                switch(theOrientationOfTheCorner) {
                    case "142":
                    {
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);     //U2
                        break;
                    }
                    case "214":
                    {
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);      //B
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);      //U'
                        break;
                    }
                    case "421":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);      //R'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);      //U
                        break;
                    }
                    default:
                        break;
                }

                break;
            }
            case "123":
            {
                switch(theOrientationOfTheCorner) {
                    case "142":
                    {
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);       //U
                        break;
                    }
                    case "214":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);       //R
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);      //U2
                        break;
                    }
                    case "421":
                    {
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);       //F'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "456":
            {
                switch(theOrientationOfTheCorner) {
                    case "421":
                    {
                        cube = cube.turnTheCube(CubeFace.L, Turns.LL);      //L2
                        break;
                    }
                    case "142":
                    {
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);       //B'
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);       //U'
                        break;
                    }
                    case "214":
                    {
                        cube = cube.turnTheCube(CubeFace.L, Turns.L);       //L
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);       //U'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "246":
            {
                switch(theOrientationOfTheCorner) {
                    case "421":
                    {
                        cube = cube.turnTheCube(CubeFace.L, Turns.LL);       //L2
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);        //U'
                        break;
                    }
                    case "142":
                    {
                        cube = cube.turnTheCube(CubeFace.L, Turns.l);        //L'
                        break;
                    }
                    case "214":
                    {
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);        //F
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "236":
            {
                switch(theOrientationOfTheCorner) {
                    case "241":
                    {
                        cube = cube.turnTheCube(CubeFace.F, Turns.FF);       //F2
                        break;
                    }
                    case "124":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);        //R
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);        //U
                        break;
                    }
                    case "412":
                    {
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);        //F'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);        //U
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "356":
            {
                switch(theOrientationOfTheCorner) {
                    case "241":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.RR);       //R2
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);        //U
                        break;
                    }
                    case "124":
                    {
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);        //B
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);       //U2
                        break;
                    }
                    case "412":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);        //R'
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);       //U2
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
        }

        System.out.println("----------");
        return cube;
    }

    // Solving the second corner piece
    static Cube solveTheSecondCorner(Cube cube) {
        System.out.println("solveTheSecondCorner");

        Corner theCorner = Helper.findCorner(cube.getCorners(), new int[]{1, 4, 5});
        String thePositionOfTheCorner =
                (String.valueOf(theCorner.getPosition()[0]) + theCorner.getPosition()[1]
                        + theCorner.getPosition()[2]).intern();
        String theOrientationOfTheCorner =
                (String.valueOf(theCorner.getOrientation()[0]) + theCorner.getOrientation()[1]
                        + theCorner.getOrientation()[2]).intern();

        switch (thePositionOfTheCorner){
            case "145":
            {
                switch(theOrientationOfTheCorner) {
                    case "514":
                    {
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);         //B
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);         //D'
                        cube = cube.turnTheCube(CubeFace.B, Turns.BB);        //B2
                        break;
                    }
                    case "451":
                    {
                        cube = cube.turnTheCube(CubeFace.B, Turns.BB);        //B2
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);         //D
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);         //B'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "135":
            {
                switch(theOrientationOfTheCorner) {
                    case "154":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);         //R
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);         //D
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);         //B'
                        break;
                    }
                    case "415":
                    {
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);         //B
                        break;
                    }
                    case "541":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);         //R
                        cube = cube.turnTheCube(CubeFace.B, Turns.BB);        //B2
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "123":
            {
                switch(theOrientationOfTheCorner) {
                    case "154":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.RR);        //R2
                        cube = cube.turnTheCube(CubeFace.B, Turns.BB);        //B2
                        break;
                    }
                    case "415":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);         //R'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);         //D
                        cube = cube.turnTheCube(CubeFace.B, Turns.BB);        //B2
                        break;
                    }
                    case "541":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);         //R
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);         //B
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "456":
            {
                switch(theOrientationOfTheCorner) {
                    case "541":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);         //D'
                        cube = cube.turnTheCube(CubeFace.B, Turns.BB);        //B2
                        break;
                    }
                    case "154":
                    {
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);         //B'
                        break;
                    }
                    case "415":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);        //D2
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);         //R'
                        cube = cube.turnTheCube(CubeFace.B, Turns.BB);        //B2
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "246":
            {
                switch(theOrientationOfTheCorner) {
                    case "541":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
                        cube = cube.turnTheCube(CubeFace.B, Turns.BB);       //B2
                        break;
                    }
                    case "154":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);        //D'
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);        //B'
                        break;
                    }
                    case "415":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);        //R'
                        cube = cube.turnTheCube(CubeFace.B, Turns.BB);       //B2
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "236":
            {
                switch(theOrientationOfTheCorner) {
                    case "451":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);         //D
                        cube = cube.turnTheCube(CubeFace.B, Turns.BB);        //B2
                        break;
                    }
                    case "145":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);         //R'
                        cube = cube.turnTheCube(CubeFace.B, Turns.BB);        //B2
                        break;
                    }
                    case "514":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);        //D2
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);         //B'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "356":
            {
                switch(theOrientationOfTheCorner) {
                    case "451":
                    {
                        cube = cube.turnTheCube(CubeFace.B, Turns.BB);       //B2
                        break;
                    }
                    case "145":
                    {
                        cube = cube.turnTheCube(CubeFace.L, Turns.l);        //L'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
                        cube = cube.turnTheCube(CubeFace.L, Turns.L);        //L
                        break;
                    }
                    case "514":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);        //B'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
        }

        System.out.println("----------");
        return cube;
    }

    // Solving the third corner piece
    static Cube solveTheThirdCorner(Cube cube) {
        System.out.println("solveTheThirdCorner");

        Corner theCorner = Helper.findCorner(cube.getCorners(), new int[]{1, 3, 5});
        String thePositionOfTheCorner =
                (String.valueOf(theCorner.getPosition()[0]) + theCorner.getPosition()[1]
                        + theCorner.getPosition()[2]).intern();
        String theOrientationOfTheCorner =
                (String.valueOf(theCorner.getOrientation()[0]) + theCorner.getOrientation()[1]
                        + theCorner.getOrientation()[2]).intern();

        switch (thePositionOfTheCorner){
            case "135":
            {
                switch(theOrientationOfTheCorner) {
                    case "513":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.RR);        //R2
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);         //D
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);         //R'
                        break;
                    }
                    case "351":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);         //R
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);         //D'
                        cube = cube.turnTheCube(CubeFace.R, Turns.RR);        //R2
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "123":
            {
                switch(theOrientationOfTheCorner) {
                    case "135":
                    {
                        cube = cube.turnTheCube(CubeFace.L, Turns.LL);        //L2
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);         //U'
                        cube = cube.turnTheCube(CubeFace.L, Turns.LL);        //L2
                        break;
                    }
                    case "513":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);         //R
                        break;
                    }
                    case "351":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);         //R'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);         //D
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);         //R'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "456":
            {
                switch(theOrientationOfTheCorner) {
                    case "351":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);        //D2
                        cube = cube.turnTheCube(CubeFace.R, Turns.RR);        //R2
                        break;
                    }
                    case "135":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);         //D'
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);         //R'
                        break;
                    }
                    case "513":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);         //D'
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);         //R
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);         //D
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);         //R'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "246":
            {
                switch(theOrientationOfTheCorner) {
                    case "351":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);         //D
                        cube = cube.turnTheCube(CubeFace.R, Turns.RR);        //R2
                        break;
                    }
                    case "135":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);        //D2
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);         //R'
                        break;
                    }
                    case "513":
                    {
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);         //F'
                        cube = cube.turnTheCube(CubeFace.R, Turns.RR);        //R2
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);         //F
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "236":
            {
                switch(theOrientationOfTheCorner) {
                    case "531":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.RR);        //R2
                        break;
                    }
                    case "153":
                    {
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);         //B'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);         //D
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);         //B
                        break;
                    }
                    case "315":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);         //D
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);         //R'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "356":
            {
                switch(theOrientationOfTheCorner) {
                    case "531":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);         //D'
                        cube = cube.turnTheCube(CubeFace.R, Turns.RR);        //R2
                        break;
                    }
                    case "153":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);         //R
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);         //D
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);         //R'
                        break;
                    }
                    case "315":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);         //R'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
        }

        System.out.println("----------");
        return cube;
    }

    // Solving the fourth corner piece
    static Cube solveTheFourthCorner(Cube cube) {
        System.out.println("solveTheFourthCorner");

        Corner theCorner = Helper.findCorner(cube.getCorners(), new int[]{1, 2, 3});
        String thePositionOfTheCorner =
                (String.valueOf(theCorner.getPosition()[0]) + theCorner.getPosition()[1]
                        + theCorner.getPosition()[2]).intern();
        String theOrientationOfTheCorner =
                (String.valueOf(theCorner.getOrientation()[0]) + theCorner.getOrientation()[1]
                        + theCorner.getOrientation()[2]).intern();

        switch (thePositionOfTheCorner){
            case "123":
            {
                switch(theOrientationOfTheCorner) {
                    case "312":
                    {
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);        //F
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);        //F'
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);        //R'
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);        //R
                        break;
                    }
                    case "231":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);        //R'
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);        //R
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);        //F
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);        //F'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "456":
            {
                switch(theOrientationOfTheCorner) {
                    case "231":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);        //R'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);        //R
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);        //F
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);        //F'
                        break;
                    }
                    case "123":
                    {
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);        //F
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);        //F'
                        break;
                    }
                    case "312":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);        //R'
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);        //R
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "246":
            {
                switch(theOrientationOfTheCorner) {
                    case "231":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);        //R'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);        //R
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);        //F
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);        //F'
                        break;
                    }
                    case "123":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);        //F
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);        //D
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);        //F'
                        break;
                    }
                    case "312":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);        //R'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);        //R
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "236":
            {
                switch(theOrientationOfTheCorner) {
                    case "321":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);        //R'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);        //R
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);        //F
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);        //F'
                        break;
                    }
                    case "132":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);        //D'
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);        //R'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);        //R
                        break;
                    }
                    case "213":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);        //F
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);        //D'
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);        //F'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "356":
            {
                switch(theOrientationOfTheCorner) {
                    case "321":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);         //D'
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);         //R'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);         //D
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);         //R
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);         //F
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);        //D2
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);         //F'
                        break;
                    }
                    case "132":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);        //D2
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);         //R'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);         //D
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);         //R
                        break;
                    }
                    case "213":
                    {
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);         //F
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);         //D'
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);         //F'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
        }

        System.out.println("----------");
        return cube;
    }

    // Solving the first edge piece
    static Cube solveTheFirstEdge(Cube cube) {
        System.out.println("solveTheFirstEdge");

        Edge theEdge = Helper.findEdge(cube.getEdges(), new int[]{1, 2});
        String thePositionOfTheEdge =
                (String.valueOf(theEdge.getPosition()[0]) + theEdge.getPosition()[1]).intern();
        String theOrientationOfTheEdge =
                (String.valueOf(theEdge.getOrientation()[0]) + theEdge.getOrientation()[1]).intern();

        switch (thePositionOfTheEdge){
            case "12":
            {
                switch(theOrientationOfTheEdge) {
                    case "21":
                    {
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);          //F
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = cube.turnTheCube(CubeFace.L, Turns.LL);         //L2
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);          //R
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "14":
            {
                switch(theOrientationOfTheEdge) {
                    case "12":
                    {
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);          //F
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);          //B'
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);          //R
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);          //F'
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);          //B
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        break;
                    }
                    case "21":
                    {
                        cube = cube.turnTheCube(CubeFace.L, Turns.l);          //L'
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);          //F
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);          //B'
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);          //R
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "15":
            {
                switch(theOrientationOfTheEdge) {
                    case "12":
                    {
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);          //B
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);          //F
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.B, Turns.BB);         //B2
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);          //B'
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);          //F'
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        break;
                    }
                    case "21":
                    {
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);          //B
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);          //F'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = cube.turnTheCube(CubeFace.L, Turns.L);          //L
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);          //R'
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "13":
            {
                switch(theOrientationOfTheEdge) {
                    case "12":
                    {
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);          //F'
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);          //B
                        cube = cube.turnTheCube(CubeFace.L, Turns.l);          //L'
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);          //F
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);          //B'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        break;
                    }
                    case "21":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);          //R
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);          //F'
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);          //B
                        cube = cube.turnTheCube(CubeFace.L, Turns.l);          //L'
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "23":
            {
                switch(theOrientationOfTheEdge) {
                    case "12":
                    {
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);          //B'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);          //R
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        break;
                    }
                    case "21":
                    {
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.L, Turns.L);          //L
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);          //D
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);          //F'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "35":
            {
                switch(theOrientationOfTheEdge) {
                    case "12":
                    {
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);          //F'
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);          //B
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        break;
                    }
                    case "21":
                    {
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);          //F
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);          //D
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);          //R'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "45":
            {
                switch(theOrientationOfTheEdge) {
                    case "12":
                    {
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);          //F
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);          //B'
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        break;
                    }
                    case "21":
                    {
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);          //F'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = cube.turnTheCube(CubeFace.L, Turns.L);          //L
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "24":
            {
                switch(theOrientationOfTheEdge) {
                    case "21":
                    {
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);          //R'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);          //F
                        break;
                    }
                    case "12":
                    {
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);          //B
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);          //D
                        cube = cube.turnTheCube(CubeFace.L, Turns.l);          //L'
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "56":
            {
                switch(theOrientationOfTheEdge) {
                    case "21":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
                        cube = downToUpEdge12Orientation21(cube);
                        break;
                    }
                    case "12":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);         //D
                        cube = downToUpEdge12Orientation12(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "46":
            {
                switch(theOrientationOfTheEdge) {
                    case "21":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);         //D
                        cube = downToUpEdge12Orientation21(cube);
                        break;
                    }
                    case "12":
                    {
                        cube = downToUpEdge12Orientation12(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "26":
            {
                switch(theOrientationOfTheEdge) {
                    case "21":
                    {
                        cube = downToUpEdge12Orientation21(cube);
                        break;
                    }
                    case "12":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
                        cube = downToUpEdge12Orientation12(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "36":
            {
                switch(theOrientationOfTheEdge) {
                    case "21":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
                        cube = downToUpEdge12Orientation21(cube);
                        break;
                    }
                    case "12":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);      //D2
                        cube = downToUpEdge12Orientation12(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
        }

        System.out.println("----------");
        return cube;
    }

    // Solving the second edge piece
    static Cube solveTheSecondEdge(Cube cube) {
        System.out.println("solveTheSecondEdge");

        Edge theEdge = Helper.findEdge(cube.getEdges(), new int[]{1, 4});
        String thePositionOfTheEdge =
                (String.valueOf(theEdge.getPosition()[0]) + theEdge.getPosition()[1]).intern();
        String theOrientationOfTheEdge =
                (String.valueOf(theEdge.getOrientation()[0]) + theEdge.getOrientation()[1]).intern();

        switch (thePositionOfTheEdge){
            case "14":
            {
                switch(theOrientationOfTheEdge) {
                    case "41":
                    {
                        cube = cube.turnTheCube(CubeFace.L, Turns.L);          //L
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = cube.turnTheCube(CubeFace.B, Turns.BB);         //B2
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);          //F
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "15":
            {
                switch(theOrientationOfTheEdge) {
                    case "14":
                    {
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);          //B'
                        cube = cube.turnTheCube(CubeFace.L, Turns.l);          //L'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);          //B
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);          //R
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        break;
                    }
                    case "41":
                    {
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);          //B'
                        cube = cube.turnTheCube(CubeFace.L, Turns.L);          //L
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);          //R'
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);          //F
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "13":
            {
                switch(theOrientationOfTheEdge) {
                    case "14":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);          //R'
                        cube = cube.turnTheCube(CubeFace.L, Turns.l);          //L'
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);          //R
                        cube = cube.turnTheCube(CubeFace.L, Turns.L);          //L
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        break;
                    }
                    case "41":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);          //R'
                        cube = cube.turnTheCube(CubeFace.L, Turns.L);          //L
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);          //D
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);          //F'
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);          //B
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "23":
            {
                switch(theOrientationOfTheEdge) {
                    case "41":
                    {
                        cube = cube.turnTheCube(CubeFace.L, Turns.L);          //L
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);          //D
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);          //F'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        break;
                    }
                    case "14":
                    {
                        cube = cube.turnTheCube(CubeFace.L, Turns.l);          //L'
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);          //R
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "35":
            {
                switch(theOrientationOfTheEdge) {
                    case "14":
                    {
                        cube = cube.turnTheCube(CubeFace.L, Turns.l);           //L'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);           //U
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);           //D'
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);           //B
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);           //U'
                        break;
                    }
                    case "41":
                    {
                        cube = cube.turnTheCube(CubeFace.L, Turns.L);           //L
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);          //U2
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);          //D2
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);           //R'
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);          //U2
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "45":
            {
                switch(theOrientationOfTheEdge) {
                    case "41":
                    {
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);          //F'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = cube.turnTheCube(CubeFace.L, Turns.L);          //L
                        break;
                    }
                    case "14":
                    {
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);          //R
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);          //D
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);          //B'
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "24":
            {
                switch(theOrientationOfTheEdge) {
                    case "41":
                    {
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);          //R'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);          //F
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        break;
                    }
                    case "14":
                    {
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);          //B
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);          //D
                        cube = cube.turnTheCube(CubeFace.L, Turns.l);          //L'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "56":
            {
                switch(theOrientationOfTheEdge) {
                    case "41":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
                        cube = downToUpEdge14Orientation41(cube);
                        break;
                    }
                    case "14":
                    {
                        cube = downToUpEdge14Orientation14(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "46":
            {
                switch(theOrientationOfTheEdge) {
                    case "41":
                    {
                        cube = downToUpEdge14Orientation41(cube);
                        break;
                    }
                    case "14":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);        //D'
                        cube = downToUpEdge14Orientation14(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "26":
            {
                switch(theOrientationOfTheEdge) {
                    case "41":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
                        cube = downToUpEdge14Orientation41(cube);
                        break;
                    }
                    case "14":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);      //D2
                        cube = downToUpEdge14Orientation14(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "36":
            {
                switch(theOrientationOfTheEdge) {
                    case "41":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);      //D2
                        cube = downToUpEdge14Orientation41(cube);
                        break;
                    }
                    case "14":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
                        cube = downToUpEdge14Orientation14(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
        }

        System.out.println("----------");
        return cube;
    }

    // Solving the third edge piece
    static Cube solveTheThirdEdge(Cube cube) {
        System.out.println("solveTheThirdEdge");

        Edge theEdge = Helper.findEdge(cube.getEdges(), new int[]{1, 5});
        String thePositionOfTheEdge =
                (String.valueOf(theEdge.getPosition()[0]) + theEdge.getPosition()[1]).intern();
        String theOrientationOfTheEdge =
                (String.valueOf(theEdge.getOrientation()[0]) + theEdge.getOrientation()[1]).intern();

        switch (thePositionOfTheEdge){
            case "15":
            {
                switch(theOrientationOfTheEdge) {
                    case "51":
                    {
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);          //B
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = cube.turnTheCube(CubeFace.R, Turns.RR);         //R2
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = cube.turnTheCube(CubeFace.L, Turns.L);          //L
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "13":
            {
                switch(theOrientationOfTheEdge) {
                    case "15":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);          //R'
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);          //B'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);          //R
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);          //F
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        break;
                    }
                    case "51":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);          //R'
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);          //B
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);          //F'
                        cube = cube.turnTheCube(CubeFace.L, Turns.L);          //L
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "23":
            {
                switch(theOrientationOfTheEdge) {
                    case "51":
                    {
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);          //B
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);          //F'
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        break;
                    }
                    case "15":
                    {
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);          //B'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);          //R
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "35":
            {
                switch(theOrientationOfTheEdge) {
                    case "15":
                    {
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        cube = cube.turnTheCube(CubeFace.L, Turns.l);          //L'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);          //B
                        break;
                    }
                    case "51":
                    {
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);          //F
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);          //D
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);          //R'
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "45":
            {
                switch(theOrientationOfTheEdge) {
                    case "15":
                    {
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);          //R
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);          //D
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);          //B'
                        break;
                    }
                    case "51":
                    {
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);          //F'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = cube.turnTheCube(CubeFace.L, Turns.L);          //L
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "24":
            {
                switch(theOrientationOfTheEdge) {
                    case "51":
                    {
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);          //B'
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);          //F
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        break;
                    }
                    case "15":
                    {
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);          //B
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);          //D
                        cube = cube.turnTheCube(CubeFace.L, Turns.l);          //L'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "56":
            {
                switch(theOrientationOfTheEdge) {
                    case "51":
                    {
                        cube = downToUpEdge15Orientation51(cube);
                        break;
                    }
                    case "15":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
                        cube = downToUpEdge15Orientation15(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "46":
            {
                switch(theOrientationOfTheEdge) {
                    case "51":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
                        cube = downToUpEdge15Orientation51(cube);
                        break;
                    }
                    case "15":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);      //D2
                        cube = downToUpEdge15Orientation15(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "26":
            {
                switch(theOrientationOfTheEdge) {
                    case "51":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);      //D2
                        cube = downToUpEdge15Orientation51(cube);
                        break;
                    }
                    case "15":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
                        cube = downToUpEdge15Orientation15(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "36":
            {
                switch(theOrientationOfTheEdge) {
                    case "51":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
                        cube = downToUpEdge15Orientation51(cube);
                        break;
                    }
                    case "15":
                    {
                        cube = downToUpEdge15Orientation15(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
        }

        System.out.println("----------");
        return cube;
    }

    // Solving the fourth edge piece
    static Cube solveTheFourthEdge(Cube cube) {
        System.out.println("solveTheFourthEdge");

        Edge theEdge = Helper.findEdge(cube.getEdges(), new int[]{1, 3});
        String thePositionOfTheEdge =
                (String.valueOf(theEdge.getPosition()[0]) + theEdge.getPosition()[1]).intern();
        String theOrientationOfTheEdge =
                (String.valueOf(theEdge.getOrientation()[0]) + theEdge.getOrientation()[1]).intern();

        switch (thePositionOfTheEdge){
            case "13":
            {
                switch(theOrientationOfTheEdge) {
                    case "31":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);          //R
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = cube.turnTheCube(CubeFace.F, Turns.FF);         //F2
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);          //B
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "23":
            {
                switch(theOrientationOfTheEdge) {
                    case "31":
                    {
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.L, Turns.L);          //L
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);          //D
                        cube = cube.turnTheCube(CubeFace.F, Turns.f);          //F'
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        break;
                    }
                    case "13":
                    {
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);          //B'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);          //R
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "35":
            {
                switch(theOrientationOfTheEdge) {
                    case "13":
                    {
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.L, Turns.l);          //L'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = cube.turnTheCube(CubeFace.B, Turns.B);          //B
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        break;
                    }
                    case "31":
                    {
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);          //F
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);          //D
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);          //R'
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "45":
            {
                switch(theOrientationOfTheEdge) {
                    case "13":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);          //R
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);          //D
                        cube = cube.turnTheCube(CubeFace.B, Turns.b);          //B'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        break;
                    }
                    case "31":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);          //R'
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = cube.turnTheCube(CubeFace.L, Turns.L);          //L
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "24":
            {
                switch(theOrientationOfTheEdge) {
                    case "31":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.r);          //R'
                        cube = cube.turnTheCube(CubeFace.U, Turns.U);          //U
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = cube.turnTheCube(CubeFace.F, Turns.F);          //F
                        cube = cube.turnTheCube(CubeFace.U, Turns.u);          //U'
                        break;
                    }
                    case "13":
                    {
                        cube = cube.turnTheCube(CubeFace.R, Turns.R);          //R
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = cube.turnTheCube(CubeFace.L, Turns.l);          //L'
                        cube = cube.turnTheCube(CubeFace.U, Turns.UU);         //U2
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "56":
            {
                switch(theOrientationOfTheEdge) {
                    case "31":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
                        cube = downToUpEdge13Orientation31(cube);
                        break;
                    }
                    case "13":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);      //D2
                        cube = downToUpEdge13Orientation13(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "46":
            {
                switch(theOrientationOfTheEdge) {
                    case "31":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);      //D2
                        cube = downToUpEdge13Orientation31(cube);
                        break;
                    }
                    case "13":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
                        cube = downToUpEdge13Orientation13(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "26":
            {
                switch(theOrientationOfTheEdge) {
                    case "31":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
                        cube = downToUpEdge13Orientation31(cube);
                        break;
                    }
                    case "13":
                    {
                        cube = downToUpEdge13Orientation13(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "36":
            {
                switch(theOrientationOfTheEdge) {
                    case "31":
                    {
                        cube = downToUpEdge13Orientation31(cube);
                        break;
                    }
                    case "13":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
                        cube = downToUpEdge13Orientation13(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
        }

        System.out.println("----------");
        return cube;
    }

    // Solving the fifth edge piece
    static Cube solveTheFifthEdge(Cube cube) {
        System.out.println("solveTheFifthEdge");

        Edge theEdge = Helper.findEdge(cube.getEdges(), new int[]{2, 3});
        String thePositionOfTheEdge =
                (String.valueOf(theEdge.getPosition()[0]) + theEdge.getPosition()[1]).intern();
        String theOrientationOfTheEdge =
                (String.valueOf(theEdge.getOrientation()[0]) + theEdge.getOrientation()[1]).intern();

        switch (thePositionOfTheEdge){
            case "23":
            {
                switch(theOrientationOfTheEdge) {
                    case "32":
                    {
                        cube = downToMiddleEdge23Orientation23(cube);
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);          //D
                        cube = downToMiddleEdge23Orientation23(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "35":
            {
                switch(theOrientationOfTheEdge) {
                    case "23":
                    {
                        cube = downToMiddleEdge35Orientation53(cube);
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        break;
                    }
                    case "32":
                    {
                        cube = downToMiddleEdge35Orientation35(cube);
                        cube = downToMiddleEdge23Orientation23(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "45":
            {
                switch(theOrientationOfTheEdge) {
                    case "23":
                    {
                        cube = downToMiddleEdge45Orientation54(cube);
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = downToMiddleEdge23Orientation23(cube);
                        break;
                    }
                    case "32":
                    {
                        cube = downToMiddleEdge45Orientation45(cube);
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = downToMiddleEdge23Orientation23(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "24":
            {
                switch(theOrientationOfTheEdge) {
                    case "23":
                    {
                        cube = downToMiddleEdge24Orientation42(cube);
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = downToMiddleEdge23Orientation23(cube);
                        break;
                    }
                    case "32":
                    {
                        cube = downToMiddleEdge24Orientation24(cube);
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);          //D
                        cube = downToMiddleEdge23Orientation23(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "56":
            {
                switch(theOrientationOfTheEdge) {
                    case "23":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);         //D
                        cube = downToMiddleEdge23Orientation23(cube);
                        break;
                    }
                    case "32":
                    {
                        cube = downToMiddleEdge23Orientation32(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "46":
            {
                switch(theOrientationOfTheEdge) {
                    case "23":
                    {
                        cube = downToMiddleEdge23Orientation23(cube);
                        break;
                    }
                    case "32":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);         //D'
                        cube = downToMiddleEdge23Orientation32(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "26":
            {
                switch(theOrientationOfTheEdge) {
                    case "23":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);         //D'
                        cube = downToMiddleEdge23Orientation23(cube);
                        break;
                    }
                    case "32":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
                        cube = downToMiddleEdge23Orientation32(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "36":
            {
                switch(theOrientationOfTheEdge) {
                    case "23":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
                        cube = downToMiddleEdge23Orientation23(cube);
                        break;
                    }
                    case "32":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
                        cube = downToMiddleEdge23Orientation32(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
        }

        System.out.println("----------");
        return cube;
    }

    // Solving the sixth edge piece
    static Cube solveTheSixthEdge(Cube cube) {
        System.out.println("solveTheSixthEdge");

        Edge theEdge = Helper.findEdge(cube.getEdges(), new int[]{3, 5});
        String thePositionOfTheEdge =
                (String.valueOf(theEdge.getPosition()[0]) + theEdge.getPosition()[1]).intern();
        String theOrientationOfTheEdge =
                (String.valueOf(theEdge.getOrientation()[0]) + theEdge.getOrientation()[1]).intern();

        switch (thePositionOfTheEdge){
            case "35":
            {
                switch(theOrientationOfTheEdge) {
                    case "53":
                    {
                        cube = downToMiddleEdge35Orientation35(cube);
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);         //D
                        cube = downToMiddleEdge35Orientation35(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "45":
            {
                switch(theOrientationOfTheEdge) {
                    case "35":
                    {
                        cube = downToMiddleEdge45Orientation54(cube);
                        cube = downToMiddleEdge35Orientation35(cube);
                        break;
                    }
                    case "53":
                    {
                        cube = downToMiddleEdge45Orientation45(cube);
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);         //D'
                        cube = downToMiddleEdge35Orientation35(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "24":
            {
                switch(theOrientationOfTheEdge) {
                    case "35":
                    {
                        cube = downToMiddleEdge24Orientation42(cube);
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = downToMiddleEdge35Orientation35(cube);
                        break;
                    }
                    case "53":
                    {
                        cube = downToMiddleEdge24Orientation24(cube);
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = downToMiddleEdge35Orientation35(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "56":
            {
                switch(theOrientationOfTheEdge) {
                    case "35":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);        //D2
                        cube = downToMiddleEdge35Orientation35(cube);
                        break;
                    }
                    case "53":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);          //D
                        cube = downToMiddleEdge35Orientation53(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "46":
            {
                switch(theOrientationOfTheEdge) {
                    case "35":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);          //D
                        cube = downToMiddleEdge35Orientation35(cube);
                        break;
                    }
                    case "53":
                    {
                        cube = downToMiddleEdge35Orientation53(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "26":
            {
                switch(theOrientationOfTheEdge) {
                    case "35":
                    {
                        cube = downToMiddleEdge35Orientation35(cube);
                        break;
                    }
                    case "53":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = downToMiddleEdge35Orientation53(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "36":
            {
                switch(theOrientationOfTheEdge) {
                    case "35":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = downToMiddleEdge35Orientation35(cube);
                        break;
                    }
                    case "53":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = downToMiddleEdge35Orientation53(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
        }

        System.out.println("----------");
        return cube;
    }

    // Solving the seventh edge piece
    static Cube solveTheSeventhEdge(Cube cube) {
        System.out.println("solveTheSeventhEdge");

        Edge theEdge = Helper.findEdge(cube.getEdges(), new int[]{4, 5});
        String thePositionOfTheEdge =
                (String.valueOf(theEdge.getPosition()[0]) + theEdge.getPosition()[1]).intern();
        String theOrientationOfTheEdge =
                (String.valueOf(theEdge.getOrientation()[0]) + theEdge.getOrientation()[1]).intern();

        switch (thePositionOfTheEdge){
            case "45":
            {
                switch(theOrientationOfTheEdge) {
                    case "54":
                    {
                        cube = downToMiddleEdge45Orientation45(cube);
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);           //D'
                        cube = downToMiddleEdge45Orientation45(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "24":
            {
                switch(theOrientationOfTheEdge) {
                    case "45":
                    {
                        cube = downToMiddleEdge24Orientation42(cube);
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        break;
                    }
                    case "54":
                    {
                        cube = downToMiddleEdge24Orientation24(cube);
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = downToMiddleEdge45Orientation45(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "56":
            {
                switch(theOrientationOfTheEdge) {
                    case "45":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = downToMiddleEdge45Orientation45(cube);
                        break;
                    }
                    case "54":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = downToMiddleEdge45Orientation54(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "46":
            {
                switch(theOrientationOfTheEdge) {
                    case "45":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);          //D
                        cube = downToMiddleEdge45Orientation45(cube);
                        break;
                    }
                    case "54":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);         //D2
                        cube = downToMiddleEdge45Orientation54(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "26":
            {
                switch(theOrientationOfTheEdge) {
                    case "45":
                    {
                        cube = downToMiddleEdge45Orientation45(cube);
                        break;
                    }
                    case "54":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);          //D
                        cube = downToMiddleEdge45Orientation54(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "36":
            {
                switch(theOrientationOfTheEdge) {
                    case "45":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);          //D'
                        cube = downToMiddleEdge45Orientation45(cube);
                        break;
                    }
                    case "54":
                    {
                        cube = downToMiddleEdge45Orientation54(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
        }

        System.out.println("----------");
        return cube;
    }

    // Solving the eight edge piece
    static Cube solveTheEightEdge(Cube cube) {
        System.out.println("solveTheEightEdge");

        Edge theEdge = Helper.findEdge(cube.getEdges(), new int[]{2, 4});
        String thePositionOfTheEdge =
                (String.valueOf(theEdge.getPosition()[0]) + theEdge.getPosition()[1]).intern();
        String theOrientationOfTheEdge =
                (String.valueOf(theEdge.getOrientation()[0]) + theEdge.getOrientation()[1]).intern();

        switch (thePositionOfTheEdge){
            case "24":
            {
                switch(theOrientationOfTheEdge) {
                    case "42":
                    {
                        cube = downToMiddleEdge24Orientation24(cube);
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);         //D'
                        cube = downToMiddleEdge24Orientation24(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "56":
            {
                switch(theOrientationOfTheEdge) {
                    case "24":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);         //D'
                        cube = downToMiddleEdge24Orientation24(cube);
                        break;
                    }
                    case "42":
                    {
                        cube = downToMiddleEdge24Orientation42(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "46":
            {
                switch(theOrientationOfTheEdge) {
                    case "24":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);        //D2
                        cube = downToMiddleEdge24Orientation24(cube);
                        break;
                    }
                    case "42":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.d);         //D'
                        cube = downToMiddleEdge24Orientation42(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "26":
            {
                switch(theOrientationOfTheEdge) {
                    case "24":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
                        cube = downToMiddleEdge24Orientation24(cube);
                        break;
                    }
                    case "42":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
                        cube = downToMiddleEdge24Orientation42(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "36":
            {
                switch(theOrientationOfTheEdge) {
                    case "24":
                    {
                        cube = downToMiddleEdge24Orientation24(cube);
                        break;
                    }
                    case "42":
                    {
                        cube = cube.turnTheCube(CubeFace.D, Turns.D);         //D
                        cube = downToMiddleEdge24Orientation42(cube);
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
        }

        System.out.println("----------");
        return cube;
    }

    //Solve the edges on the last layer
    static Cube solveTheLastFourEdges(Cube cube) {
        System.out.println("solveTheLastFourEdges");
        System.out.println("Orient the edges");
        //Make a yellow cross

        if((String.valueOf(cube.getEdges()[8].getOrientation()[0]).equals("6")) &
                (String.valueOf(cube.getEdges()[9].getOrientation()[0]).equals("6")) &
                (String.valueOf(cube.getEdges()[10].getOrientation()[0]).equals("6")) &
                (String.valueOf(cube.getEdges()[11].getOrientation()[0]).equals("6")) )
        {
            cube = orientTheEdgesOnPosition26And46And56And36(cube);
        }else if((String.valueOf(cube.getEdges()[8].getOrientation()[0]).equals("6")) &
                (String.valueOf(cube.getEdges()[9].getOrientation()[1]).equals("6")) &
                (String.valueOf(cube.getEdges()[10].getOrientation()[1]).equals("6")) &
                (String.valueOf(cube.getEdges()[11].getOrientation()[0]).equals("6")) )
        {
            cube = orientTheEdgesOnPosition56And36(cube);
        }else if((String.valueOf(cube.getEdges()[8].getOrientation()[1]).equals("6")) &
                (String.valueOf(cube.getEdges()[9].getOrientation()[1]).equals("6")) &
                (String.valueOf(cube.getEdges()[10].getOrientation()[0]).equals("6")) &
                (String.valueOf(cube.getEdges()[11].getOrientation()[0]).equals("6")) )
        {
            cube = orientTheEdgesOnPosition36And26(cube);
        }else if((String.valueOf(cube.getEdges()[8].getOrientation()[1]).equals("6")) &
                (String.valueOf(cube.getEdges()[9].getOrientation()[0]).equals("6")) &
                (String.valueOf(cube.getEdges()[10].getOrientation()[0]).equals("6")) &
                (String.valueOf(cube.getEdges()[11].getOrientation()[1]).equals("6")) )
        {
            cube = orientTheEdgesOnPosition26And46(cube);
        }else if((String.valueOf(cube.getEdges()[8].getOrientation()[0]).equals("6")) &
                (String.valueOf(cube.getEdges()[9].getOrientation()[0]).equals("6")) &
                (String.valueOf(cube.getEdges()[10].getOrientation()[1]).equals("6")) &
                (String.valueOf(cube.getEdges()[11].getOrientation()[1]).equals("6")) )
        {
            cube = orientTheEdgesOnPosition46And56(cube);
        }else if((String.valueOf(cube.getEdges()[8].getOrientation()[1]).equals("6")) &
                (String.valueOf(cube.getEdges()[9].getOrientation()[0]).equals("6")) &
                (String.valueOf(cube.getEdges()[10].getOrientation()[1]).equals("6")) &
                (String.valueOf(cube.getEdges()[11].getOrientation()[0]).equals("6")) )
        {
            cube = orientTheEdgesOnPosition26And56(cube);
        }else if((String.valueOf(cube.getEdges()[8].getOrientation()[0]).equals("6")) &
                (String.valueOf(cube.getEdges()[9].getOrientation()[1]) .equals("6")) &
                (String.valueOf(cube.getEdges()[10].getOrientation()[0]).equals("6")) &
                (String.valueOf(cube.getEdges()[11].getOrientation()[1]).equals("6")) )
        {
            cube = orientTheEdgesOnPosition36And46(cube);
        }

        System.out.println("Position the edges");
        //Position the edges by switch two edges at time

        if(String.valueOf(cube.getEdges()[10].getOrientation()[0]).equals("3"))
        {
            cube = cube.turnTheCube(CubeFace.D, Turns.D);      //D
        }else if(String.valueOf(cube.getEdges()[9].getOrientation()[0]).equals("3"))
        {
            cube = cube.turnTheCube(CubeFace.D, Turns.DD);     //D2
        }else if(String.valueOf(cube.getEdges()[8].getOrientation()[0]).equals("3"))
        {
            cube = cube.turnTheCube(CubeFace.D, Turns.d);      //D'
        }

        if((String.valueOf(cube.getEdges()[8].getOrientation()[0]).equals("5")) &
                (String.valueOf(cube.getEdges()[9].getOrientation()[0]).equals("2")) &
                (String.valueOf(cube.getEdges()[10].getOrientation()[0]).equals("4")) &
                (String.valueOf(cube.getEdges()[11].getOrientation()[0]).equals("3")) )
        {
            cube = swapTheEdgesOnPosition26And46(cube);
        }else if((String.valueOf(cube.getEdges()[8].getOrientation()[0]).equals("4")) &
                (String.valueOf(cube.getEdges()[9].getOrientation()[0]).equals("5")) &
                (String.valueOf(cube.getEdges()[10].getOrientation()[0]).equals("2")) &
                (String.valueOf(cube.getEdges()[11].getOrientation()[0]).equals("3")) )
        {
            cube = swapTheEdgesOnPosition46And56(cube);
        }else if((String.valueOf(cube.getEdges()[8].getOrientation()[0]).equals("4")) &
                (String.valueOf(cube.getEdges()[9].getOrientation()[0]).equals("2")) &
                (String.valueOf(cube.getEdges()[10].getOrientation()[0]).equals("5")) &
                (String.valueOf(cube.getEdges()[11].getOrientation()[0]).equals("3")) )
        {
            cube = swapTheEdgesOnPosition56And36AndThenADownCounterclockwiseTurn(cube);
        }else if((String.valueOf(cube.getEdges()[8].getOrientation()[0]).equals("2")) &
                (String.valueOf(cube.getEdges()[9].getOrientation()[0]).equals("5")) &
                (String.valueOf(cube.getEdges()[10].getOrientation()[0]).equals("4")) &
                (String.valueOf(cube.getEdges()[11].getOrientation()[0]).equals("3")) )
        {
            cube = swapTheEdgesOnPosition36And26AndThenADownClockwiseTurn(cube);
        }else if((String.valueOf(cube.getEdges()[8].getOrientation()[0]).equals("2")) &
                (String.valueOf(cube.getEdges()[9].getOrientation()[0]).equals("5")) &
                (String.valueOf(cube.getEdges()[10].getOrientation()[0]).equals("4")) &
                (String.valueOf(cube.getEdges()[11].getOrientation()[0]).equals("6")) )
        {
            cube = swapTheEdgesOnPosition56And36AndThenADownCounterclockwiseTurnAndThenSwapTheEdgesOnPosition46And56
                    (cube);
        }

        System.out.println("----------");
        return cube;
    }

    //Solve the corners on the last layer
    static Cube solveTheLastFourCorners(Cube cube) throws InaccurateMixingOfCornersException {
        System.out.println("solveTheLastFourCorners");
        System.out.println("Position the corners");
        int check = 0;
        boolean c4,c5,c6,c7;

        if(!((String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                cube.getCorners()[4].getNumber()[1] +
                cube.getCorners()[4].getNumber()[2]).equals("456")) &
                !((String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                        cube.getCorners()[5].getNumber()[1] +
                        cube.getCorners()[5].getNumber()[2]).equals("246")) &
                !((String.valueOf(cube.getEdges()[6].getNumber()[0]) +
                        cube.getCorners()[6].getNumber()[1] +
                        cube.getCorners()[6].getNumber()[2]).equals("236")) &
                !((String.valueOf(cube.getEdges()[7].getNumber()[0]) +
                        cube.getCorners()[7].getNumber()[1] +
                        cube.getCorners()[7].getNumber()[2]).equals("356")))
        {
            if (((String.valueOf(cube.getCorners()[6].getNumber()[0]) +
                    cube.getCorners()[6].getNumber()[1] +
                    cube.getCorners()[6].getNumber()[2]).equals("456")) |
                    ((String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                            cube.getCorners()[4].getNumber()[1] +
                            cube.getCorners()[4].getNumber()[2]).equals("356")) |
                    ((String.valueOf(cube.getEdges()[7].getNumber()[0]) +
                            cube.getCorners()[7].getNumber()[1] +
                            cube.getCorners()[7].getNumber()[2]).equals("236"))) {
                cube = rotateTheCornersOnPosition236And456And356Counterclockwise(cube);
                c6 = (String.valueOf(cube.getCorners()[6].getNumber()[0]) +
                        cube.getCorners()[6].getNumber()[1] +
                        cube.getCorners()[6].getNumber()[2]).equals("236");
                c4 = (String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                        cube.getCorners()[4].getNumber()[1] +
                        cube.getCorners()[4].getNumber()[2]).equals("456");
                c7 = (String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                        cube.getCorners()[7].getNumber()[1] +
                        cube.getCorners()[7].getNumber()[2]).equals("356");
                c5 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                        cube.getCorners()[5].getNumber()[1] +
                        cube.getCorners()[5].getNumber()[2]).equals("246");
                if(c6 & !c4 & !c7)
                {
                    cube = rotateTheCornersOnPosition356And246And456Counterclockwise(cube);
                    c4 = (String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                            cube.getCorners()[4].getNumber()[1] +
                            cube.getCorners()[4].getNumber()[2]).equals("456");
                    c7 = (String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                            cube.getCorners()[7].getNumber()[1] +
                            cube.getCorners()[7].getNumber()[2]).equals("356");
                    c5 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                            cube.getCorners()[5].getNumber()[1] +
                            cube.getCorners()[5].getNumber()[2]).equals("246");
                    if(!(c4 & c5 & c7))
                    {
                        cube = rotateTheCornersOnPosition356And246And456Counterclockwise(cube);
                    }
                }else if(c4 & !c6 & !c7)
                {
                    cube = rotateTheCornersOnPosition246And356And236Counterclockwise(cube);
                    c5 = (String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                            cube.getCorners()[4].getNumber()[1] +
                            cube.getCorners()[4].getNumber()[2]).equals("456");
                    c6 = (String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                            cube.getCorners()[7].getNumber()[1] +
                            cube.getCorners()[7].getNumber()[2]).equals("356");
                    c7 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                            cube.getCorners()[5].getNumber()[1] +
                            cube.getCorners()[5].getNumber()[2]).equals("246");
                    if(!(c5 & c6 & c7))
                    {
                        cube = rotateTheCornersOnPosition246And356And236Counterclockwise(cube);
                    }
                }else if(c7 & !c4 & !c5)
                {
                    cube = rotateTheCornersOnPosition456And236And246Counterclockwise(cube);
                    c4 = (String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                            cube.getCorners()[4].getNumber()[1] +
                            cube.getCorners()[4].getNumber()[2]).equals("456");
                    c5 = (String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                            cube.getCorners()[7].getNumber()[1] +
                            cube.getCorners()[7].getNumber()[2]).equals("356");
                    c6 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                            cube.getCorners()[5].getNumber()[1] +
                            cube.getCorners()[5].getNumber()[2]).equals("246");
                    if(!(c4 & c5 & c6))
                    {
                        cube = rotateTheCornersOnPosition456And236And246Counterclockwise(cube);
                    }
                }

            }else if (((String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                    cube.getCorners()[7].getNumber()[1] +
                    cube.getCorners()[7].getNumber()[2]).equals("246")) |
                    ((String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                            cube.getCorners()[5].getNumber()[1] +
                            cube.getCorners()[5].getNumber()[2]).equals("456")) |
                    ((String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                            cube.getCorners()[4].getNumber()[1] +
                            cube.getCorners()[4].getNumber()[2]).equals("356"))) {
                cube = rotateTheCornersOnPosition356And246And456Counterclockwise(cube);
                c4 = (String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                        cube.getCorners()[4].getNumber()[1] +
                        cube.getCorners()[4].getNumber()[2]).equals("456");
                c7 = (String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                        cube.getCorners()[7].getNumber()[1] +
                        cube.getCorners()[7].getNumber()[2]).equals("356");
                c5 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                        cube.getCorners()[5].getNumber()[1] +
                        cube.getCorners()[5].getNumber()[2]).equals("246");
                if(c7 & !c4 & !c5)
                {
                    cube = rotateTheCornersOnPosition456And236And246Counterclockwise(cube);
                    c4 = (String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                            cube.getCorners()[4].getNumber()[1] +
                            cube.getCorners()[4].getNumber()[2]).equals("456");
                    c5 = (String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                            cube.getCorners()[7].getNumber()[1] +
                            cube.getCorners()[7].getNumber()[2]).equals("356");
                    c6 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                            cube.getCorners()[5].getNumber()[1] +
                            cube.getCorners()[5].getNumber()[2]).equals("246");
                    if(!(c4 & c5 & c6))
                    {
                        cube = rotateTheCornersOnPosition456And236And246Counterclockwise(cube);
                    }
                }else if(c5 & !c4 & !c7)
                {
                    cube = rotateTheCornersOnPosition236And456And356Counterclockwise(cube);
                    c4 = (String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                            cube.getCorners()[4].getNumber()[1] +
                            cube.getCorners()[4].getNumber()[2]).equals("456");
                    c6 = (String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                            cube.getCorners()[7].getNumber()[1] +
                            cube.getCorners()[7].getNumber()[2]).equals("356");
                    c7 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                            cube.getCorners()[5].getNumber()[1] +
                            cube.getCorners()[5].getNumber()[2]).equals("246");
                    if(!(c4 & c6 & c7))
                    {
                        cube = rotateTheCornersOnPosition236And456And356Counterclockwise(cube);
                    }
                }else if(c4 & !c5 & !c7)
                {
                    cube = rotateTheCornersOnPosition246And356And236Counterclockwise(cube);
                    c5 = (String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                            cube.getCorners()[4].getNumber()[1] +
                            cube.getCorners()[4].getNumber()[2]).equals("456");
                    c6 = (String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                            cube.getCorners()[7].getNumber()[1] +
                            cube.getCorners()[7].getNumber()[2]).equals("356");
                    c7 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                            cube.getCorners()[5].getNumber()[1] +
                            cube.getCorners()[5].getNumber()[2]).equals("246");
                    if(!(c5 & c6 & c7))
                    {
                        cube = rotateTheCornersOnPosition246And356And236Counterclockwise(cube);
                    }
                }
            }else if (((String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                    cube.getCorners()[4].getNumber()[1] +
                    cube.getCorners()[4].getNumber()[2]).equals("236")) |
                    ((String.valueOf(cube.getCorners()[6].getNumber()[0]) +
                            cube.getCorners()[6].getNumber()[1] +
                            cube.getCorners()[6].getNumber()[2]).equals("246")) |
                    ((String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                            cube.getCorners()[5].getNumber()[1] +
                            cube.getCorners()[5].getNumber()[2]).equals("456"))) {
                cube = rotateTheCornersOnPosition456And236And246Counterclockwise(cube);
                c6 = (String.valueOf(cube.getCorners()[6].getNumber()[0]) +
                        cube.getCorners()[6].getNumber()[1] +
                        cube.getCorners()[6].getNumber()[2]).equals("236");
                c4 = (String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                        cube.getCorners()[4].getNumber()[1] +
                        cube.getCorners()[4].getNumber()[2]).equals("456");
                c5 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                        cube.getCorners()[5].getNumber()[1] +
                        cube.getCorners()[5].getNumber()[2]).equals("246");
                if(c4 & !c5 & !c6)
                {
                    cube = rotateTheCornersOnPosition246And356And236Counterclockwise(cube);
                    c5 = (String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                            cube.getCorners()[4].getNumber()[1] +
                            cube.getCorners()[4].getNumber()[2]).equals("456");
                    c6 = (String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                            cube.getCorners()[7].getNumber()[1] +
                            cube.getCorners()[7].getNumber()[2]).equals("356");
                    c7 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                            cube.getCorners()[5].getNumber()[1] +
                            cube.getCorners()[5].getNumber()[2]).equals("246");
                    if(!(c5 & c6 & c7))
                    {
                        cube = rotateTheCornersOnPosition246And356And236Counterclockwise(cube);
                    }
                }else if(c6 & !c4 & !c5)
                {
                    cube = rotateTheCornersOnPosition356And246And456Counterclockwise(cube);
                    c4 = (String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                            cube.getCorners()[4].getNumber()[1] +
                            cube.getCorners()[4].getNumber()[2]).equals("456");
                    c5 = (String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                            cube.getCorners()[7].getNumber()[1] +
                            cube.getCorners()[7].getNumber()[2]).equals("356");
                    c7 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                            cube.getCorners()[5].getNumber()[1] +
                            cube.getCorners()[5].getNumber()[2]).equals("246");
                    if(!(c4 & c5 & c7))
                    {
                        cube = rotateTheCornersOnPosition356And246And456Counterclockwise(cube);
                    }
                }else if(c5 & !c4 & !c6)
                {
                    cube = rotateTheCornersOnPosition236And456And356Counterclockwise(cube);
                    c4 = (String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                            cube.getCorners()[4].getNumber()[1] +
                            cube.getCorners()[4].getNumber()[2]).equals("456");
                    c6 = (String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                            cube.getCorners()[7].getNumber()[1] +
                            cube.getCorners()[7].getNumber()[2]).equals("356");
                    c7 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                            cube.getCorners()[5].getNumber()[1] +
                            cube.getCorners()[5].getNumber()[2]).equals("246");
                    if(!(c4 & c6 & c7))
                    {
                        cube = rotateTheCornersOnPosition236And456And356Counterclockwise(cube);
                    }
                }
            }else if (((String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                    cube.getCorners()[5].getNumber()[1] +
                    cube.getCorners()[5].getNumber()[2]).equals("356")) |
                    ((String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                            cube.getCorners()[7].getNumber()[1] +
                            cube.getCorners()[7].getNumber()[2]).equals("236")) |
                    ((String.valueOf(cube.getEdges()[6].getNumber()[0]) +
                            cube.getCorners()[6].getNumber()[1] +
                            cube.getCorners()[6].getNumber()[2]).equals("246"))) {
                cube = rotateTheCornersOnPosition246And356And236Counterclockwise(cube);
                c6 = (String.valueOf(cube.getCorners()[6].getNumber()[0]) +
                        cube.getCorners()[6].getNumber()[1] +
                        cube.getCorners()[6].getNumber()[2]).equals("236");
                c7 = (String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                        cube.getCorners()[7].getNumber()[1] +
                        cube.getCorners()[7].getNumber()[2]).equals("356");
                c5 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                        cube.getCorners()[5].getNumber()[1] +
                        cube.getCorners()[5].getNumber()[2]).equals("246");
                if(c5 & !c6 & !c7)
                {
                    cube = rotateTheCornersOnPosition236And456And356Counterclockwise(cube);
                    c4 = (String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                            cube.getCorners()[4].getNumber()[1] +
                            cube.getCorners()[4].getNumber()[2]).equals("456");
                    c6 = (String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                            cube.getCorners()[7].getNumber()[1] +
                            cube.getCorners()[7].getNumber()[2]).equals("356");
                    c7 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                            cube.getCorners()[5].getNumber()[1] +
                            cube.getCorners()[5].getNumber()[2]).equals("246");
                    if(!(c4 & c6 & c7))
                    {
                        cube = rotateTheCornersOnPosition236And456And356Counterclockwise(cube);
                    }
                }else if(c7 & !c5 & !c6)
                {
                    cube = rotateTheCornersOnPosition456And236And246Counterclockwise(cube);
                    c4 = (String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                            cube.getCorners()[4].getNumber()[1] +
                            cube.getCorners()[4].getNumber()[2]).equals("456");
                    c5 = (String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                            cube.getCorners()[7].getNumber()[1] +
                            cube.getCorners()[7].getNumber()[2]).equals("356");
                    c6 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                            cube.getCorners()[5].getNumber()[1] +
                            cube.getCorners()[5].getNumber()[2]).equals("246");
                    if(!(c4 & c5 & c6))
                    {
                        cube = rotateTheCornersOnPosition456And236And246Counterclockwise(cube);
                    }
                }else if(c6 & !c5 & !c7)
                {
                    cube = rotateTheCornersOnPosition356And246And456Counterclockwise(cube);
                    c4 = (String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                            cube.getCorners()[4].getNumber()[1] +
                            cube.getCorners()[4].getNumber()[2]).equals("456");
                    c5 = (String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                            cube.getCorners()[7].getNumber()[1] +
                            cube.getCorners()[7].getNumber()[2]).equals("356");
                    c7 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                            cube.getCorners()[5].getNumber()[1] +
                            cube.getCorners()[5].getNumber()[2]).equals("246");
                    if(!(c4 & c5 & c7))
                    {
                        cube = rotateTheCornersOnPosition356And246And456Counterclockwise(cube);
                    }
                }
            }
        }else if(((String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                cube.getCorners()[4].getNumber()[1] +
                cube.getCorners()[4].getNumber()[2]).equals("456")) &
                !((String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                        cube.getCorners()[5].getNumber()[1] +
                        cube.getCorners()[5].getNumber()[2]).equals("246")) &
                !((String.valueOf(cube.getEdges()[6].getNumber()[0]) +
                        cube.getCorners()[6].getNumber()[1] +
                        cube.getCorners()[6].getNumber()[2]).equals("236")) &
                !((String.valueOf(cube.getEdges()[7].getNumber()[0]) +
                        cube.getCorners()[7].getNumber()[1] +
                        cube.getCorners()[7].getNumber()[2]).equals("356"))) {
            cube = rotateTheCornersOnPosition246And356And236Counterclockwise(cube);
            c6 = (String.valueOf(cube.getCorners()[6].getNumber()[0]) +
                    cube.getCorners()[6].getNumber()[1] +
                    cube.getCorners()[6].getNumber()[2]).equals("236");
            c4 = (String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                    cube.getCorners()[4].getNumber()[1] +
                    cube.getCorners()[4].getNumber()[2]).equals("456");
            c7 = (String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                    cube.getCorners()[7].getNumber()[1] +
                    cube.getCorners()[7].getNumber()[2]).equals("356");
            c5 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                    cube.getCorners()[5].getNumber()[1] +
                    cube.getCorners()[5].getNumber()[2]).equals("246");
            if(!(c4 & c5 & c6 & c7))
            {
                cube = rotateTheCornersOnPosition246And356And236Counterclockwise(cube);
            }
        }else if(!((String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                cube.getCorners()[4].getNumber()[1] +
                cube.getCorners()[4].getNumber()[2]).equals("456")) &
                ((String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                        cube.getCorners()[5].getNumber()[1] +
                        cube.getCorners()[5].getNumber()[2]).equals("246")) &
                !((String.valueOf(cube.getEdges()[6].getNumber()[0]) +
                        cube.getCorners()[6].getNumber()[1] +
                        cube.getCorners()[6].getNumber()[2]).equals("236")) &
                !((String.valueOf(cube.getEdges()[7].getNumber()[0]) +
                        cube.getCorners()[7].getNumber()[1] +
                        cube.getCorners()[7].getNumber()[2]).equals("356"))) {
            cube = rotateTheCornersOnPosition236And456And356Counterclockwise(cube);
            c6 = (String.valueOf(cube.getCorners()[6].getNumber()[0]) +
                    cube.getCorners()[6].getNumber()[1] +
                    cube.getCorners()[6].getNumber()[2]).equals("236");
            c4 = (String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                    cube.getCorners()[4].getNumber()[1] +
                    cube.getCorners()[4].getNumber()[2]).equals("456");
            c7 = (String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                    cube.getCorners()[7].getNumber()[1] +
                    cube.getCorners()[7].getNumber()[2]).equals("356");
            c5 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                    cube.getCorners()[5].getNumber()[1] +
                    cube.getCorners()[5].getNumber()[2]).equals("246");
            if(!(c4 & c5 & c6 & c7))
            {
                cube = rotateTheCornersOnPosition236And456And356Counterclockwise(cube);
            }
        }else if(!((String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                cube.getCorners()[4].getNumber()[1] +
                cube.getCorners()[4].getNumber()[2]).equals("456")) &
                !((String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                        cube.getCorners()[5].getNumber()[1] +
                        cube.getCorners()[5].getNumber()[2]).equals("246")) &
                ((String.valueOf(cube.getEdges()[6].getNumber()[0]) +
                        cube.getCorners()[6].getNumber()[1] +
                        cube.getCorners()[6].getNumber()[2]).equals("236")) &
                !((String.valueOf(cube.getEdges()[7].getNumber()[0]) +
                        cube.getCorners()[7].getNumber()[1] +
                        cube.getCorners()[7].getNumber()[2]).equals("356"))) {
            cube = rotateTheCornersOnPosition356And246And456Counterclockwise(cube);
            c6 = (String.valueOf(cube.getCorners()[6].getNumber()[0]) +
                    cube.getCorners()[6].getNumber()[1] +
                    cube.getCorners()[6].getNumber()[2]).equals("236");
            c4 = (String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                    cube.getCorners()[4].getNumber()[1] +
                    cube.getCorners()[4].getNumber()[2]).equals("456");
            c7 = (String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                    cube.getCorners()[7].getNumber()[1] +
                    cube.getCorners()[7].getNumber()[2]).equals("356");
            c5 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                    cube.getCorners()[5].getNumber()[1] +
                    cube.getCorners()[5].getNumber()[2]).equals("246");
            if(!(c4 & c5 & c6 & c7))
            {
                cube = rotateTheCornersOnPosition356And246And456Counterclockwise(cube);
            }
        }else if(!((String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                cube.getCorners()[4].getNumber()[1] +
                cube.getCorners()[4].getNumber()[2]).equals("456")) &
                !((String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                        cube.getCorners()[5].getNumber()[1] +
                        cube.getCorners()[5].getNumber()[2]).equals("246")) &
                !((String.valueOf(cube.getEdges()[6].getNumber()[0]) +
                        cube.getCorners()[6].getNumber()[1] +
                        cube.getCorners()[6].getNumber()[2]).equals("236")) &
                ((String.valueOf(cube.getEdges()[7].getNumber()[0]) +
                        cube.getCorners()[7].getNumber()[1] +
                        cube.getCorners()[7].getNumber()[2]).equals("356"))) {
            cube = rotateTheCornersOnPosition456And236And246Counterclockwise(cube);
            c6 = (String.valueOf(cube.getCorners()[6].getNumber()[0]) +
                    cube.getCorners()[6].getNumber()[1] +
                    cube.getCorners()[6].getNumber()[2]).equals("236");
            c4 = (String.valueOf(cube.getCorners()[4].getNumber()[0]) +
                    cube.getCorners()[4].getNumber()[1] +
                    cube.getCorners()[4].getNumber()[2]).equals("456");
            c7 = (String.valueOf(cube.getCorners()[7].getNumber()[0]) +
                    cube.getCorners()[7].getNumber()[1] +
                    cube.getCorners()[7].getNumber()[2]).equals("356");
            c5 = (String.valueOf(cube.getCorners()[5].getNumber()[0]) +
                    cube.getCorners()[5].getNumber()[1] +
                    cube.getCorners()[5].getNumber()[2]).equals("246");
            if(!(c4 & c5 & c6 & c7))
            {
                cube = rotateTheCornersOnPosition456And236And246Counterclockwise(cube);
            }
        }

        System.out.println("Orient the corners");

        if(cube.getCorners()[6].getOrientation()[1] == 6) {
            cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
            cube = theFourStepTreatmentBackward(cube);
            cube = theFourStepTreatmentBackward(cube);
            cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        }else if(cube.getCorners()[6].getOrientation()[0] == 6) {
            cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
            cube = theFourStepTreatmentForward(cube);
            cube = theFourStepTreatmentForward(cube);
            cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        }

        if(cube.getCorners()[5].getOrientation()[0] == 6) {
            cube = theFourStepTreatmentBackward(cube);
            cube = theFourStepTreatmentBackward(cube);
        }else if(cube.getCorners()[5].getOrientation()[1] == 6) {
            cube = theFourStepTreatmentForward(cube);
            cube = theFourStepTreatmentForward(cube);
        }

        if(cube.getCorners()[4].getOrientation()[0] == 6) {
            cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
            cube = theFourStepTreatmentBackward(cube);
            cube = theFourStepTreatmentBackward(cube);
            cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
        }else if(cube.getCorners()[4].getOrientation()[1] == 6) {
            cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
            cube = theFourStepTreatmentForward(cube);
            cube = theFourStepTreatmentForward(cube);
            cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
        }

        if(cube.getCorners()[7].getOrientation()[1] == 6) {
            cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
            cube = theFourStepTreatmentBackward(cube);
            cube = theFourStepTreatmentBackward(cube);
            cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
        }else if(cube.getCorners()[7].getOrientation()[0] == 6) {
            cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
            cube = theFourStepTreatmentForward(cube);
            cube = theFourStepTreatmentForward(cube);
            cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
        }

        for(int i = 0; i < 8; i++)
        {
            if(
                    (String.valueOf(cube.getCorners()[i].getOrientation()[0])
                    + cube.getCorners()[i].getOrientation()[1] + cube.getCorners()[i].getOrientation()[2]).
                    equals((String.valueOf(cube.getCorners()[i].getPosition()[0])
                            + cube.getCorners()[i].getPosition()[1] + cube.getCorners()[i].getPosition()[2]))
                    &
                    ((String.valueOf(cube.getEdges()[i].getOrientation()[0])
                            + cube.getEdges()[i].getOrientation()[1]).
                            equals((String.valueOf(cube.getEdges()[i].getPosition()[0])
                                    + cube.getEdges()[i].getPosition()[1])))
                    )
            {
                check++;
            }
        }

        if(check != 8)
            throw new InaccurateMixingOfCornersException("Inaccurate mixing of the cube, please try again");

        System.out.println("----------");
        return cube;
    }

    private static Cube downToUpEdge12Orientation21(Cube cube){
        System.out.println("downToUpEdge12Orientation21");

        cube = cube.turnTheCube(CubeFace.L, Turns.l);       //L'
        cube = cube.turnTheCube(CubeFace.R, Turns.R);       //R
        cube = cube.turnTheCube(CubeFace.F, Turns.FF);      //F2
        cube = cube.turnTheCube(CubeFace.L, Turns.L);       //L
        cube = cube.turnTheCube(CubeFace.R, Turns.r);       //R'

        System.out.println("----------");
        return cube;
    }

    private static Cube downToUpEdge12Orientation12(Cube cube){
        System.out.println("downToUpEdge12Orientation12");

        cube = cube.turnTheCube(CubeFace.L, Turns.l);       //L'
        cube = cube.turnTheCube(CubeFace.R, Turns.R);       //R
        cube = cube.turnTheCube(CubeFace.F, Turns.F);       //F
        cube = cube.turnTheCube(CubeFace.L, Turns.L);       //L
        cube = cube.turnTheCube(CubeFace.R, Turns.r);       //R'

        System.out.println("----------");
        return cube;
    }

    private static Cube downToUpEdge14Orientation41(Cube cube){
        System.out.println("downToUpEdge14Orientation41");

        cube = cube.turnTheCube(CubeFace.B, Turns.b);       //B'
        cube = cube.turnTheCube(CubeFace.F, Turns.F);       //F
        cube = cube.turnTheCube(CubeFace.L, Turns.LL);      //L2
        cube = cube.turnTheCube(CubeFace.B, Turns.B);       //B
        cube = cube.turnTheCube(CubeFace.F, Turns.f);       //F'

        System.out.println("----------");
        return cube;
    }

    private static Cube downToUpEdge14Orientation14(Cube cube){
        System.out.println("downToUpEdge14Orientation14");

        cube = cube.turnTheCube(CubeFace.B, Turns.b);       //B'
        cube = cube.turnTheCube(CubeFace.F, Turns.F);       //F
        cube = cube.turnTheCube(CubeFace.L, Turns.L);       //L
        cube = cube.turnTheCube(CubeFace.B, Turns.B);       //B
        cube = cube.turnTheCube(CubeFace.F, Turns.f);       //F'

        System.out.println("----------");
        return cube;
    }

    private static Cube downToUpEdge15Orientation51(Cube cube){
        System.out.println("downToUpEdge15Orientation51");

        cube = cube.turnTheCube(CubeFace.R, Turns.r);       //R'
        cube = cube.turnTheCube(CubeFace.L, Turns.L);       //L
        cube = cube.turnTheCube(CubeFace.B, Turns.BB);      //B2
        cube = cube.turnTheCube(CubeFace.R, Turns.R);       //R
        cube = cube.turnTheCube(CubeFace.L, Turns.l);       //L'

        System.out.println("----------");
        return cube;
    }

    private static Cube downToUpEdge15Orientation15(Cube cube){
        System.out.println("downToUpEdge15Orientation15");

        cube = cube.turnTheCube(CubeFace.R, Turns.r);       //R'
        cube = cube.turnTheCube(CubeFace.L, Turns.L);       //L
        cube = cube.turnTheCube(CubeFace.B, Turns.B);       //B
        cube = cube.turnTheCube(CubeFace.R, Turns.R);       //R
        cube = cube.turnTheCube(CubeFace.L, Turns.l);       //L'

        System.out.println("----------");
        return cube;
    }

    private static Cube downToUpEdge13Orientation31(Cube cube){
        System.out.println("downToUpEdge13Orientation31");

        cube = cube.turnTheCube(CubeFace.F, Turns.f);       //F'
        cube = cube.turnTheCube(CubeFace.B, Turns.B);       //B
        cube = cube.turnTheCube(CubeFace.R, Turns.RR);      //R2
        cube = cube.turnTheCube(CubeFace.F, Turns.F);       //F
        cube = cube.turnTheCube(CubeFace.B, Turns.b);       //B'

        System.out.println("----------");
        return cube;
    }

    private static Cube downToUpEdge13Orientation13(Cube cube){
        System.out.println("downToUpEdge13Orientation13");

        cube = cube.turnTheCube(CubeFace.F, Turns.f);       //F'
        cube = cube.turnTheCube(CubeFace.B, Turns.B);       //B
        cube = cube.turnTheCube(CubeFace.R, Turns.R);       //R
        cube = cube.turnTheCube(CubeFace.F, Turns.F);       //F
        cube = cube.turnTheCube(CubeFace.B, Turns.b);       //B'

        System.out.println("----------");
        return cube;
    }

    private static Cube downToMiddleEdge23Orientation23(Cube cube){
        System.out.println("downToMiddleEdge23Orientation23");

        cube = cube.turnTheCube(CubeFace.R, Turns.r);      //R'
        cube = cube.turnTheCube(CubeFace.D, Turns.D);      //D
        cube = cube.turnTheCube(CubeFace.R, Turns.R);      //R
        cube = cube.turnTheCube(CubeFace.D, Turns.D);      //D
        cube = cube.turnTheCube(CubeFace.F, Turns.F);      //F
        cube = cube.turnTheCube(CubeFace.D, Turns.d);      //D'
        cube = cube.turnTheCube(CubeFace.F, Turns.f);      //F'

        System.out.println("----------");
        return cube;
    }

    private static Cube downToMiddleEdge23Orientation32(Cube cube){
        System.out.println("downToMiddleEdge23Orientation32");

        cube = cube.turnTheCube(CubeFace.F, Turns.F);       //F
        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
        cube = cube.turnTheCube(CubeFace.F, Turns.f);       //F'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
        cube = cube.turnTheCube(CubeFace.R, Turns.r);       //R'
        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        cube = cube.turnTheCube(CubeFace.R, Turns.R);       //R

        System.out.println("----------");
        return cube;
    }

    private static Cube downToMiddleEdge35Orientation35(Cube cube){
        System.out.println("downToMiddleEdge35Orientation35");

        cube = cube.turnTheCube(CubeFace.B, Turns.b);      //B'
        cube = cube.turnTheCube(CubeFace.D, Turns.D);      //D
        cube = cube.turnTheCube(CubeFace.B, Turns.B);      //B
        cube = cube.turnTheCube(CubeFace.D, Turns.D);      //D
        cube = cube.turnTheCube(CubeFace.R, Turns.R);      //R
        cube = cube.turnTheCube(CubeFace.D, Turns.d);      //D'
        cube = cube.turnTheCube(CubeFace.R, Turns.r);      //R'

        System.out.println("----------");
        return cube;
    }

    private static Cube downToMiddleEdge35Orientation53(Cube cube){
        System.out.println("downToMiddleEdge35Orientation53");

        cube = cube.turnTheCube(CubeFace.R, Turns.R);      //R
        cube = cube.turnTheCube(CubeFace.D, Turns.d);      //D'
        cube = cube.turnTheCube(CubeFace.R, Turns.r);      //R'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);      //D'
        cube = cube.turnTheCube(CubeFace.B, Turns.b);      //B'
        cube = cube.turnTheCube(CubeFace.D, Turns.D);      //D
        cube = cube.turnTheCube(CubeFace.B, Turns.B);      //B

        System.out.println("----------");
        return cube;
    }

    private static Cube downToMiddleEdge45Orientation45(Cube cube){
        System.out.println("downToMiddleEdge45Orientation45");

        cube = cube.turnTheCube(CubeFace.B, Turns.B);      //B
        cube = cube.turnTheCube(CubeFace.D, Turns.d);      //D'
        cube = cube.turnTheCube(CubeFace.B, Turns.b);      //B'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);      //D'
        cube = cube.turnTheCube(CubeFace.L, Turns.l);      //L'
        cube = cube.turnTheCube(CubeFace.D, Turns.D);      //D
        cube = cube.turnTheCube(CubeFace.L, Turns.L);      //L

        System.out.println("----------");
        return cube;
    }

    private static Cube downToMiddleEdge45Orientation54(Cube cube){
        System.out.println("downToMiddleEdge45Orientation54");

        cube = cube.turnTheCube(CubeFace.L, Turns.l);      //L'
        cube = cube.turnTheCube(CubeFace.D, Turns.D);      //D
        cube = cube.turnTheCube(CubeFace.L, Turns.L);      //L
        cube = cube.turnTheCube(CubeFace.D, Turns.D);      //D
        cube = cube.turnTheCube(CubeFace.B, Turns.B);      //B
        cube = cube.turnTheCube(CubeFace.D, Turns.d);      //D'
        cube = cube.turnTheCube(CubeFace.B, Turns.b);      //B'

        System.out.println("----------");
        return cube;
    }

    private static Cube downToMiddleEdge24Orientation24(Cube cube){
        System.out.println("downToMiddleEdge24Orientation24");

        cube = cube.turnTheCube(CubeFace.L, Turns.L);       //L
        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
        cube = cube.turnTheCube(CubeFace.L, Turns.l);       //L'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
        cube = cube.turnTheCube(CubeFace.F, Turns.f);       //F'
        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        cube = cube.turnTheCube(CubeFace.F, Turns.F);       //F

        System.out.println("----------");
        return cube;
    }

    private static Cube downToMiddleEdge24Orientation42(Cube cube){
        System.out.println("downToMiddleEdge24Orientation42");

        cube = cube.turnTheCube(CubeFace.F, Turns.f);       //F'
        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        cube = cube.turnTheCube(CubeFace.F, Turns.F);       //F
        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        cube = cube.turnTheCube(CubeFace.L, Turns.L);       //L
        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
        cube = cube.turnTheCube(CubeFace.L, Turns.l);       //L'

        System.out.println("----------");
        return cube;
    }

    private static Cube orientTheEdgesOnPosition26And56(Cube cube) {
        System.out.println("orientTheEdgesOnPosition26And56");

        cube = cube.turnTheCube(CubeFace.F, Turns.F);       //F
        cube = cube.turnTheCube(CubeFace.L, Turns.L);       //L
        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        cube = cube.turnTheCube(CubeFace.L, Turns.l);       //L'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
        cube = cube.turnTheCube(CubeFace.F, Turns.f);       //F'

        System.out.println("----------");
        return cube;
    }

    private static Cube orientTheEdgesOnPosition36And46(Cube cube) {
        System.out.println("orientTheEdgesOnPosition36And46");

        cube = cube.turnTheCube(CubeFace.R, Turns.R);       //R
        cube = cube.turnTheCube(CubeFace.F, Turns.F);       //F
        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        cube = cube.turnTheCube(CubeFace.F, Turns.f);       //F'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
        cube = cube.turnTheCube(CubeFace.R, Turns.r);       //R'

        System.out.println("----------");
        return cube;
    }

    private static Cube orientTheEdgesOnPosition26And46(Cube cube) {
        System.out.println("orientTheEdgesOnPosition26And46");

        cube = cube.turnTheCube(CubeFace.F, Turns.F);       //F
        cube = cube.turnTheCube(CubeFace.L, Turns.L);       //L
        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        cube = cube.turnTheCube(CubeFace.L, Turns.l);       //L'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'

        cube = cube.turnTheCube(CubeFace.L, Turns.L);       //L
        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        cube = cube.turnTheCube(CubeFace.L, Turns.l);       //L'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
        cube = cube.turnTheCube(CubeFace.F, Turns.f);       //F'

        System.out.println("----------");
        return cube;
    }

    private static Cube orientTheEdgesOnPosition46And56(Cube cube) {
        System.out.println("orientTheEdgesOnPosition46And56");

        cube = cube.turnTheCube(CubeFace.L, Turns.L);      //L
        cube = cube.turnTheCube(CubeFace.B, Turns.B);      //R
        cube = cube.turnTheCube(CubeFace.D, Turns.D);      //D
        cube = cube.turnTheCube(CubeFace.B, Turns.b);      //B'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);      //D'

        cube = cube.turnTheCube(CubeFace.B, Turns.B);      //R
        cube = cube.turnTheCube(CubeFace.D, Turns.D);      //D
        cube = cube.turnTheCube(CubeFace.B, Turns.b);      //B'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);      //D'
        cube = cube.turnTheCube(CubeFace.L, Turns.l);      //L'

        System.out.println("----------");
        return cube;
    }

    private static Cube orientTheEdgesOnPosition56And36(Cube cube) {
        System.out.println("orientTheEdgesOnPosition56And36");

        cube = cube.turnTheCube(CubeFace.B, Turns.B);       //B
        cube = cube.turnTheCube(CubeFace.R, Turns.R);       //R
        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        cube = cube.turnTheCube(CubeFace.R, Turns.r);       //R'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'

        cube = cube.turnTheCube(CubeFace.R, Turns.R);       //R
        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        cube = cube.turnTheCube(CubeFace.R, Turns.r);       //R'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
        cube = cube.turnTheCube(CubeFace.B, Turns.b);       //B'

        System.out.println("----------");
        return cube;
    }

    private static Cube orientTheEdgesOnPosition36And26(Cube cube) {
        System.out.println("orientTheEdgesOnPosition36And26");

        cube = cube.turnTheCube(CubeFace.R, Turns.R);       //R
        cube = cube.turnTheCube(CubeFace.F, Turns.F);       //F
        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        cube = cube.turnTheCube(CubeFace.F, Turns.f);       //F'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'

        cube = cube.turnTheCube(CubeFace.F, Turns.F);       //F
        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        cube = cube.turnTheCube(CubeFace.F, Turns.f);       //F'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
        cube = cube.turnTheCube(CubeFace.R, Turns.r);       //R'

        System.out.println("----------");
        return cube;
    }

    private static Cube orientTheEdgesOnPosition26And46And56And36(Cube cube) {
        System.out.println("orientTheEdgesOnPosition26And46And56And36");

        cube = orientTheEdgesOnPosition26And56(cube);

        cube = cube.turnTheCube(CubeFace.D, Turns.DD);      //D2

        cube = cube.turnTheCube(CubeFace.F, Turns.F);       //F
        cube = cube.turnTheCube(CubeFace.L, Turns.L);       //L
        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        cube = cube.turnTheCube(CubeFace.L, Turns.l);       //L'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'

        cube = cube.turnTheCube(CubeFace.L, Turns.L);       //L
        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        cube = cube.turnTheCube(CubeFace.L, Turns.l);       //L'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
        cube = cube.turnTheCube(CubeFace.F, Turns.f);       //F'

        System.out.println("----------");
        return cube;
    }

    private static Cube swapTheEdgesOnPosition26And46(Cube cube) {
        System.out.println("swapTheEdgesOnPosition26And46");

        cube = cube.turnTheCube(CubeFace.B, Turns.B);       //B
        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        cube = cube.turnTheCube(CubeFace.B, Turns.b);       //B'
        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        cube = cube.turnTheCube(CubeFace.B, Turns.B);       //B
        cube = cube.turnTheCube(CubeFace.D, Turns.DD);      //D2
        cube = cube.turnTheCube(CubeFace.B, Turns.b);       //B'
        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //U

        System.out.println("----------");
        return cube;
    }

    private static Cube swapTheEdgesOnPosition46And56(Cube cube) {
        System.out.println("swapTheEdgesOnPosition46And56");

        cube = cube.turnTheCube(CubeFace.R, Turns.R);        //R
        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
        cube = cube.turnTheCube(CubeFace.R, Turns.r);        //R'
        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
        cube = cube.turnTheCube(CubeFace.R, Turns.R);        //R
        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
        cube = cube.turnTheCube(CubeFace.R, Turns.r);        //R'
        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D

        System.out.println("----------");
        return cube;
    }

    private static Cube swapTheEdgesOnPosition56And36AndThenADownCounterclockwiseTurn(Cube cube) {
        System.out.println("swapTheEdgesOnPosition56And36AndThenADownCounterclockwiseTurn");

        cube = cube.turnTheCube(CubeFace.F, Turns.F);        //F
        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
        cube = cube.turnTheCube(CubeFace.F, Turns.f);        //F'
        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
        cube = cube.turnTheCube(CubeFace.F, Turns.F);        //F
        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
        cube = cube.turnTheCube(CubeFace.F, Turns.f);        //F'

        System.out.println("----------");
        return cube;
    }

    private static Cube swapTheEdgesOnPosition36And26AndThenADownClockwiseTurn(Cube cube) {
        System.out.println("swapTheEdgesOnPosition36And26AndThenADownClockwiseTurn");

        cube = cube.turnTheCube(CubeFace.L, Turns.L);        //L
        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
        cube = cube.turnTheCube(CubeFace.L, Turns.l);        //L'
        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
        cube = cube.turnTheCube(CubeFace.L, Turns.L);        //L
        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2
        cube = cube.turnTheCube(CubeFace.L, Turns.l);        //L'
        cube = cube.turnTheCube(CubeFace.D, Turns.DD);       //D2

        System.out.println("----------");
        return cube;
    }

    private static Cube
    swapTheEdgesOnPosition56And36AndThenADownCounterclockwiseTurnAndThenSwapTheEdgesOnPosition46And56(Cube cube) {
        System.out.println
                ("swapTheEdgesOnPosition56And36AndThenADownCounterclockwiseTurnAndThenSwapTheEdgesOnPosition46And56");

        cube = swapTheEdgesOnPosition56And36AndThenADownCounterclockwiseTurn(cube);
        cube = swapTheEdgesOnPosition46And56(cube);

        System.out.println("----------");
        return cube;
    }

    private static Cube rotateTheCornersOnPosition236And456And356Counterclockwise(Cube cube) {
        System.out.println("rotateTheCornersOnPosition236And456And356Counterclockwise");

        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
        cube = cube.turnTheCube(CubeFace.L, Turns.L);        //L
        cube = cube.turnTheCube(CubeFace.D, Turns.d);        //D'
        cube = cube.turnTheCube(CubeFace.R, Turns.r);        //R'
        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
        cube = cube.turnTheCube(CubeFace.L, Turns.l);        //L'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);        //D'
        cube = cube.turnTheCube(CubeFace.R, Turns.R);        //R

        System.out.println("----------");
        return cube;
    }

    private static Cube rotateTheCornersOnPosition356And246And456Counterclockwise(Cube cube) {
        System.out.println("rotateTheCornersOnPosition356And246And456Counterclockwise");

        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
        cube = cube.turnTheCube(CubeFace.F, Turns.F);        //F
        cube = cube.turnTheCube(CubeFace.D, Turns.d);        //D'
        cube = cube.turnTheCube(CubeFace.B, Turns.b);        //B'
        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
        cube = cube.turnTheCube(CubeFace.F, Turns.f);        //F'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);        //D'
        cube = cube.turnTheCube(CubeFace.B, Turns.B);        //B

        System.out.println("----------");
        return cube;
    }

    private static Cube rotateTheCornersOnPosition456And236And246Counterclockwise(Cube cube) {
        System.out.println("rotateTheCornersOnPosition456And236And246Counterclockwise");

        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
        cube = cube.turnTheCube(CubeFace.R, Turns.R);        //R
        cube = cube.turnTheCube(CubeFace.D, Turns.d);        //D'
        cube = cube.turnTheCube(CubeFace.L, Turns.l);        //L'
        cube = cube.turnTheCube(CubeFace.D, Turns.D);        //D
        cube = cube.turnTheCube(CubeFace.R, Turns.r);        //R'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);        //D'
        cube = cube.turnTheCube(CubeFace.L, Turns.L);        //L

        System.out.println("----------");
        return cube;
    }

    private static Cube rotateTheCornersOnPosition246And356And236Counterclockwise(Cube cube) {
        System.out.println("rotateTheCornersOnPosition246And356And236Counterclockwise");

        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        cube = cube.turnTheCube(CubeFace.B, Turns.B);       //B
        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
        cube = cube.turnTheCube(CubeFace.F, Turns.f);       //F'
        cube = cube.turnTheCube(CubeFace.D, Turns.D);       //D
        cube = cube.turnTheCube(CubeFace.B, Turns.b);       //B'
        cube = cube.turnTheCube(CubeFace.D, Turns.d);       //D'
        cube = cube.turnTheCube(CubeFace.F, Turns.F);       //F

        System.out.println("----------");
        return cube;
    }

    private static Cube theFourStepTreatmentForward(Cube cube){
        System.out.println("theFourStepTreatmentForward");

        cube = cube.turnTheCube(CubeFace.U, Turns.U);        //U
        cube = cube.turnTheCube(CubeFace.L, Turns.l);        //L'
        cube = cube.turnTheCube(CubeFace.U, Turns.u);        //U'
        cube = cube.turnTheCube(CubeFace.L, Turns.L);        //L

        System.out.println("----------");
        return cube;
    }

    private static Cube theFourStepTreatmentBackward(Cube cube){
        System.out.println("theFourStepTreatmentBackward");

        cube = cube.turnTheCube(CubeFace.L, Turns.l);        //L'
        cube = cube.turnTheCube(CubeFace.U, Turns.U);        //U
        cube = cube.turnTheCube(CubeFace.L, Turns.L);        //L
        cube = cube.turnTheCube(CubeFace.U, Turns.u);        //U'

        System.out.println("----------");
        return cube;
    }
}
