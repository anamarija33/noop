package pckg_2d_drawing;

public class Test2dDrawing {
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.drawShape();
        ShapeFillColorDecorator shapeFillColorDecorator = new ShapeFillColorDecorator(circle, SHAPECOLOR.Yellow);
        shapeFillColorDecorator.drawShape();
        System.out.println(shapeFillColorDecorator);
        ShapeLineColorDecorator shapeLineColorDecorator = new ShapeLineColorDecorator(shapeFillColorDecorator, SHAPECOLOR.Red);

        shapeLineColorDecorator.drawShape();
        System.out.println(shapeLineColorDecorator);

        BasicShape basicShape = new LineStyleDecorator(new ShapeLineColorDecorator(new ShapeFillColorDecorator(new Circle(), SHAPECOLOR.Blue), SHAPECOLOR.Green), LINESTYLE.DOT);
        basicShape.drawShape();


    }
}
