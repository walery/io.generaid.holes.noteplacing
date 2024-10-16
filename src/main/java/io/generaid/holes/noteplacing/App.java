package io.generaid.holes.noteplacing;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.process();
    }

    public void process() {
        HolePanel hp = new HolePanel(Sources.fetchHolesAsMap(), Sources.fetchNotesAsMap());
        hp.placeNotes();
        hp.placeNotesAgain();
//        hp.placeNotesAgain();
        hp.exportToSvg();
    }
}
