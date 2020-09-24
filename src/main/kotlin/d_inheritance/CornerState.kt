package d_inheritance

class CornerState (
    white: Array<Int> = arrayOf(0, 1, 2, 8, 9, 10, 16, 17, 18),
    black: Array<Int> = Array(white.size){63-white[it]}
) : State(
    Array(64){
        when {
            white.contains(it) -> "W"
            black.contains(it) -> "B"
            else -> " "
        }
    }
)
