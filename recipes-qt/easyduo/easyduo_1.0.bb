# Copyright (C) 2015 Elnico
SUMMARY = "EasyDuo Dual-Core Demo Application for SQM4-VF6-EasyBoard"
LICENSE = "CLOSED"

DEPENDS = "qt4-embedded libmcc libconfig"
RDEPENDS_${PN} = "qt4-embedded \
                  libmcc \
                  mqxboot \
                  libconfig \
                  gst-ffmpeg \
"

SRC_URI = "git://github.com/elnicoCZ/sqm4_vf6_easyDuo.git;name=source \
           http://www.elnico.cz/download/sqm4k70_480x272.avi;name=video1 \
           file://easyDuo_sqm4vf6_eb_m4.bin \
"
SRCREV_source = "c568215cc924bbde70388b41703820099826ecf3"

SRC_URI[video1.md5sum] = "76d62a006824a5cad31be4668f542292"
SRC_URI[video1.sha256sum] = "9d83eece38b9c8cfb126457a109b33943b11816d6a10da5641fb227c50b3c2ee"

PR = "r1"

S = "${WORKDIR}/git/linux"

CFLAGS += ""

FILES_${PN} += "${ROOT_HOME}/*"

INITSCRIPT_NAME = "elnico-easyduo"
INITSCRIPT_PARAMS = "start 99 5 ."

COMPATIBLE_MACHINE = "(vf60)"

inherit pkgconfig qt4e update-rc.d

do_install() {
    oe_runmake 'INSTALL_ROOT=${D}' install
    install -d ${D}${sysconfdir}/init.d/
    install -m 0755 ${S}/easyduo.init ${D}${sysconfdir}/init.d/elnico-easyduo
    install -d ${D}${ROOT_HOME}
    install -m 0644 ${WORKDIR}/easyDuo_sqm4vf6_eb_m4.bin ${D}${ROOT_HOME}/easyDuo_sqm4vf6_eb_m4.bin
    install -m 0644 ${WORKDIR}/sqm4k70_480x272.avi ${D}${ROOT_HOME}/sqm4k70_480x272.avi
    install -m 0644 ${S}/easyduo.cfg ${D}${ROOT_HOME}/easyduo.cfg
}
