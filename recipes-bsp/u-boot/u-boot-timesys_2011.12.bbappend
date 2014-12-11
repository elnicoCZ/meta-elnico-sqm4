FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRCBRANCH = "2011.12-mvf"
SRC_URI = "git://github.com/Timesys/u-boot-timesys.git;protocol=git;branch=${SRCBRANCH} \
           file://0001-vybrid-Board-identification-text-changed-to-SQM4-VF6.patch \
           file://0002-DDR-DRAM-size-increased-from-128MB-to-256MB.patch \
           file://0003-DDR-DRAM-initialization-fixed-to-improve-its-stabili.patch \
           file://0004-UART-Enable-all-three-available-UART-channels.patch \
"

SRCREV = "da57bddb827ff0da2eb8da33b7081ff56d9dea2d"

PR = "r1"

