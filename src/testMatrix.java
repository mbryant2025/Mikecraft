import org.ejml.data.DMatrix3x3;
import org.ejml.dense.fixed.CommonOps_DDF3;

public class testMatrix {

    public static void main(String[] args) {
        DMatrix3x3 a = new DMatrix3x3();
        DMatrix3x3 b = new DMatrix3x3();

        // Can assign values the usual way
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a.set(i, j, i + j + 1);
            }
        }

        // Direct manipulation of each value is the fastest way to assign/read values
        a.a11 = 12;
        a.a23 = 64;

        // can print the usual way too
        a.print();

        // most of the standard operations are support
        CommonOps_DDF3.transpose(a, b);
        b.print();

        System.out.println("Determinant = " + CommonOps_DDF3.det(a));
    }
}
