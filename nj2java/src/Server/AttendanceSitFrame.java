package Server;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.AbstractTableModel;

//�⼮��Ȳ ȭ��
class AttendanceSitFrame{
	JFrame jFrame = new JFrame("�⼮��Ȳ");
	
	String columnName[]=
		{"�̸�", "�й�", "�Ҽ��а�", "�⼮"};
		/*{"����", "�̸�", "�й�", "�Ҽ��а�", "�⼮", "����", "�Ἦ"};*/
	Object rowData[][]=
		{
			{"���¹�", "14113303", "������а�", "�Ἦ"},
			{"���ֿ�", "14113346", "������а�", "�⼮"},
			{"���Ѻ�", "14113360", "������а�", "����"},
			{"ȫ����", "14113365", "������а�", "����"}
			/*{new ImageIcon("default/a.jpg"), "���¹�", "14113303", "������а�", "�Ἦ"},
			{new ImageIcon("default/b.jpg"), "���ֿ�", "14113346", "������а�", "�⼮"},
			{new ImageIcon("default/c.jpg"), "���Ѻ�", "14113360", "������а�", "����"},
			{new ImageIcon("default/d.jpg"), "ȫ����", "14113365", "������а�", "����"}*/
		};

	JTable jTable = new JTable(rowData, columnName);
	JScrollPane jScrollPane = new JScrollPane(jTable);

	public AttendanceSitFrame(){

		jFrame.add(jScrollPane);
		jFrame.setSize(400, 300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}




}