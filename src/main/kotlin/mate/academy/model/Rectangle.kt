package mate.academy.model

class Rectangle(
    val width: Double,
    val height: Double,
    override val color: Color
) : Figure {

    override fun getArea(): Double = width * height

    override fun draw() {
        println(
            "Figure: rectangle, area: ${getArea()} sq. units, " +
                    "width: $width units, height: $height units, color: $color"
        )
    }
}
