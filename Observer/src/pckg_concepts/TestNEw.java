package pckg_concepts;

public class TestNEw {
    public static void main(String[] args) {
        String text = "Ovo je neki tekst koji treba prevesti";
        TranslatorNew translator = new TranslatorNew();
        translator.setTranslate(new ENTranslate());
        translator.translateText(text);

        translator.setTranslate(new FRTranslate());
        translator.translateText(text); 
    }
}
