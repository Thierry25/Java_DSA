public class Main {
    public static void main(String[] args) {
        String x = "xxre";
        StringBuilder stringBuilder = new StringBuilder();
        for(char c: x.toCharArray()){
            if(c == 'x'){
                stringBuilder.insert(stringBuilder.length(), c);
            }else{
                if(stringBuilder.indexOf("x") != 1){
                    stringBuilder.insert(stringBuilder.indexOf("x") -1, c);
                }else{
                    stringBuilder.append(c);
                }
            }
        }
        System.out.println(stringBuilder);
    }

    public static String endX(String str) {
        return endX(str, str.length() - 1);
    }

    public static String endX(String str, int index){
        if(index < 0) return "";
        StringBuilder sB = new StringBuilder();
        return endX(str, index -1) + sB;
    }

}