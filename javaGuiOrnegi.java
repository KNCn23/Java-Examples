import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaGuiOrnegi {

    private static int clickCount = 0;

    public static void main(String[] args) {
        // JFrame oluşturma
        JFrame frame = new JFrame("Java GUI Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Ana paneli ve düzen yöneticisini oluşturma
        JPanel panel = new JPanel(new GridLayout(5, 1));
        frame.add(panel);

        // İsim ve girdi kutusu
        JPanel namePanel = new JPanel(new FlowLayout());
        namePanel.add(new JLabel("İsim:"));
        JTextField nameField = new JTextField(20);
        namePanel.add(nameField);
        panel.add(namePanel);

        // Cinsiyet seçenekleri
        JPanel genderPanel = new JPanel(new FlowLayout());
        genderPanel.add(new JLabel("Cinsiyet:"));
        JRadioButton femaleButton = new JRadioButton("Kadın");
        JRadioButton maleButton = new JRadioButton("Erkek");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(femaleButton);
        genderGroup.add(maleButton);
        genderPanel.add(femaleButton);
        genderPanel.add(maleButton);
        panel.add(genderPanel);

        // Hobi seçenekleri
        JPanel hobbyPanel = new JPanel(new FlowLayout());
        hobbyPanel.add(new JLabel("Hobi:"));
        JCheckBox swimmingCheckBox = new JCheckBox("Yüzme");
        JCheckBox chessCheckBox = new JCheckBox("Satranç");
        hobbyPanel.add(swimmingCheckBox);
        hobbyPanel.add(chessCheckBox);
        panel.add(hobbyPanel);

        // Kaydet butonu
        JButton saveButton = new JButton("Kaydet");
        JPanel saveButtonPanel = new JPanel(new FlowLayout());
        saveButtonPanel.add(saveButton);
        panel.add(saveButtonPanel);

        // Sayaç labelı
        JLabel counterLabel = new JLabel("Tıklama Sayısı: 0");
        panel.add(counterLabel);

        // Kaydet butonuna tıklama olayı ekleme
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                counterLabel.setText("Tıklama Sayısı: " + clickCount);
                // Burada gerekli işlemleri yapabilirsiniz (örneğin, verileri kaydetmek)
            }
        });

        // JFrame'i göster
        frame.setVisible(true);
    }
}
