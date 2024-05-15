package Task.Composite;

public class Main {
    public static void main(String[] args) {
        File file1 = new File(100);  
        File file2 = new File(200);  

        Folder folder1 = new Folder();
        folder1.add(file1);
        folder1.add(file2);

        //get folder1 directory size
        System.out.println("Size of folder1: " + folder1.getSize() + " bytes"); //get folder1 directory size

        File file3 = new File(150); 
        File file4 = new File(250);  

        Folder folder2 = new Folder();
        folder2.add(file3);
        folder2.add(file4); 

        //get folder2 directory size
        System.out.println("Size of folder2: " + folder2.getSize() + " bytes");

        folder2.add(folder1);

        //get folder2 directory size after adding folder1 in folder2
        System.out.println("Size of folder2 after adding folder1: " + folder2.getSize() + " bytes");
    }
}