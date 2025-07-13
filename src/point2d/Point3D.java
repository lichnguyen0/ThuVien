package point2d;


// các thuộc tính của đối tượng Point3D
public class Point3D extends Point2D {
    private float z;


    //khởi tạo contrustor.
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    ;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    public String toString() {
        return "(x: " + getX() + "," + "y: " + getY() + "," + "z:" + z + ")";
    }
}

