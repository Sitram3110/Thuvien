package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class NonEditableTableExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Non-Editable JTable Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JTable table = new JTable();
            DefaultTableModel model = new DefaultTableModel(
                    new Object[][] {
                            { "Data 1", "Data 2" },
                            { "Data 3", "Data 4" }
                    },
                    new Object[] { "Column 1", "Column 2" });

            table.setModel(model);

            // Set the cell editor to null to make all cells non-editable
            table.setDefaultEditor(Object.class, null);

            JScrollPane scrollPane = new JScrollPane(table);

            frame.add(scrollPane);
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}