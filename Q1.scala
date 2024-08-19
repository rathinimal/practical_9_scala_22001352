import scala.io.StdIn.readDouble

object Q1{
    def main(args:Array[String]): Unit = {
        val calcInterest = (deposit:Double,rate:Double)=> deposit * rate/100
        val findInterest = (deposit:Double)=> deposit match {
            case x if x <= 20000 => calcInterest(x,2)
            case x if x <= 200000 => calcInterest(x,4)
            case x if x <= 2000000 => calcInterest(x,3.5)
            case x => calcInterest(x,6.5)
        }

        print("Enter the deposit amount: ")
        var depositInput =readDouble()

        println(s"The interest for deposit : ${findInterest(depositInput)}")
    }
}