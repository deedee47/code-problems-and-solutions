public class CharRemoval {
    public static void main(String[] args) {

        System.out.println(characterRemoval("qqqqaaabbbcc", 2));
    }

    private static String characterRemoval(String data, int frequency){

        if(data.equals("") || frequency <= 0) return "";


        StringBuilder stringBuilder = new StringBuilder();
        int index = 1;
        char indexChar = data.charAt(0);
        int indexCount = 1;

        while(index < data.length()){


            if(data.charAt(index) ==indexChar && indexCount <= frequency){
                stringBuilder.append(data.charAt(index));
                indexCount++;
            }

            if(indexChar != data.charAt(index)){
                indexChar = data.charAt(index);
                indexCount = 1;
                stringBuilder.append(data.charAt(index));
            }

            index++;

        }

        return stringBuilder.toString();
    }
}
