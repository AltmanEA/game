package d_inheritance

import javax.swing.JFrame

fun main(){
    val controller = CornerController()
//    val controller = FoxController()

    val frame = JFrame().apply {
        add(controller.view.panel)
        setSize(500, 500)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        isVisible = true
    }
}