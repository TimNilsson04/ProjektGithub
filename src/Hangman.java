import javax.swing.*;

public class Hangman {
    public static void main(String[] args) {

        String word = (JOptionPane.showInputDialog("Word?"));


        char[] hiddenLetters = createHiddenWord(word);
        char[] showingLetters = createShowingWord(word);

        System.out.println(createHiddenWord(word));
        System.out.println(guessing(hiddenLetters, showingLetters));
    }


    private static char[] createHiddenWord(String word) {

        int length = word.length();

        char[] letters = new char[length];

        for (int i = 0; i < length; i++) {

            letters[i] = '_';   //word.charAt(i);

        }

        return letters;
    }

    private static char[] createShowingWord(String word) {

        int length = word.length();

        char[] showingletters = new char[length];

        for (int i = 0; i < length; i++) {

        }
        return showingletters;
    }


    public static char[] guessing(char[] hiddenLetters, char[] showingLetters) {
        String showingword = new String(showingLetters);
        String hiddenword = new String(hiddenLetters);
        String guess = (JOptionPane.showInputDialog("Write your guess."));

        if (showingword.contains(guess)) {


            for (int i = 0; i < showingword.length(); i++) {

                if (showingword.charAt(i) == guess.charAt(0)) {

                    hiddenLetters[i] = guess.charAt(0);

                }

            }
        }
        return hiddenLetters;
    }
}

