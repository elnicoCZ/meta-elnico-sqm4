DESCRIPTION = "Image providing a set of hardware testing tools."

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += " \
    packagegroup-core-ssh-openssh \
    mtd-utils \
    usbutils \
    ethtool \
    i2c-tools \
    spitools \
    canutils \
"

PR = "r0"
