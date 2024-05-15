package Task_01;

public class Main {
    public static void main(String[] args) {
        Database session1 = Database.getDatabaseInstance("value-1");
        System.out.println(session1.getConnectionString());

        // trying to create another Database session

        Database session2 = Database.getDatabaseInstance("value-2");
        System.out.println(session2.getConnectionString());
    }
}