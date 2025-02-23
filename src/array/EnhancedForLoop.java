package array;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] strArray = {"Java", "Python", "C++", "JavaScript", "C", "C++", "C"};

        for(String lang : strArray) {
            System.out.println(lang);
        }
    }
}
