class Students {
    Person[] myStudents
    Integer size

    Students(size, name) {
      this.size = size
      this.myStudents = new Person[size]

      for(int i=0; i < size; i++) {
        this.myStudents[i] = new Person(name + "_" + i, i + 10, i +80)
      }
    }

    def calcAverage() {
      double averageClass = 0

      for (int i=0; i < this.size; i++) {
        averageClass += this.myStudents[i].getGrade()
      }

      averageClass = (averageClass / size)

      return averageClass
    }

    public def printClass() {
      for (int i=0; i < this.size; i++) {
        this.myStudents[i].whoAMI()
      }
    }

    public def printAverage() {
      println("The average of the class is: " + this.calcAverage())
    }

    public def printClassAndAverage() {
      this.printClass()
      this.printAverage()
    }
}
