// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.configs.MotionMagicConfigs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.MotionMagicVoltage;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Motor extends SubsystemBase {
  /** Creates a new Motor. */
  
  static TalonFX motor = new TalonFX(0);

  public static void movePosition (double pos) {
    motor.setControl(new MotionMagicVoltage(pos));
    
  }
  public static void setPosition(double pos) {
    motor.setPosition(pos);

  }

  public static void getPosition() {
    motor.getPosition();
  }
  public MotionMagicVoltage motionMagicVoltage = new MotionMagicVoltage(1);
  public Motor() {


    TalonFXConfiguration configs = new TalonFXConfiguration();

    configs.Slot0.kP = 1;
    configs.Slot0.kI = 0;
    configs.Slot0.kD = 10;
    
    configs.MotionMagic.MotionMagicAcceleration = 200;
    configs.MotionMagic.MotionMagicCruiseVelocity = 200;
    
    
    // Write these configs to the TalonFX
    motor.getConfigurator().apply(configs);

    motor.setPosition(0);

    var position = motor.getPosition();
    var velocity = motor.getVelocity();

    

    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    CoolMethod(197);
  }
}