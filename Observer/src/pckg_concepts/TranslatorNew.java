package pckg_concepts;

public class TranslatorNew {
    private Translate translate;

    public void setTranslate(Translate translate) {
        this.translate = translate;
    }

    public void translateText(String text) {
        translate.translate(text);
    }


}
