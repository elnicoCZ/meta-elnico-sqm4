require recipes-bsp/u-boot/u-boot-fslc.inc

PV = "v2016.01+git${SRCPV}"

SRCBRANCH = "2016.01+elnico"
SRC_URI = "git://github.com/elnicoCZ/u-boot-fslc.git;protocol=git;branch=${SRCBRANCH} \
           file://Fix-the-compile-issue-under-gcc6.patch \
"

SRCREV = "d4abab0defa8a871af5b14a9a796f96d6d70993d"
PR = "r0"

LIC_FILES_CHKSUM = "file://Licenses/README;md5=0507cd7da8e7ad6d6701926ec9b84c95"
