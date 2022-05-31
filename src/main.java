import org.ejml.data.DMatrix4;

public class main {

    public static void main(String[] args) {

        DMatrix4 v = new DMatrix4(1, 2, 3 ,4);

        transformationMatrices.rotateX(v, 4).print();
    }
}
