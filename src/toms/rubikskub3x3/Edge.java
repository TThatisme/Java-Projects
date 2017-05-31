package toms.rubikskub3x3;

class Edge {
    private int[] number;
    private int[] position;
    private int[] orientation;

    int[] getNumber(){return number;}
    int[] getPosition(){return position;}
    int[] getOrientation(){return orientation;}

    void setNumber(int[] number)
    {
        if(number != null)
        {
            this.number = number;
        }
    }
    void setPosition(int[] position)
    {
        if(position != null)
        {
            this.position = position;
        }
    }
    void setOrientation(int[] orientation)
    {
        if(orientation != null)
        {
            this.orientation = orientation;
        }
    }

    Edge()
    {
        this.number = new int[3];
        this.position = new int[3];
        this.orientation = new int[3];
    }
}
