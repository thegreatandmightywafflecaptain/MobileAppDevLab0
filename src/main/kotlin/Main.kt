import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    val sq = Square("Square")
    val cir = Circle("Circle")
    val tri = Triangle("Triangle")
    val eq_tri = EquilateralTriangle("Equilateral Triangle")

    var arg1 = 0.0
    var arg2 = 0.0
    var arg3 = 0.0

    println("Setting the dimensions for: ${sq.name}")
    println("Enter the width for ${sq.name}:")
    arg1 = reader.nextDouble()
    println("Enter the height for ${sq.name}:")
    arg2 = reader.nextDouble()
    sq.setDimensions(arg1, arg2)
    println("")

    println("Setting the dimensions for: ${cir.name}")
    println("Enter the radius for ${cir.name}:")
    arg1 = reader.nextDouble()
    cir.setDimensions(arg1)
    println("")


    println("Setting the dimensions for: ${tri.name}")
    println("Enter the length of the 1st side for ${tri.name}:")
    arg1 = reader.nextDouble()
    println("Enter the length of the 2nd side for ${tri.name}:")
    arg2 = reader.nextDouble()
    println("Enter the length of the 3rd side for ${tri.name}:")
    arg3 = reader.nextDouble()
    tri.setDimensions(arg1, arg2, arg3)
    println("")

    println("Setting the dimensions for: ${eq_tri.name}")
    println("Enter the length of each side:")
    arg1 = reader.nextDouble()
    eq_tri.setDimensions(arg1)
    println("")


    println("Results:")
    sq.printDimensions()
    println("Area: ${sq.getArea()}")
    cir.printDimensions()
    println("Area: ${cir.getArea()}")
    tri.printDimensions()
    println("Area: ${tri.getArea()}")
    eq_tri.printDimensions()
    println("Area: ${eq_tri.getArea()}")



}