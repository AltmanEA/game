package d_inheritance

open class State (
    val squares: Array<String> = Array(64){" "}
){
    fun move(from:Int, to:Int): State =
        State(squares.clone()).apply {
            squares[to] = squares[from]
            squares[from] = " "
        }

    operator fun get(index: Int)= squares[index]
}