FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-touchscreen-CRTOUCH-driver-ported-from.patch \
            file://defconfig \
            file://sqm4sx6.dtsi \
            file://sqm4sx6-eb.dtsi \
            file://sqm4sx6-eb.dts \
"

do_compile_prepend () {
    cp ${WORKDIR}/sqm4*.dts* ${S}/arch/${ARCH}/boot/dts
}
