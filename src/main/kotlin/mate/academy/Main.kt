package mate.academy

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

fun main() {
    val size = 6
    val figures = Array<Figure>(size) { Circle(1.0, Color.BLACK) }

    val supplier = FigureSupplier()

    for (i in 0 until size / 2) {
        figures[i] = supplier.getRandomFigure()
    }

    for (i in size / 2 until size) {
        figures[i] = supplier.getDefaultFigure()
    }

    // draw all figures
    figures.forEach { it.draw() }
}
