class NBAAPI {

  Date gamesDate

  NBAAPI(gamesDate) {
    this.gamesDate = gamesDate
  }

  // return value Game[]
  public Game[] getGames() {
    def g1 = new Game("Atlanta", "Lakers", 10, 1)
    def g2 = new Game("Golden state", "Boston", 2, 12)

    Game[] games = new Game[2]
    games = [g1, g2]

    return games
  }

}
