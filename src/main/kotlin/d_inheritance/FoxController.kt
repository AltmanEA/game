package d_inheritance

class FoxController : Controller(FoxState()){
    override fun possibleMoves(shape: String, from: Int) =
        when(shape){
            "F" -> arrayOf(from-7, from-9)
            "H" -> arrayOf(from+7, from+9)
            else -> arrayOf()
        }
}
