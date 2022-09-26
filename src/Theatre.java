public class Theatre {
  int hallNum;
  int[] takenSeats;
  int[][] availableSeats = { // display for seat selection (3 arrays encapped inside availableSeats array)
    //  ========= movie screen =========
    // Standard Class Seats
    {101,102,103,104,105,106,107,108,109,110,
      111,112,113,114,115,116,117,118,119,120,
      121,122,123,124,125,126,127,128,129,130},
    // Premiere Class Seats
    {201,202,203,204,205,206,207,208,209,210,
      211,212,213,214,215,216,217,218,219,220,
      221,222,223,224,225,226,227,228,229,230},
    // Gold Class Seats
    {301,302,303,304,305,306,307,308,309,310,
      311,312,313,314,315,316,317,318,319,320,
      321,322,323,324,325,326,327,328,329,330}
  };   

  public Theatre(int hallNum) { // Constructor
      this.hallNum = hallNum;
  }


	public void displaySeats() {
		// display movie screen
		System.out.println("████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░████████");
		System.out.println("████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░ Movie Screen ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░████████");
		System.out.println("████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░████████");

		System.out.println("████████                                                                                 ████████");
		System.out.println("████████╔═══════════════════════════════════════════════════════════════════════════════╗████████");

		// display seats
		for (int row = 0; row < 3; row++) { // 3 rows are the 3 sections of seats
			for (int col = 0; col < 30; col++) { // 30 columns are the 30 elements (seats) per section

				if (col == 0 || col == 10 || col == 20) { // spaces out the 1st, 11th and 21st column of every class
					System.out.printf("%8s", "████████"); // spaceout
				}

				System.out.printf("║%5s", availableSeats[row][col]); // displaying each element from seat_num array, one at a time
				System.out.printf("%2s", ""); // spaceout

				if (row == 2 && col == 29) { // formatting. When in the last row and last seat
					System.out.printf("%8s", "║████████"); // spaceout
					System.out.println("\n████████╚═══════════════════════════════════════════════════════════════════════════════╝████████");
				} else if (col == 9 || col == 19 || col == 29) { // formatting. Dividers at the 10th, 20th and 30th element of each class
					System.out.printf("%8s", "║████████"); // spaceout
					System.out.println("\n████████╬═══════╬═══════╬═══════╬═══════╬═══════╬═══════╬═══════╬═══════╬═══════╬═══════╬████████");
				}
			} 
		}
	
	}
	@Override
	public String toString() {
		return "hallNum=" + hallNum;
	}
}
