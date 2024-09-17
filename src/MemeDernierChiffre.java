public class MemeDernierChiffre {
    /*
    Écrivez une méthode nommée hasSameLastDigit avec trois paramètres de type int.

Chaque nombre doit être compris dans la plage de 10 (inclus) à 1000 (inclus). Si l’un des nombres n’est pas dans cette plage, la méthode doit retourner false.

La méthode doit retourner true si au moins deux des nombres partagent le même dernier chiffre ; sinon, elle doit retourner false.

EXEMPLES D’ENTRÉES/SORTIES :

	•	hasSameLastDigit(41, 22, 71); → devrait retourner true car 1 est le dernier chiffre des nombres 41 et 71.
	•	hasSameLastDigit(23, 32, 42); → devrait retourner true car 2 est le dernier chiffre des nombres 32 et 42.
	•	hasSameLastDigit(9, 99, 999); → devrait retourner false car 9 n’est pas dans la plage de 10 à 1000.

Écrivez une autre méthode nommée isValid avec un paramètre de type int.

La méthode doit retourner true si le paramètre du nombre est dans la plage de 10 (inclus) à 1000 (inclus), sinon, elle doit retourner false.

EXEMPLES D’ENTRÉES/SORTIES :

	•	isValid(10); → devrait retourner true car 10 est dans la plage de 10 à 1000.
	•	isValid(468); → devrait retourner true car 468 est dans la plage de 10 à 1000.
	•	isValid(1051); → devrait retourner false car 1051 n’est pas dans la plage de 10 à 1000.

REMARQUE : Toutes les méthodes doivent être définies comme public static, comme nous l’avons fait jusqu’à présent dans le cours.

REMARQUE : N’ajoutez pas de méthode main dans le code de la solution.
     */
    public static boolean hasSameLastDigit(int nombre1, int nombre2, int nombre3) {
        //verifier si un des nombres n'est pas dans l'intervale souhaité
        if(!isValid(nombre1) || !isValid(nombre2) || !isValid(nombre3)){
            return false;
        }
        //prendre le dernier chiffre de chaque nombre et l'affecter à une variable
        int dernierChiffre1 = nombre1%10;
        int dernierChiffre2 = nombre2%10;
        int dernierChiffre3 = nombre3%10;

        //verifier si au moins deux chiffre sur trois sont identique
        return  (dernierChiffre1 == dernierChiffre2)||
                (dernierChiffre1 == dernierChiffre3)||
                (dernierChiffre2 == dernierChiffre3);
    }

    public static boolean isValid(int nombre){
        return nombre >= 10 && nombre <= 1000;
    }

    public static void main(String[] args) {
        // tests
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }
}
