package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Main extends Application {
    private static Socket socket;
    private static ObjectOutputStream outStream;
    private static  ObjectInputStream inStream;


    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
            primaryStage = new Stage();
            primaryStage.setTitle("Hazgar's Application CO");
            primaryStage.setScene(new Scene(root, 763, 487)); // размеры нового окна
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


       // scene.getStylesheets().add("styles/style_sheet.css");
        primaryStage.show();
    }


    private static void connect()
    {
        try {
            socket = new Socket("127.0.0.1", 4444);
            outStream = new ObjectOutputStream(socket.getOutputStream());
            inStream = new ObjectInputStream(socket.getInputStream());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static ArrayList<Inventory> getInventoryMethod()
    {

        ArrayList<Inventory> inventories = new ArrayList<>();
        try {
            Request r = new Request("LIST_INVENTORIES", (String) null, 11);
            outStream.writeObject(r);
            Request request = (Request) inStream.readObject();
            if (request != null)
            {
                inventories = request.getInventories();
            }

        }catch (ClassNotFoundException | IOException e)
        {
            e.printStackTrace();
        }
        return inventories;

    }


    public static ArrayList<NewInventory> getNewInventoryMethod()
    {

        ArrayList<NewInventory> newInventories = new ArrayList<>();
        try {
            Request r = new Request("LIST_NEW_INVENTORIES",  null, "1");
            outStream.writeObject(r);
            Request request = (Request) inStream.readObject();
            if (request != null)
            {
                newInventories = request.getNewInventories();

            }

        }catch (ClassNotFoundException | IOException e)
        {
            e.printStackTrace();
        }
        return newInventories;

    }


    public static ArrayList<InventoryBU> getBUInventoryMethod()
    {

        ArrayList<InventoryBU> newInventories = new ArrayList<>();
        try {
            Request r = new Request("LIST_BU_INVENTORIES", null,1.0);
            outStream.writeObject(r);
            Request request = (Request) inStream.readObject();
            if (request != null)
            {
                newInventories = request.getInventoriesBU();

            }

        }catch (ClassNotFoundException | IOException e)
        {
            e.printStackTrace();
        }
        return newInventories;

    }


    public static ArrayList<Admin> getAdminsMethod()
    {
        ArrayList<Admin> admins = new ArrayList<>();
        try {
            Request r = new Request("LIST_ADMINS", null);
            outStream.writeObject(r);
            Request request = (Request) inStream.readObject();
            if (request != null)
            {
                admins = request.getAdmins();
            }
        }catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return admins;
    }


    public static void deleteInventory(String id)
    {
        Request r = new Request("DELETE_INVENTORY",id,1);
        try {
            outStream.writeObject(r);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    public static void deleteNewInventory(String id1)
    {
        Request r = new Request("DELETE_NEW_INVENTORY",id1,1);
        try {
            outStream.writeObject(r);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    public static void deleteInventoryBU(String id)
    {
        Request r = new Request("DELETE_BU_INVENTORY",id,1);
        try {
            outStream.writeObject(r);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void deleteAdmin(String id)
    {
        Request r = new Request("DELETE_ADMIN",id,1);
        try {
            outStream.writeObject(r);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void addInventoryBU(InventoryBU inventoryBU)
    {
        ArrayList<InventoryBU> inventoryBUTemp= new ArrayList<>();
        inventoryBUTemp.add(inventoryBU);
        Request r = new Request("ADD_BU_INVENTORY",inventoryBUTemp,1.0);
        try {
            outStream.writeObject(r);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    public static void addInventory(Inventory inventory)
    {
        ArrayList<Inventory> inventoryTemp= new ArrayList<>();
        inventoryTemp.add(inventory);
        Request r = new Request("ADD_INVENTORY",inventoryTemp,1);
        try {
            outStream.writeObject(r);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    public static void addAdmin(Admin admin)
    {
        ArrayList<Admin> adminTemp= new ArrayList<>();
        adminTemp.add(admin);
        Request r = new Request("ADD_ADMIN",adminTemp);
        try {
            outStream.writeObject(r);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void updateInventory(Inventory inventory)
    {
        ArrayList<Inventory> inventoryTemp= new ArrayList<>();
        inventoryTemp.add(inventory);
        Request r = new Request("UPDATE_INVENTORY",inventoryTemp,1);
        try {
            outStream.writeObject(r);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    public static void updateAdmin(Admin admin)
    {
        ArrayList<Admin> temp= new ArrayList<>();
        temp.add(admin);
        Request r = new Request("UPDATE_ADMIN", temp);
        try {
            outStream.writeObject(r);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    public static void addInventoryNew(NewInventory inventory)
    {
        ArrayList<NewInventory> inventoryTemp= new ArrayList<>();
        inventoryTemp.add(inventory);
        Request r = new Request("ADD_NEW_INVENTORY",inventoryTemp,"1");
        try {
            outStream.writeObject(r);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void addInventoryNewFile(File file)
    {

        Request r = new Request("ADD_NEW_INVENTORY_FILE", file, 1);
        try {
            outStream.writeObject(r);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        connect();
        launch(args);
    }
}
