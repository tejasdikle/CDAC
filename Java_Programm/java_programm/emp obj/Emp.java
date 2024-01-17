class Emp {
    private int id;
    private String name;
    private static int noOfEmps;

    // Constructor to initialize id and name
    Emp(int id, String name) {
        this.id = id;
        this.name = name;
        noOfEmps++; // Increment the static variable when a new Emp object is created
    }

    													// Getter 
    public int getId() {
        return id;
    }

    														// Getter  name
    public String getName() {
        return name;
    }

    														// Getter noOfEmps
    public static int getNoOfEmps() {
        return noOfEmps;
    }
}
