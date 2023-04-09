package manxkat.coldputerscience;

public class Main {
  public static void main(String[] args) {

    InputReader reader = new InputReader(System.in);
    outputDaysTemperatureIsNegative(reader);
  }

  private static void outputDaysTemperatureIsNegative(InputReader reader) {
    int count = reader.nextInt();
    String[] temperatures = reader.splitNext();

    WeatherService weatherService = new WeatherService(count, temperatures);

    System.out.println(weatherService.negativeTemperatureCount());
  }

}
