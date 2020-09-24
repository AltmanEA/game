package c_decomposition

import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JPanel

class View(val state: State) {
    val panel = JPanel().apply {
        layout = GridLayout(8, 8)
    }

    val buttons = Array(64) { index ->
        JButton().also { button ->
            button.text = state.squares[index]
            panel.add(button)
        }
    }
}