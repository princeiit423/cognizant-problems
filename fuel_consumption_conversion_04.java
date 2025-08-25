public class fuel_consumption_conversion_04 {
    public static void fuelConversion(float distance, float fuel) {
        float kmperlit = distance / fuel;
        float hunkil = (1 / kmperlit) * 100;
        System.out.println(hunkil + " litres per 100 km");

        float oneMile = 1 / 1.609f;
        float oneGallon = 1 / 4.546f;
        float mileDist = distance * oneMile;
        float gallonFuel = fuel * oneGallon;

        float milepergall = mileDist / gallonFuel;
        System.out.println(milepergall + " miles per gallon");
    }

    public static void main(String[] args) {
        float distance = 500;
        float fuel = 35;
        fuelConversion(distance, fuel);
    }
}
