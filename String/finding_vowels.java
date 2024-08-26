package String;

public class finding_vowels {
    static boolean vowels(char ch){
        ch = Character.toUpperCase(ch);
        return (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');

    }
    static int counter(String str){
        int count=0;
        for (int i=0;i<str.length();i++)
            if (vowels(str.charAt(i)))
                ++count;
            return count;

    }

    public static void main(String[] args) {
        String str="ashishashok";
        System.out.println(counter(str));
    }
}
