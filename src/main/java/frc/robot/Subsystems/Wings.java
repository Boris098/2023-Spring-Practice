package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Wings extends SubsystemBase{
    public Wings(DoubleSolenoid LeftWing, DoubleSolenoid RightWing){
        wingsOut = false;
        leftWing = LeftWing;
        rightWing = RightWing;

    }
    public boolean wingsOut = false;
    public static boolean leftWingOut = false;
    public static boolean rightWingOut = false;
    private DoubleSolenoid leftWing;
    private DoubleSolenoid rightWing;



    public void LeftWingIn(){
        leftWing.set(DoubleSolenoid.Value.kForward);
        leftWingOut=false;
    }    

    public void RightWingIn(){
        leftWing.set(DoubleSolenoid.Value.kForward);
        rightWingOut=false;
    }

    public void LeftWingOut(){
        leftWing.set(DoubleSolenoid.Value.kReverse);
        leftWingOut=true;
    }

    public void RightWingOut(){
        leftWing.set(DoubleSolenoid.Value.kReverse);
        rightWingOut=true;
    }

}


