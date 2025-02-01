public class ScientificCalculator extends ArithmeticCalculator 
{
	public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public double log(double number) {
        return Math.log(number);
    }
    
    public double sine(double angle) {
        return Math.sin(Math.toRadians(angle));
    }
    
    public double cosine(double angle) {
        return Math.cos(Math.toRadians(angle));
    }
    
    public double tangent(double angle) {
        return Math.tan(Math.toRadians(angle));
    }

}
