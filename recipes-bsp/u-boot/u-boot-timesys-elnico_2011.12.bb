require recipes-bsp/u-boot/u-boot-timesys_2011.12.bb

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRCBRANCH = "2011.12-q-sqm4vf6-eb"
SRC_URI = "git://github.com/elnicoCZ/u-boot-timesys.git;protocol=git;branch=${SRCBRANCH} \
"

SRCREV = "f9251557f19f0d1e1290e5bb27d399cb4c6c74ca"

PR = "r2"
