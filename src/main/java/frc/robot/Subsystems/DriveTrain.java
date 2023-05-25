package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;



public class DriveTrain extends SubsystemBase {
    public DriveTrain(){

    }

    private final WPI_TalonFX frontLeftMotor = new WPI_TalonFX(13);
    private final WPI_TalonFX frontRightMotor = new WPI_TalonFX(11);
    private final WPI_TalonFX backRightMotor = new WPI_TalonFX(14);
    private final WPI_TalonFX backLeftMotor = new WPI_TalonFX(12);

    private final MotorControllerGroup leftSpeedGroup = new MotorControllerGroup(backLeftMotor, frontLeftMotor);
    private final MotorControllerGroup rightSpeedGroup = new MotorControllerGroup(backRightMotor, frontRightMotor);
    private final DifferentialDrive drive = new DifferentialDrive(leftSpeedGroup, rightSpeedGroup);

    public void move(double speed, double turning){
        drive.arcadeDrive(speed, turning);
    }

    

    //private WPI_TAlONfx = new WPI_TAlONfx;


}
