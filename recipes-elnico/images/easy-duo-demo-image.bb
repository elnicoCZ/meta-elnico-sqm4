DESCRIPTION = "Out-of-the-box Qt-based demo application with gstreamer \
packages and Freescale's multimedia packages."

LICENSE = "MIT"

require ../../../meta-fsl-demos/recipes-qt/images/qt-in-use-common.inc

QT_NAME = "qt4-embedded"

TOUCH = ' ${@base_contains("MACHINE_FEATURES", "touchscreen", "tslib tslib-calibrate tslib-tests qt4-embedded-plugin-mousedriver-tslib", "",d)}'

IMAGE_INSTALL = " \
    ${COMMON_INSTALL} \
    \
    ${QT_DEMOS} \
    easyduo \
    pciutils \
    usbutils \
    alsa-utils \
    ${TOUCH} \
    packagegroup-fsl-gstreamer \
    packagegroup-fsl-gstreamer-full \
    packagegroup-core-ssh-openssh \
"

