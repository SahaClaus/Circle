public class Circle {
    public static void main(String[] args) {
        double circleRadius1 = 5;
        double circleArea1 = Math.PI * Math.pow(circleRadius1, 2);
        double circlePerimeter1 = 2 * Math.PI * circleRadius1;

        System.out.printf("Площадь круга при радиусе равном %.2f: %.2f%n%n", circleRadius1, circleArea1);
        System.out.printf("Периметр круга при радиусе равном %.2f: %.2f%n%n", circleRadius1, circlePerimeter1);

        double circleArea2 = 95;
        double circleRadius2 = Math.sqrt(circleArea2 / Math.PI);

        System.out.printf("Радиус круга при площади круга равной %.2f: %.2f%n%n", circleArea2, circleRadius2);

        double angle3 = 120;
        double circleRadius3 = 5;
        double sectorArea3 = (Math.PI * Math.pow(circleRadius3, 2) * angle3) / 360;

        System.out.printf("Площадь сектора круга при радиусе равном %.2f и угле %.2f: %.2f%n", circleRadius3, angle3, sectorArea3);
    }
}
