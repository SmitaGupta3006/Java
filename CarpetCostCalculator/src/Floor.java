public class Floor {
    private double width;
    private double length;

    public Floor(double length, double width)
    {
        if(length < 0 || width < 0){
         length = 0;
         width = 0;
    }else{
            this.length = length;
            this.width = width;
    }
    }

    public double getArea(){
        double area = this.length * this.width;
        return area;
    }

}