/*
 * @author : Supun Jaysinghe
 * Date    : 03 March 2023
 * Time    : 6:37 PM
 * Project : Thogakade With Hibernate
 * Created by IntelliJ IDEA.
 */
package lk.ccns.thogakade;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import lk.ccns.thogakade.entity.Customer;
import lk.ccns.thogakade.entity.Item;
import lk.ccns.thogakade.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.net.URL;

public class AppInitializer extends Application {
    public static void main(String[] args) {
//        launch(args);
        Customer customer1=new Customer("C001","Kasun Sankalpa","Meegahathanna",40000);
        Session session1 = FactoryConfiguration.getInstance().getSession();
        Transaction transaction1= session1.beginTransaction();
        session1.save(customer1);
        transaction1.commit();
        session1.close();

        Item item1=new Item("P001","Keerisamba Retail",105.00,3000);
        Session session2=FactoryConfiguration.getInstance().getSession();
        Transaction transaction2=session2.beginTransaction();
        session2.save(item1);
        transaction2.commit();
        session2.close();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL resource = getClass().getResource("/lk/ccns/thogakade/view/DashBoardForm.fxml");
        if(resource!=null){
            primaryStage.setScene(new Scene(FXMLLoader.load(resource)));
            primaryStage.show();
        }else {
            new Alert(Alert.AlertType.ERROR,"FXML File Not Found !!!");
        }

    }
}
