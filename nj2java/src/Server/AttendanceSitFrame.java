package Server;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.AbstractTableModel;

//출석상황 화면
class AttendanceSitFrame{
	JFrame jFrame = new JFrame("출석상황");
	
	String columnName[]=
		{"사진", "이름", "학번", "소속학과", "출석", "지각", "결석"};
	Object rowData[][]=
		{
			{new ImageIcon("default/a.jpg"), "강태민", "14113303", "산업공학과", "결석"},
			{new ImageIcon("default/b.jpg"), "이주연", "14113346", "산업공학과", "출석"},
			{new ImageIcon("default/c.jpg"), "지한별", "14113360", "산업공학과", "지각"},
			{new ImageIcon("default/d.jpg"), "홍서우", "14113365", "산업공학과", "지각"}
		};

	JTable jTable = new JTable(rowData, columnName);
	JScrollPane jScrollPane = new JScrollPane(jTable);

	public AttendanceSitFrame(){

		jFrame.add(jScrollPane);
		jFrame.setSize(700,500);
	//	jFrame.setLayout(null);
	//	jFrame.setTitle("출석상황");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}


}