
object HashCal {
    def main(args: Array[String]) {
        args.length match {
            case 1 => {
                if (args(0) == "-md5") showUsage
                else println(args(0).hashCode)
            }
            case 2 => {
                args(0) match {
                    case "-md5" => println(md5Hash(args(1)))
                    case _ => showUsage
                }
            }
            case _ => showUsage
        }
    }

    def showUsage(): Unit = {
        println("Usage: scala HashCalc <string>\n"
              + "     | scala HashCalc -md5 <string>")
    }
 

    def md5Hash(text: String): String = {
        java.security.MessageDigest.getInstance("MD5")
        .digest(text.getBytes)
        .map(0xFF & _)
        .map { "%02x".format(_) }
        .foldLeft(""){_ + _}
    }
}
