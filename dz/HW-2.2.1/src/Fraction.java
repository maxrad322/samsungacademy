public class Fraction { // обыкновенная дробь
    private int numerator;// Числитель
    private int denominator = 1;// Знаменатель

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        // знак храним в числителе
        this.numerator = numerator * (denominator < 0 ? -1 : 1);
        // знаменатель всегда положительный
        this.denominator = Math.abs(denominator);
    }

    public void print() {
        System.out.print(numerator + "/" + denominator);
    }
    public static Fraction addition(Fraction fraction1, Fraction fraction2){
        int numerator = fraction1.denominator * fraction2.numerator + fraction2.denominator * fraction1.numerator;
        int denominator = fraction1.denominator * fraction2.denominator;
        return new Fraction(numerator,denominator);
    }
}