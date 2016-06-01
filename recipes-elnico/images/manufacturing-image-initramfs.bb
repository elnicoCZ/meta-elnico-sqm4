# To integrate the initramfs into the kernel image, add the following
# definitions to the >>> conf/local.conf <<< file:
# INITRAMFS_IMAGE = "manufacturing-image-initramfs"
# INITRAMFS_IMAGE_BUNDLE = "1"
#
# Also, the kernel needs CONFIG_BLK_DEV_INITRD=y.

DESCRIPTION = "An Initramfs manufacturing Linux image, used primarily for automated \
installation of UBI filesystems to the NAND device, as this is problematic in u-boot."

LICENSE = "MIT"

require recipes-core/images/core-image-minimal.bb

IMAGE_FSTYPES = "${INITRAMFS_FSTYPES}"
PACKAGE_INSTALL = "${IMAGE_INSTALL} mtd-utils mtd-utils-ubifs xubirdr"
