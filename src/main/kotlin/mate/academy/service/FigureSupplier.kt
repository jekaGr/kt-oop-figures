package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square

class FigureSupplier(
    private val colorSupplier: ColorSupplier = ColorSupplier()
) {

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()

        return when ((1..5).random()) {
            1 -> Square((1..10).random().toDouble(), color)
            2 -> Rectangle((1..10).random().toDouble(), (1..10).random().toDouble(), color)
            3 -> RightTriangle((1..10).random().toDouble(), (1..10).random().toDouble(), color)
            4 -> Circle((1..10).random().toDouble(), color)
            else -> IsoscelesTrapezoid(
                (1..10).random().toDouble(),
                (1..10).random().toDouble(),
                (1..10).random().toDouble(),
                color
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(10.0, Color.WHITE)
    }
}
