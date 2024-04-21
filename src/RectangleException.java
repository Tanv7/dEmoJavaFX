public class RectangleException {

    int x,y;
    String color;
    public RectangleException(int x, int y) throws Exception {
        Exception e = new Exception();
        if (x<0 || y<0) throw e;
        this.x = x;
        this.y = y;
    }

    public RectangleException(int x, int y, String color) throws Exception {
        Exception e = new Exception();
        if (x<0 || y<0) throw e;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int area(){
        return x*y;
    }
}
