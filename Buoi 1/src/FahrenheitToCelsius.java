public class FahrenheitToCelsius {
    public static void main(String[] args){
        double f = 98.6;
        double c = (f - 32) * 5 / 9;

        System.out.println("Fahrenheit:" + f);
        System.out.println("Celsius:" + c);
    }
}
