class ExampleNBA {
    static void main(String[] args) {

      def date1 = new Date(12, 03, 2019)
      def nbaApi = new NBAAPI(date1)

      def gamesArray = nbaApi.getGames()
      for (Integer i=0; i < gamesArray.size() ;i++ ) {
        gamesArray[i].printGameScore()
      }
      //day1.Game.printGameScore()
    }
}
