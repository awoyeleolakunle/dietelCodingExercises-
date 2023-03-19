package DiaryOOP;

import java.util.ArrayList;

public class Diary {
    static ArrayList<Entry> entries = new ArrayList<>();

    public void createEntryFor(String title, String body) {
        int id = entries.size() + 1;
        Entry newEntry = new Entry(title, body, id);
        entries.add(newEntry);
    }
    public int getEntryNumber() {
        return entries.size();
    }

    public Entry findMyEntry(int id) {
        return entries.get(id - 1);
    }


    public Entry viewEntry(int id) {
        validateId(id);
        return findMyEntry(id);
    }

    public void removeMyEntry(int id) {
        validateId(id);
        entries.removeIf(entry -> entry.getId() == id);
    }

    public void validateId(int id) {
        if (id < 1 || id > entries.size())
            throw new IllegalArgumentException("Invalid Id");
    }

    public Entry updateEntry(int id, String editTitle, String editBody) {
        validateId(id);
        entries.get(id-1).setTitle(editTitle);
        entries.get(id-1).setBody(editBody);

        return viewEntry(id);
    }
    public int countMyEntries() {
        return entries.size();
    }
}

