require recipes-bsp/u-boot/u-boot-timesys_2011.12.bb

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRCBRANCH = "2011.12-q-sqm4vf6-eb"
SRC_URI = "git://github.com/elnicoCZ/u-boot-timesys.git;protocol=git;branch=${SRCBRANCH}"

SRCREV = "b93458f6aeaa555dc7549b052801094030988a88"

PR = "r1"
