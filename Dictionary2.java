import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import static java.awt.Font.BOLD;
class Dictionary extends JFrame implements ActionListener {
    
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
        list.setFont(new Font("Nyala", BOLD,25));
        model.addElement(new Elements("acute"));
        model.addElement(new Elements("almighty"));
        model.addElement(new Elements("apostasy"));
        model.addElement(new Elements("asperity"));
        model.addElement(new Elements("assignee"));
        model.addElement(new Elements("arsenic"));
        model.addElement(new Elements("abase"));
        model.addElement(new Elements("ability"));
        model.addElement(new Elements("ache"));
        model.addElement(new Elements("advisory"));
        model.addElement(new Elements("aback"));
        model.addElement(new Elements("abasement"));
        model.addElement(new Elements("abbey"));
        model.addElement(new Elements("abject"));
        model.addElement(new Elements("abnormal"));
        model.addElement(new Elements("abolition"));
        model.addElement(new Elements("abstract"));
        model.addElement(new Elements("absolutely"));
        model.addElement(new Elements("absurd"));
        model.addElement(new Elements("absolute"));
        model.addElement(new Elements("band dog"));
        model.addElement(new Elements("bile"));
        model.addElement(new Elements("bogey"));
        model.addElement(new Elements("brain wash"));
        model.addElement(new Elements("broken hearted"));
        model.addElement(new Elements("bull headed"));
        model.addElement(new Elements("bulldog"));
        model.addElement(new Elements("bum"));
        model.addElement(new Elements("beggar"));
        model.addElement(new Elements("back"));
        model.addElement(new Elements("bag"));
        model.addElement(new Elements("bacteria"));
        model.addElement(new Elements("bandit"));
        model.addElement(new Elements("bankrupt"));
        model.addElement(new Elements("barren"));
        model.addElement(new Elements("bear"));
        model.addElement(new Elements("beach"));
        model.addElement(new Elements("beard"));
        model.addElement(new Elements("behold"));
        model.addElement(new Elements("calve"));
        model.addElement(new Elements("camp"));
        model.addElement(new Elements("canon"));
        model.addElement(new Elements("canton"));
        model.addElement(new Elements("certify"));
        model.addElement(new Elements("char"));
        model.addElement(new Elements("chisel"));
        model.addElement(new Elements("civilly"));
        model.addElement(new Elements("claw"));
        model.addElement(new Elements("conductor"));
        model.addElement(new Elements("dough"));
        model.addElement(new Elements("duke"));
        model.addElement(new Elements("demolish"));
        model.addElement(new Elements("denounce"));
        model.addElement(new Elements("density"));
        model.addElement(new Elements("despoil"));
        model.addElement(new Elements("destiny"));
        model.addElement(new Elements("dim"));
        model.addElement(new Elements("dish"));
        model.addElement(new Elements("display"));
        model.addElement(new Elements("expose"));
        model.addElement(new Elements("expressive"));
        model.addElement(new Elements("each"));
        model.addElement(new Elements("eager"));
        model.addElement(new Elements("eagerness"));
        model.addElement(new Elements("eagle"));
        model.addElement(new Elements("earache"));
        model.addElement(new Elements("early"));
        model.addElement(new Elements("earmark"));
        model.addElement(new Elements("earn"));
        model.addElement(new Elements("earring"));
        model.addElement(new Elements("ease"));
        model.addElement(new Elements("fab"));
        model.addElement(new Elements("fabrication"));
        model.addElement(new Elements("facile"));
        model.addElement(new Elements("fact"));
        model.addElement(new Elements("fade"));
        model.addElement(new Elements("federate"));
        model.addElement(new Elements("felicity"));
        model.addElement(new Elements("feel for"));
        model.addElement(new Elements("filter"));
        model.addElement(new Elements("fit"));
        model.addElement(new Elements("gab"));
        model.addElement(new Elements("gate"));
        model.addElement(new Elements("gifted"));
        model.addElement(new Elements("gird on"));
        model.addElement(new Elements("glad"));
        model.addElement(new Elements("glare"));
        model.addElement(new Elements("glunch"));
        model.addElement(new Elements("go together"));
        model.addElement(new Elements("grace"));
        model.addElement(new Elements("grand"));
        model.addElement(new Elements("habit"));
        model.addElement(new Elements("hack"));
        model.addElement(new Elements("hat"));
        model.addElement(new Elements("heave"));
        model.addElement(new Elements("hero"));
        model.addElement(new Elements("hesitate"));
        model.addElement(new Elements("highland"));
        model.addElement(new Elements("hire"));
        model.addElement(new Elements("hock"));
        model.addElement(new Elements("hook"));
        model.addElement(new Elements("ice"));
        model.addElement(new Elements("ignoble"));
        model.addElement(new Elements("ignite"));
        model.addElement(new Elements("ill"));
        model.addElement(new Elements("ignore"));
        model.addElement(new Elements("impairment"));
        model.addElement(new Elements("inadequate"));
        model.addElement(new Elements("inevitable"));
        model.addElement(new Elements("injury"));
        model.addElement(new Elements("inspire"));
        model.addElement(new Elements("jab"));
        model.addElement(new Elements("judge"));
        model.addElement(new Elements("junk"));
        model.addElement(new Elements("jail"));
        model.addElement(new Elements("jest"));
        model.addElement(new Elements("jinks"));
        model.addElement(new Elements("join"));
        model.addElement(new Elements("journeyer"));
        model.addElement(new Elements("junior"));
        model.addElement(new Elements("junction"));
        model.addElement(new Elements("keen"));
        model.addElement(new Elements("keep"));
        model.addElement(new Elements("keg"));
        model.addElement(new Elements("kennel"));
        model.addElement(new Elements("key"));
        model.addElement(new Elements("kick"));
        model.addElement(new Elements("kid"));
        model.addElement(new Elements("kill"));
        model.addElement(new Elements("killjoy"));
        model.addElement(new Elements("kin"));
        model.addElement(new Elements("kind"));
        model.addElement(new Elements("kindle"));
        model.addElement(new Elements("king"));
        model.addElement(new Elements("kingdom"));
        model.addElement(new Elements("kite"));
        model.addElement(new Elements("kitten"));
        model.addElement(new Elements("knee"));
        model.addElement(new Elements("knock"));
        model.addElement(new Elements("knoll"));
        model.addElement(new Elements("knot"));
        model.addElement(new Elements("knowledge"));
        model.addElement(new Elements("label"));
        model.addElement(new Elements("labor"));
        model.addElement(new Elements("lack"));
        model.addElement(new Elements("lady"));
        model.addElement(new Elements("lake"));
        model.addElement(new Elements("lamb"));
        model.addElement(new Elements("lane"));
        model.addElement(new Elements("large"));
        model.addElement(new Elements("leader"));
        model.addElement(new Elements("leaf"));
        model.addElement(new Elements("lean"));
        model.addElement(new Elements("legend"));
        model.addElement(new Elements("let"));
        model.addElement(new Elements("letter"));
        model.addElement(new Elements("level"));
        model.addElement(new Elements("liana"));
        model.addElement(new Elements("liberty"));
        model.addElement(new Elements("lid"));
        model.addElement(new Elements("light"));
        model.addElement(new Elements("limit"));
        model.addElement(new Elements("listen"));
        model.addElement(new Elements("live"));
        model.addElement(new Elements("load"));
        model.addElement(new Elements("log"));
        model.addElement(new Elements("mac"));
        model.addElement(new Elements("mace"));
        model.addElement(new Elements("macro"));
        model.addElement(new Elements("magic"));
        model.addElement(new Elements("maid"));
        model.addElement(new Elements("major"));
        model.addElement(new Elements("manor"));
        model.addElement(new Elements("mead"));
        model.addElement(new Elements("measure"));
        model.addElement(new Elements("medic"));
        model.addElement(new Elements("meet"));
        model.addElement(new Elements("melancholy"));
        model.addElement(new Elements("mere"));
        model.addElement(new Elements("middle"));
        model.addElement(new Elements("mild"));
        model.addElement(new Elements("mine"));
        model.addElement(new Elements("minute"));
        model.addElement(new Elements("mirage"));
        model.addElement(new Elements("misfit"));
        model.addElement(new Elements("mist"));
        model.addElement(new Elements("mock"));
        model.addElement(new Elements("monarchy"));
        model.addElement(new Elements("mule"));
        model.addElement(new Elements("mutual"));
        model.addElement(new Elements("name"));
        model.addElement(new Elements("nap"));
        model.addElement(new Elements("nape"));
        model.addElement(new Elements("nark"));
        model.addElement(new Elements("nasty"));
        model.addElement(new Elements("native"));
        model.addElement(new Elements("near"));
        model.addElement(new Elements("neat"));
        model.addElement(new Elements("necessary"));
        model.addElement(new Elements("nectar"));
        model.addElement(new Elements("negate"));
        model.addElement(new Elements("neigh"));
        model.addElement(new Elements("nest"));
        model.addElement(new Elements("news"));
        model.addElement(new Elements("niche"));
        model.addElement(new Elements("night"));
        model.addElement(new Elements("nimble"));
        model.addElement(new Elements("no"));
        model.addElement(new Elements("noble"));
        model.addElement(new Elements("nonchalant"));
        model.addElement(new Elements("north"));
        model.addElement(new Elements("note"));
        model.addElement(new Elements("nova"));
        model.addElement(new Elements("null"));
        model.addElement(new Elements("numeral"));
        model.addElement(new Elements("numb"));
        model.addElement(new Elements("oak"));
        model.addElement(new Elements("oasis"));
        model.addElement(new Elements("obey"));
        model.addElement(new Elements("oblivion"));
        model.addElement(new Elements("occasion"));
        model.addElement(new Elements("ocular"));
        model.addElement(new Elements("odorous"));
        model.addElement(new Elements("offend"));
        model.addElement(new Elements("oil"));
        model.addElement(new Elements("okay"));
        model.addElement(new Elements("old"));
        model.addElement(new Elements("omen"));
        model.addElement(new Elements("onion"));
        model.addElement(new Elements("opacity"));
        model.addElement(new Elements("open"));
        model.addElement(new Elements("opinion"));
        model.addElement(new Elements("orbit"));
        model.addElement(new Elements("ore"));
        model.addElement(new Elements("oscillate"));
        model.addElement(new Elements("otiose"));
        model.addElement(new Elements("oust"));
        model.addElement(new Elements("overcome"));
        model.addElement(new Elements("ox"));
        model.addElement(new Elements("pacifism"));
        model.addElement(new Elements("pack"));
        model.addElement(new Elements("paddle"));
        model.addElement(new Elements("page"));
        model.addElement(new Elements("painful"));
        model.addElement(new Elements("pagan"));
        model.addElement(new Elements("padre"));
        model.addElement(new Elements("paediatrician"));
        model.addElement(new Elements("porous"));
        model.addElement(new Elements("pace"));
        model.addElement(new Elements("pace off"));
        model.addElement(new Elements("pack"));
        model.addElement(new Elements("public"));
        model.addElement(new Elements("pub"));
        model.addElement(new Elements("podium"));
        model.addElement(new Elements("poignant"));
        model.addElement(new Elements("point"));
        model.addElement(new Elements("pudding"));
        model.addElement(new Elements("puerile"));
        model.addElement(new Elements("pugilism"));
        model.addElement(new Elements("portal"));
        model.addElement(new Elements("quack"));
        model.addElement(new Elements("quaff"));
        model.addElement(new Elements("quagmire"));
        model.addElement(new Elements("qualified"));
        model.addElement(new Elements("quantity"));
        model.addElement(new Elements("quark"));
        model.addElement(new Elements("quarry"));
        model.addElement(new Elements("quarter"));
        model.addElement(new Elements("quash"));
        model.addElement(new Elements("queasy"));
        model.addElement(new Elements("quell"));
        model.addElement(new Elements("question"));
        model.addElement(new Elements("quibble"));
        model.addElement(new Elements("quick"));
        model.addElement(new Elements("quickly"));
        model.addElement(new Elements("quient"));
        model.addElement(new Elements("quoth"));
        model.addElement(new Elements("quit"));
        model.addElement(new Elements("quits"));
        model.addElement(new Elements("racism"));
        model.addElement(new Elements("rack"));
        model.addElement(new Elements("radial"));
        model.addElement(new Elements("reach"));
        model.addElement(new Elements("roach"));
        model.addElement(new Elements("road"));
        model.addElement(new Elements("roar"));
        model.addElement(new Elements("roast"));
        model.addElement(new Elements("robe"));
        model.addElement(new Elements("rocket"));
        model.addElement(new Elements("roe"));
        model.addElement(new Elements("roll"));
        model.addElement(new Elements("rubber band"));
        model.addElement(new Elements("rubbish"));
        model.addElement(new Elements("rude"));
        model.addElement(new Elements("rugged"));
        model.addElement(new Elements("ruffian"));
        model.addElement(new Elements("run"));
        model.addElement(new Elements("sabbath"));
        model.addElement(new Elements("sabotage"));
        model.addElement(new Elements("saccharine"));
        model.addElement(new Elements("sack"));
        model.addElement(new Elements("sacred"));
        model.addElement(new Elements("sad"));
        model.addElement(new Elements("saddle"));
        model.addElement(new Elements("safari"));
        model.addElement(new Elements("sea"));
        model.addElement(new Elements("seagoing"));
        model.addElement(new Elements("seam"));
        model.addElement(new Elements("search"));
        model.addElement(new Elements("season"));
        model.addElement(new Elements("sick"));
        model.addElement(new Elements("so as to"));
        model.addElement(new Elements("soil"));
        model.addElement(new Elements("suave"));
        model.addElement(new Elements("sub"));
        model.addElement(new Elements("table"));
        model.addElement(new Elements("tabernacle"));
        model.addElement(new Elements("tea"));
        model.addElement(new Elements("teacup"));
        model.addElement(new Elements("tear"));
        model.addElement(new Elements("toad"));
        model.addElement(new Elements("toast"));
        model.addElement(new Elements("today"));
        model.addElement(new Elements("toilet"));
        model.addElement(new Elements("tolerance"));
        model.addElement(new Elements("toll"));
        model.addElement(new Elements("tomorrow"));
        model.addElement(new Elements("trace"));
        model.addElement(new Elements("treachery"));
        model.addElement(new Elements("tube"));
        model.addElement(new Elements("tug"));
        model.addElement(new Elements("tuition"));
        model.addElement(new Elements("tummy"));
        model.addElement(new Elements("unborn"));
        model.addElement(new Elements("unconscious"));
        model.addElement(new Elements("underpass"));
        model.addElement(new Elements("undoing"));
        model.addElement(new Elements("unearth"));
        model.addElement(new Elements("uneven"));
        model.addElement(new Elements("unfounded"));
        model.addElement(new Elements("unharmonious"));
        model.addElement(new Elements("unison"));
        model.addElement(new Elements("unlawful"));
        model.addElement(new Elements("visiting"));
        model.addElement(new Elements("vocabulary"));
        model.addElement(new Elements("voltmeter"));
        model.addElement(new Elements("voting"));
        model.addElement(new Elements("voucher"));
        model.addElement(new Elements("vouchsafe"));
        model.addElement(new Elements("vow"));
        model.addElement(new Elements("vulgarism"));
        model.addElement(new Elements("vulgarity"));
        model.addElement(new Elements("vulnerable"));
        model.addElement(new Elements("wadding"));
        model.addElement(new Elements("waist"));
        model.addElement(new Elements("walloping"));
        model.addElement(new Elements("warbler"));
        model.addElement(new Elements("warden"));
        model.addElement(new Elements("warhead"));
        model.addElement(new Elements("warp"));
        model.addElement(new Elements("warrior"));
        model.addElement(new Elements("waspish"));
        model.addElement(new Elements("welder"));
        model.addElement(new Elements("x-coordinate"));
        model.addElement(new Elements("xenon"));
        model.addElement(new Elements("xenomenia"));
        model.addElement(new Elements("xerox"));
        model.addElement(new Elements("x-mas"));
        model.addElement(new Elements("xray"));
        model.addElement(new Elements("xylem"));
        model.addElement(new Elements("xylophone"));
        model.addElement(new Elements("xylograpy"));
        model.addElement(new Elements("xenophobia"));
        model.addElement(new Elements("xerophytes"));
        model.addElement(new Elements("yacht"));
        model.addElement(new Elements("yachting"));
        model.addElement(new Elements("yak"));
        model.addElement(new Elements("yammer"));
        model.addElement(new Elements("yardstick"));
        model.addElement(new Elements("yashmak"));
        model.addElement(new Elements("yaw"));
        model.addElement(new Elements("yawning"));
        model.addElement(new Elements("yearling"));
        model.addElement(new Elements("yearning"));
        model.addElement(new Elements("zealot"));
        model.addElement(new Elements("zealous"));
        model.addElement(new Elements("zombie"));
        model.addElement(new Elements("zone"));
        model.addElement(new Elements("zonked"));
        model.addElement(new Elements("zoologist"));
        model.addElement(new Elements("zucchini"));
        model.addElement(new Elements("zygote"));
        model.addElement(new Elements("zymurgy"));
        model.addElement(new Elements("zinc"));
        

        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    String val = String.valueOf(list.getSelectedValue());
                    words wo = new words();
                    HashMap<String, String> newHashMap;
                    newHashMap = wo.addToDictionary();
                    for (Map.Entry<String, String> word : newHashMap.entrySet()) {
                        String key = word.getKey();
                        String value = word.getValue();
                        if (key.equals(val.toLowerCase().trim())) {
                            WORDS2.setText(">>"+key + " Means: " + value);
                        }
                    }
                }
            }
        });
        list.setBackground(new Color(170,170,170));
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String val = String.valueOf(list.getSelectedValue());
                words wo = new words();
                HashMap<String, String> newHashMap;
                newHashMap = wo.addToDictionary();
                for (Map.Entry<String, String> word : newHashMap.entrySet()) {
                    String key = word.getKey();
                    String value = word.getValue();
                    if (key.equals(val.toLowerCase().trim())) {
                        WORDS2.setText(">>" + key + " Means: " + value);
                    }
                }
            }
        });
        ImageIcon ImageIC = new ImageIcon("icons8-dictionary-48.png");
        ImageIcon ImageBG = new ImageIcon("BGnew.png");
        Label = new JLabel(ImageBG);
        Label.setSize(900,500);
        Label.setBackground(new Color(125,70,77,0));
        Label.setVisible(true);

        Searchbar = new JTextField("Search");
        Searchbar.setFont(new Font("Power Geez Unicode1", BOLD,20));
        Searchbar.setForeground(Color.BLACK);
        Searchbar.setBackground(new Color(175,175,175));
        Searchbar.setEditable(true);
        Searchbar.setBorder(new LineBorder(Color.GRAY));
        Searchbar.setBounds(362,60,330,32);
        Searchbar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                words wo = new words();
                HashMap<String, String> newHashMap;
                newHashMap = wo.addToDictionary();
                for (Map.Entry<String, String> word : newHashMap.entrySet()) {
                    String key = word.getKey();
                    String value = word.getValue();
                    if (key.equals(Searchbar.getText().toLowerCase().trim())) {
                        WORDS2.setText(">>" + key + " Means: " + value);
                        Searchbar.setText("");
                    } else if (value.equals(Searchbar.getText().toLowerCase().trim())) {
                        WORDS2.setText(">>" + key + " Means: " + key);
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
        Searchbar.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String str = Searchbar.getText().trim();
                str += e.getKeyChar();
                str = str.toLowerCase().trim();
                String s;
                for(int i=0; i< model.size(); i++){
                    s = String.valueOf(model.getElementAt(i));
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
        WORDS2.setFont(new Font("Power Geez Unicode1",BOLD,18));
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
        Design.setIconImage(ImageIC.getImage());
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
        EventQueue.invokeLater(() -> {
            try{
                Dictionary Dic = new Dictionary();
            } catch (Exception e){
                e.printStackTrace();
            }
        });
    }
}
