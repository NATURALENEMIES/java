package ch7;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 求点与p点间距离
    public double distance(Point p) {
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }

    // 求点与（x,y）点间距离
    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    // 求x、y两点间距离
    public static double distance(Point x, Point y) {
        return Math.sqrt((x.x - y.x) * (x.x - y.x) + (x.y - y.y) * (x.y - y.y));
    }
}

public class wds2 {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);

        // 测试public double distance(Point p)
        double dist1 = p1.distance(p2);
        System.out.println("点p1与p2的距离: " + dist1);

        // 测试public double distance(int x,int y)
        double dist2 = p1.distance(3, 4);
        System.out.println("点p1与(3, 4)的距离: " + dist2);

        // 测试public static double distance(Point x,Point y)
        double dist3 = Point.distance(p1, p2);
        System.out.println("点p1与p2通过静态方法计算的距离: " + dist3);
    }
}