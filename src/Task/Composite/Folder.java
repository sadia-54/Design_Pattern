package Task.Composite;

import java.util.ArrayList;
import java.util.List;

class Folder implements FileSystemComponent {
    private List<FileSystemComponent> contents;

    public Folder() {
        contents = new ArrayList<>();
    }

    public void add(FileSystemComponent component) {
        contents.add(component);
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : contents) {
            totalSize += component.getSize();
        }
        return totalSize;
    }
}