import javax.swing.*;

public class NumberDialog {
    public static void showDays(String[] args) {
        int creditDays = 30;
        JOptionPane.showMessageDialog(null, "" + creditDays);
        JOptionPane.showMessageDialog(null, "Every bill is due in " + creditDays + " days");

    }
}
