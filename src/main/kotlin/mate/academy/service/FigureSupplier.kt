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
private const val RANGE_START = 1
private const val TYPE_SQUARE = 1
private const val TYPE_RECTANGLE = 2
private const val TYPE_TRIANGLE = 3
private const val TYPE_CIRCLE = 4

class FigureSupplier(
    private val colorSupplier: ColorSupplier = ColorSupplier()
) {

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()

        return when ((RANGE_START..FIGURE_TYPES).random()) {
            TYPE_SQUARE -> Square((RANGE_START..MAX_DIMENSION).random().toDouble(), color)
            TYPE_RECTANGLE -> Rectangle(
                (RANGE_START..MAX_DIMENSION).random().toDouble(),
                (RANGE_START..MAX_DIMENSION).random().toDouble(),
                color
            )
            TYPE_TRIANGLE -> RightTriangle(
                (RANGE_START..MAX_DIMENSION).random().toDouble(),
                (RANGE_START..MAX_DIMENSION).random().toDouble(),
                color
            )
            TYPE_CIRCLE -> Circle((RANGE_START..MAX_DIMENSION).random().toDouble(), color)
            else -> IsoscelesTrapezoid(
                (RANGE_START..MAX_DIMENSION).random().toDouble(),
                (RANGE_START..MAX_DIMENSION).random().toDouble(),
                (RANGE_START..MAX_DIMENSION).random().toDouble(),
                color
            )
        }
    }

    fun getDefaultFigure(): Figure =
        Circle(DEFAULT_RADIUS, Color.WHITE)
}
