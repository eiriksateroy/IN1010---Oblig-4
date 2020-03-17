import java.util.Scanner;
class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nHovedmeny: \n0: Skriv ut elementer" //Lag 1
        + "\n1: Legge til nye elementer \n2: Bruk resept \n3: Skriv ut statistikk"
        + "\n4: Skrive alle lagrede data til fil");
        int svar = input.nextInt();

        while (svar >= 0) {
            if (svar == 0) { //Lag2
                System.out.println("\nDette er funksjonen for aa skrive ut alle elementene\n"); //Midlertidig

                System.out.println("\nHovedmeny: \n0: Skriv ut elementer" //Bolk for aa loope tilbake til hovedmenyen
                + "\n1: Legge til nye elementer \n2: Bruk resept \n3: Skriv ut statistikk"
                + "\n4: Skrive alle lagrede data til fil");
                svar = input.nextInt();
            }

            else if (svar == 1) { //Lag 2
                System.out.println("\nHva onsker du aa legge til? \n0: Lege \n1: Pasient"
                + "\n2: Resept \n3: Legemiddel");
                int svar2 = input.nextInt();

                if (svar2 == 0) {       //Lag 2.2 - Lege
                    input.nextLine(); //Maa ha med dette for at String input skal leses etter Int input
                    System.out.println("\nNavn paa legen: ");
                    String navn = input.nextLine();
                    System.out.println("\nKontrollnummer (vanlig lege, 0): ");
                    int kontrollnummer =  input.nextInt();

                    if (kontrollnummer == 0) {
                        Lege lege = new Lege(navn);
                        //Og ogsaa legge til legen i lista
                    }

                    else {
                        Spesialister spes = new Spesialister(navn, kontrollnummer);
                        //Og ogsaa legge til legen i lista
                    }

                    System.out.println("Dette legger til en lege"); //Midlertidig
                }

                else if (svar2 == 1) {  //Lag 2.2 - Pasient
                    input.nextLine();
                    System.out.println("\nNavn paa pasient: ");
                    String navn = input.nextLine();
                    System.out.println("\nFodselsnummer: ");
                    String fodselsnummer = input.nextLine();

                    Pasient pasient = new Pasient(navn, fodselsnummer);
                    //Og ogsaa legge til pasienten i lista

                    System.out.println("Dette legger til en Pasient");//Midlertidig
                }

                else if (svar2 == 2) {  //Lag 2.2
                    System.out.println("Dette legger til en Resept");//Midlertidig
                }

                else if (svar2 == 3) {  //Lag 2.2 - Legemiddel
                    input.nextLine();
                    System.out.println("\nHvilken type legemiddel? \n0: Vanlig"
                    + "\n1: Narkotisk \n2: Vanedannende");
                    int type = input.nextInt();
                    input.nextLine();
                    System.out.println("\nNavn paa legemiddel: ");
                    String navn = input.nextLine();
                    System.out.println("\nPris (double): ");
                    Double pris = input.nextDouble();
                    System.out.println("\nVirkstoffmengde (double): ");
                    Double virkestoffmengde = input.nextDouble();
                    System.out.println("\nStyrke (int). Vanlig legemiddel, 0 ");
                    int styrke = input.nextInt();

                    if (type == 0) {
                        Vanlig vanlig = new Vanlig(navn, pris, virkestoffmengde);
                        //Og ogsaa legger til legemiddlet i lista
                    }

                    else if (type == 1) {
                        Narkotisk narkotisk = new Narkotisk(navn, pris, virkestoffmengde, styrke);
                        //Og ogsaa legger til legemiddlet i lista
                    }

                    else if (type == 2) {
                        Vanedannende vanedannende = new Vanedannende(navn, pris, virkestoffmengde, styrke);
                        //Og ogsaa legger til legemiddlet i lista
                    }
                    System.out.println("Dette legger til ett legemiddel");//Midlertidig
                }

                else {                  //Lag 2.2 - Feil input
                    System.out.println("Feil input. Begynner paa nytt\n");

                    System.out.println("\nHovedmeny: \n0: Skriv ut elementer" //Bolk for aa loope tilbake til hovedmenyen
                    + "\n1: Legge til nye elementer \n2: Bruk resept \n3: Skriv ut statistikk"
                    + "\n4: Skrive alle lagrede data til fil");
                    svar = input.nextInt();
                }

                System.out.println("\nHovedmeny: \n0: Skriv ut elementer" //Bolk for aa loope tilbake til hovedmenyen
                + "\n1: Legge til nye elementer \n2: Bruk resept \n3: Skriv ut statistikk"
                + "\n4: Skrive alle lagrede data til fil");
                svar = input.nextInt();
            }

            else if (svar == 2) { // Lag 2
                System.out.println("\nDette er funksjonen for aa bruke resepter\n");

                System.out.println("\nHovedmeny: \n0: Skriv ut elementer" //Bolk for aa loope tilbake til hovedmenyen
                + "\n1: Legge til nye elementer \n2: Bruk resept \n3: Skriv ut statistikk"
                + "\n4: Skrive alle lagrede data til fil");
                svar = input.nextInt();
            }

            else if (svar == 3) { //Lag 2
                System.out.println("\nDette er funksjonen for aa skrive ut statistikk\n");

                System.out.println("\nHovedmeny: \n0: Skriv ut elementer" //Bolk for aa loope tilbake til hovedmenyen
                + "\n1: Legge til nye elementer \n2: Bruk resept \n3: Skriv ut statistikk"
                + "\n4: Skrive alle lagrede data til fil");
                svar = input.nextInt();
            }

            else if (svar == 4) { //Lag 2
                System.out.println("\nDette er funksjonen for aa skrive ut alle data til fil\n");

                System.out.println("\nHovedmeny: \n0: Skriv ut elementer" //Bolk for aa loope tilbake til hovedmenyen
                + "\n1: Legge til nye elementer \n2: Bruk resept \n3: Skriv ut statistikk"
                + "\n4: Skrive alle lagrede data til fil");
                svar = input.nextInt();
            }

            else { //Lag 2
                System.out.println("Feil input. Begynner paa nytt\n");


                System.out.println("\nHovedmeny: \n0: Skriv ut elementer" //Bolk for aa loope tilbake til hovedmenyen
                + "\n1: Legge til nye elementer \n2: Bruk resept \n3: Skriv ut statistikk"
                + "\n4: Skrive alle lagrede data til fil");
                svar = input.nextInt();

            }
        }
    }
}
