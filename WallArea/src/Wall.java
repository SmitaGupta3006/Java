public class Wall {

    private double width;
    private double height;

    public Wall() {
        this(0.0 , 0.0);
    }

    public Wall(double width, double height) {
       this.setWidth(width);
       this.setHeight(height);
    }

    public double getWidth() {
        if (width < 0) {
           return  width = 0;
        } else {
            return width;
        }
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        if (height < 0) {
            return height = 0;
        } else {
            return height;
        }
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
       double area = width * height;
       return area;
    }
}

