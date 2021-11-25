package at.unterhuber.test.subpackage;

public class AnotherClassToTest {
    public int min(int a, int b, int c) {
        if (a < b) {
            if (c < a) {
                return c;
            }
            return a;
        }
        if (c < b){
            return c;
        }
        return b;
    }
}
