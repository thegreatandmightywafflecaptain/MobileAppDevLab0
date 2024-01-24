class EquilateralTriangle(name : String) : Triangle(name) {

    fun setDimensions(x: Double){
        super.setDimensions(x, x, x)
    }
}