public class find_word_in_sentence {

    public static void main(String[] args) {

        //Given string
        String A = " Hi Ashish how are you!";
        String B = " Its bean long time seeing you";
        String C = " Ashish is 21 years old";

        // Finding String on the give String

        String toFind = "Ashish";

        //contains inbuild function

        System.out.println("A "+A.contains(toFind));
        System.out.println("B "+B.contains(toFind));
        System.out.println("C "+C.contains(toFind));


    }

}
