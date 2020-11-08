import java.util.*;

public class Solution {

  private static Map<String,ScoreInfo> playerInfo;

  public static class PlayerStatisticsCollectorImpl implements PlayerStatisticsCollector {
    private static Map<String,ScoreInfo> playerInfo = new HashMap<>();
    @Override
    public void putNewInnings(String player, int runs){
      ScoreInfo scoreInfo = playerInfo.get(player);
      if (null != scoreInfo) {
        scoreInfo.setRuns(runs);
        playerInfo.put(player, scoreInfo);
      } else {
        scoreInfo = new ScoreInfo(runs);
        playerInfo.put(player, scoreInfo);
      }
    }

    @Override
    public double getAverageRuns(String player){
      ScoreInfo scoreInfo =  playerInfo.get(player);
      return null != scoreInfo ? scoreInfo.getRuns()/scoreInfo.getInnings() : 0.0;
    }

    @Override
    public int getInningsCount(String player){
      ScoreInfo scoreInfo =  playerInfo.get(player);
      return null != scoreInfo ? scoreInfo.getInnings() : 0;
    }
  }


  public static class ScoreInfo {
    private int innings;
    private int runs;

    ScoreInfo(int runs) {
      innings++;
      this.runs += runs;
    }

    public int getInnings() {
      return innings;
    }

    public int getRuns() {
      return runs;
    }

    public void setRuns(int runs) {
      this.runs += runs;
      innings++;
    }
  }
  ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

  public interface PlayerStatisticsCollector {
    // This is an input. Make note of this player inning.  Runs is a non negative integer.
    void putNewInnings(String player, int runs);

    // Get the runs average(mathematical average) for a player
    double getAverageRuns(String player);

    // Get the total number of innings for the player
    int getInningsCount(String player);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numLines = Integer.parseInt(scanner.nextLine());
    int currentLine = 0;
    while (currentLine++ < numLines) {
      final PlayerStatisticsCollector stats = new PlayerStatisticsCollectorImpl();
      final Set<String> players = new TreeSet<>();

      String line = scanner.nextLine();
      String[] inputs = line.split(",");
      for (int i = 0; i < inputs.length; ++i) {
        String[] tokens = inputs[i].split(" ");
        final String player = tokens[0];
        players.add(player);
        final int runs = Integer.parseInt(tokens[1]);

        stats.putNewInnings(player, runs);

      }

      for (String player : players) {
        System.out.println(
            String.format("%s %.4f %d", player, stats.getAverageRuns(player), stats.getInningsCount(player)));
      }

    }
    scanner.close();

  }
}
