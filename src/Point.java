public class Point {
    //instance vars
    private int x;
    private int y;

    //constructors
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int value) {
        x = value;
        y = value;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    //getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //setters
    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }

    public String quadrant() {
        if (x == 0 && y == 0) {
            return "origin";
        } else if (x > 0 && y > 0) {
            return "I";
        } else if (x < 0 && y > 0) {
            return "II";
        } else if (x < 0 && y < 0) {
            return "III";
        } else if (x > 0 && y < 0) {
            return "IV";
        } else {
            return "on an axis";
        }

    }
}
