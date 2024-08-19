object Q1{
    def main(args:Array[String]): Unit = {
        val interest : Double => Double = deposit => {
            deposit match {
                case d if d <= 20000 => d * 0.02
                case d if d <= 20000 => d * 0.04
                case d if d <= 200000 =>d * 0.035
                case d if d >  2000000 => d * 0.065
            }
        }

        val deposit = 40000.0
        val Interest_for_deposit = interest(deposit)
        println(s"Intersest earned: Rs.$Interest_for_deposit")

    }
}