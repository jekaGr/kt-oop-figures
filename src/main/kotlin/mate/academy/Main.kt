package mate.academy

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

private const val ARRAY_SIZE = 6

fun main() {

    val figures = Array<Figure>(ARRAY_SIZE) { Circle(1.0, Color.BLACK) }

    val supplier = FigureSupplier()

    for (i in 0 until ARRAY_SIZE / 2) {
        figures[i] = supplier.getRandomFigure()
    }

    for (i in ARRAY_SIZE / 2 until ARRAY_SIZE) {
        figures[i] = supplier.getDefaultFigure()
    }

    // draw all figures
    figures.forEach { it.draw() }
}
