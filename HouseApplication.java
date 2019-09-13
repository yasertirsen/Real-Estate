package CA2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;
import java.text.NumberFormat;
import java.util.*;

public class HouseApplication extends JFrame {
	
	ArrayList<House> houseList = new ArrayList<House>();

	String[][] records = { {"113 The Maltings", "Dublin 8", "2", "1", "155500.00", "House1.jpg", "(087) 9011135"},
			   {"78 Newington Lodge", "Dublin 14", "3", "2", "310000.00", "House2.jpg", "(087) 9010580"},
			   {"62 Bohernabreena Road", "Dublin 24", "3", "1", "220000.00", "House3.jpg", "(087) 6023159"},
			   {"18 Castledevitt Park", "Dublin 15", "3", "3", "325000.00", "House4.jpg", "(087) 9010580"},
			   {"40 Dunsawny Road", "Swords", "3", "19", "245000.00", "House5.jpg", "(087) 9011135"}};
	int currentItem;
	
	
	public HouseApplication() {
		super("Estate Agent Application");
	//Transform the array of data into Houses on the ArrayList 
		for (int i = 0; i < records.length; i++) {
			houseList.add(new House(records[i][0], records[i][1], Integer.parseInt(records[i][2]), 
					Integer.parseInt(records[i][3]), Double.parseDouble(records[i][4]), records[i][5], records[i][6]));
		}
			
		initComponents();
	}

	public void initComponents() {
		
		/* Set up your menus and menu items here */

		setSize(400, 550);
		setVisible(true);
		}

	
	public static void main(String[] args) {
		HouseApplication ha = new HouseApplication();
		
	}

}
