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
        if (exponential == 0) {
            return result;
        }
        for (int i = 0; i < exponential; i++) {
            result *= number;
        }
        return result;
    }
}
