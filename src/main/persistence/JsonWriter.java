package persistence;
import model.Game;


import java.io.*;

// Represents a writer that writes JSON representation of workroom to file
public class JsonWriter {


    // EFFECTS: constructs writer to write to destination file
    public JsonWriter(String destination) {

    }

    // MODIFIES: this
    // EFFECTS: opens writer; throws FileNotFoundException if destination file cannot
    // be opened for writing
    public void open() throws FileNotFoundException {
     
    }

    // MODIFIES: this
    // EFFECTS: writes JSON representation of game to file
    public void write(Game game) {

    }

    // MODIFIES: this
    // EFFECTS: closes writer
    public void close() {

    }

    // MODIFIES: this
    // EFFECTS: writes string to file
    private void saveToFile(String json) {

    }
}
