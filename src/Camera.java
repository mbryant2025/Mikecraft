import org.ejml.data.DMatrix4;
import org.ejml.data.DMatrix4x4;
import org.ejml.dense.fixed.CommonOps_DDF4;

public class Camera {

    public static DMatrix4x4 cameraMatrix(DMatrix4 position, double x, double y, double z, DMatrix4 forward, DMatrix4 right, DMatrix4 up) {

        DMatrix4x4 T = new DMatrix4x4();
        DMatrix4x4 R = new DMatrix4x4();
        DMatrix4x4 M = new DMatrix4x4();

        T.a11 = 1;
        T.a12 = 0;
        T.a13 = 0;
        T.a14 = 0;

        T.a21 = 0;
        T.a22 = 1;
        T.a23 = 0;
        T.a24 = 0;

        T.a31 = 0;
        T.a32 = 0;
        T.a33 = 1;
        T.a34 = 0;

        T.a41 = -x;
        T.a42 = -y;
        T.a43 = -z;
        T.a44 = 1;


        R.a11 = right.a1;
        R.a12 = up.a1;
        R.a13 = forward.a1;
        R.a14 = 0;

        R.a21 = right.a2;
        R.a22 = up.a2;
        R.a23 = forward.a2;
        R.a24 = 0;

        R.a31 = right.a3;
        R.a32 = up.a3;
        R.a33 = forward.a3;
        R.a34 = 0;

        R.a41 = 0;
        R.a42 = 0;
        R.a43 = 0;
        R.a44 = 1;

        CommonOps_DDF4.mult(T, R, M);
        
        return M;
    }

}
