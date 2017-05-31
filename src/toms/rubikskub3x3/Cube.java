package toms.rubikskub3x3;

class Cube {
    private CubeFace[] orientation;
    private Corner[] corners;
    private Edge[] edges;
    private int numberOfTurns;
    private int[][] positionListCorners;
    private int[][] positionListEdges;
    private int[] indexListCorners;
    private int[] indexListEdges;

    Corner[] getCorners(){return corners;}

    Edge[] getEdges(){return edges;}

    Cube() {
        this.orientation = new CubeFace[]{CubeFace.U, CubeFace.F, CubeFace.R,
                CubeFace.L, CubeFace.B, CubeFace.D};

        this.corners = new Corner[8];
        this.edges = new Edge[12];
        this.positionListCorners = new int[4][3];
        this.positionListEdges = new int[4][2];

        this.corners[0] = new Corner();
        this.corners[1] = new Corner();
        this.corners[2] = new Corner();
        this.corners[3] = new Corner();
        this.corners[4] = new Corner();
        this.corners[5] = new Corner();
        this.corners[6] = new Corner();
        this.corners[7] = new Corner();

        this.corners[0].setNumber(new int[]{1, 2, 4});
        this.corners[0].setPosition(new int[]{1, 2, 4});
        this.corners[0].setOrientation(new int[]{1, 2, 4});

        this.corners[1].setNumber(new int[]{1, 4, 5});
        this.corners[1].setPosition(new int[]{1, 4, 5});
        this.corners[1].setOrientation(new int[]{1, 4, 5});

        this.corners[2].setNumber(new int[]{1, 3, 5});
        this.corners[2].setPosition(new int[]{1, 3, 5});
        this.corners[2].setOrientation(new int[]{1, 3, 5});

        this.corners[3].setNumber(new int[]{1, 2, 3});
        this.corners[3].setPosition(new int[]{1, 2, 3});
        this.corners[3].setOrientation(new int[]{1, 2, 3});

        this.corners[4].setNumber(new int[]{4, 5, 6});
        this.corners[4].setPosition(new int[]{4, 5, 6});
        this.corners[4].setOrientation(new int[]{4, 5, 6});

        this.corners[5].setNumber(new int[]{2, 4, 6});
        this.corners[5].setPosition(new int[]{2, 4, 6});
        this.corners[5].setOrientation(new int[]{2, 4, 6});

        this.corners[6].setNumber(new int[]{2, 3, 6});
        this.corners[6].setPosition(new int[]{2, 3, 6});
        this.corners[6].setOrientation(new int[]{2, 3, 6});

        this.corners[7].setNumber(new int[]{3, 5, 6});
        this.corners[7].setPosition(new int[]{3, 5, 6});
        this.corners[7].setOrientation(new int[]{3, 5, 6});

        this.edges[0] = new Edge();
        this.edges[1] = new Edge();
        this.edges[2] = new Edge();
        this.edges[3] = new Edge();
        this.edges[4] = new Edge();
        this.edges[5] = new Edge();
        this.edges[6] = new Edge();
        this.edges[7] = new Edge();
        this.edges[8] = new Edge();
        this.edges[9] = new Edge();
        this.edges[10] = new Edge();
        this.edges[11] = new Edge();

        this.edges[0].setNumber(new int[]{1, 2});
        this.edges[0].setPosition(new int[]{1, 2});
        this.edges[0].setOrientation(new int[]{1, 2});

        this.edges[1].setNumber(new int[]{1, 4});
        this.edges[1].setPosition(new int[]{1, 4});
        this.edges[1].setOrientation(new int[]{1, 4});

        this.edges[2].setNumber(new int[]{1, 5});
        this.edges[2].setPosition(new int[]{1, 5});
        this.edges[2].setOrientation(new int[]{1, 5});

        this.edges[3].setNumber(new int[]{1, 3});
        this.edges[3].setPosition(new int[]{1, 3});
        this.edges[3].setOrientation(new int[]{1, 3});

        this.edges[4].setNumber(new int[]{2, 3});
        this.edges[4].setPosition(new int[]{2, 3});
        this.edges[4].setOrientation(new int[]{2, 3});

        this.edges[5].setNumber(new int[]{3, 5});
        this.edges[5].setPosition(new int[]{3, 5});
        this.edges[5].setOrientation(new int[]{3, 5});

        this.edges[6].setNumber(new int[]{4, 5});
        this.edges[6].setPosition(new int[]{4, 5});
        this.edges[6].setOrientation(new int[]{4, 5});

        this.edges[7].setNumber(new int[]{2, 4});
        this.edges[7].setPosition(new int[]{2, 4});
        this.edges[7].setOrientation(new int[]{2, 4});

        this.edges[8].setNumber(new int[]{5, 6});
        this.edges[8].setPosition(new int[]{5, 6});
        this.edges[8].setOrientation(new int[]{5, 6});

        this.edges[9].setNumber(new int[]{4, 6});
        this.edges[9].setPosition(new int[]{4, 6});
        this.edges[9].setOrientation(new int[]{4, 6});

        this.edges[10].setNumber(new int[]{2, 6});
        this.edges[10].setPosition(new int[]{2, 6});
        this.edges[10].setOrientation(new int[]{2, 6});

        this.edges[11].setNumber(new int[]{3, 6});
        this.edges[11].setPosition(new int[]{3, 6});
        this.edges[11].setOrientation(new int[]{3, 6});
    }

     Cube turnTheCube(CubeFace face, Turns turn) {
        int[] cornerOrientationCopy1;
        int[] edgeOrientationCopy1;
        int[] cornerOrientationCopy2;
        int[] edgeOrientationCopy2;

        if(this.orientation[0] == face){

            // White face

              positionListCorners[0][0] = 1;
              positionListCorners[0][1] = 2;
              positionListCorners[0][2] = 4;

              positionListCorners[1][0] = 1;
              positionListCorners[1][1] = 4;
              positionListCorners[1][2] = 5;

              positionListCorners[2][0] = 1;
              positionListCorners[2][1] = 3;
              positionListCorners[2][2] = 5;

              positionListCorners[3][0] = 1;
              positionListCorners[3][1] = 2;
              positionListCorners[3][2] = 3;

              positionListEdges[0][0] = 1;
              positionListEdges[0][1] = 2;

              positionListEdges[1][0] = 1;
              positionListEdges[1][1] = 4;

              positionListEdges[2][0] = 1;
              positionListEdges[2][1] = 5;

              positionListEdges[3][0] = 1;
              positionListEdges[3][1] = 3;


            indexListCorners = Helper.findIndexForCorners(this.corners, positionListCorners);
            indexListEdges = Helper.findIndexForEdges(this.edges, positionListEdges);


        }else if(this.orientation[1] == face){

            // Blue face

              positionListCorners[0][0] = 2;
              positionListCorners[0][1] = 4;
              positionListCorners[0][2] = 6;

              positionListCorners[1][0] = 1;
              positionListCorners[1][1] = 2;
              positionListCorners[1][2] = 4;

              positionListCorners[2][0] = 1;
              positionListCorners[2][1] = 2;
              positionListCorners[2][2] = 3;

              positionListCorners[3][0] = 2;
              positionListCorners[3][1] = 3;
              positionListCorners[3][2] = 6;

              positionListEdges[0][0] = 2;
              positionListEdges[0][1] = 6;

              positionListEdges[1][0] = 2;
              positionListEdges[1][1] = 4;

              positionListEdges[2][0] = 1;
              positionListEdges[2][1] = 2;

              positionListEdges[3][0] = 2;
              positionListEdges[3][1] = 3;

            indexListCorners = Helper.findIndexForCorners(this.corners, positionListCorners);
            indexListEdges = Helper.findIndexForEdges(this.edges, positionListEdges);

        }else if(this.orientation[2] == face){

            // Orange face

              positionListCorners[0][0] = 2;
              positionListCorners[0][1] = 3;
              positionListCorners[0][2] = 6;

              positionListCorners[1][0] = 1;
              positionListCorners[1][1] = 2;
              positionListCorners[1][2] = 3;

              positionListCorners[2][0] = 1;
              positionListCorners[2][1] = 3;
              positionListCorners[2][2] = 5;

              positionListCorners[3][0] = 3;
              positionListCorners[3][1] = 5;
              positionListCorners[3][2] = 6;

              positionListEdges[0][0] = 3;
              positionListEdges[0][1] = 6;

              positionListEdges[1][0] = 2;
              positionListEdges[1][1] = 3;

              positionListEdges[2][0] = 1;
              positionListEdges[2][1] = 3;

              positionListEdges[3][0] = 3;
              positionListEdges[3][1] = 5;


            indexListCorners = Helper.findIndexForCorners(this.corners, positionListCorners);
            indexListEdges = Helper.findIndexForEdges(this.edges, positionListEdges);

        }else if(this.orientation[3] == face){

            // Red face

              positionListCorners[0][0] = 4;
              positionListCorners[0][1] = 5;
              positionListCorners[0][2] = 6;

              positionListCorners[1][0] = 1;
              positionListCorners[1][1] = 4;
              positionListCorners[1][2] = 5;

              positionListCorners[2][0] = 1;
              positionListCorners[2][1] = 2;
              positionListCorners[2][2] = 4;

              positionListCorners[3][0] = 2;
              positionListCorners[3][1] = 4;
              positionListCorners[3][2] = 6;

              positionListEdges[0][0] = 4;
              positionListEdges[0][1] = 6;

              positionListEdges[1][0] = 4;
              positionListEdges[1][1] = 5;

              positionListEdges[2][0] = 1;
              positionListEdges[2][1] = 4;

              positionListEdges[3][0] = 2;
              positionListEdges[3][1] = 4;

            indexListCorners = Helper.findIndexForCorners(this.corners, positionListCorners);
            indexListEdges = Helper.findIndexForEdges(this.edges, positionListEdges);

        }else if(this.orientation[4] == face){

            // Green face

              positionListCorners[0][0] = 3;
              positionListCorners[0][1] = 5;
              positionListCorners[0][2] = 6;

              positionListCorners[1][0] = 1;
              positionListCorners[1][1] = 3;
              positionListCorners[1][2] = 5;

              positionListCorners[2][0] = 1;
              positionListCorners[2][1] = 4;
              positionListCorners[2][2] = 5;

              positionListCorners[3][0] = 4;
              positionListCorners[3][1] = 5;
              positionListCorners[3][2] = 6;

              positionListEdges[0][0] = 5;
              positionListEdges[0][1] = 6;

              positionListEdges[1][0] = 3;
              positionListEdges[1][1] = 5;

              positionListEdges[2][0] = 1;
              positionListEdges[2][1] = 5;

              positionListEdges[3][0] = 4;
              positionListEdges[3][1] = 5;

            indexListCorners = Helper.findIndexForCorners(this.corners, positionListCorners);
            indexListEdges = Helper.findIndexForEdges(this.edges, positionListEdges);

        }else if(this.orientation[5] == face){

            // Yellow face

            positionListCorners[0][0] = 4;
            positionListCorners[0][1] = 5;
            positionListCorners[0][2] = 6;

            positionListCorners[1][0] = 2;
            positionListCorners[1][1] = 4;
            positionListCorners[1][2] = 6;

            positionListCorners[2][0] = 2;
            positionListCorners[2][1] = 3;
            positionListCorners[2][2] = 6;

            positionListCorners[3][0] = 3;
            positionListCorners[3][1] = 5;
            positionListCorners[3][2] = 6;

            positionListEdges[0][0] = 5;
            positionListEdges[0][1] = 6;

            positionListEdges[1][0] = 4;
            positionListEdges[1][1] = 6;

            positionListEdges[2][0] = 2;
            positionListEdges[2][1] = 6;

            positionListEdges[3][0] = 3;
            positionListEdges[3][1] = 6;

            indexListCorners = Helper.findIndexForCorners(this.corners, positionListCorners);
            indexListEdges = Helper.findIndexForEdges(this.edges, positionListEdges);
        }

        //Clockwise or counterclockwise or 180 degrees

        if(turn == Turns.U | turn == Turns.F | turn == Turns.R
                | turn == Turns.L | turn == Turns.B | turn == Turns.D) {
            Helper.cornerNumberSwap(this.corners[indexListCorners[0]], this.corners[indexListCorners[1]]);
            Helper.cornerNumberSwap(this.corners[indexListCorners[0]], this.corners[indexListCorners[2]]);
            Helper.cornerNumberSwap(this.corners[indexListCorners[0]], this.corners[indexListCorners[3]]);

            Helper.edgeNumberSwap(this.edges[indexListEdges[0]], this.edges[indexListEdges[1]]);
            Helper.edgeNumberSwap(this.edges[indexListEdges[0]], this.edges[indexListEdges[2]]);
            Helper.edgeNumberSwap(this.edges[indexListEdges[0]], this.edges[indexListEdges[3]]);

            // Change of orientation

            switch (face) {
                case U: {
                    cornerOrientationCopy1 = this.corners[0].getOrientation();
                    edgeOrientationCopy1 = this.edges[0].getOrientation();

                    this.corners[0].setOrientation(
                              Helper.swapTwoIntegersInList(this.corners[3].getOrientation(), 1, 2));

                    this.corners[3].setOrientation(this.corners[2].getOrientation());

                    this.corners[2].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[1].getOrientation(), 1, 2));

                    this.corners[1].setOrientation(cornerOrientationCopy1);

                    this.edges[0].setOrientation(this.edges[3].getOrientation());
                    this.edges[3].setOrientation(this.edges[2].getOrientation());
                    this.edges[2].setOrientation(this.edges[1].getOrientation());
                    this.edges[1].setOrientation(edgeOrientationCopy1);

                    break;
                }

                case F: {
                    cornerOrientationCopy1 = this.corners[5].getOrientation();
                    edgeOrientationCopy1 = this.edges[10].getOrientation();

                    this.corners[5].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[6].getOrientation(), 1, 2));

                    this.corners[6].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[3].getOrientation(), 0, 1));

                    this.corners[3].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[0].getOrientation(), 0, 2));

                    this.corners[0].setOrientation(
                            Helper.swapTwoIntegersInList(cornerOrientationCopy1, 0, 1));

                    this.edges[10].setOrientation(this.edges[4].getOrientation());
                    this.edges[4].setOrientation(
                            Helper.swapTwoIntegersInList(this.edges[0].getOrientation(), 0, 1));
                    this.edges[0].setOrientation(
                            Helper.swapTwoIntegersInList(this.edges[7].getOrientation(), 0, 1));
                    this.edges[7].setOrientation(edgeOrientationCopy1);

                    break;
                }

                case R: {
                    cornerOrientationCopy1 = this.corners[6].getOrientation();
                    edgeOrientationCopy1 = this.edges[11].getOrientation();

                    this.corners[6].setOrientation(
                            Helper.rotateThreeIntegersInListCounterclockwise(this.corners[7].getOrientation()));

                    this.corners[7].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[2].getOrientation(), 0, 1));

                    this.corners[2].setOrientation(
                            Helper.rotateThreeIntegersInListClockwise(this.corners[3].getOrientation()));

                    this.corners[3].setOrientation(
                            Helper.swapTwoIntegersInList(cornerOrientationCopy1, 1, 2));

                    this.edges[11].setOrientation(this.edges[5].getOrientation());
                    this.edges[5].setOrientation(
                            Helper.swapTwoIntegersInList(this.edges[3].getOrientation(), 0, 1));
                    this.edges[3].setOrientation(this.edges[4].getOrientation());
                    this.edges[4].setOrientation(
                            Helper.swapTwoIntegersInList(edgeOrientationCopy1, 0, 1));

                    break;
                }

                case L: {
                    cornerOrientationCopy1 = this.corners[4].getOrientation();
                    edgeOrientationCopy1 = this.edges[9].getOrientation();

                    this.corners[4].setOrientation(
                            Helper.rotateThreeIntegersInListClockwise(this.corners[5].getOrientation()));

                    this.corners[5].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[0].getOrientation(), 1, 2));

                    this.corners[0].setOrientation(
                            Helper.rotateThreeIntegersInListCounterclockwise(this.corners[1].getOrientation()));

                    this.corners[1].setOrientation(
                            Helper.swapTwoIntegersInList(cornerOrientationCopy1, 0, 1));

                    this.edges[9].setOrientation(
                            Helper.swapTwoIntegersInList(this.edges[7].getOrientation(), 0, 1));
                    this.edges[7].setOrientation(this.edges[1].getOrientation());
                    this.edges[1].setOrientation(
                            Helper.swapTwoIntegersInList(this.edges[6].getOrientation(), 0, 1));
                    this.edges[6].setOrientation(edgeOrientationCopy1);

                    break;
                }

                case B: {
                    cornerOrientationCopy1 = this.corners[7].getOrientation();
                    edgeOrientationCopy1 = this.edges[8].getOrientation();

                    this.corners[7].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[4].getOrientation(), 0, 2));

                    this.corners[4].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[1].getOrientation(), 1, 2));

                    this.corners[1].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[2].getOrientation(), 0, 1));

                    this.corners[2].setOrientation(
                            Helper.swapTwoIntegersInList(cornerOrientationCopy1, 1, 2));

                    this.edges[8].setOrientation(
                            Helper.swapTwoIntegersInList(this.edges[6].getOrientation(), 0, 1));
                    this.edges[6].setOrientation(this.edges[2].getOrientation());
                    this.edges[2].setOrientation(this.edges[5].getOrientation());
                    this.edges[5].setOrientation(
                            Helper.swapTwoIntegersInList(edgeOrientationCopy1, 0, 1));

                    break;
                }

                case D: {
                    cornerOrientationCopy1 = this.corners[4].getOrientation();
                    edgeOrientationCopy1 = this.edges[8].getOrientation();

                    this.corners[4].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[7].getOrientation(), 0, 1));

                    this.corners[7].setOrientation(this.corners[6].getOrientation());

                    this.corners[6].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[5].getOrientation(), 0, 1));

                    this.corners[5].setOrientation(cornerOrientationCopy1);

                    this.edges[8].setOrientation(this.edges[11].getOrientation());
                    this.edges[11].setOrientation(this.edges[10].getOrientation());
                    this.edges[10].setOrientation(this.edges[9].getOrientation());
                    this.edges[9].setOrientation(edgeOrientationCopy1);

                    break;
                }
            }
        }else if(turn == Turns.u | turn == Turns.f | turn == Turns.r
                | turn == Turns.l | turn == Turns.b | turn == Turns.d){
            Helper.cornerNumberSwap(this.corners[indexListCorners[3]], this.corners[indexListCorners[2]]);
            Helper.cornerNumberSwap(this.corners[indexListCorners[3]], this.corners[indexListCorners[1]]);
            Helper.cornerNumberSwap(this.corners[indexListCorners[3]], this.corners[indexListCorners[0]]);

            Helper.edgeNumberSwap(this.edges[indexListEdges[3]], this.edges[indexListEdges[2]]);
            Helper.edgeNumberSwap(this.edges[indexListEdges[3]], this.edges[indexListEdges[1]]);
            Helper.edgeNumberSwap(this.edges[indexListEdges[3]], this.edges[indexListEdges[0]]);

            // Change of orientation

            switch (face) {
                case U: {
                    cornerOrientationCopy1 = this.corners[0].getOrientation();
                    edgeOrientationCopy1 = this.edges[0].getOrientation();

                    this.corners[0].setOrientation(this.corners[1].getOrientation());

                    this.corners[1].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[2].getOrientation(), 1, 2));

                    this.corners[2].setOrientation(this.corners[3].getOrientation());

                    this.corners[3].setOrientation(
                            Helper.swapTwoIntegersInList(cornerOrientationCopy1, 1, 2));

                    this.edges[0].setOrientation(this.edges[1].getOrientation());
                    this.edges[1].setOrientation(this.edges[2].getOrientation());
                    this.edges[2].setOrientation(this.edges[3].getOrientation());
                    this.edges[3].setOrientation(edgeOrientationCopy1);

                    break;
                }

                case F: {
                    cornerOrientationCopy1 = this.corners[5].getOrientation();
                    edgeOrientationCopy1 = this.edges[10].getOrientation();

                    this.corners[5].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[0].getOrientation(), 0, 1));

                    this.corners[0].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[3].getOrientation(), 0, 2));

                    this.corners[3].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[6].getOrientation(), 0, 1));

                    this.corners[6].setOrientation(
                            Helper.swapTwoIntegersInList(cornerOrientationCopy1, 1, 2));

                    this.edges[10].setOrientation(this.edges[7].getOrientation());
                    this.edges[7].setOrientation(
                            Helper.swapTwoIntegersInList(this.edges[0].getOrientation(), 0, 1));
                    this.edges[0].setOrientation(
                            Helper.swapTwoIntegersInList(this.edges[4].getOrientation(), 0, 1));
                    this.edges[4].setOrientation(edgeOrientationCopy1);

                    break;
                }

                case R: {
                    cornerOrientationCopy1 = this.corners[6].getOrientation();
                    edgeOrientationCopy1 = this.edges[11].getOrientation();

                    this.corners[6].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[3].getOrientation(), 1, 2));

                    this.corners[3].setOrientation(
                            Helper.rotateThreeIntegersInListCounterclockwise(this.corners[2].getOrientation()));

                    this.corners[2].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[7].getOrientation(), 0, 1));

                    this.corners[7].setOrientation(
                            Helper.rotateThreeIntegersInListClockwise(cornerOrientationCopy1));

                    this.edges[11].setOrientation(
                            Helper.swapTwoIntegersInList(this.edges[4].getOrientation(), 0, 1));
                    this.edges[4].setOrientation(this.edges[3].getOrientation());
                    this.edges[3].setOrientation(
                            Helper.swapTwoIntegersInList(this.edges[5].getOrientation(), 0, 1));
                    this.edges[5].setOrientation(edgeOrientationCopy1);

                    break;
                }

                case L: {
                    cornerOrientationCopy1 = this.corners[4].getOrientation();
                    edgeOrientationCopy1 = this.edges[9].getOrientation();

                    this.corners[4].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[1].getOrientation(), 0, 1));

                    this.corners[1].setOrientation(
                            Helper.rotateThreeIntegersInListClockwise(this.corners[0].getOrientation()));

                    this.corners[0].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[5].getOrientation(), 1, 2));

                    this.corners[5].setOrientation(
                            Helper.rotateThreeIntegersInListCounterclockwise(cornerOrientationCopy1));

                    this.edges[9].setOrientation(this.edges[6].getOrientation());
                    this.edges[6].setOrientation(
                            Helper.swapTwoIntegersInList(this.edges[1].getOrientation(), 0, 1));
                    this.edges[1].setOrientation(this.edges[7].getOrientation());
                    this.edges[7].setOrientation(
                            Helper.swapTwoIntegersInList(edgeOrientationCopy1, 0, 1));

                    break;
                }

                case B: {
                    cornerOrientationCopy1 = this.corners[7].getOrientation();
                    edgeOrientationCopy1 = this.edges[8].getOrientation();

                    this.corners[7].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[2].getOrientation(), 1, 2));

                    this.corners[2].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[1].getOrientation(), 0, 1));

                    this.corners[1].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[4].getOrientation(), 1, 2));

                    this.corners[4].setOrientation(
                            Helper.swapTwoIntegersInList(cornerOrientationCopy1, 0, 2));

                    this.edges[8].setOrientation(
                            Helper.swapTwoIntegersInList(this.edges[5].getOrientation(), 0, 1));
                    this.edges[5].setOrientation(this.edges[2].getOrientation());
                    this.edges[2].setOrientation(this.edges[6].getOrientation());
                    this.edges[6].setOrientation(
                            Helper.swapTwoIntegersInList(edgeOrientationCopy1, 0, 1));

                    break;
                }

                case D: {
                    cornerOrientationCopy1 = this.corners[4].getOrientation();
                    edgeOrientationCopy1 = this.edges[8].getOrientation();

                    this.corners[4].setOrientation(this.corners[5].getOrientation());

                    this.corners[5].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[6].getOrientation(), 0, 1));

                    this.corners[6].setOrientation(this.corners[7].getOrientation());

                    this.corners[7].setOrientation(
                            Helper.swapTwoIntegersInList(cornerOrientationCopy1, 0, 1));

                    this.edges[8].setOrientation(this.edges[9].getOrientation());
                    this.edges[9].setOrientation(this.edges[10].getOrientation());
                    this.edges[10].setOrientation(this.edges[11].getOrientation());
                    this.edges[11].setOrientation(edgeOrientationCopy1);

                    break;
                }
            }
        }else if(turn == Turns.UU | turn == Turns.FF | turn == Turns.RR
                | turn == Turns.LL | turn == Turns.BB | turn == Turns.DD){
            Helper.cornerNumberSwap(this.corners[indexListCorners[0]], this.corners[indexListCorners[2]]);
            Helper.cornerNumberSwap(this.corners[indexListCorners[1]], this.corners[indexListCorners[3]]);

            Helper.edgeNumberSwap(this.edges[indexListEdges[0]], this.edges[indexListEdges[2]]);
            Helper.edgeNumberSwap(this.edges[indexListEdges[1]], this.edges[indexListEdges[3]]);

            // Change of orientation

            switch (face) {
                case U: {
                    cornerOrientationCopy1 = this.corners[0].getOrientation();
                    cornerOrientationCopy2 = this.corners[3].getOrientation();
                    edgeOrientationCopy1 = this.edges[0].getOrientation();
                    edgeOrientationCopy2 = this.edges[3].getOrientation();

                    this.corners[0].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[2].getOrientation(), 1, 2));

                    this.corners[2].setOrientation(
                            Helper.swapTwoIntegersInList(cornerOrientationCopy1, 1, 2));

                    this.corners[3].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[1].getOrientation(), 1, 2));

                    this.corners[1].setOrientation(
                            Helper.swapTwoIntegersInList(cornerOrientationCopy2, 1, 2));

                    this.edges[0].setOrientation(this.edges[2].getOrientation());
                    this.edges[2].setOrientation(edgeOrientationCopy1);
                    this.edges[3].setOrientation(this.edges[1].getOrientation());
                    this.edges[1].setOrientation(edgeOrientationCopy2);

                    break;
                }

                case F: {
                    cornerOrientationCopy1 = this.corners[5].getOrientation();
                    cornerOrientationCopy2 = this.corners[0].getOrientation();
                    edgeOrientationCopy1 = this.edges[10].getOrientation();
                    edgeOrientationCopy2 = this.edges[7].getOrientation();

                    this.corners[5].setOrientation(
                            Helper.rotateThreeIntegersInListClockwise(this.corners[3].getOrientation()));

                    this.corners[3].setOrientation(
                            Helper.rotateThreeIntegersInListCounterclockwise(cornerOrientationCopy1));

                    this.corners[0].setOrientation(
                            Helper.rotateThreeIntegersInListCounterclockwise(this.corners[6].getOrientation()));

                    this.corners[6].setOrientation(
                            Helper.rotateThreeIntegersInListClockwise(cornerOrientationCopy2));

                    this.edges[10].setOrientation(
                            Helper.swapTwoIntegersInList(this.edges[0].getOrientation(), 0, 1));
                    this.edges[0].setOrientation(
                            Helper.swapTwoIntegersInList(edgeOrientationCopy1, 0, 1));
                    this.edges[7].setOrientation(this.edges[4].getOrientation());
                    this.edges[4].setOrientation(edgeOrientationCopy2);

                    break;
                }

                case R: {
                    cornerOrientationCopy1 = this.corners[6].getOrientation();
                    cornerOrientationCopy2 = this.corners[3].getOrientation();
                    edgeOrientationCopy1 = this.edges[11].getOrientation();
                    edgeOrientationCopy2 = this.edges[4].getOrientation();

                    this.corners[6].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[2].getOrientation(), 0, 2));

                    this.corners[2].setOrientation(
                            Helper.swapTwoIntegersInList(cornerOrientationCopy1, 0, 2));

                    this.corners[3].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[7].getOrientation(), 0, 2));

                    this.corners[7].setOrientation(
                            Helper.swapTwoIntegersInList(cornerOrientationCopy2, 0, 2));

                    this.edges[11].setOrientation(
                            Helper.swapTwoIntegersInList(this.edges[3].getOrientation(), 0, 1));
                    this.edges[3].setOrientation(
                            Helper.swapTwoIntegersInList(edgeOrientationCopy1, 0, 1));
                    this.edges[4].setOrientation(
                            Helper.swapTwoIntegersInList(this.edges[5].getOrientation(), 0, 1));
                    this.edges[5].setOrientation(
                            Helper.swapTwoIntegersInList(edgeOrientationCopy2, 0, 1));

                    break;
                }

                case L: {
                    cornerOrientationCopy1 = this.corners[4].getOrientation();
                    cornerOrientationCopy2 = this.corners[1].getOrientation();
                    edgeOrientationCopy1 = this.edges[9].getOrientation();
                    edgeOrientationCopy2 = this.edges[6].getOrientation();

                    this.corners[4].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[0].getOrientation(), 0, 2));

                    this.corners[0].setOrientation(
                            Helper.swapTwoIntegersInList(cornerOrientationCopy1, 0, 2));

                    this.corners[1].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[5].getOrientation(), 0, 2));

                    this.corners[5].setOrientation(
                            Helper.swapTwoIntegersInList(cornerOrientationCopy2, 0, 2));

                    this.edges[9].setOrientation(
                            Helper.swapTwoIntegersInList(this.edges[1].getOrientation(), 0, 1));
                    this.edges[1].setOrientation(
                            Helper.swapTwoIntegersInList(edgeOrientationCopy1, 0, 1));
                    this.edges[6].setOrientation(
                            Helper.swapTwoIntegersInList(this.edges[7].getOrientation(), 0, 1));
                    this.edges[7].setOrientation(
                            Helper.swapTwoIntegersInList(edgeOrientationCopy2, 0, 1));

                    break;
                }

                case B: {
                    cornerOrientationCopy1 = this.corners[7].getOrientation();
                    cornerOrientationCopy2 = this.corners[2].getOrientation();
                    edgeOrientationCopy1 = this.edges[8].getOrientation();
                    edgeOrientationCopy2 = this.edges[5].getOrientation();

                    this.corners[7].setOrientation(
                            Helper.rotateThreeIntegersInListClockwise(this.corners[1].getOrientation()));

                    this.corners[1].setOrientation(
                            Helper.rotateThreeIntegersInListCounterclockwise(cornerOrientationCopy1));

                    this.corners[2].setOrientation(
                            Helper.rotateThreeIntegersInListCounterclockwise(this.corners[4].getOrientation()));

                    this.corners[4].setOrientation(
                            Helper.rotateThreeIntegersInListClockwise(cornerOrientationCopy2));

                    this.edges[8].setOrientation(
                            Helper.swapTwoIntegersInList(this.edges[2].getOrientation(), 0, 1));
                    this.edges[2].setOrientation(
                            Helper.swapTwoIntegersInList(edgeOrientationCopy1, 0, 1));
                    this.edges[5].setOrientation(this.edges[6].getOrientation());
                    this.edges[6].setOrientation(edgeOrientationCopy2);

                    break;
                }

                case D: {
                    cornerOrientationCopy1 = this.corners[4].getOrientation();
                    cornerOrientationCopy2 = this.corners[5].getOrientation();
                    edgeOrientationCopy1 = this.edges[8].getOrientation();
                    edgeOrientationCopy2 = this.edges[9].getOrientation();

                    this.corners[4].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[6].getOrientation(), 0, 1));

                    this.corners[6].setOrientation(
                            Helper.swapTwoIntegersInList(cornerOrientationCopy1, 0, 1));

                    this.corners[5].setOrientation(
                            Helper.swapTwoIntegersInList(this.corners[7].getOrientation(), 0, 1));

                    this.corners[7].setOrientation(
                            Helper.swapTwoIntegersInList(cornerOrientationCopy2, 0, 1));

                    this.edges[8].setOrientation(this.edges[10].getOrientation());
                    this.edges[10].setOrientation(edgeOrientationCopy1);
                    this.edges[9].setOrientation(this.edges[11].getOrientation());
                    this.edges[11].setOrientation(edgeOrientationCopy2);

                    break;
                }
            }
        }
        numberOfTurns++;
        System.out.println(numberOfTurns + ". " + turn.getShortCode());
        return this;
    }
}
