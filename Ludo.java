// Anas :)
class Ludo {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        var player1 = 0;
        var player2 = 0;

        int pointP1 = 0;
        int pointP2 = 0;

        int ekstraPoint = 5;

        // P L A Y E R   -   1
        while (true) {
            System.out.println("________________________________________");
            scanner.nextLine(); // Tryk ENTER for at starte
            System.out.println("[P L A Y E R   1] - Kast terningerne!");
            scanner.nextLine(); // Trykker ENTER for kast

            int terning1Player1 = kastTerning(); 
            int terning2Player1 = kastTerning(); 

            System.out.println("Terning 1: " + terning1Player1);
            System.out.println("Terning 2: " + terning2Player1);

            if (terning1Player1 == terning2Player1) {
                System.out.println("Terningerne er ens!");
            } else {
                System.out.println("Terningerne er ikke ens.");
            }

            int sumP1 = terning1Player1 + terning2Player1;
            System.out.println("Summen af terningerne er: " + sumP1);

            if (terning1Player1 == terning2Player1) {
                pointP1 = pointP1 + ekstraPoint;
                System.out.println("Du far hermed +5 ekstra point!");
            }

            pointP1 = sumP1 + pointP1;
            System.out.println("Player 1 har nu [" + pointP1 + " POINT].");

            if (pointP1 >= 40) {
                System.out.println("PLAYER 1 WINS!");
                break;
            }




            // P L A Y E R   -   2
            System.out.println("________________________________________");
            scanner.nextLine(); // Tryk ENTER for at starte
            System.out.println("[P L A Y E R   2] - Kast terningerne!");
            scanner.nextLine(); // Trykker ENTER for kast

            int terning1Player2 = kastTerning(); 
            int terning2Player2 = kastTerning(); 

            System.out.println("Terning 1: " + terning1Player2);
            System.out.println("Terning 2: " + terning2Player2);

            if (terning1Player2 == terning2Player2) {
                System.out.println("Terningerne er ens!");
            } else {
                System.out.println("Terningerne er ikke ens.");
            }

            int sumP2 = terning1Player2 + terning2Player2;
            System.out.println("Summen af terningerne er: " + sumP2);

            if (terning1Player2 == terning2Player2) {
                pointP2 = pointP2 + ekstraPoint;
                System.out.println("Du far hermed +5 ekstra point!");
            }

            pointP2 = sumP2 + pointP2;
            System.out.println("Player 2 har nu [" + pointP2 + " POINT].");

            if (pointP2 >= 40) {
                System.out.println("PLAYER 2 WINS!");
                break;
            }
        }
    }
    public static int kastTerning() {
        return (int)(Math.random() * 6 + 1);
    }
}