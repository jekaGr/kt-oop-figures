package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square

private const val MAX_DIMENSION = 10
private const val FIGURE_TYPES = 5
private const val DEFAULT_RADIUS = 10.0

class FigureSupplier(
    private val colorSupplier: ColorSupplier = ColorSupplier()
) {

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()

        return when ((1..FIGURE_TYPES).random()) {
            1 -> Square((1..MAX_DIMENSION).random().toDouble(), color)
            2 -> Rectangle(
                (1..MAX_DIMENSION).random().toDouble(),
                (1..MAX_DIMENSION).random().toDouble(),
                color
            )
            3 -> RightTriangle(
                (1..MAX_DIMENSION).random().toDouble(),
                (1..MAX_DIMENSION).random().toDouble(),
                color
            )
            4 -> Circle((1..MAX_DIMENSION).random().toDouble(), color)
            else -> IsoscelesTrapezoid(
                (1..MAX_DIMENSION).random().toDouble(),
                (1..MAX_DIMENSION).random().toDouble(),
                (1..MAX_DIMENSION).random().toDouble(),
                color
            )
        }
    }

    fun getDefaultFigure(): Figure =
        Circle(DEFAULT_RADIUS, Color.WHITE)
}
