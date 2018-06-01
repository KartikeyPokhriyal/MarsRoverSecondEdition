 public class Player {

    public static void main(String[] args) {
        Plateau roverPlateau = new Plateau(5,5);

        MarsRover marsRover = new MarsRover(new Location(1,2,'N'));

        System.out.println(marsRover.follow("LMLMLMLMM"));

        MarsRover marsRover2 = new MarsRover(new Location(3,3,'E'));

        System.out.println(marsRover2.follow("MMRMMRMRRM"));
    }
}
