// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class IntakeWristCommand extends CommandBase {
  /** Creates a new IntakeWristCommand. */
  public IntakeWristCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.IntakeSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (Robot.IntakeSubsystem.toggleForward()) {
      Robot.IntakeSubsystem.intakeWrist(0.1);
    } else {
      Robot.IntakeSubsystem.intakeWrist(-0.1);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Robot.IntakeSubsystem.intakeReset();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (Robot.IntakeSubsystem.encoderLimitReached()) {
      return true;
    }
    return false;
  }
}
