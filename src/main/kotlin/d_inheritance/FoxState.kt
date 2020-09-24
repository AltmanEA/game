package d_inheritance

class FoxState(
    fox: Int = 60,
    hounds: Array<Int> = arrayOf(1, 3, 5, 7)
) : State(
    Array(64){
        when {
            it == fox -> "F"
            hounds.contains(it) -> "H"
            else -> " "
        }
    }
)


