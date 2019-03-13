class Exam {
  String name
  Integer grade
  Date date

  Exam(name, grade, date){
        this.name = name
        this.grade = grade
        this.date = date
  }

  public def getGrade() {
    return this.grade
  }

  public def printExam() {
    println(this.date.getDate() + ", " + this.name + ", " + this.getGrade())
  }
}
