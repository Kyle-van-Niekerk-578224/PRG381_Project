package DataAccessLayer;

import java.util.List;

public interface Operations {
    public List<String> readOperation(String filename);
    public void writeOperation(Object obj);
}
