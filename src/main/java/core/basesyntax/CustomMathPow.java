package core.basesyntax;

public class CustomMathPow {

    /**
     * Написать метод pow(int number, int exponential), который является аналогом метода
     * Math.pow() и принимает 2 целых числа:
     * number - число которое надо возводить в какую-то степень
     * exponential - значение степени
     */
    public int pow(int number, int exponential) {
        double value = 1;
        if (number == 0) {
            return 0;
        }
        for (int i = 0; i < exponential; i++) {
            value *= number;
        }
        return (int) value;

    }
}
