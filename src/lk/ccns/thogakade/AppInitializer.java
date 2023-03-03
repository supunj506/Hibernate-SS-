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
import javafx.stage.Stage;
import lk.ccns.thogakade.entity.Customer;
import lk.ccns.thogakade.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer extends Application {
    public static void main(String[] args) {
//        launch(args);
        Customer customer1=new Customer("C001","Kasun Sankalpa","Meegahathanna",40000);
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction= session.beginTransaction();
        session.save(customer1);
        transaction.commit();
        session.close();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/lk/ccns/thogakade/view/DashBoardForm.fxml"))));
        primaryStage.show();
    }
}
