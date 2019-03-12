class Person {
    String name
    Integer age

    Person(name, age) {
        this.name = name
        this.age = age
    }

    def increaseAge(Integer years) {
        this.age += years
    }

    public def whoAMI() {
      println("name: " + this.name + " age: " + this.age)
    }
}
