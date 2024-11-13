package pckg_translate;

import javax.naming.directory.InvalidAttributesException;

public class AppTestTranslator {
    public static void main(String[] args) {
        Translator translator = new Translator();

        try {
            translator.setChoice(22);
            translator.translate("Hello");
        } catch (InvalidAttributesException e) {
            System.out.println(e.getMessage());
        }
    }
}
