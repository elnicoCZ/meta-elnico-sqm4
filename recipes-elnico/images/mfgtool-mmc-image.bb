# This generates a manufacturing tool image, to be used with MfgTool,
# but without initramfs. Feature-full system with RFS on an SD card is generated
# instead. MfgTool is only responsible to load a runtime u-boot and a boot
# script. This boot script then configures env, loads kernel, dtb and boots from
# SD card, significantly speeding up the manufacturing process.

DESCRIPTION = "Offloaded mfgtool image."
LICENSE = "MIT"
PR = "r0"

inherit core-image

IMAGE_INSTALL += " \
    packagegroup-fsl-mfgtool-mtd \
    packagegroup-fsl-mfgtool-extfs \
    packagegroup-core-ssh-openssh \
    ntpdate \
"

UBOOT_CONFIG = "mfgtool"

IMAGE_ROOTFS_EXTRA_SPACE = "50000"
IMAGE_FSTYPES = "tar.bz2"

