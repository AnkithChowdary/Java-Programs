import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class SurveyApp extends JFrame implements ActionListener {
    private final String[] categories = {"AC", "Mobile Phone", "Laptop"};
    private final String[][] models = {
            {"AC Model 1", "AC Model 2", "AC Model 3", "AC Model 4", "AC Model 5"},
            {"Mobile Model 1", "Mobile Model 2", "Mobile Model 3", "Mobile Model 4", "Mobile Model 5"},
            {"Laptop Model 1", "Laptop Model 2", "Laptop Model 3", "Laptop Model 4", "Laptop Model 5"}
    };
    private final Map<String, Integer> scores = new HashMap<>();
    private int userCount = 0;

    public SurveyApp() {
        super("Product Survey");
        setLayout(new FlowLayout());

        JComboBox<String> categoryBox = new JComboBox<>(categories);
        add(categoryBox);

        JPanel modelPanel = new JPanel(new GridLayout(5, 1));
        ButtonGroup modelGroup = new ButtonGroup();
        JRadioButton[] modelButtons = new JRadioButton[5];
        for (int i = 0; i < 5; i++) {
            modelButtons[i] = new JRadioButton("Model " + (i + 1));
            modelGroup.add(modelButtons[i]);
            modelPanel.add(modelButtons[i]);
        }
        add(modelPanel);

        JButton submitButton = new JButton("Submit Rating");
        add(submitButton);

        categoryBox.addActionListener(e -> {
            int index = categoryBox.getSelectedIndex();
            for (int i = 0; i < 5; i++) {
                modelButtons[i].setText(models[index][i]);
            }
        });

        submitButton.addActionListener(e -> {
            for (int i = 0; i < 5; i++) {
                if (modelButtons[i].isSelected()) {
                    scores.merge(models[categoryBox.getSelectedIndex()][i], 1, Integer::sum);
                    break;
                }
            }
            userCount++;
            if (userCount >= 5) {
                displayResults();
            }
        });

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void displayResults() {
        StringBuilder results = new StringBuilder("Survey Results:\n");
        scores.forEach((key, value) -> results.append(key).append(": ").append(value).append("\n"));
        JOptionPane.showMessageDialog(null, results.toString());
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Placeholder for potential future actions
    }

    public static void main(String[] args) {
        new SurveyApp();
    }
}
