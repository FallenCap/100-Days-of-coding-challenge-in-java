package Day055;

import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.util.*;

@SuppressWarnings("serial")
public class DigitalClock extends JFrame {
	Calendar calendar;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;

	//Creating constructor for DigitalClock.
	DigitalClock() {
		//Setting frame design layout.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Digital Clock");
		this.setLayout(new FlowLayout());
		this.setSize(350, 250);
		this.setResizable(false);
		
		//Setting time and date fromat.
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("EEEE");
		dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
		
		//Setting time design on the app.
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
		timeLabel.setForeground(new Color(0x00ff00));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		
		//Setting day design on the app.
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));
		
		//Setting date design in the app.
		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));
		
		
		time = timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
		
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		
		this.setVisible(true);
		
		setTime();
	}
	
	//Method for run the clock.
	public void setTime() {
		while(true) {
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);
			
			day = dayFormat.format(Calendar.getInstance().getTime());
			dayLabel.setText(day);
			
			date = dateFormat.format(Calendar.getInstance().getTime());
			dateLabel.setText(date);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
