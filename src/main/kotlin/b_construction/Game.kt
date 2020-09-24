package b_construction

import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

class Game(
    val squares: Array<String> = Array(64) { it.toString() }
) {

    val panel = JPanel().apply {
        layout = GridLayout(8, 8)
    }

    val buttons = Array(64) { index ->
        JButton().also { button ->
            button.text = squares[index]
            panel.add(button)
        }
    }

    val frame = JFrame()

    init {
        with(frame) {
            add(panel)
            setSize(500, 500)
            defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            isVisible = true
        }
    }

    constructor(
        fox: Int = 60,
        hounds: Array<Int> = arrayOf(1, 3, 5, 7)
    ) : this(Array(64) {
        when {
            it == fox -> "F"
            hounds.contains(it) -> "H"
            else -> " "
        }
    }){}

    fun update() {
        for ((index, button) in buttons.withIndex()) {
            button.text = squares[index]
        }
    }
}