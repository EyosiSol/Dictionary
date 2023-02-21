import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

class Dictionary extends JFrame implements ActionListener{
    JFrame Design;
    JTextField Searchbar;
    JLabel Label;
    JTextArea WORDS2;
    JScrollPane SP;
    JList<Elements> list = new JList<>();
    DefaultListModel<Elements> model = new DefaultListModel<>();
    public static class Elements {
        String elements;
        public Elements(String elements) {
            this.elements = elements;
        }
        @Override
        public String toString() {
            return elements;
        }
    }
    Dictionary(){
        list.setModel(model);
        list.setFont(new Font("Nyala", Font.BOLD,25));

        ///adding the hashmap keys into the wordss arraylist
        ArrayList<String> WORDSS = new ArrayList<>(); //array list
        words wo = new words();
        HashMap<String,String> Hashmap = wo.addToDictionary();
        for(Map.Entry<String,String> word : Hashmap.entrySet()) {
            String key = word.getKey();
            WORDSS.add(key);
            }
        Collections.sort(WORDSS);  //this line of code will sort the array list in alphabet order

        //below will add the arrayList elements to the Jlist for it to be displayed in the GUI
        for(int i=0;i <WORDSS.size();i++){
            model.addElement(new Elements(WORDSS.get(i)));
        }

        //a mouse listner for the Jlist so it can do the hashmap iteration//
        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    String val = String.valueOf(list.getSelectedValue());
                    words wo = new words(); //object from the words class
                    HashMap<String, String> newHashMap; //a hashmap variable
                    newHashMap = wo.addToDictionary(); //
                    for (Map.Entry<String, String> word : newHashMap.entrySet()) {
                        String key = word.getKey();
                        String value = word.getValue();
                        if (key.equals(val.toLowerCase().trim())) {
                            WORDS2.setText(">>"+key + " ማለት: " + value);
                        }
                    }
                }
            }
        });
        list.setBackground(new Color(170,170,170));
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String val = String.valueOf(list.getSelectedValue());//store the selected word (arsenic)
                words wo = new words(); //we created an object using the "words" hashmap class
                HashMap<String, String> newHashMap;// an empty hashmap variable
                newHashMap = wo.addToDictionary(); // assigning the addtodictionary method of the words class in the empty hashmap
                for (Map.Entry<String, String> word : newHashMap.entrySet()) {
                    String key = word.getKey();
                    String value = word.getValue();
                    if (key.equals(val.toLowerCase().trim())) {
                        WORDS2.setText(">>" + key + " ማለት: " + value);
                    }
                }
            }
        });
        ImageIcon ImageIC = new ImageIcon("icons8-dictionary-48.png");
        ImageIcon ImageBG = new ImageIcon("BGnew.png");

        Label = new JLabel(ImageBG);
        Label.setSize(900,540);
        Label.setVisible(true);
        Font Myfont = new Font("Arial",Font.BOLD,20);
        Searchbar = new JTextField("Search");
        Searchbar.setFont(Myfont);
        Searchbar.setForeground(Color.BLACK);
        Searchbar.setBackground(new Color(175,175,175));
        Searchbar.setEditable(true);
        Searchbar.setBorder(new LineBorder(Color.GRAY));
        Searchbar.setBounds(362,60,330,32);
        Searchbar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                words wo = new words(); //object wo is being created from the class words
                HashMap<String, String> newHashMap; // creating a hashmap variable
                newHashMap = wo.addToDictionary(); //assigning the addtoDictionary method from class words
                for(Map.Entry<String, String> word : newHashMap.entrySet()) {
                    String key = word.getKey();
                    String value = word.getValue();
                    if (key.equals(Searchbar.getText().toLowerCase().trim())) {
                        WORDS2.setText(">>" + key + " ማለት: " + value);
                        Searchbar.setText("");
                    }
                }
            }
        });
        Searchbar.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(Searchbar.getText().equals("Search")){
                    Searchbar.setText(""); } }
            @Override
            public void focusLost(FocusEvent e) {
                if(Searchbar.getText().equals("")){
                    Searchbar.setText("Search");
                }
            }
        });
        Searchbar.addKeyListener(new KeyListener() { //the search system
            @Override
            public void keyTyped(KeyEvent e) {
                String str = Searchbar.getText().toLowerCase().trim();
                str += e.getKeyChar();
                String s;

                for(int i=0; i< model.size(); i++){
                    s = String.valueOf(model.getElementAt(i)); //it will take the ith element of the Jlist and store to i in string form
                    s = s.toLowerCase();
                    if(s.startsWith(str)){
                        list.setSelectedIndex(i);
                        JScrollBar sb = SP.getVerticalScrollBar();
                        sb.setValue(i*29);
                        return;
                    }
                }
                WORDS2.setText("Not Found!");
                list.clearSelection();
            }
            @Override
            public void keyPressed(KeyEvent e) { }
            @Override
            public void keyReleased(KeyEvent e) { }
        });
        WORDS2 = new JTextArea(">>.......");
        WORDS2.setFont(new Font("Power Geez Unicode1",Font.BOLD,18));
        WORDS2.setBorder(new LineBorder(Color.LIGHT_GRAY));
        WORDS2.setBounds(498,168,330,300);
        WORDS2.setBackground(new Color(170,170,170));
        WORDS2.setEditable(false);

        SP = new JScrollPane(list);
        SP.setBounds(57,168,330,300);
        SP.setBorder(new LineBorder(Color.LIGHT_GRAY));
        SP.setForeground(new Color(170,170,170));
        SP.setVisible(true);

        Design = new JFrame("English to Amharic Dictionary(Sample) ");
        Design.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Design.setSize(900,545);
        Design.setIconImage(ImageIC.getImage()); //setting the ICON OF THE GUI
        Design.setLocationRelativeTo(null);
        Design.setResizable(false);
        Design.setVisible(true);

        Label.add(Searchbar);
        Label.add(SP);
        Label.add(WORDS2);


        Design.add(Label);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
public class Main {
    public static void main(String[] args) {
            try{
                Dictionary Diction = new Dictionary();
            } catch (Exception e){
                e.printStackTrace();
            }
    }
}
