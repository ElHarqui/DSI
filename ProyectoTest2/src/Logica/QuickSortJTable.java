package Logica;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class QuickSortJTable {
    public static void quickSort(String[][] data, int low, int high, int column) {
        if (low < high) {
            int pi = partition(data, low, high, column);
            quickSort(data, low, pi - 1, column);
            quickSort(data, pi + 1, high, column);
        }
    }

    private static int partition(String[][] data, int low, int high, int column) {
        String pivot = data[high][column];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (data[j][column].compareToIgnoreCase(pivot) < 0) {
                i++;
                swap(data, i, j);
            }
        }
        swap(data, i + 1, high);
        return i + 1;
    }

    private static void swap(String[][] data, int i, int j) {
        String[] temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void sortJTable(JTable table, int columnIndex) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();
        int colCount = model.getColumnCount();

        String[][] data = new String[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                data[i][j] = model.getValueAt(i, j).toString();
            }
        }

        quickSort(data, 0, rowCount - 1, columnIndex);

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                model.setValueAt(data[i][j], i, j);
            }
        }
    }
}
