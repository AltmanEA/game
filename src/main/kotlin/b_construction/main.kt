package b_construction

fun main(){
    val state = Array(64){
        when(it){
            60 -> "F"
            in arrayOf(1, 3, 5, 7) -> "H"
            else -> " "
        }
    }
    Game(state)
    Game(60, arrayOf(1, 3, 5, 7))
}
