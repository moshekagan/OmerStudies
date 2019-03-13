class Example {
    static void main(String[] args) {
        def date = new Date(22, 11, 1999)
        def date2 = new Date(1, 12, 1999)

        def exam_1 = new Exam("Math", 89, date)
        def exam_2 = new Exam("Eng", 94, date2)

        def N = 2
        def examArray = new Exam[N]
        examArray = [exam_1, exam_2]
        def examList = new ExamList(examArray, N)

        def person1 = new Person("Omer", 27, examList)
        def person2 = new Person("Moshe", 28, examList)

        def personArray = new Person[N]
        personArray = [person1, person2]
        def students1 = new Students(personArray, N)

        students1.printClassAndAverage()
    }
}
