# Copyright (C) 2015-2019 Elnico
SUMMARY = "Elnico Updater"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"
PR = "r0"

RDEPENDS_${PN} = "coreutils"

SRC_URI = "git://github.com/elnicoCZ/eupdate.git"
SRCREV = "450ac2fc5f91705d84f7522f550dd506a59e2a0e"

S = "${WORKDIR}/git"

# --- classes ---
inherit useradd

# useradd
USERADD_PACKAGES = "${PN}"
GROUPADD_PARAM_${PN} = "admin"

do_install() {
	install -d ${D}${sysconfdir}/${PN}
	install -m 4754 -g admin ${S}/eupdate ${D}${sysconfdir}/${PN}/eupdate
	install -m 0644 ${S}/eutils ${D}${sysconfdir}/${PN}/eutils
	install -d ${D}${sysconfdir}/${PN}/config
	install -m 0644 ${S}/config/config ${D}${sysconfdir}/${PN}/config/config
	install -m 0644 ${S}/config/manifest ${D}${sysconfdir}/${PN}/config/manifest
}
