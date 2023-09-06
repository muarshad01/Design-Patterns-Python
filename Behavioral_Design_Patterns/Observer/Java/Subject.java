import java.util.ArrayList;
import java.util.List;
import java.util.Random;

interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
