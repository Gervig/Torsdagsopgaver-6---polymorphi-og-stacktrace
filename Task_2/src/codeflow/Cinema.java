package codeflow;

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {    // der manglede at blive printet "0" på alle pladserne først
        this.seats = new String[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                this.seats[i][j] = "0";
            }
        }
        this.seats[0][0] = "X";     // reservationen skal ske til sidst
    }
    public int getRows() {
        return seats.length;
    }
    public int getSeats() {
        return seats[0].length;
    }
    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {     // fiksede at reservationen findes i arrayet
        if (row >= 0 && row < getRows() && seat >= 0 && seat < getSeats() && seats[row][seat].equals("0")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }
    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) {     // lille "x"
            seats[row][seat] = "0";
            return true;
        }
        return false;
    }
@Override
    public String toString() {
        String result = "";
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