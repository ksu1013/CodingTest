package test.codingTest;

class GmarketCT02 {
    public static void main(String[] args) {
//        String k = solution("...!@BaT#*..y.abcdefghijklm");
        String k = solution("abcdefghijklmn.p");
//        System.out.println("k = " + k);
    }
    public static String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase().replaceAll("[^a-z0-9._-]", "").replaceAll("\\.{2,}","\\.").replaceAll("^\\.", "").replaceAll("\\.$", "");

        if(new_id.isEmpty())new_id = "a";
        if(new_id.length() >=16) new_id =new_id.substring(0,15).replaceAll("\\.$", "");
        if(new_id.length() <=2){
            String k = new_id.substring(new_id.length()-1,new_id.length());
            System.out.println("k = " + k);
            while (true){
                new_id+=k;
                if(new_id.length()>=3){
                    break;
                }
            }
        }

        answer = new_id;
        System.out.println("answer = " + answer);
        return answer;
    }
}