package mate.academy.model

class RightTriangle(
    val firstLeg: Double,
    val secondLeg: Double,
    override val color: Color
) : Figure {

    override fun getArea(): Double = firstLeg * secondLeg / 2

    override fun draw() {
        println(
            "Figure: right triangle, area: ${getArea()} sq. units, " +
                    "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color"
        )
    }
}
