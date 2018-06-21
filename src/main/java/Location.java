
public  class Location {
    char direction_on_compass;
    private int x_coordinate;
    private  int y_coordinate;


     Location(int x_coordinate, int y_coordinate, char direction_on_compass) throws IllegalArgumentException {
         if (x_coordinate > 5 || y_coordinate > 5 || x_coordinate < 0 || y_coordinate < 0) {
             throw new IllegalArgumentException();
         } else {
             this.direction_on_compass = direction_on_compass;
             this.x_coordinate = x_coordinate;
             this.y_coordinate = y_coordinate;
         }
     }


    public  Location north(char command) {
         if(command == 'R') {
             return new Location(x_coordinate, y_coordinate,'E');
         }

        if(command == 'L') {
            return new Location(x_coordinate, y_coordinate, 'W');
        }

        if(command == 'M')
            return new Location(x_coordinate, y_coordinate + 1, direction_on_compass);

        return this;
    }

    public  Location south(char command) {
        if(command == 'R') {
            return new Location(x_coordinate, y_coordinate, 'W');
        }

        if(command == 'L') {
            return new Location(x_coordinate, y_coordinate, 'E');

        }

        if(command == 'M')
            return new Location(x_coordinate, y_coordinate - 1, direction_on_compass);

        return this;
    }

    public  Location east(char command) {
        if(command == 'R') {
            return new Location(x_coordinate, y_coordinate,'S');
        }

        if(command == 'L') {
            return new Location(x_coordinate, y_coordinate, 'N');

        }
        if(command == 'M')
            return new Location(x_coordinate + 1, y_coordinate , direction_on_compass);

        return this;
    }

    public  Location west(char command) {
        if(command == 'R') {
            return new Location(x_coordinate, y_coordinate, 'N');
        }

        if(command == 'L') {
            return new Location(x_coordinate, y_coordinate, 'S');

        }

        if(command == 'M')
            return new Location(x_coordinate - 1, y_coordinate , direction_on_compass);

        return this;
    }


     Location(char direction_on_compass) {
        this.direction_on_compass = direction_on_compass;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return direction_on_compass == location.direction_on_compass;
    }


    @Override
    public String toString() {
        return "Location{" +
                "direction_on_compass=" + direction_on_compass +
                ", x_coordinate=" + x_coordinate +
                ", y_coordinate=" + y_coordinate +
                '}';
    }
}

