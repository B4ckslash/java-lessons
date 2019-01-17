
/**
 * A simple class for arithmetic on {@code ints}.
 * @author
 * @version
 */
public class JavadocExercise {
    private int firstNumber, secondNumber;
    private long lastResult;

    /**
     *
     * @param firstNumber
     * @param secondNumber
     */
    public JavadocExercise(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.lastResult = 0L;
    }

    /**
     *
     * @return
     */
    public long add() {
        this.lastResult = firstNumber+secondNumber;
        return this.lastResult;
    }

    /**
     *
     * @return
     */
    public long multiply() {
        this.lastResult = firstNumber*secondNumber;
        return this.lastResult;
    }

    /**
     *
     * @return
     * @throws ArithmeticException
     */
    public int divide() throws ArithmeticException {
        this.lastResult = firstNumber/secondNumber;
        return (int) this.lastResult;
    }

    /**
     *
     * @return
     */
    public long subtract() {
        this.lastResult = firstNumber - secondNumber;
        return this.lastResult;
    }

}
