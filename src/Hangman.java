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

            showingletters[i] = word.charAt(i);

        }
        return showingletters;
    }


    public static String guessing(char[] hiddenLetters, char[] showingLetters) {
        String showingword = new String(showingLetters);
        String hiddenword = new String(hiddenLetters);
        String guess = (JOptionPane.showInputDialog("Write your guess."));
        int life = 11;
        String NewLife;
        String Win;
        String Lose;
        char[] LetterList = new char[10 + showingLetters.length];
        int a = 0;

        while (hiddenword.contains("_")){

            if (showingword.contains(guess)) {

                if (guess.length() > 1) {

                    for (int  i= 0; i < showingword.length(); i++) {

                        if (showingword.charAt(i) == guess.charAt(i)) {

                            hiddenLetters[i] = guess.charAt(i);

                        }
                    }
                } else if (guess.length() > 0) {


                    for (int i = 0; i < showingword.length(); i++) {

                        if (showingword.charAt(i) == guess.charAt(0)) {

                            hiddenLetters[i] = guess.charAt(0);

                        }

                    }
                }
            }
                else{
                    life = life - 1;

                }

                    LetterList[a] = guess.charAt(0);
                    a++;


                NewLife = "You have " + life +" turns left";
                System.out.println(hiddenLetters);
                System.out.println(NewLife);
                System.out.println(LetterList);

            Win = "Congratulations You Win!!!";
            Lose = "You Lose";

            hiddenword = new String(hiddenLetters);

            if(hiddenword.equals(showingword)){
                System.out.println(Win);
                System.exit(0);
            }

            if(life < 1){
                System.out.println(Lose);
                System.exit(0);
            }


            guess = (JOptionPane.showInputDialog("Write your guess."));


        }

        return hiddenword;

    }
}

