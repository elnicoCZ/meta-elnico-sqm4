require recipes-bsp/u-boot/u-boot-fslc.inc

PV = "v2016.01+git${SRCPV}"

SRCBRANCH = "2016.01+elnico"
SRC_URI = "git://github.com/elnicoCZ/u-boot-fslc.git;protocol=git;branch=${SRCBRANCH} \
"

SRCREV = "d4abab0defa8a871af5b14a9a796f96d6d70993d"
PR = "r0"

