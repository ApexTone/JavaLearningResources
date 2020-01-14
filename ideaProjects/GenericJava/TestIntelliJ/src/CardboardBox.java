public class CardboardBox {
    private double width, height, length;

    public CardboardBox(){
    }
    public CardboardBox(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.length = d;
    }

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}
