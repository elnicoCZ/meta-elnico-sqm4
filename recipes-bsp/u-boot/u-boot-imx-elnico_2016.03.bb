DESCRIPTION = "U-Boot provided by Freescale, extended by Elnico with SQM4 BSPs."
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRCBRANCH = "elnico_v2016.03"
SRC_URI = "git://github.com/elnicoCZ/u-boot-imx.git;protocol=git;branch=${SRCBRANCH} \
"
SRCREV = "32835502aa807e3232c58122f3443c2f0eefd70c"

S = "${WORKDIR}/git"

inherit fsl-u-boot-localversion

LOCALVERSION ?= "-${SRCBRANCH}"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6|mx7)"
