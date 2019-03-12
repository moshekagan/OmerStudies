class Example {
    static void main(String[] args) {
        def N = 5

        def yossis = new Students(N, "Yossi") // yossi_1
        def avis = new Students(N * 2, "avi")
        def moshes = new Students(12, "moshe")

        yossis.printClass()
        avis.printClass()
        moshes.printClass()
    }
}
