package Task.Composite;

public class File implements FileSystemComponent{
    private int size;

    public File(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
