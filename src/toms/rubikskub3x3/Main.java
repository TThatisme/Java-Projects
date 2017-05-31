package toms.rubikskub3x3;

public class Main {

    public static void main(String[] args) {
        Cube userCube;

        //Inaccurate mixing
        //Two corners is getting wrong
        //However, I do not know which piece is wrong
        //I think I wrote a some wrongly value by mistake

//        String[] s1 = new String[8];
//
//        // position 124
//        s1[0] = "3 5 6 3 5 6";
//        // position 145
//        s1[1] = "1 2 3 3 2 1";
//        // position 135
//        s1[2] = "4 5 6 4 5 6";
//        // position 123
//        s1[3] = "1 2 4 1 4 2";
//        // position 456
//        s1[4] = "2 3 6 3 2 6";
//        // position 246
//        s1[5] = "1 4 5 1 5 4";
//        // position 236
//        s1[6] = "1 3 5 5 3 1";
//        // position 356
//        s1[7] = "2 4 6 2 6 4";
//
//        String[] s2 = new String[12];
//
//        // position 12
//        s2[0] = "4 6 4 6";
//        // position 14
//        s2[1] = "5 6 5 6";
//        // position 15
//        s2[2] = "2 4 4 2";
//        // position 13
//        s2[3] = "2 3 2 3";
//        // position 23
//        s2[4] = "1 2 2 1";
//        // position 35
//        s2[5] = "1 5 1 5";
//        // position 45
//        s2[6] = "2 6 2 6";
//        // position 24
//        s2[7] = "3 5 3 5";
//        // position 56
//        s2[8] = "3 6 6 3";
//        // position 46
//        s2[9] = "1 4 1 4";
//        // position 26
//        s2[10] = "4 5 4 5";
//        // position 36
//        s2[11] = "1 3 3 1";

        //correct mixing

        String[] s1 = new String[8];

        // position 124
        s1[0] = "2 4 6 2 6 4";
        // position 145
        s1[1] = "3 5 6 5 6 3";
        // position 135
        s1[2] = "1 3 5 5 1 3";
        // position 123
        s1[3] = "2 3 6 3 2 6";
        // position 456
        s1[4] = "1 2 3 2 3 1";
        // position 246
        s1[5] = "1 4 5 4 1 5";
        // position 236
        s1[6] = "1 2 4 2 4 1";
        // position 356
        s1[7] = "4 5 6 5 4 6";

        String[] s2 = new String[12];

        // position 12
        s2[0] = "3 6 3 6";
        // position 14
        s2[1] = "1 3 3 1";
        // position 15
        s2[2] = "1 5 5 1";
        // position 13
        s2[3] = "4 6 4 6";
        // position 23
        s2[4] = "3 5 5 3";
        // position 35
        s2[5] = "2 4 2 4";
        // position 45
        s2[6] = "5 6 5 6";
        // position 24
        s2[7] = "1 2 2 1";
        // position 56
        s2[8] = "2 6 2 6";
        // position 46
        s2[9] = "1 4 1 4";
        // position 26
        s2[10] = "4 5 5 4";
        // position 36
        s2[11] = "2 3 3 2";

//        String[] s1 = new String[8];
//
//        // position 124
//        s1[0] = "2 3 6 2 3 6";
//        // position 145
//        s1[1] = "1 2 4 1 2 4";
//        // position 135
//        s1[2] = "1 4 5 1 5 4";
//        // position 123
//        s1[3] = "1 2 3 2 3 1";
//        // position 456
//        s1[4] = "4 5 6 4 5 6";
//        // position 246
//        s1[5] = "2 4 6 2 4 6";
//        // position 236
//        s1[6] = "3 5 6 6 3 5";
//        // position 356
//        s1[7] = "1 3 5 3 1 5";
//
//        String[] s2 = new String[12];
//
//        // position 12
//        s2[0] = "2 3 2 3";
//        // position 14
//        s2[1] = "1 2 1 2";
//        // position 15
//        s2[2] = "1 4 1 4";
//        // position 13
//        s2[3] = "1 5 1 5";
//        // position 23
//        s2[4] = "3 6 6 3";
//        // position 35
//        s2[5] = "1 3 3 1";
//        // position 45
//        s2[6] = "4 5 4 5";
//        // position 24
//        s2[7] = "2 4 2 4";
//        // position 56
//        s2[8] = "5 6 5 6";
//        // position 46
//        s2[9] = "4 6 4 6";
//        // position 26
//        s2[10] = "2 6 2 6";
//        // position 36
//        s2[11] = "3 5 3 5";

        userCube = mixTheCube(s1, s2);
        userCube = Algorithms.solveTheFirstCorner(userCube);
        System.out.println();
        userCube = Algorithms.solveTheSecondCorner(userCube);
        System.out.println();
        userCube = Algorithms.solveTheThirdCorner(userCube);
        System.out.println();
        userCube = Algorithms.solveTheFourthCorner(userCube);
        System.out.println();
        userCube = Algorithms.solveTheFirstEdge(userCube);
        System.out.println();
        userCube = Algorithms.solveTheSecondEdge(userCube);
        System.out.println();
        userCube = Algorithms.solveTheThirdEdge(userCube);
        System.out.println();
        userCube = Algorithms.solveTheFourthEdge(userCube);
        System.out.println();
        userCube = Algorithms.solveTheFifthEdge(userCube);
        System.out.println();
        userCube = Algorithms.solveTheSixthEdge(userCube);
        System.out.println();
        userCube = Algorithms.solveTheSeventhEdge(userCube);
        System.out.println();
        userCube = Algorithms.solveTheEightEdge(userCube);
        userCube = Algorithms.solveTheLastFourEdges(userCube);

        try {
            userCube = Algorithms.solveTheLastFourCorners(userCube);
        }catch(InaccurateMixingOfCornersException e) {
            System.out.println(e.getMessage());
        }
        printTheCube(userCube);
    }

    private static Cube mixTheCube(String[] s1, String[] s2) {
        Cube userCube = new Cube();
        String[] cornerNumberAndOrientation;
        String[] edgeNumberAndOrientation;
        for(int i = 0; i < 8; i++) {
            cornerNumberAndOrientation = s1[i].split(" ");

            int i0 = Integer.parseInt(cornerNumberAndOrientation[0]);
            int i1 = Integer.parseInt(cornerNumberAndOrientation[1]);
            int i2 = Integer.parseInt(cornerNumberAndOrientation[2]);

            int i3 = Integer.parseInt(cornerNumberAndOrientation[3]);
            int i4 = Integer.parseInt(cornerNumberAndOrientation[4]);
            int i5 = Integer.parseInt(cornerNumberAndOrientation[5]);

            userCube.getCorners()[i].setNumber(new int[]{i0, i1, i2});
            userCube.getCorners()[i].setOrientation(new int[]{i3, i4, i5});
        }
        for(int i = 0; i < 12; i++) {
            edgeNumberAndOrientation = s2[i].split(" ");

            int i0 = Integer.parseInt(edgeNumberAndOrientation[0]);
            int i1 = Integer.parseInt(edgeNumberAndOrientation[1]);

            int i2 = Integer.parseInt(edgeNumberAndOrientation[2]);
            int i3 = Integer.parseInt(edgeNumberAndOrientation[3]);

            userCube.getEdges()[i].setNumber(new int[]{i0, i1});
            userCube.getEdges()[i].setOrientation(new int[]{i2, i3});
        }
        return userCube;
    }

    private static void printTheCube(Cube cube) {
        System.out.println("Number: " + cube.getCorners()[0].getNumber()[0] +
                cube.getCorners()[0].getNumber()[1] + cube.getCorners()[0].getNumber()[2]);
        System.out.println("Position: " + cube.getCorners()[0].getPosition()[0] +
                cube.getCorners()[0].getPosition()[1] + cube.getCorners()[0].getPosition()[2]);
        System.out.println("Orientation: " + cube.getCorners()[0].getOrientation()[0] +
                cube.getCorners()[0].getOrientation()[1] + cube.getCorners()[0].getOrientation()[2]);

        System.out.println();

        System.out.println("Number: " + cube.getCorners()[1].getNumber()[0] +
                cube.getCorners()[1].getNumber()[1] + cube.getCorners()[1].getNumber()[2]);
        System.out.println("Position: " + cube.getCorners()[1].getPosition()[0] +
                cube.getCorners()[1].getPosition()[1] + cube.getCorners()[1].getPosition()[2]);
        System.out.println("Orientation: " + cube.getCorners()[1].getOrientation()[0] +
                cube.getCorners()[1].getOrientation()[1] + cube.getCorners()[1].getOrientation()[2]);

        System.out.println();

        System.out.println("Number: " + cube.getCorners()[2].getNumber()[0] +
                cube.getCorners()[2].getNumber()[1] + cube.getCorners()[2].getNumber()[2]);
        System.out.println("Position: " + cube.getCorners()[2].getPosition()[0] +
                cube.getCorners()[2].getPosition()[1] + cube.getCorners()[2].getPosition()[2]);
        System.out.println("Orientation: " + cube.getCorners()[2].getOrientation()[0] +
                cube.getCorners()[2].getOrientation()[1] + cube.getCorners()[2].getOrientation()[2]);

        System.out.println();

        System.out.println("Number: " + cube.getCorners()[3].getNumber()[0] +
                cube.getCorners()[3].getNumber()[1] + cube.getCorners()[3].getNumber()[2]);
        System.out.println("Position: " + cube.getCorners()[3].getPosition()[0] +
                cube.getCorners()[3].getPosition()[1] + cube.getCorners()[3].getPosition()[2]);
        System.out.println("Orientation: " + cube.getCorners()[3].getOrientation()[0] +
                cube.getCorners()[3].getOrientation()[1] + cube.getCorners()[3].getOrientation()[2]);

        System.out.println();

        System.out.println("Number: " + cube.getCorners()[4].getNumber()[0] +
                cube.getCorners()[4].getNumber()[1] + cube.getCorners()[4].getNumber()[2]);
        System.out.println("Position: " + cube.getCorners()[4].getPosition()[0] +
                cube.getCorners()[4].getPosition()[1] + cube.getCorners()[4].getPosition()[2]);
        System.out.println("Orientation: " + cube.getCorners()[4].getOrientation()[0] +
                cube.getCorners()[4].getOrientation()[1] + cube.getCorners()[4].getOrientation()[2]);

        System.out.println();

        System.out.println("Number: " + cube.getCorners()[5].getNumber()[0] +
                cube.getCorners()[5].getNumber()[1] + cube.getCorners()[5].getNumber()[2]);
        System.out.println("Position: " + cube.getCorners()[5].getPosition()[0] +
                cube.getCorners()[5].getPosition()[1] + cube.getCorners()[5].getPosition()[2]);
        System.out.println("Orientation: " + cube.getCorners()[5].getOrientation()[0] +
                cube.getCorners()[5].getOrientation()[1] + cube.getCorners()[5].getOrientation()[2]);

        System.out.println();

        System.out.println("Number: " + cube.getCorners()[6].getNumber()[0] +
                cube.getCorners()[6].getNumber()[1] + cube.getCorners()[6].getNumber()[2]);
        System.out.println("Position: " + cube.getCorners()[6].getPosition()[0] +
                cube.getCorners()[6].getPosition()[1] + cube.getCorners()[6].getPosition()[2]);
        System.out.println("Orientation: " + cube.getCorners()[6].getOrientation()[0] +
                cube.getCorners()[6].getOrientation()[1] + cube.getCorners()[6].getOrientation()[2]);

        System.out.println();

        System.out.println("Number: " + cube.getCorners()[7].getNumber()[0] +
                cube.getCorners()[7].getNumber()[1] + cube.getCorners()[7].getNumber()[2]);
        System.out.println("Position: " + cube.getCorners()[7].getPosition()[0] +
                cube.getCorners()[7].getPosition()[1] + cube.getCorners()[7].getPosition()[2]);
        System.out.println("Orientation: " + cube.getCorners()[7].getOrientation()[0] +
                cube.getCorners()[7].getOrientation()[1] + cube.getCorners()[7].getOrientation()[2]);

        System.out.println();

        System.out.println("Number: " + cube.getEdges()[0].getNumber()[0] +
                cube.getEdges()[0].getNumber()[1]);
        System.out.println("Position: " + cube.getEdges()[0].getPosition()[0] +
                cube.getEdges()[0].getPosition()[1]);
        System.out.println("Orientation: " + cube.getEdges()[0].getOrientation()[0] +
                cube.getEdges()[0].getOrientation()[1]);

        System.out.println();

        System.out.println("Number: " + cube.getEdges()[1].getNumber()[0] +
                cube.getEdges()[1].getNumber()[1]);
        System.out.println("Position: " + cube.getEdges()[1].getPosition()[0] +
                cube.getEdges()[1].getPosition()[1]);
        System.out.println("Orientation: " + cube.getEdges()[1].getOrientation()[0] +
                cube.getEdges()[1].getOrientation()[1]);

        System.out.println();

        System.out.println("Number: " + cube.getEdges()[2].getNumber()[0] +
                cube.getEdges()[2].getNumber()[1]);
        System.out.println("Position: " + cube.getEdges()[2].getPosition()[0] +
                cube.getEdges()[2].getPosition()[1]);
        System.out.println("Orientation: " + cube.getEdges()[2].getOrientation()[0] +
                cube.getEdges()[2].getOrientation()[1]);

        System.out.println();

        System.out.println("Number: " + cube.getEdges()[3].getNumber()[0] +
                cube.getEdges()[3].getNumber()[1]);
        System.out.println("Position: " + cube.getEdges()[3].getPosition()[0] +
                cube.getEdges()[3].getPosition()[1]);
        System.out.println("Orientation: " + cube.getEdges()[3].getOrientation()[0] +
                cube.getEdges()[3].getOrientation()[1]);

        System.out.println();

        System.out.println("Number: " + cube.getEdges()[4].getNumber()[0] +
                cube.getEdges()[4].getNumber()[1]);
        System.out.println("Position: " + cube.getEdges()[4].getPosition()[0] +
                cube.getEdges()[4].getPosition()[1]);
        System.out.println("Orientation: " + cube.getEdges()[4].getOrientation()[0] +
                cube.getEdges()[4].getOrientation()[1]);

        System.out.println();

        System.out.println("Number: " + cube.getEdges()[5].getNumber()[0] +
                cube.getEdges()[5].getNumber()[1]);
        System.out.println("Position: " + cube.getEdges()[5].getPosition()[0] +
                cube.getEdges()[5].getPosition()[1]);
        System.out.println("Orientation: " + cube.getEdges()[5].getOrientation()[0] +
                cube.getEdges()[5].getOrientation()[1]);

        System.out.println();

        System.out.println("Number: " + cube.getEdges()[6].getNumber()[0] +
                cube.getEdges()[6].getNumber()[1]);
        System.out.println("Position: " + cube.getEdges()[6].getPosition()[0] +
                cube.getEdges()[6].getPosition()[1]);
        System.out.println("Orientation: " + cube.getEdges()[6].getOrientation()[0] +
                cube.getEdges()[6].getOrientation()[1]);

        System.out.println();

        System.out.println("Number: " + cube.getEdges()[7].getNumber()[0] +
                cube.getEdges()[7].getNumber()[1]);
        System.out.println("Position: " + cube.getEdges()[7].getPosition()[0] +
                cube.getEdges()[7].getPosition()[1]);
        System.out.println("Orientation: " + cube.getEdges()[7].getOrientation()[0] +
                cube.getEdges()[7].getOrientation()[1]);

        System.out.println();

        System.out.println("Number: " + cube.getEdges()[8].getNumber()[0] +
                cube.getEdges()[8].getNumber()[1]);
        System.out.println("Position: " + cube.getEdges()[8].getPosition()[0] +
                cube.getEdges()[8].getPosition()[1]);
        System.out.println("Orientation: " + cube.getEdges()[8].getOrientation()[0] +
                cube.getEdges()[8].getOrientation()[1]);

        System.out.println();

        System.out.println("Number: " + cube.getEdges()[9].getNumber()[0] +
                cube.getEdges()[9].getNumber()[1]);
        System.out.println("Position: " + cube.getEdges()[9].getPosition()[0] +
                cube.getEdges()[9].getPosition()[1]);
        System.out.println("Orientation: " + cube.getEdges()[9].getOrientation()[0] +
                cube.getEdges()[9].getOrientation()[1]);

        System.out.println();

        System.out.println("Number: " + cube.getEdges()[10].getNumber()[0] +
                cube.getEdges()[10].getNumber()[1]);
        System.out.println("Position: " + cube.getEdges()[10].getPosition()[0] +
                cube.getEdges()[10].getPosition()[1]);
        System.out.println("Orientation: " + cube.getEdges()[10].getOrientation()[0] +
                cube.getEdges()[10].getOrientation()[1]);

        System.out.println();

        System.out.println("Number: " + cube.getEdges()[11].getNumber()[0] +
                cube.getEdges()[11].getNumber()[1]);
        System.out.println("Position: " + cube.getEdges()[11].getPosition()[0] +
                cube.getEdges()[11].getPosition()[1]);
        System.out.println("Orientation: " + cube.getEdges()[11].getOrientation()[0] +
                cube.getEdges()[11].getOrientation()[1]);
    }
}
