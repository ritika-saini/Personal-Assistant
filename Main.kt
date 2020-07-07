import java.util.*
import java.util.Scanner

fun main() {

    /*Initialize the object Robot and give it a name*/
    val robot = Robot("MYLIE")
    var t="0"
    val i=Scanner(System.`in`)

    /*Print the details of the Robot along with a greeting*/
    println("Hey, there. My name is ${robot.name} and I will be your personal assistant!!")
    println()

    /*Input an alarm time you want to wake up*/
    println("At what time shall I wake you up?")
    t= readLine()!!
    robot.ringAlarm(t)
    println()

    /*Let the robot know whether you'll take black coffee or not along with the number of spoons of sugar*/

    println("Would you like to take black coffee today, and with how much spoons of sugar?")
    println()
    var c:Boolean=i.nextBoolean()
    var s:Int=i.nextInt()
    robot.makeCoffee(Coffee(c,s))
    println()

    /*Input the water temperature in Celsius*/
    println("At what temperature you want to heat the water?")
    println()
    var tp:Int=i.nextInt()
    robot.heatWater(tp)
    println()

    /*The robot packs the bag according to the day to the week*/
    println("Your bag is set for the day!")
    robot.packBag(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    println()

    /*A random breakfast is made depending on the items you have*/
    println("Hey there! Your assistant Mylie has set the menu for today!")
    robot.cook()
    println()

    /*Just tell the color combination you want to wear. The robot will select the same from your wardrobe*/
    println("Let me know the colour combination for your clothing today?")
    println("For shirt:")
    var sh=readLine()!!
    println("For trousers:")
    var tr=readLine()!!
    robot.ironClothes(sh, tr)
    println()
}