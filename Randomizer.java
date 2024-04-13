import java.util.Random;
import java.awt.*;
import java.awt.event.*;

public class GuessTheNumber extends Frame {
//////////////////// CONSTRUCTOR //////////////////////////
  int number = 0;
  int RAND;
  int randCount;

  GuessTheNumber(String title) {
    super(title);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent ev) {
        System.exit(0);
      }
    });
    setBackground(Color.CYAN);
    setSize(200, 500);
    init();
    setVisible(true);
    setResizable(false);
    setLocationRelativeTo(null);
  }

////////////// METHOD MAIN FOR CODE RUNNING ////////////////
  public static void main(String[] args) throws Exception {
    GuessTheNumber myButtons = new GuessTheNumber("Calculator");
  }

  public void init() {
    Panel calc = new Panel();
    add(calc, BorderLayout.CENTER);
    Button enter = new Button("Enter");
    TextField text = new TextField("");
    Button ten = new Button("Від 0 до 10");
    Button twfive = new Button("Від 0 до 25");
    Button fifty = new Button("Від 0 до 50");
    Button one = new Button("1");
    Button two = new Button("2");
    Button three = new Button("3");
    Button four = new Button("4");
    Button five = new Button("5");
    Button six = new Button("6");
    Button seven = new Button("7");
    Button eight = new Button("8");
    Button nine = new Button("9");
    Button zero = new Button("0");
    text.setEditable(false);
    ten.setBackground(new Color(0, 255, 0));
    twfive.setBackground(new Color(255, 255, 0));
    fifty.setBackground(new Color(255, 0, 0));
    one.setBackground(new Color(0, 196, 255));
    two.setBackground(new Color(0, 196, 255));
    three.setBackground(new Color(0, 196, 255));
    four.setBackground(new Color(0, 196, 255));
    five.setBackground(new Color(0, 196, 255));
    six.setBackground(new Color(0, 196, 255));
    seven.setBackground(new Color(0, 196, 255));
    eight.setBackground(new Color(0, 196, 255));
    nine.setBackground(new Color(0, 196, 255));
    zero.setBackground(new Color(0, 196, 255));
    enter.setBackground(new Color(0, 196, 255));
    ten.setPreferredSize(new Dimension(150, 50));
    twfive.setPreferredSize(new Dimension(150, 50));
    fifty.setPreferredSize(new Dimension(150, 50));
    enter.setPreferredSize(new Dimension(100, 50));
    text.setPreferredSize(new Dimension(50, 50));
    one.setPreferredSize(new Dimension(50, 50));
    two.setPreferredSize(new Dimension(50, 50));
    three.setPreferredSize(new Dimension(50, 50));
    four.setPreferredSize(new Dimension(50, 50));
    five.setPreferredSize(new Dimension(50, 50));
    six.setPreferredSize(new Dimension(50, 50));
    seven.setPreferredSize(new Dimension(50, 50));
    eight.setPreferredSize(new Dimension(50, 50));
    nine.setPreferredSize(new Dimension(50, 50));
    zero.setPreferredSize(new Dimension(150, 50));
    calc.add(enter);
    calc.add(text);
    calc.add(one);
    calc.add(two);
    calc.add(three);
    calc.add(four);
    calc.add(five);
    calc.add(six);
    calc.add(seven);
    calc.add(eight);
    calc.add(nine);
    calc.add(zero);
    calc.add(ten);
    calc.add(twfive);
    calc.add(fifty);
    one.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        number = 1;
        text.setText(text.getText() + number);
      }
    });
    two.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        number = 2;
        text.setText(text.getText() + number);
      }
    });
    three.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        number = 3;
        text.setText(text.getText() + number);
      }
    });
    four.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        number = 4;
        text.setText(text.getText() + number);
      }
    });
    five.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        number = 5;
        text.setText(text.getText() + number);
      }
    });
    six.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        number = 6;
        text.setText(text.getText() + number);
      }
    });
    seven.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        number = 7;
        text.setText(text.getText() + number);
      }
    });
    eight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        number = 8;
        text.setText(text.getText() + number);
      }
    });
    nine.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        number = 9;
        text.setText(text.getText() + number);
      }
    });
    zero.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        number = 0;
        text.setText(text.getText() + number);
      }
    });
    ten.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            randCount = 10;
            RAND = new Random().nextInt(randCount) + 1; // Генерація випадкового числа
       
        }
    });
    
    twfive.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            randCount = 25;
            RAND = new Random().nextInt(randCount) + 1; // Генерація випадкового числа
        }
    });
    fifty.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            randCount = 50;
            RAND = new Random().nextInt(randCount) + 1; // Генерація випадкового числа
        }
    });
    enter.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            int inter = Integer.parseInt(text.getText());
            if (inter < RAND) {
              text.setText("Треба");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                text.setText("Більше");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                text.setText("");
            }
            if (inter > RAND) {
              text.setText("Треба");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                text.setText("Менше");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                text.setText("");
            }
            if(inter == RAND) {
                text.setText("Вірно!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                text.setText("");
            }
        }
    });

  }
}

