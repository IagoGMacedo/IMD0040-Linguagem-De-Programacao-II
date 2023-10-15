public class Main {
    public static void main(String[] args) {
        Product notebook = new Product("notebook", 3500);
        User iago = new User("iagola");


        System.out.println(notebook.saveFile());
        System.out.println(iago.saveFile());;
    }
}