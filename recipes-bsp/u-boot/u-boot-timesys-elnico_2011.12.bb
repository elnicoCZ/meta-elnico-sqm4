require recipes-bsp/u-boot/u-boot-timesys_2011.12.bb

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRCBRANCH = "2011.12-q-sqm4vf6-eb"
SRC_URI = "git://github.com/elnicoCZ/u-boot-timesys.git;protocol=git;branch=${SRCBRANCH} \
"

SRCREV = "2df431317b0bcb85ebabf90d01e573d77c546483"

PR = "r3"
