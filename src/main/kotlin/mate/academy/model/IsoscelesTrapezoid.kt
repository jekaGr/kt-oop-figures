package mate.academy.model

class IsoscelesTrapezoid(
    val baseA: Double,
    val baseB: Double,
    val height: Double,
    override val color: Color
) : Figure {

    override fun getArea(): Double = (baseA + baseB) * height / 2

    override fun draw() {
        println(
            "Figure: isosceles trapezoid, area: ${getArea()} sq. units, " +
                    "baseA: $baseA units, baseB: $baseB units, height: $height units, color: $color"
        )
    }
}
