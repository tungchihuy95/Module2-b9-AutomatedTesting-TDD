package bt_triangle_checker;

public class TriangleClassifier {
    public static String triangleClassify(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return "Khong phai la tam giac!";
        } else if (side1 == side2 && side1 == side3) {
            return "Tam giac deu!";
        } else if (((side1 == side2) && ((side1 + side2) > side3)) || ((side1 == side3) && ((side1 + side3) > side2)) || ((side2 == side3) && ((side2 + side3) > side1))) {
            return "Tam giac can!";
        } else if (side1 + side2 > side3 || side1 + side3 > side2 || side2 + side3 > side1) {
            return "La tam giac!";
        }
            return "Khong phai la tam giac!";
    }
}
