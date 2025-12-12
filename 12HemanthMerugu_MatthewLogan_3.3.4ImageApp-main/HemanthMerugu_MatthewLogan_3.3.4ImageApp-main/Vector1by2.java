public class Vector1by2 {

    private double topNum;
    private double bottomNum;

    public Vector1by2(double num1, double num2) {
        topNum = num1;
        bottomNum = num2;

    }
    
    public double dotProduct(Vector1by2 vector1, Vector1by2 vector2) {
        double result = vector1.topNum * vector2.topNum + vector1.bottomNum * vector2.bottomNum;
        return result;
    }

    public double getTopNum() {
        return this.topNum;
    }

    public double getBottomNum() {
        return this.bottomNum;
    }
    
    public void setTopNum(double newValue) {
        this.topNum = newValue;
    }

    public void setBottomNum(double newValue) {
        this.bottomNum = newValue;
    }

    
}
