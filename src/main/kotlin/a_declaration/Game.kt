package a_declaration

import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

class Game {
    val squares = Array(64){it.toString()}
    val buttons = Array(64){ JButton() }
    val panel = JPanel()
    val frame = JFrame()

    fun draw(){
        panel.layout = GridLayout(8,8)
        for((index, button) in buttons.withIndex()) {
            button.text = squares[index]
            panel.add(button)
        }
        with(frame){
            add(panel)
            setSize(500, 500)
            defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            isVisible = true
        }
    }
}