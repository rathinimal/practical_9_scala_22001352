import scala.io.StdIn.readInt

object Q2 {
    def main(args:Array[String]): Unit = {
        val isEven = (x:Int)=>x % 2 == 0

        val findTypeNum = (x:Int)=> x match {
            case x if x<=0 => println("Negative/zero is input.")
            case x if isEven(x)=> println("Even number is given"); 
            case _ => println("odd number is given")
        }

        print("Enter the number: ")
        val inputNum = readInt()
        findTypeNum(inputNum)
    }
}