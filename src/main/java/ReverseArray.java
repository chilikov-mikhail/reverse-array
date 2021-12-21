public class ReverseArray {

    public static String[] reverse (String[] strings){
        for(int i = 0; i <= (strings.length - 1)/2; i++) {
            String string = strings[i];
            strings[i] = strings[strings.length - 1 - i];
            strings[strings.length - 1 - i] = string;
        }
        return strings;
    }
}
