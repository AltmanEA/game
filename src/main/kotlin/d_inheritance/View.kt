package d_inheritance

import java.awt.Color
import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JPanel

class View(
    val controller: Controller
) {
    val panel = JPanel().apply {
        layout = GridLayout(8, 8)
    }

    val buttons = Array(64) { index ->
        JButton().also { button ->
            button.text = controller.state.squares[index]
            button.addActionListener {controller.onClick(index)}
            panel.add(button)
        }
    }

    init {
        update()
    }

    fun update() {
        for ((index, button) in buttons.withIndex()) {
            button.text = controller.state.squares[index]
            val line = index.div(8)
            button.background =
                if (index.rem(2) != line.rem(2))
                    Color.YELLOW
                else
                    Color.WHITE
        }
        controller.checkedCell?.let{
            buttons[it].background = Color.BLUE
        }
    }
}