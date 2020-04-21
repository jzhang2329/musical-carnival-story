/** MyHandler.java created by junxuanzhang on MacBook Air in ateam
 *  
 *  Author: 	Junxuan Zhang(jzhang2329@wisc.edu)
 *  Date: 		@date
 *  
 *  Course: 	CS400
 *  Semester: 	Spring 2020
 *  Lecture: 	001
 *  
 *  IDE:		Eclipse IDE for Java Developers
 *  Version: 	2019-12(4.14.0)
 *  Build id: 	20191212-1212
 *  
 *  Device: 	Macbook Air
 *  OS: 		macOS Catalina
 *  Version: 	10.15
 *  
 *  List Collaborators:N/A
 *  
 *  Other Credits: N/A
 *  
 *  Known Bugs: N/A
 */

package ateam;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

/**
 * MyHandler - TODO Describe purpose of this user-defined type
 * @author zhang (2020)
 *
 */
public class DateMyHandler implements   javafx.event.EventHandler<ActionEvent> {

	private Button button;
	private BorderPane root;
//	private String gt;
	private TextField text;
	private String A = "2020";
	
	private final ObservableList<Data> data =
		FXCollections.observableArrayList(new Data(A,"001","100","20")

			 );

	public DateMyHandler(Button c,BorderPane root,TextField text ) {
		button = c; 
		this.root = root;
		this.text = text;
	}



	@Override
	public void handle(ActionEvent arg0) {
		
		
		String gt =null;
		gt = text.getText().toString();

		
		
		//add table
		 TableView table=new TableView<>(); 
		 table.setEditable(true);
		 
		 //1
		 TableColumn col1=new TableColumn<>("Date");
		 col1.setPrefWidth(250); 
		 col1.setCellValueFactory(
				 new PropertyValueFactory<>("date") );
		 
		 //2
		 TableColumn col2=new TableColumn<>("Farm ID"); 
		 col2.setPrefWidth(250); 
		 col2.setCellValueFactory(
				 new PropertyValueFactory<>("farmID") );
		 
		 //3
		 TableColumn col3=new TableColumn<>("Total Weight"); 
		 col3.setPrefWidth(250); 
		 col3.setCellValueFactory(
				 new PropertyValueFactory<>("weight") );
		 
		 
		 //4
		 TableColumn col4=new TableColumn<>("Percent of Total Weight of All Farms"); 
		 col4.setPrefWidth(250); 
		 col4.setCellValueFactory(
				 new PropertyValueFactory<>("percentage") );
		 
		 table.setItems(data);
		 table.getColumns().addAll(col1,col2,col3,col4);	
		 
		 

		 
	//	 col1.setCellValueFactory(new PropertyValueFactory(gt));
	
//		 System.out.println(gt);
	
	
//	class Data{
//		private final SimpleStringProperty Date;
//		private final SimpleStringProperty ID;
//		private final SimpleStringProperty Weight;
//		private final SimpleStringProperty percentage;
//		
//		private Data(String Data, String ID, String Weight, String percentage) {
//			this
//		}
//		
//	}
//	
	
	
	
	
	root.setBottom(table);
	
	}

	public static class Data{
		private final SimpleStringProperty Date;
		private final SimpleStringProperty FarmID;
		private final SimpleStringProperty Weight;
		private final SimpleStringProperty Percentage;
		
		private Data(String date,String farmID,String weight, String percentage ) {
			this.Date = new SimpleStringProperty(date);
			this.FarmID = new SimpleStringProperty(farmID);
			this.Weight = new SimpleStringProperty(weight);
			this.Percentage = new SimpleStringProperty(percentage);

		}
		
		public String getDate() {
			return Date.get();
		}
		public void setDate(String date) {
			 Date.set(date);
		}
		
		public String getFarmID() {
			return FarmID.get();
		}
		public void setFarmID(String farmID) {
			Date.set(farmID);
		}
		
		public String getWeight() {
			return Weight.get();
		}
		public void setWeight(String weight) {
			Date.set(weight);
		}
		
		public String getPercentage() {
			return Percentage.get();
		}
		public void setPercentage(String percentage) {
			Date.set(percentage);
		}
}
	
}
