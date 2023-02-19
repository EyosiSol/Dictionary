import DICTIONARY.DictionaryClass;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import static java.awt.Font.BOLD;

class Dictionary extends JFrame implements ActionListener {
    JFrame Design;
    JTextField Searchbar;
    JTextArea WORDS;

    JButton Buttons;
    JPanel Panel;
    JLabel Label;
    JTextField Translate;
    JTextArea WORDS2;

    Font myFont = new Font("Nyala", BOLD,15);
    JScrollBar SB;
    JScrollPane SP;

    JList<Elements> list = new JList<Elements>();
    DefaultListModel<Elements> model = new DefaultListModel<>();

    Dictionary(){
        list.setModel(model);
        list.setFont(new Font("Nyala", BOLD,25));
        model.addElement(new Elements("acute"));
        model.addElement(new Elements("almighty"));
        model.addElement(new Elements("apostacy"));
        model.addElement(new Elements("asperity"));
        model.addElement(new Elements("assignee "));
        model.addElement(new Elements("arsenic"));
        model.addElement(new Elements("abase"));
        model.addElement(new Elements("ache"));

        list.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Elements El = list.getSelectedValue();
                 Searchbar.setText(String.valueOf(El));

            }
        });

        ImageIcon ImageIC = new ImageIcon("icons8-dictionary-48.png");
        ImageIcon ImageBG = new ImageIcon("BG.png");
        Label = new JLabel(ImageBG);
        Label.setSize(910,630);
        Label.setBackground(new Color(125,70,77,0));
        Label.setVisible(true);

        Searchbar = new JTextField("Search");
        Searchbar.setFont(new Font("Power Geez Unicode1", BOLD,20));
        Searchbar.setForeground(Color.GRAY);
        Searchbar.setEditable(true);
        Searchbar.setBounds(35,123,280,47);
        Searchbar.addActionListener(this::actionPerformed);

        Searchbar.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(Searchbar.getText().equals("Search")){
                    Searchbar.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(Searchbar.getText().equals("")){
                    Searchbar.setText("Search");
                }

            }
        })
        ;

        Translate = new JTextField("ትርጉም፦");
        Translate.setFont(new Font("Nyala",BOLD,30));
        Translate.setBounds(470,123,384,50);
        Translate.setEditable(false);

        WORDS = new JTextArea();
        WORDS.setBounds(35,170,380,373);
        WORDS.setEditable(false);
        //WORDS.setBackground(new Color(125,70,77,100));

        WORDS2 = new JTextArea("MEANING");
        WORDS2.setFont(new Font("Power Geez Unicode1",BOLD,20));
        WORDS2.setBounds(467,170,390,373);
        WORDS2.setEditable(false);
        //WORDS2.setBackground(new Color(125,70,77,100));

        Buttons = new JButton("Search");
        Buttons.setBounds(310,123,110,46);
        Buttons.setFont(new Font("Arial",BOLD,20));
        //Buttons.setVisible(true);
        //Buttons.setFocusable(false);
        //Buttons.setBackground(new Color(125,70,77,100));
        Buttons.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    words wo = new words();
                    HashMap<String,String> newHashMap = new HashMap<>();
                    newHashMap =wo.addToDictionary();
                    for(Map.Entry<String,String> word : newHashMap.entrySet()){
                        String key = word.getKey();
                        String value = word.getValue();
                        if(key.equals(Searchbar.getText().toLowerCase().trim())){
                            WORDS2.setText(key + " Means: "+ value);
                            Searchbar.setText("");
                        }else if(value.equals(Searchbar.getText().toLowerCase().trim())){
                            WORDS2.setText(key+" Means: "+ key);
                            Searchbar.setText("");
                        }
                    }
            }
        });
       // Buttons.



        //SB = new JScrollBar();
        //SB.setBounds(389,170,30,373);

        SP = new JScrollPane(list);
        SP.setBounds(35,170,380,373);




        Design = new JFrame("Amharic ");

        Design.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Design.setSize(910,630);
        Design.setIconImage(ImageIC.getImage());
        //Design.getContentPane().setBackground(Image.getImage());
        Design.setLocationRelativeTo(null);
        Design.setResizable(false);
        Design.setVisible(true);

        Label.add(Buttons);
        Label.add(Searchbar);
        Label.add(SP);
        Label.add(WORDS);
        Label.add(WORDS2);
        Label.add(Translate);


        Design.add(Label);

        //Design.add(Searchbar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        words wo = new words();
        HashMap<String,String> newHashMap;
        newHashMap =wo.addToDictionary();
        for(Map.Entry<String,String> word : newHashMap.entrySet()){
            String key = word.getKey();
            String value = word.getValue();
            if(key.equals(Searchbar.getText().toLowerCase().trim())){
                WORDS2.setText("Means:"+ value);
                //Searchbar.setText("");
            }else if(value.equals(Searchbar.getText().toLowerCase().trim())){
                WORDS2.setText("Means:"+ key);
            }

        }
        }

    public class Elements {
        String elements;
        public Elements(String elements) {
            this.elements = elements;
        }
        public String getElements() {
            return elements;
        }
        public void setElements(String elements) {
            this.elements = elements;
        }

        @Override
        public String toString() {
            return elements;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                     Dictionary Dic = new Dictionary();
                     TextField Txt = new TextField();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}
