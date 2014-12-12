FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI_append_sqm4vf6-eb = "file://0001-UART-UART-pad-definitions-fixed-UART0-enabled-Quad-S.patch \
                             file://0002-sgtl5000-Audio-support-ported-for-EasyBoard-pads-and.patch \
                             file://0003-DCU-Support-for-800x480-LCD-added.patch \
                             file://0004-DMA-Ignore-interrupts-from-DMA1-as-it-is-reserved-fo.patch \
                             file://0005-USB-USB-host-implemented-for-both-USB-PHYs-to-be-ena.patch \
"

