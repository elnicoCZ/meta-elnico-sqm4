require recipes-bsp/u-boot/u-boot-fslc.inc

PV = "v2016.01+git${SRCPV}"

SRCBRANCH = "2016.01+elnico"
SRC_URI = "git://github.com/elnicoCZ/u-boot-fslc.git;protocol=git;branch=${SRCBRANCH} \
"

SRCREV = "0f52120584c53cc7fed8ae20027c04abfe786b75"
PR = "r0"

LIC_FILES_CHKSUM = "file://Licenses/README;md5=0507cd7da8e7ad6d6701926ec9b84c95"

