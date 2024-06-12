import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

class Book {
    String id;
    String title;
    boolean isBorrowed;

    Book(String id, String title) {
        this.id = id;
        this.title = title;
        this.isBorrowed = false;
    }

    String borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            return title + " has been borrowed.";
        } else {
            return title + " is already borrowed.";
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Is Borrowed? " + isBorrowed;
    }
}

public class LibraryGUI extends JFrame {
    private ArrayList<Book> books = new ArrayList<>();
    private DefaultListModel<String> bookListModel = new DefaultListModel<>();
    private JList<String> bookList = new JList<>(bookListModel);
    private JTextField idField = new JTextField(10);
    private JTextField titleField = new JTextField(10);

    public LibraryGUI() {
        setTitle("Library Management System");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new JLabel("Book ID:"));
        add(idField);
        add(new JLabel("Book Title:"));
        add(titleField);
        JButton addButton = new JButton("Add Book");
        add(addButton);
        addButton.addActionListener(new AddBookListener());

        JScrollPane scrollPane = new JScrollPane(bookList);
        add(scrollPane);

        JButton borrowButton = new JButton("Borrow Book");
        add(borrowButton);
        borrowButton.addActionListener(new BorrowBookListener());

        setVisible(true);
    }

    private class AddBookListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String id = idField.getText();
            String title = titleField.getText();
            books.add(new Book(id, title));
            bookListModel.addElement(title + " (ID: " + id + ")");
            idField.setText("");
            titleField.setText("");
        }
    }

    private class BorrowBookListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = bookList.getSelectedIndex();
            if (selectedIndex != -1) {
                Book selectedBook = books.get(selectedIndex);
                JOptionPane.showMessageDialog(LibraryGUI.this,
                        selectedBook.borrowBook());
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LibraryGUI();
            }
        });
    }
}
