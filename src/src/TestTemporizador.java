package src;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TestTemporizador implements ActionListener {

	public static void main(String[] args) {

		ActionListener objetInterfaz = new TestTemporizador();

		Timer temporizador = new Timer(1000, objetInterfaz);

		temporizador.start();

		JOptionPane.showMessageDialog(null, "Aprete Aceptar para que se detenga el programa");

		System.exit(0);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		Date horaLocal;
		System.out.println(horaLocal = new Date());
		Toolkit.getDefaultToolkit().beep();
	}
}