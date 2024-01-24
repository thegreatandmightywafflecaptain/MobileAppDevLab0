class Square(name : String) : Shape(name) {
    var length = 0.0
    var height = 0.0

    fun setDimensions(x : Double, y : Double){
        length = x
        height = y
    }


    override fun getArea() : Double{

        return length * height;

    }


    override fun printDimensions(){
        println("Dimensions of ${name}")
        println("Length: ${length}")
        println("Height: ${height}")
    }
}