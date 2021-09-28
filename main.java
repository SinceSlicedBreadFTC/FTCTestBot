package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaCurrentGame;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.tfod.TfodCurrentGame;

@TeleOp(name = "CameraTestf (Blocks to Java)")
public class CameraTestf extends LinearOpMode {

  private VuforiaCurrentGame vuforiaFreightFrenzy;
  private TfodCurrentGame tfodFreightFrenzy;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    vuforiaFreightFrenzy = new VuforiaCurrentGame();
    tfodFreightFrenzy = new TfodCurrentGame();

    // amogus
    vuforiaFreightFrenzy.initialize(
        "", // vuforiaLicenseKey
        hardwareMap.get(WebcamName.class, "Webcam 1"), // cameraName
        "", // webcamCalibrationFilename
        true, // useExtendedTracking
        false, // enableCameraMonitoring
        VuforiaLocalizer.Parameters.CameraMonitorFeedback.AXES, // cameraMonitorFeedback
        0, // dx
        0, // dy
        0, // dz
        0, // xAngle
        0, // yAngle
        0, // zAngle
        true); // useCompetitionFieldTargetLocations
    tfodFreightFrenzy.initialize(vuforiaFreightFrenzy, (float) 0.4, true, true);
    tfodFreightFrenzy.activate();
    telemetry.addData(">", "Press Play to Start");
    telemetry.update();
    waitForStart();
    if (opModeIsActive()) {
      while (opModeIsActive()) {
      }
    }

    vuforiaFreightFrenzy.close();
    tfodFreightFrenzy.close();
  }
}
