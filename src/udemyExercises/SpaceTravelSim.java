package udemyExercises;
import java.util.Random;

public class SpaceTravelSim {


        public void spaceTravelSimulator() {
            // Declare and initialize a 2D array representing sectors in space
            String[][] spaceGrid = {
                    {"Empty", "Asteroids", "Planet"},
                    {"Alien Ship", "Empty", "Space Station"},
                    {"Comet", "Black Hole", "Empty"}
            };

            // Display the initial state of the space grid
            //TODO
            displayGrid(spaceGrid);

            // Simulate traveling through space by visiting random sectors
            //TODO
            System.out.println("Starting space travel...");

            int totalEvents = 5;
            for (int i = 0; i < totalEvents; i++) {
                Random random = new Random();
                // Get random row index
                int row = random.nextInt(spaceGrid.length);
                // Get random column index
                int col = random.nextInt(spaceGrid[row].length);
                //TODO

                System.out.println("Visiting sector [" + row + "][" + col + "]: " + spaceGrid[row][col]);
            }

            System.out.println();

            // Calculate the number of "Empty" sectors
            //TODO
            System.out.println("Total empty sectors: " + countEmptySectors(spaceGrid));

            // Find the largest "event" (based on ASCII comparison) in the space grid
            //TODO
            System.out.println("Largest event in space grid: " + findLargestEvent(spaceGrid));
        }

        // Method to display the space grid
        public void displayGrid(String[][] grid) {
            //TODO
            System.out.println("Space Grid:");
            for (String[] row : grid) {
                for (String event : row) {
                    System.out.print(event + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Method to count the number of "Empty" sectors in the space grid
        public int countEmptySectors(String[][] grid) {
            //TODO
            int count = 0;
            for (String[] row : grid) {
                for (String event: row) {
                    if (event.equals("Empty")) {
                        count++;
                    }
                }
            }

            return count;
        }

        // Method to find the largest event in the space grid (lexicographically)
        public String findLargestEvent(String[][] grid) {
            //TODO
            String largest = grid[0][0];

            for (String[] row : grid) {
                for (String event : row) {
                    if (event.compareTo(largest) > 0) {
                        largest = event;
                    }
                }
            }

            return largest;
        }
}

