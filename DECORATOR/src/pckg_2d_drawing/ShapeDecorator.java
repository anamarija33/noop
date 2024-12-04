package pckg_2d_drawing;

public abstract class ShapeDecorator implements BasicShape {
// apstraktna klasa koja implementira sučelje ne forsira implementaciju metoda, jer klasa koja naslijedi ovu klasu mora implementirati metode
    protected BasicShape basicShape;

    protected ShapeDecorator(BasicShape shape) {
        this.basicShape = shape;
    }

    protected abstract void decorateShape();

}
