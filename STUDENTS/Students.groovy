class Students {
    Person[] myStudents
    Integer size

    Students(students, size) {
      this.size = size
      this.myStudents = students
    }

    def calcClassAverage() {
      double averageClass = 0

      for (Integer i=0; i < this.size; i++) {
        averageClass += this.myStudents[i].getAvg()
      }
      averageClass = (averageClass / size)
      return averageClass
    }

    public def printClass() {
      for (Integer i=0; i < this.size; i++) {
        this.myStudents[i].printPerson()
      }
    }

    public def printAverage() {
      println("The average of the class is: " + this.calcClassAverage())
    }

    public def printClassAndAverage() {
      this.printClass()
      this.printAverage()
    }
}
