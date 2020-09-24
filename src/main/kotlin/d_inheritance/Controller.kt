package d_inheritance

open class Controller(
    var state: State
) {
    val view = View(this)
    var checkedCell: Int? = null

    fun onClick(index: Int) {
        if (checkedCell == null)
            checkedCell = index
        else {
            step(checkedCell!!, index)?.let {
                state = it
            }
            checkedCell = null
        }
        view.update()
    }

    fun step(from: Int, to: Int) =
        if (possibleMoves(state[from], from).contains(to))
            state.move(from, to)
        else
            null

    open fun possibleMoves(shape: String, from: Int) =
        Array(64) { it }
}
