package sequenceDCode.no42024;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private String publisherName;
    private List<Library> libraries;

    public Publisher(String publisherName) {
        this.publisherName = publisherName;
        this.libraries = new ArrayList<>();
    }

    public void addLibrary(Library library) {
        this.libraries.add(library);
    }

    public double getBookPrice() {
        double sumPrice = 0.0;
        for (Library library : libraries) {
            sumPrice += library.getBookPrice();
        }
        return sumPrice;
    }
}
