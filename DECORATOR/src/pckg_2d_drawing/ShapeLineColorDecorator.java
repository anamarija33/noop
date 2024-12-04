package pckg_2d_drawing;

public class ShapeLineColorDecorator extends ShapeDecorator{
    private SHAPECOLOR lineColor;
    protected ShapeLineColorDecorator(BasicShape shape, SHAPECOLOR lineColor) {
        super(shape);
        this.lineColor = lineColor;
    }
    // not standard practice with decorator pattern
    // samo kroz konstruktore* se može postaviti dekorator
    // može bit na usmenom
    public void setShapeToDecorate(BasicShape shape) {
        this.basicShape = shape;
    }

    @Override
    protected void decorateShape() {
        System.out.println("Decorating: "+this.basicShape+ "with color: "+this.lineColor);
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing: "+this.basicShape+ "decorated with: "+getClass().getSimpleName());
        System.out.println("Line color: "+this.lineColor);
    }

    @Override
    public void resize() {
        System.out.println("Resizing: "+this.basicShape+ "decorated with: "+getClass().getSimpleName());
    }

    @Override
    public String description() {
        return this.toString();
    }

    @Override
    public boolean isHidden() {
        return false;
    }

    @Override
    public void shapeName(String name) {
        System.out.println("Decorated shape name: " + name);
    }

    @Override
    public String toString() {
        return "ShapeLineColorDecorator{" +
                "basicShape=" + basicShape +
                "lineColor=" + lineColor +
                '}';
    }
}
