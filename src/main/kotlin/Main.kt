 val listOfAllCountry = listOf<String>(
    "Qatar",
    "Ecuador",
    "Senegal",
    "Netherlands",
    "England",
    "IR Iran",
    "USA",
    "Wales",
    "Argentina",
    "Saudi Arabia",
    "Mexico",
    "Poland",
    "France",
    "Australia",
    "Denmark",
    "Tunisia",
    "Spain",
    "Costa Rica",
    "Germany",
    "Japan",
    "Belgium",
    "Canada",
    "Morocco",
    "Croatia",
    "Brazil",
    "Serbia",
    "Switzerland",
    "Cameroon",
    "Portugal",
    "Ghana",
    "Uruguay",
    "Korea Republic")

fun main() {
    println(listOfAllCountry())
    println(knockOut().toMutableList())
}

fun listOfAllCountry(): MutableList<String> {
    val allCountry = listOfAllCountry as MutableList<String>
    return allCountry
}

 fun knockOut(): MutableList<String> {
     val teamOut = listOf<String>(
         "Qatar",
         "Ecuador",
         "Senegal",
         "Netherlands",
         "IR Iran",
         "USA",
         "Wales",
         "Saudi Arabia",
         "Poland",
         "Australia",
         "Tunisia",
         "Costa Rica",
         "Germany",
         "Canada",
         "Morocco",
         "Serbia",
         "Cameroon",
         "Ghana",
         "Korea Republic"
     )

     val newTeam = listOf<String>(
         "Russia",
         "Sweden",
         "Colombia"
     ) as MutableList<String>

     val newTeams = listOfAllCountry as MutableList<String>
     newTeams.add(newTeam.toMutableList().toString())
     newTeams.remove(teamOut.toMutableList().toString())
     return newTeams
 }

fun listOfQuarterFinalists(){
    val countryLists = listOfAllCountry as MutableList<String>
    //countryLists.remove()
}

fun listOfFinalists(){}