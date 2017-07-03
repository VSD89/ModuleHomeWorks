/**
 * Created by Валентин on 02.07.2017.
 */
public class Integ extends Number {
    private final int value;

    public Integ(int value) {
        this.value = value;
    }
    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return (long) value;
    }

    @Override
    public float floatValue() {
        return (float) value;
    }

    @Override
    public double doubleValue() {
        return (double) value;
    }
}
