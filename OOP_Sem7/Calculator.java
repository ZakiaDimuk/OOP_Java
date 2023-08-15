package OOP_Sem7;

import java.util.logging.Logger;

public class Calculator {
    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());

    public Complex add(Complex a, Complex b) {
        LOGGER.info("Выполнение операции сложения комплексных чисел");
        Complex result = a.add(b);
        LOGGER.info("Результат: " + result);
        return result;
    }

    public Complex multiply(Complex a, Complex b) {
        LOGGER.info("Выполнение операции сложения комплексных чисел");
        Complex result = a.multiply(b);
        LOGGER.info("Результат: " + result);
        return result;
    }

    public Complex divide(Complex a, Complex b) {
        LOGGER.info("Выполнение операции сложения комплексных чисел");
        Complex result = a.divide(b);
        LOGGER.info("Результат: " + result);
        return result;
    }
}
