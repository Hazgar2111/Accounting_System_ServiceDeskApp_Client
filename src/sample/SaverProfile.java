package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class SaverProfile {



    public static void saveProfile(Admin admin){
        try{
            ObjectOutputStream outputStream=
                    new ObjectOutputStream(new FileOutputStream("1xd54lre.txt"));
            outputStream.writeObject(admin);
            outputStream.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static Admin getProfile(){
        Admin admin = null;
        try{
            ObjectInputStream inputStream=
                    new ObjectInputStream(new FileInputStream("1xd54lre.txt"));
            admin = (Admin) inputStream.readObject();
            inputStream.close();
            //ObjectOutputStream outputStream=
            //        new ObjectOutputStream(new FileOutputStream("1xd54lre.txt"));
            //outputStream.writeObject("");
            //outputStream.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return admin;
    }


}
