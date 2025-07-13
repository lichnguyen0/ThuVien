package point2d;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.awt.*;
import java.util.Arrays;

public class MainPoint {
    public static void main(String[] args) {
        //khởi tạo Point2
        Point2D p2d = new Point2D(1.0f, 2.0f);
        System.out.println("Point2 " + p2d);  // gọi toString()


        //khởi tạo point3d
        Point3D p3d = new Point3D(3.0f, 4.0f, 5.0f);
        {
            System.out.println("Point3D" + p3d); // in ra toString()
        }


     // Lấy mảng XYZ và in ra
        float[] arr = p3d.getXYZ();
        System.out.println("Mảng XYZ "+ Arrays.toString(arr));




    }
}
