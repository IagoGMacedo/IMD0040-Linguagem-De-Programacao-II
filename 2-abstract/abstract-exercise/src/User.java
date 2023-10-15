public class User extends Entity {

    private String name;

    public User(String p_name){
        name = p_name;
    }

    @Override
    public String fileName() {
        return "User"+name+".txt";
    }

    @Override
    public boolean validar() {
        return !(name.length() <5);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
