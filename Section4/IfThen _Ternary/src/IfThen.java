public class IfThen {
    public static void main(String[] args) {

        boolean isAlien = true;
        boolean isAnimal = true;
        // alternative if(isAlien == true)
        if (isAlien)
            System.out.println("Hello I'm an Alien");

        if (isAlien || isAnimal)
            System.out.println("Its an Animal or an Alien");

        if (isAlien && !isAnimal)
            System.out.println("Its not an Animal but an Alien");

        isAnimal = isAlien ? false : true;
        System.out.print(isAnimal);

        // call challange
        challange();
    }

    public static void challange() {
        double doubleVar1 = 20.00d;
        double doubleVar2 = 80.00d;

        double multi = (doubleVar1 + doubleVar2) * 100d;
        double multiRemainder = multi % 40d;
        boolean boolean1 = multiRemainder == 0.00 ? true : false;
        System.out.print(boolean1);
        if (boolean1) {
            System.out.print("got some Remainder");
        }
    }
};
