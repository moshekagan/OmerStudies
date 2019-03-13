class Date {
  Integer day
  Integer month
  Integer year

  Date(day, month, year) {
    this.day = day
    this.month = month
    this.year = year
  }

  public def getDate() {
    return this.day + "/" + this.month + "/" + this.year
  }

  public def getDay() {
    retutn this.day
  }

  public def getmonth() {
    retutn this.month
  }

  public def getYear() {
    retutn this.year
  }

  public def printDate() {
    println(this.getDate())
  }

}
