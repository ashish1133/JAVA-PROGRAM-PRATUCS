class main{
    public static void main(String[] args) {

        // Show to duplicate letter in the String

        String a = "Ashish";
        a=a.toUpperCase();
        for (int i=0;i<a.length();i++){
            for (int j=i+1;j<a.length();j++){
                if (a.charAt(i)==a.charAt(j))
                    System.out.print(a.charAt(i));
            }
        }

    }
}