package com.pyxlwuff.jrpicam;

/**
 * With Raspian Buster, raspistill was dropped in favour of Libcamera.
 * This small class is used to determine which version of Raspian is being used, so that the correct
 * camera library is executed.
 */
public class RPiOSVersion {
    private static final String OS_VERSION = System.getProperty("os.version");

    /**
     * Returns the OS version of the Raspberry Pi.
     * @return The OS version of the Raspberry Pi.
     */
    public static String getOSVersion(){
        return OS_VERSION;
    }

    /**
     * Returns true if the OS version is Raspian Buster or newer.
     * @return True if the OS version is Raspian Buster or newer.
     */
    public static boolean isBusterOrNewer(){
        return OS_VERSION.contains("buster");
    }
}
