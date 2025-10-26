public class CalculatorTest {
    public static void main(String[] args) {
        assert eq(Calculator.calculate("4+5"), 9) : "4+5 treba da bude 9";
        assert eq(Calculator.calculate("10+5*4+3"), 33) : "10+5*4+3 treba da bude 33";
        assert eq(Calculator.calculate("8+12/3*2"), 16) : "8+12/3*2 treba da bude 16";
        int res = (int) Calculator.calculate("7/2");
        assert res == 3 || res == 4 : "7/2 proveri tip rezultata (int vs double)";
        System.out.println("Svi jednostavni testovi prosli");
    }

    private static boolean eq(Object a, Object b) {
        return String.valueOf(a).equals(String.valueOf(b));
    }
}
