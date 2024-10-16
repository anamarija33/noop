package pckg_snd;

public class CompareTWO <T extends Comparable<T>>{
    private T fst;
    private T snd;

    public CompareTWO(T fst, T snd){
        this.fst = fst;
        this.snd = snd;
    }

    // metoda nema parametre, jer su parametri vec definirani u konstruktoru
    public void compareTwo(){
        if(fst.compareTo(snd) > 0){
            System.out.println("First is greater than second" );
        }else if(fst.compareTo(snd) < 0){
            System.out.println("First is smaller than second" );
        }else{
            System.out.println("First is equal to second ") ;
        }
    }



}
