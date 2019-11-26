package isep;

import static org.junit.jupiter.api.Assertions.*;

class DivideMatrixTest {

    @org.junit.jupiter.api.Test
    void matrixIdent3 () {
        DivideMatrix c = new DivideMatrix();
        int [][] result = c.matrixIdent(3);
        assertArrayEquals(new int [][] {{1,0,0},{0,1,0},{0,0,1}}, result);
    }

    @org.junit.jupiter.api.Test
    void matrixIdent4 () {
        DivideMatrix c = new DivideMatrix();
        int [][] result = c.matrixIdent(4);
        assertArrayEquals(new int [][] {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}}, result);
    }

}