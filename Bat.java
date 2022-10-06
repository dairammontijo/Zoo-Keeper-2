class Bat {

    public static int defaultEnergy = 300;

    public void fly() {
        this.defaultEnergy -= 50;
        System.out.println("swooshhhh...");
        System.out.println("Bat Energy Level:" + this.defaultEnergy);
    }

    public void eatHumans() {
        this.defaultEnergy += 25;
        System.out.println("Bat Energy Level:" + this.defaultEnergy); 
    }

    public void attackTown() {
        this.defaultEnergy -= 100;
        System.out.println("Crackel...Crackel....ahhhhhh....*burning town sounds*.... crackle BOOM! *sirens in the distance* 'MY LEG!!!'");
        System.out.println("Bat Energy Level:" + this.defaultEnergy);
    }
}

