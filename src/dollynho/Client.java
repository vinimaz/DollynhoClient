package dollynho;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry refServidorDeNomes = LocateRegistry.getRegistry(6789);
        InterfaceServ refServidor = (InterfaceServ) refServidorDeNomes.lookup("Dollynho");
        ClientImpl cliente = new ClientImpl(refServidor);
        System.out.println("Rodando cliente");
        launch(args);
    }
}
