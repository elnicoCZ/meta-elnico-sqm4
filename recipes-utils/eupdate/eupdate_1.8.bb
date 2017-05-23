# Copyright (C) 2015-2016 Elnico
SUMMARY = "Elnico Updater"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"
PR = "r2"

RDEPENDS_${PN} = "coreutils mtd-utils"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI = "git://github.com/elnicoCZ/eupdate.git \
           file://autoupdate.init \
"
SRCREV = "8ef8b1e58bfed71ff8ab39eb066800012bd62bc6"

S = "${WORKDIR}/git"

# --- classes ---
inherit useradd update-rc.d

# useradd
USERADD_PACKAGES = "${PN}"
GROUPADD_PARAM_${PN} = "admin"

# eupdate-autoupdate
PACKAGES =+ "${PN}-autoupdate"
FILES_${PN}-autoupdate = "${sysconfdir}/init.d/autoupdate"
INITSCRIPT_PACKAGES += "${PN}-autoupdate"
INITSCRIPT_NAME_${PN}-autoupdate = "autoupdate"
INITSCRIPT_PARAMS_${PN}-autoupdate = "start 90 3 4 5 ."

do_install() {
    install -d ${D}${sysconfdir}/${PN}
    install -m 4754 -g admin ${S}/eupdate ${D}${sysconfdir}/${PN}/eupdate
    install -m 0644 ${S}/eutils ${D}${sysconfdir}/${PN}/eutils
    install -d ${D}${sysconfdir}/${PN}/config
    install -m 0644 ${S}/config/config ${D}${sysconfdir}/${PN}/config/config
    install -m 0644 ${S}/config/manifest ${D}${sysconfdir}/${PN}/config/manifest

    install -d ${D}${sysconfdir}/init.d/
    install -m 0755 ${WORKDIR}/autoupdate.init ${D}${sysconfdir}/init.d/autoupdate
}
