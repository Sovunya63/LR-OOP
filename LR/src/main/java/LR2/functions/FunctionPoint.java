package LR2.functions;

public class FunctionPoint {
    double x, y;

    FunctionPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    FunctionPoint(FunctionPoint point) {
        this.x = point.x;
        this.y = point.y;
    }

    FunctionPoint() {
        this.x = 0;
        this.y = 0;
    }

}
