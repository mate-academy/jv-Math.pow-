package core.basesyntax;

public class CustomMathPow {

    /**
     * Написать метод pow(int number, int exponential), который является аналогом метода
     * Math.pow() и принимает 2 целых числа:
     *      number - число которое надо возводить в какую-то степень
     *      exponential - значение степени
     */
    public int pow(int number, int exponential) {
        int result = 1;
        if (number >= 0 && exponential > 0) {
            for (int i = 1; i <= exponential; i++) {
                result = result * number;
            }
        }
        return result;
    }
}
