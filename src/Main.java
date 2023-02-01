import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//  Groepsopdracht
//  Euro/Dollar converter
//      Ik ga een programma schrijven dat de waarde van de euro omzet naar dollars en andersom.
//  Zoek koers euro/dollar op
//      De koers van de euro t.o.v. de dollar is vandaag (woensdag 1 februari 2023):
//      1 euro == 1,0897 dollar
//      1 dollar == 0,9177 euro
//  Maak een nieuw project aan in IntelliJ
//      Project is aangemaakt: dit project, CurrencyConverterOpdracht
//  Creëer enkele variabelen binnen de main-methode om informatie op te slaan over:
//      De huidige koers, het euro-bedrag en het dollar-bedrag

double euro = 1.08965;
double dollar = 0.9177;
double euroAmount = 1;
double dollarAmount = 1;
double euroConverted = euroAmount * dollar;
double dollarConverted = dollarAmount * euro;

//  Print de gegevens op het scherm met behulp van System.out.println()

        System.out.println("Hieronder een aantal regels waarin de resultaten worden weergegeven op basis van vaste (hardcoded) waardes");
        System.out.println("");
        System.out.println("De koers van de euro is op 1 februari 2023 " + euro);
        System.out.println("Dat betekent dat " + euroAmount + " euro een waarde heeft van " + dollarConverted + " dollar.");
//
        System.out.println("");
        System.out.println("De koers van de dollar is op 1 februari 2023 " + dollar);
        System.out.println("Dat betekent dat " + dollarAmount + " dollar een waarde heeft van " + euroConverted + " euro.");

//  Bonus: Zorg voor gebruikersinvoer via het Scanner-object
//      Gebruikersinvoer doen we me de scanner class
        System.out.println("");
        System.out.println("Hieronder ga ik invoer van de gebruiker vragen, om daarmee aan de slag te gaan.");
//      Als eerste vraag ik hoeveel euro's de gebruiker wil omrekenen:
        Scanner inputEuro = new Scanner(System.in); // Scanner object creëren
        System.out.println("Voer het aantal euro's in dat je hebt:");
        double userEuroEntry = inputEuro.nextDouble();
        euroConverted = userEuroEntry * euro;
        System.out.println("Je hebt ingevoerd " + userEuroEntry + " euro");
        System.out.println(userEuroEntry + " euro komt overeen met " + euroConverted + " dollar");
        Scanner inputDollar = new Scanner(System.in); // Tweede Scanner object creëren
        System.out.println("");
        System.out.println("Voer nu in hoeveel dollars je hebt: ");
        double userDollarEntry = inputDollar.nextDouble();
        dollarConverted = userDollarEntry * dollar;
        System.out.println("");
        System.out.println("Je hebt ingevoerd dat je " + userDollarEntry + " dollars hebt");
        System.out.println(userDollarEntry + " komt overeen met " + dollarConverted + " euro");
        System.out.println("");
        System.out.println("Heel goed. Je hebt nu gewerkt met invoer van een gebruiker.");
        System.out.println("Tijd ome en stapje verder te gaan: een keuzemenu");
// We bouwen een keuzemenu
        Boolean keepRunning = true;
        while  (keepRunning) {

        System.out.println("");
        System.out.println("Maak een keuze uit de volgende opties:");
        System.out.println("(1) Ik wil euro's omzetten naar dollars");
        System.out.println("(2) Ik wil dollars omzetten naar euro's");
        System.out.println("(X) Ik wil stoppen");
        System.out.println("");
//  Als het menu is opgebouwd, gaan we de gebruiker om input vragen
        Scanner menuOptionEntry = new Scanner(System.in); // New Scanner object aanmaken
        System.out.println("Voer je keuze (1, 2, X) in: ");
        String menuOptionSelected = menuOptionEntry.nextLine();
//  De gebruiker heeft een keuze gemaakt. We lopen nu door de keuzes heen.
        if (menuOptionSelected.equals("1")) {
            System.out.println(menuOptionSelected);
            System.out.println("Oke, je wil euro's omzetten in dollars.");
            System.out.println("Hoeveel euro's heb je?");
            userEuroEntry = inputEuro.nextDouble();
            euroConverted = userEuroEntry * euro;
            System.out.println("Je hebt ingevoerd dat je " + userEuroEntry + " euro's hebt. Dat komt overeen met " + euroConverted + " dollars");
        } else if (menuOptionSelected.equals("2")) {
            System.out.println("Oke, je wil dollars omzetten in euro's.");
            System.out.println("Hoeveel dollars heb je?");
            userDollarEntry = inputDollar.nextDouble();
            dollarConverted = userDollarEntry * dollar;
            System.out.println("Je hebt ingevoerd dat je " + userDollarEntry + " dollars hebt. Dat komt overeen met " + dollarConverted + " euro's");
        } else if (menuOptionSelected.equals("X")) {
            System.out.println("Oke, je wil stoppen.");
            System.out.println("Ik wens je nog een fijne dag");
            keepRunning = false;
        } else {
            System.out.println("Die invoer herken ik niet, sorry.");
        }

        }


    }
}