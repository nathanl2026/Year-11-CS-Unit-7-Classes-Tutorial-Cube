public class Cube {

    private int side; //properties

    public Cube(){
        side = 1;
    }

    public Cube(int i) {
        if(i<1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        else {
            side = i;
        }
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        this.side = side;
    }

    public int getSurfaceArea() {
        return (side*side)*6;
    }

    public int getVolume() {
        return side*side*side;
    }

    @Override

    public String toString() {
        return "Cube{side=" + side + "}";
    }


//Cube{side=4}

}
