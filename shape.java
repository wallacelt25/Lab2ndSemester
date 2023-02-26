abstract class shape {
    String color;
    abstract int getArea();
    public shape(String color){
        this.color = color;
    }

}

class Rectangle extends shape {
    int width;
    int height;
    public Rectangle(int width, int height, String color){
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public int getArea(){
        return this.height*this.width;
    }
}

class Area {
    public static void main(String[] args){
        Rectangle constructor = new Rectangle(60, 60, "Area");
        System.out.print(constructor.getArea());
    }
}
