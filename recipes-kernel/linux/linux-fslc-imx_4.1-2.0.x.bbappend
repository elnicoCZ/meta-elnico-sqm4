FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

include linux-fslc-fix.inc

SRC_URI += "file://0001-touchscreen-CRTOUCH-driver-ported-from.patch \
            file://imx_sema4.patch \
            file://rpmsg_sysfs_interface.patch \
            file://rtc-ab-eoz9-s3.patch \
            file://defconfig \
            file://sqm4sx6.dtsi \
            file://sqm4sx6-eb.dtsi \
            file://sqm4sx6-eb.dts \
            file://sqm4sx6-eb-m4.dts \
"

do_compile_prepend () {
    cp ${WORKDIR}/sqm4*.dts* ${S}/arch/${ARCH}/boot/dts
}

PR = "r1"
