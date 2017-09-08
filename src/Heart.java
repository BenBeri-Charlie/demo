/**
 * Created by charlie-richi on 15.07.17.
 */
import java.awt.event.KeyEvent;

public class Heart {

    public static Byte[][] cell = new Byte[22][22];
    public static int x = 0;
    public static int y = 0;

    public void fild() {
        for (int i = 0; i < 22; i++) {
            for (int j = 0; j < 22; j++) {
                cell[i][j] = 0;
                if (i == 0 || i == 21 || j == 0 || j == 21)
                    cell[i][j] = 2;
            }
        }
        cell[3][3] = 1;
        x =3;
        y =3;
    }


}
