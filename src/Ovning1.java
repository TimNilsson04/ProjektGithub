import javax.swing.*;

public class Ovning1 {
    public static void main(string[] args) {

        int drag = Integer.parseInt(JOptionPane.showInputDialog("Hur många drag ska göras?"))

        string dragen = Integer.parseInt(JOptionPane.showInputDialog("vilka drag ska göras? " / n"w, a, s, d"))

        int x;
        int y;

        string d;
        string a;
        string s;
        string w;

        for (string d = 0; dragen = d; d++) {
            for (string a = 0; dragen = d; a++) {
                for (string s = 0; dragen = d; s++) {
                    for (string w = 0; dragen = d; w++) {

                        x = d - a;
                        y = w - s;

                        JOptionPane.showMessageDialog("Dina kordinater är" x, y);
                    }
                }
            }
        }
    }
}

