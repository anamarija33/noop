package pckg_translate;

import javax.naming.directory.InvalidAttributesException;

public class Translator {
    private int choice;
    private final EnglishTranslator englishTranslator;
    private final FrenchTranslator frenchTranslator;

    public Translator(){
        System.out.println("CRO to ENG and CRO to FR translator");
        englishTranslator = new EnglishTranslator();
        frenchTranslator = new FrenchTranslator();
    }

    public void setChoice(int choice){
        this.choice = choice;
    }

    public void translate(String text) throws InvalidAttributesException {
        switch(choice) {
            case 1:{
                englishTranslator.translateText(text);
            }break;
            case 2:{
                frenchTranslator.translate(text);
            }break;
            default:
                throw new InvalidAttributesException("Invalid choice. Expected 1 or 2");
        }
    }
}
