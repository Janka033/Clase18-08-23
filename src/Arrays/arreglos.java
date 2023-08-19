package Arrays;

import java.lang.reflect.Array;

public class arreglos {
    public static void main(String[] args) {
        float [] floats = new float[5];
        floats[0] = 0.5F;
        floats[1] = 1.5f;
        Array.set(floats,2,3.7f);
        System.out.println(floats[0]);
        System.out.println(Array.get(floats,1));
        for (float i:floats) {
            System.out.println(i);
        }
    }
}
