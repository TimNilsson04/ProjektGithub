import javax.swing.*;

public class Hangman {
    public static void main(String[] args) {

        String word = (JOptionPane.showInputDialog("Write the word that is going to be guessed."));


        char[] hiddenLetters = createHiddenWord(word);
          char[] showingLetters = createShowingWord(word);

        System.out.println(createHiddenWord(word));
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


    public static void guessing(char hiddenLetters, char showingLetters) {

        String guess = (JOptionPane.showInputDialog("Write your guess."));

        if (showingLetters == guess);

        hiddenLetters =
}
}

