public class Main {
    public static void main(String[] args) {
        Point point = new Point(1.2f,1.3f);
        System.out.println(point);
        point.setX(1.4f);
        point.setY(1.5f);
        float[] arr = point.getXY();
        for (float a : arr
             ) {
            System.out.println(a + "\t");
        }
        System.out.println(point);
        // moveable point
        MoveablePoint mP = new MoveablePoint(2.1f,2.2f,2.3f,2.4f);
        System.out.println(mP);
        mP.setSpeed(3.1f,3.2f);
        float[] arr1 = mP.getSpeed();
        for (float b : arr1
             ) {
            System.out.print(b + "\t");
        }
        System.out.println(mP);
        System.out.println(mP.moveablePoint());
    }
}
