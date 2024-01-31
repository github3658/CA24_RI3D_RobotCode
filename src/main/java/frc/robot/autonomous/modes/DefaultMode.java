package frc.robot.autonomous.modes;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import frc.robot.autonomous.tasks.BrakeTask;
import frc.robot.autonomous.tasks.DriveTrajectoryTask;

public class DefaultMode extends AutoModeBase {
  @Override
  public Pose2d getRedStartingPosition() {
    return new Pose2d(14.655021228445234, 4.458172598636864, Rotation2d.fromDegrees(180));
  }

  public void queueTasks() {
    queueTask(new DriveTrajectoryTask("Test Auto", 2, 1));

    queueTask(new BrakeTask());
  }

  // public void queueTasks() {
  // queueTask(new ParallelTask(
  // new IntakeTask(IntakeState.NONE, PivotTarget.STOW),
  // new ShooterTask(3000),
  // new WaitTask(2.0)));

  // queueTask(new ParallelTask(
  // new IntakeTask(IntakeState.EJECT, PivotTarget.STOW),
  // new WaitTask(1.0)));

  // queueTask(new ParallelTask(
  // new IntakeTask(IntakeState.INTAKE, PivotTarget.GROUND),
  // new WaitTask(0.1)));

  // queueTask(new DriveForwardTask(1, 0.4));

  // queueTask(new ParallelTask(
  // new IntakeTask(IntakeState.PULSE, PivotTarget.STOW),
  // new WaitTask(0.1)));

  // queueTask(new DriveForwardTask(1, -0.4));

  // queueTask(new ParallelTask(
  // new IntakeTask(IntakeState.EJECT, PivotTarget.STOW),
  // new WaitTask(2.0)));

  // queueTask(new ParallelTask(
  // new IntakeTask(IntakeState.NONE, PivotTarget.STOW),
  // new WaitTask(2.0),
  // new ShooterTask(0)));

  // queueTask(new BrakeTask());
  // }
}
