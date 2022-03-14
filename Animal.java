public class Animal {
    public static String getCatVoice(String animal) {
        if (animal.equalsIgnoreCase("cat"))
            return "Meowww !";
        else 
            return "I dont know";
    }
        

    public static void main(String[] args) {
        String firstArg = args[0];
        System.out.println(getAnimalVoice(firstArg));
    }
}
