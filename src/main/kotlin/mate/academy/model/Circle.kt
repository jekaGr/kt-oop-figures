package mate.academy.model

class Circle(
    val radius: Double,
    override val color: Color
) : Figure {

    override fun getArea(): Double = Math.PI * radius * radius

    override fun draw() {
        println(
            "Figure: circle, area: ${getArea()} sq. units, " +
                    "radius: $radius units, color: $color"
        )
    }
}
