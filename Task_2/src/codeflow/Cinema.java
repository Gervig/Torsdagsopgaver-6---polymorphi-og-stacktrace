package codeflow;

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {    // #1 der manglede at blive printet "0" på alle pladserne først
        this.seats = new String[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                this.seats[i][j] = "O";
            }
        }
        this.seats[0][0] = "X";     // #2 reservationen skal ske til sidst
    }
    public int getRows() {
        return seats.length;
    }
    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    public int getSeats() {
        return seats[0].length;
    }
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {     // #3 fiksede at reservationen findes i arrayet
        row -= 1;   // så vi ikke tæller fra 0
        seat -= 1;
        if (row >= 0 && row < getRows()-1 && seat >= 0 && seat < getSeats()-1 && seats[row][seat].equals("O")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }
    public boolean cancelReservation(int row, int seat) {
        row -= 1;   // så vi ikke tæller fra 0
        seat -= 1;
        if (row >= 0 && row < getRows()-1 && seat >= 0 && seat < getSeats()-1 && seats[row][seat].equals("X")) {     // #4 lille "x"
            seats[row][seat] = "O";     //  #5 tal 0 skulle være bogstav O
            return false;
        }
        return true;
    }
@Override
    public String toString() {
        String result = "";     // #6 ?  string må ikke være null, satte en tom string ind ""
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}