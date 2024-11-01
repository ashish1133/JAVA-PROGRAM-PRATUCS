class main{
    static String[]word ={"zero","one","two","three","four","five","six","seven","eight","nine"};

    static String digitoword (int num){

        String k = Integer.toString(num);
        StringBuilder result = new StringBuilder();

        for (char digit : k.toCharArray()){

            int digitValue = digit-'0';
            result.append(word[digitValue]);
        }
        return result.toString();
    }

    public static void main(String[] args) {

        int num = 312;
        String result = digitoword(num);
        System.out.println("Digit to Word : " + result);

    }

}