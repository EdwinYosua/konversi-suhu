import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelciusToFahrenheit extends JDialog{
    private JPanel fMain;
    private JTextField txtSuhu;
    private JButton btnConvert;
    private JLabel label1;
    private JLabel lblResult;


    public CelciusToFahrenheit()   {
        setContentPane(fMain);
        setMinimumSize(new Dimension(400, 400));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblResult.setText(celciusToFahrenheit(txtSuhu.getText()));
            }
        });
    }

    private String celciusToFahrenheit(String celcius) {
        return Double.toString(1.8 * (Integer.parseInt(celcius)) + 32);
    }
}
