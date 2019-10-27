package isep;

import static org.junit.jupiter.api.Assertions.*;

class DivisaoTest {

    @org.junit.jupiter.api.Test
    void matrixIdent3 () {
        Divisao c = new Divisao();
        int [][] result = c.matrixIdent(3);
        assertArrayEquals(new int [][] {{1,0,0},{0,1,0},{0,0,1}}, result);
    }

    @org.junit.jupiter.api.Test
    void matrixIdent4 () {
        Divisao c = new Divisao();
        int [][] result = c.matrixIdent(4);
        assertArrayEquals(new int [][] {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}}, result);
    }

}