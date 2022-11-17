package deneme;

import ser_deser.User;

import java.io.*;

public class deneme1 {

    private static void readObjects() {
        readObject();
    }

    private static void readObject() {
        try(FileInputStream fis=new FileInputStream("user.dat")){
            try(ObjectInputStream ois=new ObjectInputStream(fis)){

                User user1= (User) ois.readObject();
                User user2= (User) ois.readObject();
                User user3= (User) ois.readObject();

                System.out.println(user1);
                System.out.println(user2);
                System.out.println(user3);


            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void writeObjects() {
        System.out.println("User objeleri oluşturuluyor....");

        User user1=new User(1L, "John Coffee", "345-34-344");
        User user2=new User(2L, "James Bond", "676-34-344");
        User user3=new User(3L, "Tony Stark", "676-55-599");


        try(FileOutputStream fos=new FileOutputStream("user.dat")){
            try(ObjectOutputStream oos=new ObjectOutputStream(fos)){
                oos.writeObject(user1);
                oos.writeObject(user2);
                oos.writeObject(user3);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("User objeleri serialized yapıldı");
    }
}
