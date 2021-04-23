package pl.camp.it;

public class RecursionOne {
    public static void main(String[] args) {
        String name = "ania";
        System.out.println((RecursionOne.recursion(name)));
    }

    public static String recursion(String word) {
        String wordRComlete;
        String wordR;
        String letter;
        StringBuilder sb = new StringBuilder();
        if (word.length() == 1) {
            wordR = (word.substring(word.length()));
            sb.append(wordR);
            return sb.toString();
        }

        letter = word.substring(word.length() - 1);
        sb.append(letter);
        wordRComlete = sb.toString();

        wordR = word.substring(0, word.length() - 1);
        recursion(wordR);

        return wordRComlete;
    }
}

/*for (int i = 0; i <= word.length(); i++) {
            letter = (word.charAt(word.length() - 1));
            System.out.print(letter);

            word.leng
        }*/

//1)mamy stringa - chcemy go zapisać odwrtnie
//2)bierzemy pętlę i zapisujemy w do nowej talicy ostatni znak ze stringa na pierwsze miejsce
