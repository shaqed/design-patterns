package creational.prototype;

public class Mainer {
    public static void main(String[] args) {
        // We want a few couches
        // Creating each is heavy

        // So we will clone the prototype and change it however we like
        CouchPrototype prototype = new CouchPrototype(); // heavy process


        // Easy and fast
        CouchPrototype couch1 = (CouchPrototype) prototype.cloneSelf();
        couch1.setColor("blue");
        couch1.changeThis(3); // couch1 is a new couch!


        // Easy and fast
        CouchPrototype couch2 = (CouchPrototype) prototype.cloneSelf();
        couch2.setColor("green");
        // Dont change the other thing


    }
}
