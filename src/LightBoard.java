import java.util.*;
public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];
        Random rand = new Random();

        for (int i = 0; i < lights.length; i++) {
            for (int j = 0; j < lights[i].length; j++) {
                if (rand.nextInt(10) < 4) lights[i][j] = true;
            }
        }
    }
    public boolean evaluateLight(int r, int c) {
        int cnt = 0;

        for (int i = 0; i < lights.length; i++) {
            if (lights[i][c]) cnt++;
        }

        if (lights[r][c]) {
            if (cnt % 2 == 0) return false;
        }
        else {
            if (cnt % 3 == 0) return true;
        }

        return lights[r][c];
    }
    public boolean[][] getLights() {
        return lights;
    }
    public void setLights(boolean[][] lights) {
        this.lights = lights;
    }
}
