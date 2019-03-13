class Person {
  String name
  Integer age
  ExamList exams

  Person(name, age, exams) {
    this.name = name
    this.age = age
    this.exams = exams
  }

    public def printPerson() {
      println(this.name + " " + this.age + " " + this.exams.calcAvg())
    }

    public def getAvg() {
      this.exams.calcAvg()
    }
}
