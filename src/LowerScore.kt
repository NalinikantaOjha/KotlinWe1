fun main(){
    val scores = arrayOf(20,30,50,6)
    var lowest=scores[0]
    for (score in scores){
        if (score<lowest){
            lowest=score
        }
    }
    print(lowest)
}