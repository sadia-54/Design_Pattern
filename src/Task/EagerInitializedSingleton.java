package Task;

class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // private constructor to avoid client applications using the constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}

class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    // Static factory method for global access
    public static LazyInitializedSingleton getInstance() {
        // Check if an instance exists
        if (instance == null) {
            // If no instance exists, create one
            instance = new LazyInitializedSingleton();
        }
        // Return the existing instance
        return instance;
    }
}

// This class represents a simple Database singleton implementation
class Database {
    // Static instance of the Database class, initialized to null
    public static Database databaseInstance;
    // Private field to store the database connection string
    private String connectionString;

    // Private constructor to initialize the Database with a connection string
    private Database(String connectionString){
        this.connectionString = connectionString;
    }

    // Public method to get or create the singleton instance of the Database
    public static Database getDatabaseInstance(String connectionString){
        if(databaseInstance == null){
            databaseInstance = new Database(connectionString);
        }
        return databaseInstance;
    }

    // Public method to get the connection string of the Database
    public String getConnectionString(){
        return connectionString;
    }
}

