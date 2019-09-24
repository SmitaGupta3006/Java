public class Point {

    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        int x0 = 0;
        int y0 = 0;
        return distance(x0, y0);
    }

    public double distance(int x, int y){
        double d = Math.sqrt(((x - this.x)*(x - this.x))
                          + ((y - this.y) * (y - this.y)));
        return d;
    }

    public double distance(Point another){
        return distance(another.x, another.y);
    }
}
