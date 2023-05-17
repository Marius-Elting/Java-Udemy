public class IfThen {
    public static void main(String[] args) {

        boolean isAlien = true; 
        boolean isAnimal = false;
        // alternative if(isAlien == true)
        if(isAlien)
            System.out.println("Hello I'm an Alien");

        if(isAlien || isAnimal)
            System.out.println("Its an Animal or an Alien");
            
        if(isAlien && !isAnimal)
            System.out.println("Its not an Animal but an Alien");
        }
};



