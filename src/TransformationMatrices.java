import org.ejml.data.DMatrix4;
import org.ejml.data.DMatrix4x4;
import org.ejml.dense.fixed.CommonOps_DDF4;

public class TransformationMatrices {

    public static DMatrix4 translate(DMatrix4 v, double tx, double ty, double tz) {

        DMatrix4x4 translationMatrix = new DMatrix4x4();

        translationMatrix.a11 = 1;
        translationMatrix.a12 = 0;
        translationMatrix.a13 = 0;
        translationMatrix.a14 = 0;

        translationMatrix.a21 = 0;
        translationMatrix.a22 = 1;
        translationMatrix.a23 = 0;
        translationMatrix.a24 = 0;

        translationMatrix.a31 = 0;
        translationMatrix.a32 = 0;
        translationMatrix.a33 = 1;
        translationMatrix.a34 = 0;

        translationMatrix.a41 = tx;
        translationMatrix.a42 = ty;
        translationMatrix.a43 = tz;
        translationMatrix.a44 = 1;

        DMatrix4 result = new DMatrix4();

        CommonOps_DDF4.mult(v, translationMatrix, result);

        return result;
    }

    public static DMatrix4 scale(DMatrix4 v, double sx, double sy, double sz) {

        DMatrix4x4 scalingMatrix = new DMatrix4x4();

        scalingMatrix.a11 = sx;
        scalingMatrix.a12 = 0;
        scalingMatrix.a13 = 0;
        scalingMatrix.a14 = 0;

        scalingMatrix.a21 = 0;
        scalingMatrix.a22 = sy;
        scalingMatrix.a23 = 0;
        scalingMatrix.a24 = 0;

        scalingMatrix.a31 = 0;
        scalingMatrix.a32 = 0;
        scalingMatrix.a33 = sz;
        scalingMatrix.a34 = 0;

        scalingMatrix.a41 = 0;
        scalingMatrix.a42 = 0;
        scalingMatrix.a43 = 0;
        scalingMatrix.a44 = 1;

        DMatrix4 result = new DMatrix4();

        CommonOps_DDF4.mult(v, scalingMatrix, result);

        return result;
    }

    public static DMatrix4 rotateX(DMatrix4 v, double n) {

        DMatrix4x4 rotationMatrix = new DMatrix4x4();

        rotationMatrix.a11 = 1;
        rotationMatrix.a12 = 0;
        rotationMatrix.a13 = 0;
        rotationMatrix.a14 = 0;

        rotationMatrix.a21 = 0;
        rotationMatrix.a22 = Math.cos(n);
        rotationMatrix.a23 = Math.sin(n);
        rotationMatrix.a24 = 0;

        rotationMatrix.a31 = 0;
        rotationMatrix.a32 = -1 * Math.sin(n);
        rotationMatrix.a33 = Math.cos(n);
        rotationMatrix.a34 = 0;

        rotationMatrix.a41 = 0;
        rotationMatrix.a42 = 0;
        rotationMatrix.a43 = 0;
        rotationMatrix.a44 = 1;

        DMatrix4 result = new DMatrix4();

        CommonOps_DDF4.mult(v, rotationMatrix, result);

        return result;
    }

    public static DMatrix4 rotateY(DMatrix4 v, double n) {

        DMatrix4x4 rotationMatrix = new DMatrix4x4();

        rotationMatrix.a11 = Math.cos(n);
        rotationMatrix.a12 = 0;
        rotationMatrix.a13 = -1 * Math.sin(n);
        rotationMatrix.a14 = 0;

        rotationMatrix.a21 = 0;
        rotationMatrix.a22 = 1;
        rotationMatrix.a23 = 0;
        rotationMatrix.a24 = 0;

        rotationMatrix.a31 = Math.sin(n);
        rotationMatrix.a32 = 0;
        rotationMatrix.a33 = Math.cos(n);
        rotationMatrix.a34 = 0;

        rotationMatrix.a41 = 0;
        rotationMatrix.a42 = 0;
        rotationMatrix.a43 = 0;
        rotationMatrix.a44 = 1;

        DMatrix4 result = new DMatrix4();

        CommonOps_DDF4.mult(v, rotationMatrix, result);

        return result;
    }

    public static DMatrix4 rotateZ(DMatrix4 v, double n) {

        DMatrix4x4 rotationMatrix = new DMatrix4x4();

        rotationMatrix.a11 = Math.cos(n);
        rotationMatrix.a12 = Math.sin(n);
        rotationMatrix.a13 = 0;
        rotationMatrix.a14 = 0;

        rotationMatrix.a21 = -1 * Math.sin(n);
        rotationMatrix.a22 = Math.cos(n);
        rotationMatrix.a23 = 0;
        rotationMatrix.a24 = 0;

        rotationMatrix.a31 = 0;
        rotationMatrix.a32 = 0;
        rotationMatrix.a33 = 1;
        rotationMatrix.a34 = 0;

        rotationMatrix.a41 = 0;
        rotationMatrix.a42 = 0;
        rotationMatrix.a43 = 0;
        rotationMatrix.a44 = 1;

        DMatrix4 result = new DMatrix4();

        CommonOps_DDF4.mult(v, rotationMatrix, result);

        return result;
    }

}
