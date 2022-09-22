package AulaPratica;

public class TempCities {
    public static void main(String[] args) {
        String[] cities = { "Londres", "Madrid", "Nueva York", "Buenos Aires",
                "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int[][] tempCities = { { -2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35} };

        System.out.println(tempCities[5][1]);

        String hottestCityName = cities[0];
        String collestCityName = cities[0];

        int hottestCityTemp = 0;
        int collestCityTemp = 0;

        for (int i = 0; i < cities.length; i++) {
            if ( hottestCityTemp < tempCities[i][1]) {
                hottestCityTemp = tempCities[i][1];
                hottestCityName = cities[i];
            }
            if ( collestCityTemp > tempCities[i][0]) {
                collestCityTemp = tempCities[i][0];
                collestCityName = cities[i];
            }
        }
        System.out.println("A cidade que registrou maior temperatura foi "+ hottestCityName + " com a temperatura de " + hottestCityTemp);
        System.out.println("A cidade que registrou menor temperatura foi "+ collestCityName + " com a temperatura de " + collestCityTemp);
    }
}
