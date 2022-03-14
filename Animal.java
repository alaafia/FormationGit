public class Animal {
        
    public static String getAnimalVoice(String animal) {
        if (animal.equalsIgnoreCase("bird"))
            return "Tweet";
        else if (animal.equalsIgnoreCase("cat"))
            return "Meowww !";
        if (animal.equalsIgnoreCase("cow"))
            return "moooooooh";
        else  
            return "I dont Know";
    }

    public static void main(String[] args) {
        String firstArg = args[0];
        System.out.println(getAnimalVoice(firstArg));
    }
}
