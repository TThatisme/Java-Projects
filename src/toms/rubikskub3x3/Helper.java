package toms.rubikskub3x3;

class Helper {
    static int[] findIndexForCorners(Corner[] corner, int[][] position) {
        int[] indices = new int[4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 8; j++){
                if(position[i][0] == corner[j].getPosition()[0] & position[i][1] == corner[j].getPosition()[1]
                        & position[i][2] == corner[j].getPosition()[2])
                    indices[i] = j;
            }
        }
        return indices;
    }

    static int[] findIndexForEdges(Edge[] edge, int[][] position) {
        int[] indices = new int[4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 12; j++){
                if(position[i][0] == edge[j].getPosition()[0] & position[i][1] == edge[j].getPosition()[1])
                    indices[i] = j;
            }
        }
        return indices;
    }

    static void cornerNumberSwap(Corner corner1, Corner corner2) {
        Corner corner3 = new Corner();
        corner3.setNumber(corner1.getNumber());
        corner1.setNumber(corner2.getNumber());
        corner2.setNumber(corner3.getNumber());
    }

    static void edgeNumberSwap(Edge edge1, Edge edge2) {
        Edge edge3 = new Edge();
        edge3.setNumber(edge1.getNumber());
        edge1.setNumber(edge2.getNumber());
        edge2.setNumber(edge3.getNumber());
    }

    static int[] swapTwoIntegersInList(int[] list, int index1, int index2) {
        int copy = list[index1];
        list[index1] = list[index2];
        list[index2] = copy;
        return list;
    }

    static int[] rotateThreeIntegersInListClockwise(int[] list) {
        int copy = list[0];
        list[0] = list[1];
        list[1] = list[2];
        list[2] = copy;
        return list;
    }

    static int[] rotateThreeIntegersInListCounterclockwise(int[] list) {
        int copy = list[2];
        list[2] = list[1];
        list[1] = list[0];
        list[0] = copy;
        return list;
    }

    static Corner findCorner(Corner[] corner, int[] number) {
            for(int j = 0; j < 8; j++){
                if(number[0] == corner[j].getNumber()[0] & number[1] == corner[j].getNumber()[1]
                        & number[2] == corner[j].getNumber()[2])
                    return corner[j];
            }
            return null;
    }

    static Edge findEdge(Edge[] edge, int[] number) {
        for(int j = 0; j < 12; j++){
            if(number[0] == edge[j].getNumber()[0] & number[1] == edge[j].getNumber()[1])
                return edge[j];
        }
        return null;
    }
}
