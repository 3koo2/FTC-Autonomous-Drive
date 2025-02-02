package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.pinpoint.*;

@Autonomous(name = "PinpointDriveAuto", group = "AutonomousModes")
public class AutoDrive extends LinearOpMode {


    private ElapsedTime timer;
    private GoBildaPinpointManager pinpoint;

    @Override
    public void runOpMode(){
        timer = new ElapsedTime();
        pinpoint = new GoBildaPinpointManager(hardwareMap, "odo");

        waitForStart();
        timer.reset();

        while (opModeIsActive()){

        }

    }
}
