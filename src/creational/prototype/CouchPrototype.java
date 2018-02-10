package creational.prototype;

public class CouchPrototype implements Prototype{

    private String details;

    public CouchPrototype() {
        // Constructing a couch prototype, a heavy process that requires a lot of time

        // Fetch from DB stuff

        // Get data from Internet maybe

        // Anyway - this is heavy
    }

    public void setColor(String color) {

    }

    public void changeThis(int id) {
        // Change something in the couch ... who cares what
    }

    public CouchPrototype(CouchPrototype copyPrototype) {
        // Copying however is much easier that constructing the object from scratch

        // Make sure you copy everything necessary for this object to act
        // independently from the prototype (e.g - copying pointers)
        this.details = copyPrototype.details;
    }

    @Override
    public Prototype cloneSelf() {
        return new CouchPrototype(this); // clone self and return a new instance
    }


}
