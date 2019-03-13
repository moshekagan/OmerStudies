class Game {
  String homeTeamName
  String awayTeamName
  Integer homeScore
  Integer awayScore

  Game(homeTeamName, awayTeamName, homeScore, awayScore) {
    this.homeTeamName = homeTeamName
    this.awayTeamName  = awayTeamName
    this.awayScore = awayScore
    this.homeScore = homeScore
  }

  public printGameScore() {
    println(this.homeTeamName + " " + this.homeScore + " - " + this.awayScore + " " + this.awayTeamName)
  }
}
