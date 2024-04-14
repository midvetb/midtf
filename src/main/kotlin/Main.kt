package mid.vet

import java.util.*

fun main(args: Array<String>) {
    if (System.getProperty("os.name").lowercase(Locale.getDefault()) != "linux") {
        println("Sorry, but the script does not work correctly on your system")
        /* So far, this script only works correctly on Linux distributions */
    }

    return if ("--all" in args) {
        outputInformation("all")
    } else {
        outputInformation("")
    }
}