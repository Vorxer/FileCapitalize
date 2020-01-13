import java.util.HashMap;

public class Resolver {

    HashMap<String, String> SubMap;

    public Resolver(HashMap<String, String> subMap) {
        this.SubMap = subMap;
    }

    public String Resolve(){
        return "a";
    }
}
