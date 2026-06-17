package Methods.level2;
public class UnitConverterTemperatureWeightVolume {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {

        System.out.println("100 F = " +
                convertFahrenheitToCelsius(100) + " C");

        System.out.println("37 C = " +
                convertCelsiusToFahrenheit(37) + " F");

        System.out.println("10 pounds = " +
                convertPoundsToKilograms(10) + " kg");

        System.out.println("10 kg = " +
                convertKilogramsToPounds(10) + " pounds");

        System.out.println("5 gallons = " +
                convertGallonsToLiters(5) + " liters");

        System.out.println("10 liters = " +
                convertLitersToGallons(10) + " gallons");
    }
}
