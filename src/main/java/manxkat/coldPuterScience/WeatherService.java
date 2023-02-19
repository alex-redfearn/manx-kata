package manxkat.coldPuterScience;

public class WeatherService {
  private int temperatureCount;
  private String[] temperatures;

  public WeatherService(int temperatureCount, String[] temperatures) {
    this.temperatureCount = temperatureCount;
    this.temperatures = temperatures;
  }

  public int negativeTemperatureCount() {
    int negativeCount = 0;

    for (int i = 0; i < this.temperatureCount; i++) {
      if (Integer.parseInt(this.temperatures[i]) < 0) {
        negativeCount++;
      }
    }

    return negativeCount;
  }
}
