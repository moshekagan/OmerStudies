class ExamList {
  Exam[] exams
  Integer size

    ExamList(exams, size) {
      this.size = size
      this.exams = exams
    }

    public def calcAvg() {
      double avg = 0
      for (Integer i = 0; i < this.size ; i++ ) {
        avg += this.exams[i].getGrade()
      }
      return (avg / size)
    }

    public def printAvg() {
      println(this.calcAvg())
    }

    public def getBestExams() {
      double bestGrade = 0
      for (Integer i = 0; i < this.size ; i++ ) {
        if (bestGrade <= this.exams[i].getGrade()) {
          bestGrade = this.exams[i].getGrade()
        }
      }
      return bestGrade
    }

    public def printExams() {
      for (Integer i = 0; i < this.size ; i++ ) {
        this.exams[i].printExam()
      }
    }
}
