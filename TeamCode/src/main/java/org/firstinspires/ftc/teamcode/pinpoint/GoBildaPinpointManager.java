package org.firstinspires.ftc.teamcode.pinpoint;

import com.qualcomm.robotcore.hardware.HardwareMap;

public class GoBildaPinpointManager {
    // constants
    private final double ODOMETRY_OFFSET_X_MM = 0;
    private final double ODOMETRY_OFFSET_Y_MM = 0;
    private final GoBildaPinpointDriver.EncoderDirection X_ENCODER_DIRECTION = GoBildaPinpointDriver.EncoderDirection.FORWARD;
    private final GoBildaPinpointDriver.EncoderDirection Y_ENCODER_DIRECTION = GoBildaPinpointDriver.EncoderDirection.FORWARD;

    // object variables
    private GoBildaPinpointDriver pinpoint;

    public GoBildaPinpointManager(HardwareMap hardwareMap, String configurationName){
        pinpoint = hardwareMap.get(GoBildaPinpointDriver.class, configurationName);

        pinpoint.setOffsets(ODOMETRY_OFFSET_X_MM, ODOMETRY_OFFSET_Y_MM);
        pinpoint.setEncoderResolution(GoBildaPinpointDriver.GoBildaOdometryPods.goBILDA_SWINGARM_POD);
        pinpoint.setEncoderDirections(X_ENCODER_DIRECTION, Y_ENCODER_DIRECTION);

        pinpoint.resetPosAndIMU();
    }
}
