package bt_triangle_checker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testTriangleDeu() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 2;

        String expected = "Tam giac deu!";
        String result = TriangleClassifier.triangleClassify(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testTriangleCan() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 8;

        String expected = "Tam giac can!";
        String result = TriangleClassifier.triangleClassify(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testTriangleThuong() {
        double side1 = 3;
        double side2 = 5;
        double side3 = 4;

        String expected = "La tam giac!";
        String result = TriangleClassifier.triangleClassify(side1, side2, side3);
        assertEquals(expected, result);
    }
}