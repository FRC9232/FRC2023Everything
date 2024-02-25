package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.motorcontrol.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.ctre.phoenix.motorcontrol.*;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


public class ShooterSubsystem extends SubsystemBase {
    private CANSparkMax rightMotor;
    private CANSparkMax leftMotor;

    public ShooterSubsystem(){
        
        rightMotor = new CANSparkMax(9, MotorType.kBrushless);
        leftMotor = new CANSparkMax(8, MotorType.kBrushless);
        
    }

    public void setShooter(Boolean open){
        if (open == true){
            rightMotor.setInverted(true);
            leftMotor.setInverted(false);
            rightMotor.set(-0.75);
            leftMotor.set(-0.75);
        }
        else{
            rightMotor.set(0);
            leftMotor.set(0);
        }
    }
    public void amphShoot(){
         rightMotor.setInverted(true);
         leftMotor.setInverted(false);
         rightMotor.set(-0.17);
         leftMotor.set(-0.17);
     
    }

    @Override
    public void periodic(){
        SmartDashboard.putNumber("shooter temp", rightMotor.getMotorTemperature());
    
    }



}