class Students {
    Person[] myStudents
    Integer size

    Students(size, name) {
      this.size = size
      this.myStudents = new Person[size]

      for(int i=0; i < size; i++) {
        this.myStudents[i] = new Person(name + "_" + i, i + 10)
      }
    }

    public def printClass() {
      for (int i=0; i < this.size; i++) {
        this.myStudents[i].whoAMI()
      }
    }
}
