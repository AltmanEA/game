package d_inheritance

class CornerController : Controller(CornerState()) {
    val nextCell = arrayOf(-7, -8, -9, -1, 1, 7, 8, 9)

    override fun possibleMoves(shape: String, from: Int) =
        ArrayList<Int>().apply {
            for (next in nextCell)
                (checkCell(from + next)
                    ?: checkCell(from + 2 * next))
                    ?.let {
                        add(it)
                    }
        }.toTypedArray()

    fun checkCell(cell: Int) =
        if ((cell >= 0) and (cell < 64))
            if (state[cell] == " ")
                cell
            else null
        else null
}