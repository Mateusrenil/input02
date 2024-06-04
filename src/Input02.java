import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Neymar é good",
                "",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Quem é melhor pedro ou bernardo",
                "isso ou aquilo",
                2,
                null,
                null,
                "Quem é melhor.");
        
        
        String[] acceptableValues = {"bernardo ", " pedro ", "ben10"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Quem tem o melhor carreira?",
                "Pergunta seria",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
