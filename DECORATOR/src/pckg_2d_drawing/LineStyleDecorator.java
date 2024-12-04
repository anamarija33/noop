package pckg_2d_drawing;

public class LineStyleDecorator extends ShapeDecorator{

    private LINESTYLE style;
    protected LineStyleDecorator(BasicShape shape, LINESTYLE style) {
        super(shape);
        this.style = style;
    }

    @Override
    protected void decorateShape() {
        System.out.println("Decorating: "+this.basicShape+ "with style: "+this.style);
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing: "+this.basicShape+ "decorated with: "+getClass().getSimpleName());
        System.out.println("Line style: "+this.style);
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
        return "LineStyleDecorator{" +
                "style=" + style +
                ", basicShape=" + basicShape +
                '}';
    }
}
