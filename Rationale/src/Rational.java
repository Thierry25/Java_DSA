public class Rational extends Number implements Comparable<Rational> {
    private long numerator = 0;
    private long denominator = 1;

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public static long gcd(long number1, long number2) {
        long n1 = Math.abs(number1);
        long n2 = Math.abs(number2);
        int gcd = 1;

        long minValue = Math.min(n1, n2);
        for (int i = 2; i <= minValue; i++) {
            if (n1 % i == 0 && n2 % i == 0) gcd = i;
        }
        return gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational secondRational) {
        long newNumerator = this.numerator * secondRational.getDenominator() + this.denominator * secondRational.getNumerator();
        long newDenominator = this.denominator * secondRational.getDenominator();
        return new Rational(newNumerator, newDenominator);
    }

    public Rational subtract(Rational secondRational) {
        long newNumerator = this.numerator * secondRational.getDenominator() - this.denominator * secondRational.getNumerator();
        long newDenominator = this.denominator * secondRational.getDenominator();
        return new Rational(newNumerator, newDenominator);
    }

    public Rational multiply(Rational secondRational) {
        long newNumerator = this.numerator * secondRational.getNumerator();
        long newDenominator = this.denominator * secondRational.getDenominator();
        return new Rational(newNumerator, newDenominator);
    }

    public Rational divide(Rational secondRational) {
        long newNumerator = this.numerator * secondRational.getDenominator();
        long newDenominator = this.denominator * secondRational.getNumerator();
        return new Rational(newNumerator, newDenominator);
    }

    @Override
    public int compareTo(Rational o) {
        return Double.compare(this.doubleValue(), o.doubleValue());
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    @Override
    public boolean equals(Object obj) {
        return this.doubleValue() == ((Rational) obj).doubleValue();
    }

    @Override
    public String toString() {
        if (denominator == 1) return numerator + "";
        else return numerator + "/" + denominator;
    }
}
