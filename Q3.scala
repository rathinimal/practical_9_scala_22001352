object Q3 {
    def main(args:Array[String]):Unit = {
        var toUpper = (w1:String)=>println(w1.toUpperCase())

        var toLower= (w2:String)=>println(w2.toLowerCase())

        var formatName = (w3:String,index1:Int,index2:Int)=>println(s"${toUpper(w3.substring(0,index1))}${w3.substring(index2,w3.length())}")

         // for Niroshan output NIroshan
        def formatNames(w3:String): Any ={
            println(w3.substring(0,2).toUpperCase() + w3.substring(2))
        }

        // for Kumara output KumarA
        def formatNames1(w4: String): Any ={
            println(w4.substring(0,1).toUpperCase() + w4.substring(1,5) + w4.substring(5).toUpperCase())
        }

        toUpper("Benny")
        formatNames("Niroshan")
        toLower("Saman")
        formatNames1("Kumara")
    
    }

}
