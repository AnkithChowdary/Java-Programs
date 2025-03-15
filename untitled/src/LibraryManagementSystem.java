//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.io.*;
//import java.util.ArrayList;
//
//class Book implements Serializable {
//    private String id;
//    private String name;
//    private String author;
//    private double price;
//
//    public Book(String id, String name, String author, double price) {
//        this.id = id;
//        this.name = name;
//        this.author = author;
//        this.price = price;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    @Override
//    public String toString() {
//        return "ID: " + id + ", Name: " + name + ", Author: " + author + ", Price: $" + price;
//    }
//}
//
//class LibraryManager {
//    private ArrayList<Book> books;
//    private String filename;
//
//    public LibraryManager(String directory) {
//        this.filename = directory + File.separator + "books.txt";
//        books = new ArrayList<>();
//        loadBooks();
//    }
//
//    public void addBook(Book book) {
//        books.add(book);
//        saveBooks();
//    }
//
//    public ArrayList<Book> getBooks() {
//        return books;
//    }
//
//    private void saveBooks() {
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
//            oos.writeObject(books);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void loadBooks() {
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
//            books = (ArrayList<Book>) ois.readObject();
//        } catch (IOException | ClassNotFoundException e) {
//            // If file doesn't exist or empty, do nothing
//        }
//    }
//
//    public boolean lendBook(String id) {
//        for (Book book : books) {
//            if (book.getId().equals(id)) {
//                books.remove(book);
//                saveBooks();
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public ArrayList<Book> searchBook(String keyword) {
//        ArrayList<Book> searchResults = new ArrayList<>();
//        for (Book book : books) {
//            if (book.getId().equalsIgnoreCase(keyword) || book.getName().toLowerCase().contains(keyword.toLowerCase())) {
//                searchResults.add(book);
//            }
//        }
//        return searchResults;
//    }
//}
//
//class LibraryGUI {
//    private JFrame frame;
//    private JPanel panel;
//    private JButton addBookButton, lendBookButton, searchBookButton;
//    private LibraryManager libraryManager;
//
//    public LibraryGUI() {
//        String directory = "C:\\Users\\ankit\\Documents"; // Change this to your desired directory
//        libraryManager = new LibraryManager(directory);
//        prepareGUI();
//    }
//
//    private void prepareGUI() {
//        frame = new JFrame("Library Management System");
//        frame.setSize(400, 300);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        panel = new JPanel();
//        frame.add(panel);
//        placeComponents(panel);
//
//        frame.setVisible(true);
//    }
//
//    private void placeComponents(JPanel panel) {
//        panel.setLayout(new GridLayout(3, 1));
//
//        addBookButton = new JButton("Add Book");
//        addBookButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                new AddBookFrame(libraryManager);
//            }
//        });
//        panel.add(addBookButton);
//
//        lendBookButton = new JButton("Lend Book");
//        lendBookButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                new LendBookFrame(libraryManager);
//            }
//        });
//        panel.add(lendBookButton);
//
//        searchBookButton = new JButton("Search Book");
//        searchBookButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                new SearchBookFrame(libraryManager);
//            }
//        });
//        panel.add(searchBookButton);
//    }
//}
//
//class AddBookFrame extends JFrame {
//    private JTextField idField, nameField, authorField, priceField;
//    private JButton addButton;
//    private LibraryManager libraryManager;
//
//    public AddBookFrame(LibraryManager libraryManager) {
//        this.libraryManager = libraryManager;
//        setTitle("Add Book");
//        setSize(300, 200);
//        setLayout(new GridLayout(5, 2));
//
//        add(new JLabel("ID:"));
//        idField = new JTextField();
//        add(idField);
//
//        add(new JLabel("Name:"));
//        nameField = new JTextField();
//        add(nameField);
//
//        add(new JLabel("Author:"));
//        authorField = new JTextField();
//        add(authorField);
//
//        add(new JLabel("Price:"));
//        priceField = new JTextField();
//        add(priceField);
//
//        addButton = new JButton("Add");
//        addButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                String id = idField.getText();
//                String name = nameField.getText();
//                String author = authorField.getText();
//                double price = Double.parseDouble(priceField.getText());
//                Book book = new Book(id, name, author, price);
//                libraryManager.addBook(book);
//                JOptionPane.showMessageDialog(null, "Book added successfully!");
//                dispose();
//            }
//        });
//        add(addButton);
//
//        setVisible(true);
//    }
//}
//
//class LendBookFrame extends JFrame {
//    private JTextField idField;
//    private JButton lendButton;
//    private LibraryManager libraryManager;
//
//    public LendBookFrame(LibraryManager libraryManager) {
//        this.libraryManager = libraryManager;
//        setTitle("Lend Book");
//        setSize(300, 100);
//        setLayout(new GridLayout(2, 2));
//
//        add(new JLabel("Enter Book ID:"));
//        idField = new JTextField();
//        add(idField);
//
//        lendButton = new JButton("Lend");
//        lendButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                String id = idField.getText();
//                boolean success = libraryManager.lendBook(id);
//                if (success) {
//                    JOptionPane.showMessageDialog(null, "Book with ID " + id + " has been lent.");
//                } else {
//                    JOptionPane.showMessageDialog(null, "Book with ID " + id + " not found!");
//                }
//            }
//        });
//        add(lendButton);
//
//        setVisible(true);
//    }
//}
//
//class SearchBookFrame extends JFrame {
//    private JTextField searchField;
//    private JButton searchButton;
//    private JTextArea resultArea;
//    private LibraryManager libraryManager;
//
//    public SearchBookFrame(LibraryManager libraryManager) {
//        this.libraryManager = libraryManager;
//        setTitle("Search Book");
//        setSize(400, 300);
//        setLayout(new BorderLayout());
//
//        JPanel searchPanel = new JPanel();
//        searchPanel.setLayout(new FlowLayout());
//
//        searchField = new JTextField(20);
//        searchPanel.add(searchField);
//
//        searchButton = new JButton("Search");
//        searchButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                String keyword = searchField.getText();
//                ArrayList<Book> searchResults = libraryManager.searchBook(keyword);
//                resultArea.setText("");
//                if (searchResults.isEmpty()) {
//                    resultArea.append("No books found matching the keyword '" + keyword + "'.");
//                } else {
//                    for (Book book : searchResults) {
//                        resultArea.append(book.toString() + "\n");
//                    }
//                }
//            }
//        });
//        searchPanel.add(searchButton);
//        add(searchPanel, BorderLayout.NORTH);
//
//        resultArea = new JTextArea();
//        resultArea.setEditable(false);
//        JScrollPane scrollPane = new JScrollPane(resultArea);
//        add(scrollPane, BorderLayout.CENTER);
//
//        setVisible(true);
//    }
//}
//
//public class LibraryManagementSystem {
//    public static void main(String[] args) {
//        new LibraryGUI();
//    }
//}
//
//
