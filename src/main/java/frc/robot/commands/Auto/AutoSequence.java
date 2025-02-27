// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Auto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

import frc.robot.Robot;
import frc.robot.commands.Auto.AutoDrive;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class AutoSequence extends SequentialCommandGroup {
  /** Creates a new AutoSequence. */
  public AutoSequence() {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(new AutoDrive(-0.5, 0, 50), new AutoArm(0.3, 10), 
    new AutoArm(-0.3, 10), new AutoDrive(0.5, 0, 30), 
    new AutoDrive(0.5, -0.5, 10), new AutoDrive(0.5, 0, 50), 
    new AutoDrive(0.5, 0.5, 10), new AutoDrive(0.5, 0, 50));
  }
}
