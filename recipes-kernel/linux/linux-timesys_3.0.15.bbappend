FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

# Common patches to all our boards, applied first
SRC_URI += "file://0001-UART-UART-pad-definitions-fixed-UART0-enabled-Quad-S.patch \
            file://0002-sgtl5000-Audio-support-ported-for-EasyBoard-pads-and.patch \
            file://0003-DCU-Support-for-800x480-LCD-added.patch \
            file://0004-DMA-Ignore-interrupts-from-DMA1-as-it-is-reserved-fo.patch \
            file://0006-Logo-Custom-SQM4-bootup-logo-introduced.patch \
            file://0008-sgtl-sysclk-fixed-to-equal-the-frequency-of-the-inpu.patch \
            file://0009-NFC-8-bit-NAND-patch-do-not-set-the-CONFIG_16BIT_MAS.patch \
            file://0010-sdhc-Use-22K-pullup-for-the-Card-Detect-pin-for-high.patch \
"

PR = "r2"

