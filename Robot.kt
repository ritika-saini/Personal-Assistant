import java.util.*

/*Class Robot defines the tasks which will be performed by the Robot
* You can customize this class according to your preferences*/
class Robot(val name: String) {

    fun ringAlarm(time: String) = println("Good morning! It is $name, the time is already $time, please wake up!")

    fun makeCoffee(coffee: Coffee) {
        if (coffee.black) {
            println("Your black coffee with ${coffee.spoonsOfSugar} spoons of sugar is ready!")
        } else {
            println("Your coffee with ${coffee.spoonsOfSugar} spoons of sugar is ready!")
        }
    }

    fun heatWater(temperature: Int) = println("Your bath water with $temperature Celsius is ready, take a bath now!")

    fun packBag(day: Int) {
        val messageTemplate = "Books kept for today are : "
        val subjects =
            arrayOf("JAVA", "PYTHON", "IT Support", "Electronics", "App Development", "Web Development", "DS & Algorithms")

        when (day) {
            Calendar.MONDAY -> println("$messageTemplate ${subjects[0]}, ${subjects[1]}, ${subjects[2]}")
            Calendar.TUESDAY -> println("$messageTemplate ${subjects[0]}, ${subjects[1]}, ${subjects[2]}")
            Calendar.WEDNESDAY -> println("$messageTemplate ${subjects[3]}, ${subjects[4]}")
            Calendar.THURSDAY -> println("$messageTemplate ${subjects[3]}, ${subjects[4]}")
            Calendar.FRIDAY -> println("$messageTemplate ${subjects[5]}, ${subjects[6]}")
             else -> println("Invalid day or maybe its holiday today!!")
        }
    }

    /*Here a random choice is made by the robot using the system defined method random()*/
    fun cook() {
        val breakfast = mutableListOf("Cereals", "Cornflakes", "Oats", "Sandwiches", "Eggs")
        val lunch =
            mutableListOf("Corn Spinach", "Salad", "Chicken", "Shahi Paneer", "Mashed Potatoes", "Eat out today!")
        val dinner =
            mutableListOf("Soup", "Salad", "Chicken", "Kadhai Paneer", "Noodles", "Eat out today!")
        println("Today's breakfast is ${breakfast.random()}, lunch is ${lunch.random()} and dinner is ${dinner.random()}.")
    }

    fun ironClothes(shirtColor: String, trouserColor: String) {
        val shirtColors = mutableListOf("Blue", "Green", "Orange", "Red", "Yellow", "Black")
        val trouserColors = mutableListOf("Blue", "Black", "Grey")

        if (shirtColors.contains(shirtColor)) {
            if (trouserColors.contains(trouserColor)) {
                println("Your Clothes are ready!!")
            } else {
                println("You do not have trouser of this color. May be its time to go for a trouser shopping.")
            }
        } else {
            println("You do not have shirt of this color. May be its time to go for a trouser shopping.")
        }
    }


}