package pckg_2d_drawing;

public class ShapeFillColorDecorator extends ShapeDecorator{
    private SHAPECOLOR color;
    protected ShapeFillColorDecorator(BasicShape shape, SHAPECOLOR color) {
        super(shape);
        this.color = color;
    }

    @Override
    protected void decorateShape() {
        System.out.println("Decorating : " + this.basicShape +" with decorator: "+this.getClass().getSimpleName());
        System.out.println("Setting some fill color: "+this.color);
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing decorated: "+this.basicShape+" With decoration "+this.getClass().getSimpleName());
        System.out.println("setting color: "+this.color);
    }

    @Override
    public void resize() {
        System.out.println("Resizing decorated : " +this.getClass().getSimpleName());
    }

    @Override
    public String description() {
        return this.toString();
    }

    @Override
    public boolean isHidden() {
        return this.basicShape.isHidden();
    }

    @Override
    public void shapeName(String name) {
        System.out.println("shape name: "+this.basicShape + " decorated with name: " + name);
    }

    @Override
    public String toString() {
        return "ShapeFillColorDecorator{" +
                "basicShape=" + basicShape +
                "color=" + color +
                '}';
    }
}
