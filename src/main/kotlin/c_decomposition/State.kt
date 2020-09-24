package c_decomposition

class State(
    val squares: Array<String>
) {
    constructor(
        fox: Int = 60,
        hounds: Array<Int> = arrayOf(1, 3, 5, 7)
    ) : this(Array(64) {
        when {
            it == fox -> "F"
            hounds.contains(it) -> "H"
            else -> " "
        }
    })
}