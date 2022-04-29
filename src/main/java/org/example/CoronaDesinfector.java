package org.example;

public class CoronaDesinfector {

    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Policeman policeman;

    public void start(Room room) {
        announcer.announce("Начинаем дезинфекцию, все вон!");
        policeman.makePeopleLeaveRoom();
        desinfect(room);
        announcer.announce("Можете вернуться обратно!");
    }

    private void desinfect(Room room) {
        System.out.println("дезинфекция!");
    }
}
