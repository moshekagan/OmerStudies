class Person {
    String name
    Integer age
    Integer grade

    Person(name, age, grade) {
        this.name = name
        this.age = age
        this.grade = grade
    }

    def increaseAge(Integer years) {
        this.age += years
    }

    public getGrade() {
    return this.grade
    }
    
    public def whoAMI() {
      println ("name: " + this.name + " age: " + this.age + " grade: " + this.grade)
    }
}
