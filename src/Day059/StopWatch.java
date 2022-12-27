/*Create a stop watch using java swing.*/
package Day059;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StopWatch implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton start_button = new JButton("Start");
	JButton reset_button = new JButton("Reset");
	JLabel timelabel = new JLabel();
	int elapsedTime = 0;
	int  seconds = 0;
	int  minutes = 0;
	int  hours = 0;
	boolean started = false;
	String seconds_string = String.format("%02d", seconds);
	String minutes_string = String.format("%02d", minutes);
	String hours_string = String.format("%02d", hours);
	
	Timer timer = new Timer(1000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			elapsedTime += 1000;
			hours = (elapsedTime / 3600000);
			minutes = (elapsedTime / 60000) % 60;
			seconds = (elapsedTime / 1000) % 60;
			seconds_string = String.format("%02d", seconds);
			minutes_string = String.format("%02d", minutes);
			hours_string = String.format("%02d", hours);
			timelabel.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
			
		}
	});
	
	StopWatch() {
		
		timelabel.setText(hours_string + ":" + minutes_string +":" + seconds_string);
		timelabel.setBounds(100, 100, 200, 100);
		timelabel.setFont(new Font("Verdana", Font.PLAIN, 35));
		timelabel.setBorder(BorderFactory.createBevelBorder(1));
		timelabel.setOpaque(true);
		timelabel.setHorizontalAlignment(JTextField.CENTER);
		
		start_button.setBounds(100, 200, 100, 50);
		start_button.setFont(new Font("Ink Free", Font.PLAIN, 20));
		start_button.setFocusable(false);
		start_button.addActionListener(this);
		
		reset_button.setBounds(200, 200, 100, 50);
		reset_button.setFont(new Font("Ink Free", Font.PLAIN, 20));
		reset_button.setFocusable(false);
		reset_button.addActionListener(this);
		
		frame.add(timelabel);
		frame.add(start_button);
		frame.add(reset_button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 
		if(e.getSource() == start_button) {
			if(started == false) {
				started = true;
				start_button.setText("STOP");
				start();
			}
			else {
				started = false;
				start_button.setText("START");
				stop();
			}
		}
		
		if(e.getSource() == reset_button) {
			started = false;
			start_button.setText("START");
			reset();
			
		}
	}
	
	void start() {
		timer.start();
	}
	
	void stop() {
		timer.stop();
	}
	
	void reset() {
		timer.stop();
		elapsedTime = 0;
		seconds = 0;
		minutes = 0;
		hours = 0;
		seconds_string = String.format("%02d", seconds);
		minutes_string = String.format("%02d", minutes);
		hours_string = String.format("%02d", hours);
		timelabel.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
		
	}
	
}
