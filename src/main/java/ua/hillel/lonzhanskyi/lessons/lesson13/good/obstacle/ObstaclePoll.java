package ua.hillel.lonzhanskyi.lessons.lesson13.good.obstacle;

import ua.hillel.lonzhanskyi.lessons.lesson13.bad.ParticipantCat;
import ua.hillel.lonzhanskyi.lessons.lesson13.bad.ParticipantFrog;
import ua.hillel.lonzhanskyi.lessons.lesson13.good.participants.Participant;

public class ObstaclePoll extends Obstacle {

    @Override
    public void start(Participant participant) {
        System.out.println(participant.getName() + " start swim");
    }

}
