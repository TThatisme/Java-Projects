package toms.rubikskub3x3;

/**
 * Created by Tom on 2017-04-30.
 */
public class Kant2 {
    private int[] nummer = new int[3];
    private int[] position = new int[3];
    private int[] orientering = new int[3];

    public int[] getNummer(){return nummer;}
    public int[] getPosition(){return position;}
    public int[] getOrientering(){return orientering;}

    public void setNummer(int[] nummer){this.nummer = nummer;}
    public void setPosition(int[] position){this.position = position;}
    public void setOrientering(int[] orientering){this.orientering = orientering;}
}
