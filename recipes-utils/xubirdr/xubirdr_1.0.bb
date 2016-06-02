# Copyright (C) 2016 Elnico
SUMMARY = "X-UBI image reader utility"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

DEPENDS = ""
RDEPENDS_${PN} = "mtd-utils-ubifs"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI = "git://github.com/elnicoCZ/xubirdr.git \
           file://ubi-install.init \
"
SRCREV = "ddbe155ad6f6af0858406cd431fcb87526f2e025"

PR = "r1"

S = "${WORKDIR}/git"

CFLAGS += ""

INITSCRIPT_NAME = "elnico-ubi-install"
INITSCRIPT_PARAMS = "start 99 2 ."

COMPATIBLE_MACHINE = "(vf60)"

inherit pkgconfig cmake update-rc.d

do_install() {
    oe_runmake 'DESTDIR=${D}' install
    install -d ${D}${sysconfdir}/init.d/
    install -m 0744 ${WORKDIR}/ubi-install.init ${D}${sysconfdir}/init.d/elnico-ubi-install
}
