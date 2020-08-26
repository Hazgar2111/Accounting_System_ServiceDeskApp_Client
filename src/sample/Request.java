package sample;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class Request implements Serializable {
    private String operationType;
    private String id;
    private ArrayList<Admin> admins;
    private ArrayList<Inventory> inventories;
    private ArrayList<NewInventory> newInventories;
    private ArrayList<InventoryBU> InventoriesBU;
    private static final long serialVersionUID=1L;
    private File file;

    public Request(String operationType, ArrayList<Admin> admins) {
        this.operationType = operationType;
        this.admins = admins;
    }

    public File getFile() {
        return file;
    }

    public Request(String operationType, File file, long check) {
        this.operationType = operationType;
        this.file = file;
    }

    public Request(String operationType, ArrayList<InventoryBU> inventoriesBU,double check) {
        this.operationType = operationType;
        this.InventoriesBU = inventoriesBU;


    }


    public Request(String operationType,  ArrayList<Inventory> inventories,int check) {
        this.operationType = operationType;
        this.inventories = inventories;
    }


    public Request(String operationType,  ArrayList<NewInventory> inventories, String check) {
        this.operationType = operationType;
        this.newInventories = inventories;
    }


    public Request(String operationType, String id, int check) {
        this.operationType = operationType;
        this.id = id;

    }


    public Request() {
    }






    public ArrayList<InventoryBU> getInventoriesBU() {
        return InventoriesBU;
    }
    public String getId() {
        return id;
    }
    public ArrayList<NewInventory> getNewInventories() {
        return newInventories;
    }
    public void setNewInventories(ArrayList<NewInventory> newInventories) {
        this.newInventories = newInventories;
    }
    public String getOperationType() {
        return operationType;
    }
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }
    public ArrayList<Admin> getAdmins() {
        return admins;
    }
    public void setAdmins(ArrayList<Admin> admins) {
        this.admins = admins;
    }
    public ArrayList<Inventory> getInventories() {
        return inventories;
    }
    public void setInventories(ArrayList<Inventory> inventories) {
        this.inventories = inventories;
    }



}
