import org.ejml.data.DMatrix4;
import org.lwjgl.opengl.Display;

public class main {

    public static void main(String[] args) {

//        DMatrix4 v = new DMatrix4(1, 2, 3 ,4);
//
//        TransformationMatrices.rotateX(v, 4).print();


        DisplayManager.createDisplay();

        while (!Display.isCloseRequested()) {

            DisplayManager.updateDisplay();
        }

        DisplayManager.closeDisplay();
    }
}
