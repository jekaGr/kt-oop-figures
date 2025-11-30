package mate.academy.model

class Rectangle(
    val width: Double,
    val height: Double,
    override val color: Color
) : Figure {

    override fun getArea(): Double = width * height

    override fun draw() {
        println("Figure: rectangle, area: ${getArea()}, width: $width, height: $height, color: $color")
    }
}
