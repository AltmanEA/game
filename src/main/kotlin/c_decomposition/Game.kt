package c_decomposition

import javax.swing.JFrame

class Game(
    var state: State = State()
) {
    val view = View(state)
    val frame = JFrame().apply {
        add(view.panel)
        setSize(500, 500)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        isVisible = true
    }
}