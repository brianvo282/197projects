// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class motor extends SubsystemBase {
  /** Creates a new motor. */
  public motor() {
    TalonFX talonfx1 = new TalonFX(1);
    TalonFX talonfx2 = new TalonFX(2);
    talonfx1.setControl(new DutyCycleOut(0.5));
    talonfx2.setControl(new Follower(1, false));
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
