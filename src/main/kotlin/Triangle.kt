import kotlin.math.sqrt

open class Triangle(name : String) : Shape(name) {
    var side_one = 0.0
    var side_two = 0.0
    var side_three = 0.0

    fun setDimensions(x : Double, y : Double, z:Double){
        side_one = x
        side_two = y
        side_three = z
    }


    override fun getArea() : Double{

        val half_perimeter = (side_one + side_two + side_three)/2
        val difference_one = half_perimeter - side_one
        val difference_two = half_perimeter - side_two
        val difference_three = half_perimeter - side_three
        return sqrt(half_perimeter * difference_one * difference_two * difference_three)



    }


    override fun printDimensions(){
        println("Dimensions of ${name}")
        println("1st Side: ${side_one}")
        println("2nd Side: ${side_two}")
        println("3rd Side: ${side_three}")

    }
}