package FilosophyJavaLess.Section_4;

/**
 * Created by ������ on 26.11.2015.
 */
public class ListCharacters {
    public static void main(String[] args) {
        for(char c = 0; c < 128; c++){
            if(Character.isLowerCase(c))
                System.out.println("value: " + (int)c + "symbol: " + c);

        }
    }
}
