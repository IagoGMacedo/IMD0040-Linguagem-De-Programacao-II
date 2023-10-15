import java.io.*;

public abstract class Entity implements Serializable {
    public Entity(){

    }

    public abstract String fileName();

    protected boolean saveFile(){
    if(validar()) {
        try {
            FileOutputStream f = new FileOutputStream(new File(fileName()));
            System.out.println("arquivo criado: "+fileName());
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            o.writeObject(this);

            o.close();
            f.close();
            return true;

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }
        return false;
    }

    public abstract boolean validar();




}
