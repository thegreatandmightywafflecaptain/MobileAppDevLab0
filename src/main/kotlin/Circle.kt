import kotlin.math.PI
import kotlin.math.exp
import kotlin.math.pow

class Circle(name : String) : Shape(name) {
    var radius = 0.0

    fun setDimensions(x : Double){
        radius = x
    }


    override fun getArea() : Double{

        return radius.pow(2) * PI

    }


    override fun printDimensions(){
        println("Dimensions of ${name}")
        println("Radius: ${radius}")
    }
}