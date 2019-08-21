package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
    public static void main(String[] args) throws Exception {
	Robot Bobert=new Robot();

Bobert.penDown();

Bobert.setSpeed(10);
Bobert.turn(20);
Bobert.move(300);
Bobert.turn(135);
Bobert.move(300);
Bobert.turn(180);
Bobert.move(150);
Bobert.turn(290);
Bobert.move(150);
}
}