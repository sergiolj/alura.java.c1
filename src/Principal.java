public class Principal {
    public static void main(String[] args) {
        double celsius = 0;
        int fahrenheit;
        double kelvin;

        fahrenheit = convertTemp(celsius);
        System.out.println(String.format("A temperatura em %.2f é equivalente a %d em fahrenheit", celsius, fahrenheit));

        celsius = 35.4;
        fahrenheit = convertTemp(celsius);
        System.out.println(String.format("A temperatura em %.2f é equivalente a %d em fahrenheit", celsius, fahrenheit));


    }
    public static int convertTemp(double celsius){
        return ((int)(celsius * 1.8) + 32);
    }
}
