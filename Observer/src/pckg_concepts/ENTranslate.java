package pckg_concepts;

public class ENTranslate implements Translate {
    @Override
    public void translate(String text) {
        System.out.println(getClass().getSimpleName() + " translating ");
        System.out.println("To translate this: \n"+text);
        System.out.println("Translated to EN");

    }
}
